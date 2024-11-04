package com.exe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/user")
	public String getmsg(Model model)
	{
		model.addAttribute("msg", "user email address:mohini@gmail.com");
	    String s=null;
	    s.length();//null ponter exception
		return "view1";
	}

}
