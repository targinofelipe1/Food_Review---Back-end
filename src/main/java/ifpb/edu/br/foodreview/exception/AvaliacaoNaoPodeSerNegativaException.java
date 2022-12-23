package ifpb.edu.br.foodreview.exception;

public class AvaliacaoNaoPodeSerNegativaException extends RuntimeException {
    public AvaliacaoNaoPodeSerNegativaException(){super("Avaliação não pode ser negativa ou maior que 100");}
}
