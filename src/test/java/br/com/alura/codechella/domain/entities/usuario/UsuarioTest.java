package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalAccessException.class,
        () -> new Usuario("123456789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    //Código omitido

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){
        FabricaUsuario fabrica = new FabricaUsuario();
        Usuario usuario = fabrica.comNomeCpfNacimento("Emily", "654.123.897-88",
                LocalDate.parse("2000-10-01"));
    }
}
