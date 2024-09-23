package com.sesi.aula04.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sesi.aula04.Repository.UsuarioRepository;
import com.sesi.aula04.model.Usuario;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public String listarUsuario(Model modelo) {
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		
		return "usuarios";
	}

	
	
}