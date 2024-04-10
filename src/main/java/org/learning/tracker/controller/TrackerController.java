package org.learning.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {
	
	@GetMapping("/app-info")
	public String appInfo() {
		return "Tracker Service";
	}
}
