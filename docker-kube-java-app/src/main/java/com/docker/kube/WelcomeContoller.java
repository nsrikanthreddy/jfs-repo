package com.docker.kube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jfstools")
public class WelcomeContoller {

	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		
		return "Hi, Welcome to Java with Docker and Kubernetes.";
	}
}
