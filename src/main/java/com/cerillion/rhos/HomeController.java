package com.cerillion.rhos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index.jsp");
		return view;
	}
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home.jsp");
		return view;
	}
	
}
