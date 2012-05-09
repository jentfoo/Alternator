package com.michelboudreau.alternator.validators;

import com.amazonaws.services.dynamodb.model.CreateTableRequest;
import com.michelboudreau.alternator.validation.Validator;
import com.michelboudreau.alternator.validation.ValidatorUtils;
import com.michelboudreau.alternator.validators.element.KeySchemaValidator;
import com.michelboudreau.alternator.validators.element.ProvisionedThroughputValidator;
import com.michelboudreau.alternator.validators.element.TableNameValidator;

import java.util.ArrayList;
import java.util.List;

public class CreateTableRequestValidator implements Validator {

    public boolean supports(Class clazz) {
        return CreateTableRequest.class.isAssignableFrom(clazz);
    }

    public List<Error> validate(Object target) {
        CreateTableRequest instance = (CreateTableRequest) target;
        List<Error> errors = new ArrayList<Error>();
        errors.addAll(ValidatorUtils.invokeValidator(new TableNameValidator(), instance.getTableName()));


        errors = ValidatorUtils.rejectIfNullOrEmptyOrWhitespace(errors,instance.getProvisionedThroughput().toString());

        errors.addAll(ValidatorUtils.invokeValidator(new KeySchemaValidator(), instance.getKeySchema()));

        errors.addAll(ValidatorUtils.invokeValidator(new ProvisionedThroughputValidator(), instance.getProvisionedThroughput()));

        return errors;
    }
}
