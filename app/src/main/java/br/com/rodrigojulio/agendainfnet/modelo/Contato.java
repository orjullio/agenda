package br.com.rodrigojulio.agendainfnet.modelo;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private String cidade;

    public Contato(String nome, String telefone, String email, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
    }

    public String toString(){return nome;}
}
