package com.iutvel.legigan_rochard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import static com.iutvel.legigan_rochard.R.id.spinner;

public class Surface extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surface);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Context context = getApplicationContext();
                String text = spinner.getSelectedItem().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                switch(text){
                    case("Carré"):

                        break;
                    case("Rectangle"):

                        break;
                    case("Triangle"):

                        break;
                    case("Trapèze"):

                        break;
                    case("Losange"):

                        break;
                    case("Parallélogramme"):

                        break;
                    case("Disque"):

                        break;
                    case("Ellipse"):

                        break;
                    case("Sphère"):

                        break;
                    case("Cône"):

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    public void redirection_volume(View view){
        startActivity(new Intent(this, Volume.class));
    }
}
