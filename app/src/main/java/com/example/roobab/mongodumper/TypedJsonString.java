package com.example.roobab.mongodumper;

import retrofit.mime.TypedString;

public class TypedJsonString extends TypedString {
    public TypedJsonString(String body) {
        super(body);
    }

    @Override
    public String mimeType() {
        return "application/json";
    }
}
