package com.main;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Indigo")
public class Indigo {
	@GetMapping("/booking")
	public String booking() {
		return "Welcome to Indigo Airline for Flight booking and ticketing";
	}
	@PostMapping("/airport_Info")
	public String airport_Info() {
		return "Welcome to Indigo Airport and airline information";
			
	}
	@PutMapping("/flight_Status")
	public String flight_Status() {
		return "Welcome to Indigo Real-time flight status";
		
	}
	@DeleteMapping("/flight_History")
	public String flight_History() {
		return "Welcome to Indigo Historical flight data";
		
	}	
}
