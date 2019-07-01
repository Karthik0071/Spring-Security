package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginpage() {
		
		return "plain-login";
	}
}
