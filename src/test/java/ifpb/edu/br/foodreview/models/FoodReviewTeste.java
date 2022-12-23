package ifpb.edu.br.foodreview.models;

import ifpb.edu.br.foodreview.exception.AvaliacaoNaoPodeSerNegativaException;
import ifpb.edu.br.foodreview.exception.NomenaoPodeSerNulo;
import ifpb.edu.br.foodreview.model.entity.Produto;
import ifpb.edu.br.foodreview.model.repository.ProdutoIF;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class FoodReviewTeste {
    Produto p1;

    @BeforeEach
    public void configurarProduto(){
        p1 = new Produto();
        p1.setAvaliacao(5);
    }

    @Test
    public void testarAvaliacao(){
        Assertions.assertEquals(5, p1.getAvaliacao());
    }

    @Test
    public void AvaliacaoNaoPodeSerNegativa(){
        Assertions.assertThrows(AvaliacaoNaoPodeSerNegativaException.class, () -> p1.setAvaliacao(-1));
    }

    @Test
    public void AvaliacaoNaoPodeSerMaiorQueCem(){
        Assertions.assertThrows(AvaliacaoNaoPodeSerNegativaException.class, () -> p1.setAvaliacao(101));
    }

    @Test
    public void NomenaoPodeSerNulo(){
        Assertions.assertThrows(NomenaoPodeSerNulo.class, () -> p1.setNome(null));
    }
}
