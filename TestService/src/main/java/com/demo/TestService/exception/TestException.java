package com.demo.TestService.exception;

import com.demo.TestService.dto.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Problem> handleException(){
        Problem problem = new Problem();
        problem.setErrorCode(130);
        problem.setErrorMessage("updated issue");
        return new ResponseEntity<>(problem, HttpStatus.OK);
    }
}
