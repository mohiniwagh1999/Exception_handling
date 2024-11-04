package com.exe.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(value=ProductNotFoundException.class)
	public String handleAe(ProductNotFoundException e1)
	{
		return "exview";
	}

	

	//generic exception
	@ExceptionHandler(value=Exception.class)
	public String handleAe(Exception e)
	{
		return "exview";
	}
	
	
	
}
