package com.main;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/AirIndia")
public class AirIndia {
	@GetMapping("/booking")
	public String booking() {
		return "Welcome to Air India Airline for Flight booking and ticketing";
	}
	@PostMapping("/airport_Info")
	public String airport_Info() {
		return "Welcome to Air India Airport and airline information";
			
	}
	@PutMapping("/flight_Status")
	public String flight_Status() {
		return "Welcome to Air India Real-time flight status";
		
	}
	@DeleteMapping("/flight_History")
	public String flight_History() {
		return "Welcome to Air India Historical flight data";
		
	}	

}
