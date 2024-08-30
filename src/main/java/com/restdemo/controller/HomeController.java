package com.restdemo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;




@RestController
public class HomeController {
	
//	@GetMapping("/users")
//	public String getuser() {
//		return "Hi Spring welcome ";
//	}
//	@GetMapping("/users1")
//	public int getuser1() {
//		return 12;
//	}
	
	@GetMapping("/sub")
	public int mark1(@RequestParam ("a")int opt1,@RequestParam ("b") int opt2) {
		return opt1-opt2;
	}
	@GetMapping("/multi")
	public int mark2(@RequestParam ("a")int opt1,@RequestParam ("b") int opt2) {
		return opt1*opt2;
	}
	@GetMapping("/div")
	public int mark3(@RequestParam ("a")int opt1,@RequestParam ("b") int opt2) {
		return opt1/opt2;
	}
	@GetMapping("/add")
	public int mark4(@RequestParam ("a")int opt1,@RequestParam ("b") int opt2) {
		return opt1+opt2;
	}
	@GetMapping("/add/{a}/{b}")
	public int mark5(@PathVariable ("a")int opt1,@PathVariable ("b") int opt2) {
		return opt1+opt2;
	}
	
	@PostMapping("/save")
	public String saveUserdata(@RequestBody Users user){
		if(user.getUserName().equals("Ajeem")) {
			return "valid user";
		}
		return "User";
		
	}
	
	
	

	
	
}
