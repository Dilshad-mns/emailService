package com.service.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.email.service.EmailService;

@RestController
@RequestMapping("/message")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/send")
	public String postMessage() {
		emailService.sendEmail();
		return "message sent";
	}
}
