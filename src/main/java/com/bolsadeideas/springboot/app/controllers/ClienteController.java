package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.app.models.dao.IClienteDAO;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteDAO clienteDAO;

	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","Lista de Clientes");
		model.addAttribute("clientes",clienteDAO.finAll());
		return "listar";
	}
}
