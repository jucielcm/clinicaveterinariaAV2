package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Animal;
import com.example.demo.repository.AnimalRepository;
@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> List(){
		return animalRepository.findAll();
	}
	
	public Animal find(Integer id) {
		return animalRepository.findById(id).get();
	}

}
