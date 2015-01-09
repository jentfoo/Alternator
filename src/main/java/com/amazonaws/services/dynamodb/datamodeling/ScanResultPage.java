/*
 * Copyright 2013-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodb.datamodeling;

import java.util.List;

import com.amazonaws.services.dynamodb.model.Key;

/**
 * Container for a page of scan results.
 * @deprecated Use {@link com.amazonaws.services.dynamodbv2.datamodeling.ScanResultPage} instead.
 */
@Deprecated
public class ScanResultPage<T> {

    private List<T> results;
    private Key lastEvaluatedKey;

    /**
     * Returns all matching items for this page of scan results, which may be
     * empty.
     */
    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    /**
     * Returns the last evaluated key, which can be used as the
     * exclusiveStartKey to fetch the next page of results. Returns null if this
     * is the last page of results.
     */
    public Key getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    public void setLastEvaluatedKey(Key lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

}
