package com.frenchcomputerguy.rest;

import com.frenchcomputerguy.utils.JSONElement;

import java.util.Map;

/**
 * TODO: Description
 *
 * @author Quentin Brault
 * @since 2016/03/16
 */
public class PutRequest extends Request {

    public PutRequest(String url) {
        super(url);
    }

    public PutRequest(String url, Map<String, String> parameters) {
        super(url, parameters);
    }

    @Override
    public JSONElement getResponse() {
        return fetch(PUT);
    }

}
