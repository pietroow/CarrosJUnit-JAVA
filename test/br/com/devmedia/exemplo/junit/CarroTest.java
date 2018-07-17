package br.com.devmedia.exemplo.junit;

import org.junit.Test;

import java.time.LocalDate;

public class CarroTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExcecaoAoCriarCarroComAnoDeLancamentoInvalido(){

        Carro carro1 = new Carro("Urus", "Lamborghini", 2030, LocalDate.now());
    }

    @Test
    public void testExcecaoAoCriarCarroComAnoDeLancamentoValido(){

        Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
    }

}