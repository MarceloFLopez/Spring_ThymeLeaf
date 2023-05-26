package br.com.spring_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring_project.model.Usuario;
import br.com.spring_project.repository.UsuarioRepository;
import br.com.spring_project.serviceimpl.UsuarioServiceImpl;

@Service
public class UsuarioService implements UsuarioServiceImpl{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void salvar(Usuario usuario) { 
        usuarioRepository.save(usuario);
    }
    
}
