package com.kl.SpringOauth2project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String greet() {
		return "helo welcome to spring security";
	}
}
