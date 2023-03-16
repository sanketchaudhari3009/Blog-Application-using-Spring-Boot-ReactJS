package com.application.blog.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.blog.payloads.UserDto;
import com.application.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	// POST-create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser( @RequestBody UserDto userDto) {
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

//	// PUT- update user
//
//	@PutMapping("/{userId}")
//	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer uid) {
//		UserDto updatedUser = this.userService.updateUser(userDto, uid);
//		return ResponseEntity.ok(updatedUser);
//	}
//
//	//ADMIN
//	// DELETE -delete user
//	@PreAuthorize("hasRole('ADMIN')")
//	@DeleteMapping("/{userId}")
//	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid) {
//		this.userService.deleteUser(uid);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully", true), HttpStatus.OK);
//	}
//
//	// GET - user get
//	@GetMapping("/")
//	public ResponseEntity<List<UserDto>> getAllUsers() {
//		return ResponseEntity.ok(this.userService.getAllUsers());
//	}
//
//	// GET - user get
//	@GetMapping("/{userId}")
//	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId) {
//		return ResponseEntity.ok(this.userService.getUserById(userId));
//	}
	
}