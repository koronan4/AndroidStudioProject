package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView nom, prenom,email,numero,Age;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nom = (EditText)findViewById(R.id.nom);
        prenom = (EditText)findViewById(R.id.prenom);
        email = (EditText)findViewById(R.id.email);
        numero = (EditText)findViewById(R.id.numero);
        Age = (EditText)findViewById(R.id.Age);
        btn = (Button) findViewById(R.id.boutonenvoi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nomsaisi = nom.getText().toString();
                final String prenomsaisi = prenom.getText().toString();
                final String emailsaisi = email.getText().toString();
                final String numerosaisi = numero.getText().toString();
                final String agesaisi = Age.getText().toString();
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("lenom",nomsaisi);
                intent.putExtra("leprenom",prenomsaisi);
                intent.putExtra("leemail",emailsaisi);
                intent.putExtra("lenumero",numerosaisi);
                intent.putExtra("lage",agesaisi);
                MainActivity2.this.startActivity(intent);

            }
        });
    }
}
