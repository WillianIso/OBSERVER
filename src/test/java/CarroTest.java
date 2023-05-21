import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveNotificarUmCliente() {
        Concessionaria concessionaria = new Concessionaria(2021, "Concessionaria", "Corolla");
        Carro carro = new Carro("Cliente Fulano");
        carro.matricular(concessionaria);
        concessionaria.novoCarro();
        assertEquals("Cliente Fulano, chegou na Concessionaria{codigo=2021, nomeConcessionaria='Concessionaria', nomeModelo=Corolla'}", carro.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Concessionaria concessionaria = new Concessionaria(2021, "concessionaria", "Renegade");
        Carro carro = new Carro("Cliente Fulano");
        concessionaria.novoCarro();
        assertEquals(null, carro.getUltimaNotificacao());
    }

}