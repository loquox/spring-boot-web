package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	/*
	@GetMapping("/")
	public String home() {
		
		return "redirect:/app/index";
		
	}
	*/
	/*
	@GetMapping("/")
	public String home() {
		return "redirect:https://www.google.com";
	}
	*/
	
	@GetMapping("/")
	public String home() {
		
		return "forward:/app/index";
	}
	

}