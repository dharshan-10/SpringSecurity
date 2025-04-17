package com.SpringSecurity.demo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet(){
        return  "Welcome";
    }
    @GetMapping("/csrf")
    public CsrfToken getcsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
