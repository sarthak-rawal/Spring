package com.apptech.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.springdemo.model.User;
import com.apptech.springdemo.reprsitory.userRepository;

@Controller
public class SignupConreoller {
	@Autowired
	private userRepository userRepo;
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
  
	@PostMapping("/signup")
	public String saveUser(@ModelAttribute User u) {
		userRepo.save(u);
		
		return "login";
	}
	
	
}
