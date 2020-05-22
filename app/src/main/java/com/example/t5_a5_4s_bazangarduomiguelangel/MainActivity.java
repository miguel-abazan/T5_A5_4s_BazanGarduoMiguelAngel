package com.example.t5_a5_4s_bazangarduomiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText cajaTem,cajaRes;
    private Spinner spinnerAConvertir, spinnerConvercion;
    private ArrayAdapter adapter;
    private String medidaTem[]= {"Centigrados","Fahrenheit","Kelvin","Rankin"};
    private double c,f,k,r,res;
    private String v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerAConvertir = findViewById(R.id.spinner_de);
        spinnerConvercion = findViewById(R.id.spinner_a);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,medidaTem);
        spinnerAConvertir.setAdapter(adapter);
        spinnerConvercion.setAdapter(adapter);

        cajaTem= findViewById(R.id.caja_tem);
        cajaRes = findViewById(R.id.caja_res);



        spinnerAConvertir.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 v1=medidaTem[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerConvercion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                v2 = medidaTem[position];
                if (v1 == "Centigrados" && v2 == "Fahrenheit") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = (c * 1.8) + 32;
                    String mr = String.valueOf(res);
                    cajaRes.setText("");
                    cajaRes.setText(mr);
                } else if (v1 == "Centigrados" && v2 == "Kelvin") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = c + 273.15;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Centigrados" && v2 == "Rankin") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = (c * 1.8) + 491.67;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                }
                if (v1 == "Fahrenheit" && v2 == "Centigrados") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = (c - 32) * 0.55;
                    String mr = String.valueOf(res);
                    cajaRes.setText("");
                    cajaRes.setText(mr);
                } else if (v1 == "Fahrenheit" && v2 == "Kelvin") {
                    f = Double.parseDouble(cajaTem.getText().toString());
                    res = (c - 32) * 0.55 + 273.15;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Fahrenheit" && v2 == "Rankin") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = c + 459.67;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                }
                if (v1 == "Kelvin" && v2 == "Centigrados"){
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = c - 273.15;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Kelvin" && v2 == "Fahrenheit") {
                    f = Double.parseDouble(cajaTem.getText().toString());
                    res = (c - 273.15) * 1.8 + 32;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Kelvin" && v2 == "Rankin") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = c *1.8;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                }
                if (v1 == "Rankin" && v2 == "Centigrados"){
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = (c - 491.67)* 0.55;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Rankin" && v2 == "Fahrenheit") {
                    f = Double.parseDouble(cajaTem.getText().toString());
                    res = c -459.67;
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                } else if (v1 == "Rankin" && v2 == "Kelvin") {
                    c = Double.parseDouble(cajaTem.getText().toString());
                    res = c *(5/9);
                    String mr = String.valueOf(res);
                    cajaRes.setText(mr);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
