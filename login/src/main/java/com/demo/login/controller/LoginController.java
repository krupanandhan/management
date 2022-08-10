package com.demo.login.controller;

import com.demo.login.model.LoginRequestDTO;
import com.demo.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/login")
public class LoginController {


	@Autowired LoginService loginService;

	@GetMapping("/test/{username}")
	public ResponseEntity<String> test(@PathVariable String username) {
		return loginService.test(username);
	}

	@PostMapping("/verify")
	public ResponseEntity<String> verify(@RequestBody LoginRequestDTO request) {
		return loginService.verify(request);
	}
}
