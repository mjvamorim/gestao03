package com.algaworks.festas.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festas.models.Convidado;
import com.algaworks.festas.repositories.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private Convidados cr;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados",cr.findAll());
		Convidado c = new Convidado();
		mv.addObject("convidado", c);
		return(mv);
	}
	
	@PostMapping 
	public String salvar(Convidado c) {
		cr.save(c);
		return "redirect:/convidados";
	}
	
	@RequestMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		cr.deleteById(id);
		return "redirect:/convidados";
	}
	
	@RequestMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados",cr.findAll());
		Convidado c = cr.getOne(id);
		mv.addObject( "convidado",c);
		return (mv);
	}
	
	

}
