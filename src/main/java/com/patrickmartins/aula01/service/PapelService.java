package com.patrickmartins.aula01.service;

import com.patrickmartins.aula01.modelo.Papel;

import java.util.List;

public interface PapelService {
    public Papel buscarPapelPorId(Long id);
    public Papel buscarPapel(String papel);
    public List<Papel> listarPapel();
}
