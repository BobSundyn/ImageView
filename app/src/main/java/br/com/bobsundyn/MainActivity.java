package br.com.bobsundyn;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.bobsundyn.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    EditText textNome, textImagem, textEmail;
    Button btnCadastrar;
    ListView listPessoas;
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    PessoaAdapter adapterPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNome = findViewById(R.id.textNome);
        textImagem = findViewById(R.id.textImagem);
        textEmail = findViewById(R.id.textEmail);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        listPessoas = findViewById(R.id.listPessoas);

        adapterPessoas = new PessoaAdapter(this, pessoas);
        listPessoas.setAdapter(adapterPessoas);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = textNome.getText().toString();
                String imagem = textImagem.getText().toString();
                String email = textEmail.getText().toString();
                Pessoa pessoa = new Pessoa(nome, imagem, email);
                pessoas.add(pessoa);
                adapterPessoas.notifyDataSetChanged();
            }
        });

    }
}