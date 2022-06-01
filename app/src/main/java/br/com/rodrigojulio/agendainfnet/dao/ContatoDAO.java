package br.com.rodrigojulio.agendainfnet.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.rodrigojulio.agendainfnet.modelo.Contato;

public class ContatoDAO {

    private static List<Contato> contatos = new ArrayList<>();

    public void salva(Contato novoContato){
        contatos.add(novoContato);
    }

    public List<Contato> todos(){
        return new ArrayList<>(contatos);
    }
}
