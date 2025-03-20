package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;

public class FabricaUsuario {
    private Usuario usuario;
    public Usuario comNomeCpfNacimento(String nome, String cpf, LocalDate nascimento){
        this.usuario = new Usuario(cpf,nome, nascimento, "");
        return this.usuario;
    }

    public Usuario IncluiEndereco(String cep, Integer numero, String complemento){
        this.usuario.setEndereco(new Endereco(cep,numero,complemento));
        return this.usuario;
    }
}
