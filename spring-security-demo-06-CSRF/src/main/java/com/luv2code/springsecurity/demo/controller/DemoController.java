package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String showHome() {
		System.out.println("Controller....");
		return "home";
	}
	
	@RequestMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";
	}
	
 
}
