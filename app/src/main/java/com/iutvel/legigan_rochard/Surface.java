package com.iutvel.legigan_rochard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Surface extends AppCompatActivity  {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surface);
    }

    public void redirection_volume(View view){
        startActivity(new Intent(this, Volume.class));
    }
}
