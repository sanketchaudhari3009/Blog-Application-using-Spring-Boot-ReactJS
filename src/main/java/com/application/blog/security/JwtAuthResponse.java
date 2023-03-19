package com.application.blog.security;

import com.application.blog.payloads.UserDto;

import lombok.Data;

@Data
public class JwtAuthResponse {
	
	private String token;
	
	private UserDto user;

}
