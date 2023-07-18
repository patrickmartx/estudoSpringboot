package com.patrickmartins.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickmartins.aula01.modelo.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
