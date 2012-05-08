package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.DeleteTableRequest;
import com.amazonaws.services.dynamodb.model.UpdateTableRequest;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import org.codehaus.jackson.JsonToken;

public class DeleteTableRequestJsonUnmarshaller implements Unmarshaller<DeleteTableRequest, JsonUnmarshallerContext> {

    public DeleteTableRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteTableRequest request = new DeleteTableRequest();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
/*
        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Items", targetDepth)) {
                    request.setItem(new MapUnmarshaller<String,AttributeValue>(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance(), AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
	            if (context.testExpression("TableName", targetDepth)) {
                    request.setTableName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
	             if (context.testExpression("ExpectedAttributeValue", targetDepth)) {
                   *//* putItemRequest.setExpected(new MapUnmarshaller<String,ExpectedAttributeValue>(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance(), Expect.getInstance()).unmarshall(context));*//*
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }*/

        return request;
    }

    private static DeleteTableRequestJsonUnmarshaller instance;
    public static DeleteTableRequestJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DeleteTableRequestJsonUnmarshaller();
        return instance;
    }
}