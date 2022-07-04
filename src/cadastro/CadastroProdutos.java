package cadastro;

import java.util.ArrayList;

public class CadastroProdutos {
    ArrayList cadastroProdutos = new ArrayList();

    private String nome;
    private String modelo;
    private String tamanho;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        cadastroProdutos.add(nome);
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        cadastroProdutos.add(modelo);
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        cadastroProdutos.add(tamanho);
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        cadastroProdutos.add(preco);
        this.preco = preco;
    }

}
