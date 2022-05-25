package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;



@RestController
//Esse anotação é referente ao caminho que esse controlador 
//irá responder.
@RequestMapping(value = "/users")
public class UserController {
	//Criando endPoints
	
	//Acessando o banco atraves de uma composição
	//Usando também a injeção de dependencia do framework
	
	@Autowired
	private UserRepository repository;
	
	//Buscando todos os usuarios do banco
	@GetMapping
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
	
	//Buscando um unico usuarios do banco
	@GetMapping(value = "{id}")
	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	//Criando um novo usuario
	@PostMapping
	public User isert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
}
