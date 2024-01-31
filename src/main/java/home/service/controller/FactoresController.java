package home.service.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import home.service.dto.FactoryDto;

@RestController
public class FactoresController {

	@GetMapping("/factory")
	public ArrayList<FactoryDto> getAll() {
		ArrayList<FactoryDto> factories = new ArrayList<FactoryDto>();
		factories.add(new FactoryDto("Tnuva"));
		factories.add(new FactoryDto("Donon"));
		factories.add(new FactoryDto("Nestle"));
		System.out.println("getAll");
		return factories;
	}

	@GetMapping("/factory/{id}")
	public FactoryDto getFactory(@PathVariable String id) {
		return new FactoryDto("SuperFarm");
	}

}
