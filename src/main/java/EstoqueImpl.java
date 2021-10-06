import java.util.Random;

public class EstoqueImpl implements EstoqueService {
    @Override
    public double getPrecoEstoque(String s) {
        Random random = new Random();
        try {
            Thread.sleep(50 + random.nextInt(50));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chamando serviço de estoque: " + s);

        return 10;
    }
}