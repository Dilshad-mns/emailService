package com.service.email.serviceimpl;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.service.email.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("mohammaddilshad753@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        
        
        System.out.println("Sending Email...");

        try {
		
        	javaMailSender.send(msg);

        } catch (MailException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

	}

}
