package com.algaworks.festas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festas.models.Convidado;

@Controller
@RequestMapping( "/")
public class GeralController {
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Home");
		return(mv);
	}
	
	@GetMapping("localizacao")
	public ModelAndView localizacao() {
		ModelAndView mv = new ModelAndView("Localizacao");
		return(mv);
	}

}
