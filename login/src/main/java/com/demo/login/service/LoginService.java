package com.demo.login.service;

import com.demo.login.model.LoginRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    String username = "Maha";
    String password = "pass";


    public ResponseEntity<String> test(String username) {
        if(username.equalsIgnoreCase("Raj"))
            return new ResponseEntity<>("Not allowed", HttpStatus.UNAUTHORIZED);
        return ResponseEntity.ok("Welcome, "+username);
    }

    public ResponseEntity<String> verify(LoginRequestDTO request) {
        if(!request.getUsername().equals(username))
            return new ResponseEntity<>("Invalid username", HttpStatus.UNAUTHORIZED);
        if(!request.getPassword().equals(password))
            return new ResponseEntity<>("Invalid password", HttpStatus.UNAUTHORIZED);

        return ResponseEntity.ok("Successful Login");
    }
}
