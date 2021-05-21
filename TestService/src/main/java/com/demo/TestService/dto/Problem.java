package com.demo.TestService.dto;

import org.springframework.stereotype.Component;

public class Problem {
    private int errorCode;
    private String errorMessage;

    public Problem(){
        //todo
    }
    public Problem(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
