package com.dashboard.exception;

public class InvalidInput extends RuntimeException {
    public InvalidInput(String message) {
        super(message);
    }
}