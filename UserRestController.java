package com.simplilearnphase3.Sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearnphase3.Sportyshoes.model.User;
import com.simplilearnphase3.Sportyshoes.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	

	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		User user = userService.findById(id);
		if (user == null) {
			throw new RuntimeException("User id not found - " + id);
		}
		return user;
	}
	

	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteEmployee(@PathVariable int id) {
		User user = userService.findById(id);
		// throw exception if null
		if (user == null) {
			throw new RuntimeException("Employee id not found - " + user);
		}
		userService.deleteById(id);
		return "Deleted employee id - " + id;
	}

}
