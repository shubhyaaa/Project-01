package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.Avengers;
import com.springboot.services.AvengerService;

@RestController
@RequestMapping("/avenger")
public class BasicController {

	@Autowired
	private AvengerService avengerService = null;

	@GetMapping("/assemble")
	public String avengersAssemble() {
		return "Hello World!...Avengers Assemble";
	}

	@PostMapping("/saveYourself")
	public void saveAvenger(@RequestBody Avengers avenger) {
		avengerService.saveAvenger(avenger);
	}
	
	@PutMapping("/updateYourself")
	private void updateAvenger(@RequestBody Avengers avenger) {
		avengerService.updateAvenger(avenger);
	}
	
	@DeleteMapping("/deleteAvenger/{id}")
	private void deleteAvenger(@PathVariable Integer id) {
		avengerService.deleteAvenger(id);
	}

}
