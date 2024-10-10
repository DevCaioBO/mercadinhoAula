package com.projeto.santoandre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasks.controllers.RequestTasks;
import com.projeto.santoandre.models.FruitModel;
import com.projeto.santoandre.repositories.FruitRepository;

import jakarta.validation.Valid;



@RestController
@Controller
@RequestMapping("fruits")

public class FrutasController {
	
	@Autowired
	private FruitRepository repository;
	
	@GetMapping("/getfruits")
	public List<FruitModel> getFruits() {
		List<FruitModel> getmodelfruit = repository.findAll();
		return getmodelfruit;
	}
	
	@PostMapping("/postfruits")
	public List<FruitModel> postFruits(@Valid @RequestBody  FruitDTO data) {
		FruitModel teste = new FruitModel();
		teste.setNomefruit(data.nomefruit());
		teste.setColor(data.color());
		teste.setPrice(data.price());
		repository.save(teste);
		List<FruitModel> postmodelfruit = repository.findAll();
		return postmodelfruit;
	}
}
