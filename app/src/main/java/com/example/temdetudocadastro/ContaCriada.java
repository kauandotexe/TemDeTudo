package com.example.temdetudocadastro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContaCriada extends AppCompatActivity {

    private Button btnVoltar;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conta_criada);

        btnVoltar = findViewById(R.id.btnVoltar);
        texto = findViewById(R.id.textPrincipal);


        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome");

        texto.setText("Seja bem vindo " + nome + "!");



        btnVoltar.setOnClickListener(v -> {
            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}