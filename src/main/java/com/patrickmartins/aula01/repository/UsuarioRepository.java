package com.patrickmartins.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickmartins.aula01.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}


