package br.com.rodrigojulio.agendainfnet.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.rodrigojulio.agendainfnet.R;
import br.com.rodrigojulio.agendainfnet.dao.ContatoDAO;
import br.com.rodrigojulio.agendainfnet.modelo.Contato;

public class Lista_Contato_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contato);

        ContatoDAO dao = new ContatoDAO();
        setTitle("Lista de Contatos");

        FloatingActionButton btnAdicionar = findViewById(R.id.activity_lista_contato_fab_novo_aluno);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lista_Contato_Activity.this, Dados_Contato_Activity.class));
            }
        });
    }

    @Override
    protected void onResume() {

        super.onResume();
        ContatoDAO dao = new ContatoDAO();
        ListView listaContatos = findViewById(R.id.activity_lista_contato_listView);
        listaContatos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.todos()));
    }
}