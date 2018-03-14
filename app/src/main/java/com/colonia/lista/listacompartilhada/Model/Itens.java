package com.colonia.lista.listacompartilhada.Model;

/**
 * Created by ocram on 14/03/2018.
 */

public class Itens {

    private String nome;
    private int quantidade;

    public Itens(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
