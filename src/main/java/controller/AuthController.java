package com.tecmax.sistema.controller;

import com.tecmax.sistema.dto.AuthResponse;
import com.tecmax.sistema.dto.LoginRequest;
import com.tecmax.sistema.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}