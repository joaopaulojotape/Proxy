import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ServicoPrecoEstoqueTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test(){
        EstoqueService estoqueService = new EstoqueImpl();
        List<String> symbols = Arrays.asList(
                "ESTOQUE1", "ESTOQUE2", "ESTOQUE3", "ESTOQUE4");
        assertArrayEquals(symbols.forEach(estoqueService::getPrecoEstoque));


    }


}