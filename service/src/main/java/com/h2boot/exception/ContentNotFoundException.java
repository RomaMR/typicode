package com.h2boot.exception;

public class ContentNotFoundException extends RuntimeException {

    private String value;

    public ContentNotFoundException(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
