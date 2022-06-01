package br.com.rodrigojulio.agendainfnet.ui.activity;

import static android.os.Environment.getExternalStorageDirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;

import br.com.rodrigojulio.agendainfnet.R;
import br.com.rodrigojulio.agendainfnet.dao.ContatoDAO;
import br.com.rodrigojulio.agendainfnet.modelo.Contato;

public class Dados_Contato_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_contato);

        setTitle("Inserir Contato");

        final ContatoDAO dao = new ContatoDAO();

        EditText campoNome = findViewById(R.id.dados_contato_nome);
        EditText campoTelefone = findViewById(R.id.dados_contato_telefone);
        EditText campoEmail = findViewById(R.id.dados_contato_email);
        EditText campoCidade = findViewById(R.id.dados_contato_cidade);

        Button btnSalvar = findViewById(R.id.dados_contato_salvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                String cidade = campoCidade.getText().toString();

                Contato novoContato = new Contato(nome, telefone, email, cidade);
                dao.salva(novoContato);
                finish();
            }
        });
    }

}