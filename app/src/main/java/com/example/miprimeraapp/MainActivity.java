package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    //Este metodo sirve para sumar
    public void suma(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1+num2;
        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }

    //Este metodo es para la resta
    public void resta(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resta = num1-num2;
        String resultado = String.valueOf(resta);
        tv1.setText(resultado);
    }

    //Este metodo es para la multiplicación
    public void mult(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int mult = num1*num2;
        String resultado = String.valueOf(mult);
        tv1.setText(resultado);
    }

    //Este metodo es para la división
    public void division(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int division = num1/num2;
        String resultado = String.valueOf(division);
        tv1.setText(resultado);
    }

}