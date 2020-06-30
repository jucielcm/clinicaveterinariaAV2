package com.example.demo.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> list() {
		return clienteRepository.findAll();
	}
	
	public Cliente find(Integer id) {
		return clienteRepository.findById(id).get();
	}

}
