package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginpage() {
		
		return "fancy-login";
	}
	@RequestMapping("/leaders")
    public String showMyRole() {
		
		return "leaders";
	}
	@RequestMapping("/systems")
    public String showMySystemsPage() {
		
		return "systems";
	}
	
	@RequestMapping("/access-Denied")
	public String accessdeniedpage() {
		return "accessdenied";
	}
}
