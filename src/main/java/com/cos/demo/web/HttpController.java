package com.cos.demo.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller -> 파일을 응답하는 컨트롤러 (클라이언트가 브라우저면 .html을 응답해야 하니까 해당 어노테이션 사용)
@RestController //DATA를 응답하는 컨트롤러 (클라이언트가 모바일인 경우, 데이터를 응답해야해서 RestController 사용)
public class HttpController {

	@GetMapping("/get")
	public String get() {
		return "<h1>get요청됨</h1>";
	}
	
	@PostMapping("/post")
	public String post() {
		return "post요청됨";

	}
	
	@PutMapping("/put")
	public String put() {
		return "put요청됨";

	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete요청됨";
		
	}
}
