package com.kl.SpringOauth2project;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kl.SpringOauth2project.dto.UserDto;

@RestController
public class HelloController {


	@GetMapping("/")
	public String greet() {
		return "helo welcome to spring security";
	}
	
	@GetMapping("/user")
	public UserDto user(@AuthenticationPrincipal OAuth2User auth2User) {
		
		
		UserDto u = new UserDto();
		
		String name = auth2User.getName();
		String email = auth2User.getAttribute("email");
		String password = auth2User.getAttribute("password");
		
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		
		return u;
	}
}
