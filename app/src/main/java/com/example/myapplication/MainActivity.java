package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText name2;
    Button btn;
    TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText) findViewById(R.id.numero1);
        name2 = (EditText) findViewById(R.id.numero2);
        msg = (TextView) findViewById(R.id.resultado);
        btn = (Button) findViewById(R.id.suma);

        btn.setOnClickListener(this);
    }

    public void onClick(View view) {

        int entero = Integer.parseInt(name.getText().toString());
        int entero2 = Integer.parseInt(name2.getText().toString());
        int resultado2 = entero + entero2;

        msg.setText("Hola" + resultado2 + "Gracias");
    }
}
