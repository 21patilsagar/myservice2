package com.cerillion.rhos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/index")
	public String index() {		
		return "index.jsp";
	}
	
	@GetMapping("/")
	public String home() {		
		return "Welcome to home";
	}
	
}
