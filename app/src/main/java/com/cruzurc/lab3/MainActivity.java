package com.cruzurc.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bmw = findViewById(R.id.button_bmw);
        Button chevy = findViewById(R.id.button_cheverolet);
        Button honda = findViewById(R.id.button_honda);
        int time = 500;
        ArrayList<Car> cars = new ArrayList<Car>();
        Showroom showroom = new Showroom(cars);
        showroom.loadCars(this);

        //final String bmwToast = showroom.getCar(0).toString();
        //final String chevyToast = showroom.getCar(1).toString();
        //final String hondaToast = showroom.getCar(2).toString();


        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(), "bmwToast", Toast.LENGTH_LONG).show();
                Car bmwCar = showroom.getCar(2);
                if( bmwCar != null){
                    Toast.makeText(view.getContext(), bmwCar.toString(), Toast.LENGTH_LONG).show();

                }
            }
        });

        chevy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Car chevy = showroom.getCar(1);
                if (chevy != null) {
                    Toast.makeText(view.getContext(),chevy.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

        honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Car honda = showroom.getCar(3);
                if (honda != null) {
                    Toast.makeText(view.getContext(),honda.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}