package com.example.listapersonagens.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Personagem implements Serializable {

    /*Carregando variáveis*/
    private String nome;
    private String altura;
    private String nascimento;
    private String genero;
    private String telefone;
    private String rg;
    private String cep;

    private int id = 0;

    public Personagem(String nome, String altura, String nascimento, String genero, String telefone, String rg, String cep) {
        /*Setando as variáveis carregadas acima*/
        this.nome = nome;
        this.altura = altura;
        this.nascimento = nascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.rg = rg;
        this.cep = cep;
    }

    //Serve para que não ocorra erro quando todos os campo estiverem vazios
    public Personagem() {
    }
    //Todos os Get e Set abaixo pegam e gravam as informações
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getRg() { return rg; }

    public void setRg(String rg) { this.rg = rg; }

    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }

    //Pega e grava o ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    //Verifica se o ID é valido
    public boolean IdValido() {
        return id > 0;
    }
}