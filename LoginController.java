package com.apptech.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.springdemo.model.User;
import com.apptech.springdemo.reprsitory.userRepository;

@Controller
public class LoginController {
	@Autowired
	private userRepository userRepo;
	@GetMapping("/login")
	public String ShowLogin() {
		
		return "login";
	}
	@PostMapping("/login")
	public String dologin(@ModelAttribute User u , Model model ) {
	User usr =	userRepo.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		if (usr != null) {
			model.addAttribute("uname",u.getUsername());
			
		return "home";
	}
		model.addAttribute("message","user not found");
		return "login";
	
}
}
