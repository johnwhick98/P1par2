package com.isc.p1par2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton visc,vtics,vambiental,vgastro;
    CheckBox vcasa,vescuela,vtrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc=(RadioButton) findViewById(R.id.rdIsc);
        vtics=(RadioButton) findViewById(R.id.rdTics);
        vambiental=(RadioButton) findViewById(R.id.rdAmbiental);

        vgastro=(RadioButton) findViewById(R.id.rdGastro);

        vcasa=(CheckBox) findViewById((R.id.checkBox));
        vescuela=(CheckBox) findViewById((R.id.checkBox2));
        vtrabajo=(CheckBox) findViewById((R.id.checkBox3));


    }
    public void seleccion (View view    ){
        if(visc.isChecked()) Toast.makeText(this,"Ingenieria en sistemas", Toast.LENGTH_SHORT).show();
        if(vtics.isChecked()) Toast.makeText(this,"Ingenieria en TICS", Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this,"Ingenieria ambiental", Toast.LENGTH_SHORT).show();
        if(vgastro.isChecked()) Toast.makeText(this,"Licenciatura en gastronomia", Toast.LENGTH_SHORT).show();

        if(vcasa.isChecked()) Toast.makeText(this,"Ocupas internet en casa", Toast.LENGTH_SHORT).show();
        if(vescuela.isChecked()) Toast.makeText(this,"Ocupas internet en la escuela", Toast.LENGTH_SHORT).show();
        if(vtrabajo.isChecked()) Toast.makeText(this,"Ocupas internet en el trsbajo", Toast.LENGTH_SHORT).show();
    }
}
