package com.example.temdetudocadastro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cadastrar extends AppCompatActivity {

    private Button btnVoltar;
    private Button btnSet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastrar);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnSet = findViewById(R.id.btnSet);

        EditText CampoNome = findViewById(R.id.editTextNome);



        btnVoltar.setOnClickListener(v -> {
            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        });

        btnSet.setOnClickListener(v -> {
            Intent cadastrar = new Intent(this, ContaCriada.class);
            cadastrar.putExtra("nome", CampoNome.getText().toString());
            startActivity(cadastrar);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}