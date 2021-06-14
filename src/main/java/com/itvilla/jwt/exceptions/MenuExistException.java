package com.itvilla.jwt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MenuExistException extends RuntimeException {
	
	 public MenuExistException(String exception) {
		    super(exception);
		  }
		
}
