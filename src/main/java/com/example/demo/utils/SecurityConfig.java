package com.example.demo.utils;

import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {
	@Bean
	public PasswordEncoder passwordEncoder(){
	    return new BCryptPasswordEncoder(10, new SecureRandom()); // Para saltos

	}
}
