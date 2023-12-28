package com.mb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c2")
public class UserController {
	public UserController() {
		System.out.println("User controller");
	}
	
	@GetMapping("/user")
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", 101);
		mav.addObject("name", "Rashmi");
		mav.addObject("email", "rash@gmail.com");
		mav.setViewName("user");
		return mav;
	}

}
