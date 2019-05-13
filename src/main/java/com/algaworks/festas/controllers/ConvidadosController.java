package com.algaworks.festas.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festas.models.Convidado;
import com.algaworks.festas.repositories.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados cr;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados",cr.findAll());
		Convidado c = new Convidado();
		mv.addObject("convidado", c);
		return(mv);
	}
	
	@PostMapping("/convidados") 
	public String salvar(Convidado c) {
		cr.save(c);
		return "redirect:/convidados";
	}
	
	

}
