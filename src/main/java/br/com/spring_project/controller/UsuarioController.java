package br.com.spring_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.spring_project.model.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @GetMapping("/novo")
	public String adicionaUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "publica-criar-usuario";
	}


    
}
