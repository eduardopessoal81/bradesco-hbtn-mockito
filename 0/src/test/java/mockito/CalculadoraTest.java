package mockito;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

    @Mock
    private ServicoMatematico servico;

    @Test
    void testeSomar() {

        // Configurando o mock
        when(servico.somar(2, 3)).thenReturn(5);

        // Instanciando a calculadora com o mock
        Calculadora calc = new Calculadora(servico);

        int resultado = calc.somar(2, 3);

        // Validando
        assertEquals(5, resultado);
    }
}