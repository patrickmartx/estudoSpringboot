package com.patrickmartins.aula01.service;

import com.patrickmartins.aula01.modelo.Usuario;

import java.util.List;

public interface UsuarioService {
    public void apagarUsuarioPorId(Long id);
    public Usuario buscarUsuarioPorId(Long id);
    public Usuario buscarUsuarioPorLogin(String login);
    public Usuario gravarUsuario(Usuario usuario);
    public void alterarUsuario(Usuario usuario);
    public List<Usuario> listarUsuario();
    public void atribuirPapelParaUsuario(long idUsuario, int[] idsPapeis, boolean isAtivo);
}
