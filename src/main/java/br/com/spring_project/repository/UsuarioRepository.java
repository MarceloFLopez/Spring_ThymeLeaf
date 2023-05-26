package br.com.spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring_project.model.Usuario;

public interface UsuarioRepository  extends JpaRepository <Usuario , Long>{
    
}
