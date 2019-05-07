package com.algaworks.festas.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.algaworks.festas.repositories.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidadosRepository;
	
	@GetMapping("/convidados")
	public String listar() {
		return("ListaConvidados");
	}
	
	

}
