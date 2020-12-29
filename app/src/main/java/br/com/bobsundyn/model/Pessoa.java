package br.com.bobsundyn.model;

public class Pessoa {

    public String nome;
    public String imagem;
    public String email;

    public Pessoa(String nome, String imagem, String email){
        this.nome = nome;
        this.imagem = imagem;
        this.email = email;
        //alt+ins - para gerar constructor get e set e etc
    }
}
