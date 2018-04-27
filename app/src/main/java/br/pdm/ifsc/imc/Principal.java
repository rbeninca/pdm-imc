package br.pdm.ifsc.imc;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Principal extends AppCompatActivity {
    protected  Imc imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void calculaImc(View view) {

        Double peso= Double.parseDouble(((EditText) findViewById(R.id.editTextPeso)).getText().toString());
        Double altura= Double.parseDouble(((EditText) findViewById(R.id.editTextAltura)).getText().toString());

        this.imc=new Imc(peso,altura);

        TextView textViewResultado = (TextView) findViewById( R.id.ResultadoIMC);
        DecimalFormat f = new DecimalFormat("#.###");
        textViewResultado.setText(Double.toString((Double.parseDouble(f.format(this.imc.get_imc())))));
        ImageView imgview = (ImageView) findViewById(R.id.imageView);
        if (this.imc.get_imc()<18.5 ){
            imgview.setImageResource(R.drawable.abaixopeso);
        }
        if (this.imc.get_imc()>=18.5 && this.imc.get_imc()<25 ){
            imgview.setImageResource(R.drawable.normal);
        }
        if (this.imc.get_imc()>=25 && this.imc.get_imc()<=30 ){
            imgview.setImageResource(R.drawable.sobrepeso);
        }
        if (this.imc.get_imc()>30 && this.imc.get_imc()<35 ){
            imgview.setImageResource(R.drawable.obesidade1);
        }
        if (this.imc.get_imc()>35 && this.imc.get_imc()<40 ){
            imgview.setImageResource(R.drawable.obesidade2);
        }
        if (this.imc.get_imc()>40  ){
            imgview.setImageResource(R.drawable.obesidade3);
        }
    }
}
