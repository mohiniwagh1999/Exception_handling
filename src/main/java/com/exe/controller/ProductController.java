package com.exe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.exe.exception.ProductNotFoundException;

@Controller
public class ProductController {
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") Integer pid,Model model) throws Exception
	{
		if(pid>=100)
		{
			throw new  ProductNotFoundException("invalid data");
		}
		else
		{
		model.addAttribute("msg", "apple mobile");
		}
		
		return "view1";
	}

}
