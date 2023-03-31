package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //declarando variavel global que ira representar o xml no java

    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        //Criando clique no menu de navagação
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "cliquei no menu hamburguer", Toast.LENGTH_SHORT).show();
            }
        });

        //criando clique nos itens do menu

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(), "cliquei no Favorito", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBuscar:
                        Toast.makeText(getApplicationContext(), "cliquei no Buscar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(), "cliquei no Compartilhar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSalvar:
                        Toast.makeText(getApplicationContext(), "cliquei no Salvar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSair:
                        Toast.makeText(getApplicationContext(), "cliquei no Sair", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}