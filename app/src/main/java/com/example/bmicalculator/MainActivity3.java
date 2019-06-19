package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity3 extends AppCompatActivity {

    private String leprenom, lenom,leemail,lenumero,lage;
    private TextView textprenom, textnom,tail,poi,rst,textemail,textnumero,textage;
    private Button btn,btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        lenom=getIntent().getStringExtra("lenom");
        leprenom=getIntent().getStringExtra("leprenom");
        leemail=getIntent().getStringExtra("leemail");
        lenumero=getIntent().getStringExtra("lenumero");
        lage=getIntent().getStringExtra("lage");


        textnom = (TextView)findViewById(R.id.textView4);
        textprenom=(TextView)findViewById(R.id.textView5);
        textemail=(TextView)findViewById(R.id.textView11);
        textnumero=(TextView)findViewById(R.id.textView13);
        textage=(TextView)findViewById(R.id.textView8);
        poi=(TextView)findViewById(R.id.editText8);
        rst=(TextView)findViewById(R.id.textView17);
        tail=(TextView)findViewById(R.id.editText9);
        btn = (Button)findViewById(R.id.button3);
        btt = (Button)findViewById(R.id.button2);


        textnom.setText(lenom);
        textprenom.setText(leprenom);
        textemail.setText(leemail);
        textnumero.setText(lenumero);
        textage.setText(lage);

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lataille = Double.parseDouble(tail.getText().toString());
                Double lepoids = Double.parseDouble(poi.getText().toString());
                Double imc = lepoids/(lataille*lataille);
                rst.setText("M."+lenom+" votre imc est: "+imc);
            }
        });

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst.setText("Pas encore implémenté !");

            }
        });



    }
}
