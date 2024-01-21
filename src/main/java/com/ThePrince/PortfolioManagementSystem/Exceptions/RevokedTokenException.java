package com.ThePrince.PortfolioManagementSystem.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class RevokedTokenException extends RuntimeException{
    public RevokedTokenException(String message){super(message);}
}