package com.app.springboot.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DockerDemoController {
	
	@RequestMapping("/home")
	public String bidWelcome() {
		System.out.println("Welcome over Docker!!!");
		return "welcome";
	}

}
