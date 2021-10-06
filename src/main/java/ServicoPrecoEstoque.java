import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServicoPrecoEstoque implements EstoqueService {
    private EstoqueService estoqueService;
    private Map<String, Double> c = new ConcurrentHashMap<>();
    public ServicoPrecoEstoque(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }
    @Override
    public double getPrecoEstoque(String s) {
        return c.computeIfAbsent(s,
                s1 -> estoqueService.getPrecoEstoque(s1));
    }
}