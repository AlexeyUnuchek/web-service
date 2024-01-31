package home.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import home.service.dto.PersonDto;
import home.service.dto.PersonEatDto;

@RestController
public class ServiceController {
	
	@GetMapping("/hello")
   public String hello(@RequestParam("title") String name) {
	   return "Hello " + name;
   }
	
	@PostMapping("/hello")
	public String helloPerson(@RequestBody PersonDto personDto) {
		return "Hello " + personDto.getFirstName() + " " + personDto.getLastName();
	}
	
	@PostMapping("/food")
	public PersonEatDto personEating(@RequestBody PersonDto personDto) {
		return PersonEatDto.builder()
				.fullName(personDto.getFirstName() + " " + personDto.getLastName())
				.food("Candy")
				.food("Cake")
				.food("Cookies")
				.build();
	}
}
