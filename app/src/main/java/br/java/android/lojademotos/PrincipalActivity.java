package br.java.android.lojademotos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Gallery;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Gallery minhaGaleria = (Gallery) findViewById(R.id.galeriaImagem);
        minhaGaleria.setAdapter(new AdaptadorImagens(this));
    }
}
