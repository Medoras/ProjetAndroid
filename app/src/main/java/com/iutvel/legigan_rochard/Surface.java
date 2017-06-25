package com.iutvel.legigan_rochard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.iutvel.legigan_rochard.R.id.spinner;

public class Surface extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surface);

        //Initialisation des handlers des boutons
        Button butCar = (Button) findViewById(R.id.butCarre);
        butCar.setOnClickListener(this);

        Button butRect = (Button) findViewById(R.id.Rectangle);
        butRect.setOnClickListener(this);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Context context = getApplicationContext();
                String text = spinner.getSelectedItem().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                LinearLayout carre = (LinearLayout) findViewById(R.id.Carre);
                LinearLayout rectangle = (LinearLayout) findViewById(R.id.surfRectangleLayout);
                switch(spinner.getSelectedItem().toString()){
                    case("Carré"):
                        carre.setVisibility(View.VISIBLE);
                        rectangle.setVisibility(View.INVISIBLE);
                        break;
                    case("Rectangle"):
                        carre.setVisibility(View.INVISIBLE);
                        rectangle.setVisibility(View.VISIBLE);
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
                    default:
                        carre.setVisibility(View.INVISIBLE);
                        rectangle.setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    //gestion des fonctions à appeler en cas de click sur un bouton
    public void onClick(View v){
        switch (v.getId()){
            case R.id.butCarre:
                calculCarre();
                break;
            case R.id.Rectangle:
                calculRectangle();
                break;
            default:
                System.out.println("defaut");
                break;
        }
    }

    public void calculCarre(){
        EditText toto = (EditText) findViewById(R.id.editText); //Récupération du editText
        int valeur = Integer.parseInt(toto.getText().toString()); //Récupération de sa valeur en string
        TextView textview = (TextView) findViewById(R.id.textCarre); //Récupération du TextView où l'on va afficher le résultat
        textview.setText("Surface en cm² : "+String.valueOf(Math.pow(valeur,2))); //affichage du résultat
    }

    public void calculRectangle(){
        EditText longueurEdit = (EditText) findViewById(R.id.eTextLongueurRect); //Récupération du editText
        EditText largeurEdit = (EditText) findViewById(R.id.eTextLargeurRect); //Récupération du editText
        int valeurLongueur = Integer.parseInt(longueurEdit.getText().toString());
        int valeurLargeur = Integer.parseInt(largeurEdit.getText().toString());
        TextView textview = (TextView) findViewById(R.id.textRectangle); //Récupération du TextView où l'on va afficher le résultat
        textview.setText("Surface en cm² : "+String.valueOf(valeurLargeur * valeurLongueur)); //affichage du résultat

    }

    public void redirection_volume(View view){
        startActivity(new Intent(this, Volume.class));
    }
}
