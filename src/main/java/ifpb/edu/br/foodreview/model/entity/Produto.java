package ifpb.edu.br.foodreview.model.entity;

import ifpb.edu.br.foodreview.exception.AvaliacaoNaoPodeSerNegativaException;
import ifpb.edu.br.foodreview.exception.NomenaoPodeSerNulo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_produto")
@Data
@EqualsAndHashCode
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="logo")
    private String logo;
    @Column(name="nome")
    private String nome;
    @Column(name="localizacao")
    private String localizacao;
    @Column(name="avaliacao")
    private int avaliacao;
    @Column(name="contato")
    private String contato;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if (nome == null){
            throw new NomenaoPodeSerNulo();
        }
        this.nome = nome;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public int getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao){
        if(avaliacao <0 || avaliacao > 100){
            throw new AvaliacaoNaoPodeSerNegativaException();
    }
        this.avaliacao = avaliacao;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato){
        this.contato = contato;
    }
}

