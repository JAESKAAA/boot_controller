package com.cos.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.demo.Domain.User;

@RestController
public class HttpResponseJsonController {

	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\":\"cos\"}";
	}
	
	@GetMapping("/resp/json/object")
	public String respJsonToObject() {
		User user = new User();
		
		user.setUsername("홍길동");
		
		String data = "{\"username\":\""+user.getUsername()+"\"}";
		return data;
	}
	@GetMapping("/resp/json/javaObject")
	public User respJsonToJavaObject() {
		User user = new User();
		
		user.setUsername("홍길동");
		
		return user;
	}
}
