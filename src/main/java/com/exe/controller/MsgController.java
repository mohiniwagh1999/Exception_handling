package com.exe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	
	@GetMapping("/welcome")
	public String getMsg(Model model)
	{
		int i=10/0;//Arithmetic Exception
		model.addAttribute("msg", "welcome to my home");
		return "index";
	}
	
	@GetMapping("/greet")
	public String getgreet(Model model)
	{
		//int i=10/0;
		model.addAttribute("msg", "good morning");
		return "index";
	}
	
	/*specific exception
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleAe(ArithmeticException ae)
	{
		return "exview";
	}
	
	//generic exception
	@ExceptionHandler(value=Exception.class)
	public String handleAe(Exception e)
	{
		return "exview";
	}
*/
}
