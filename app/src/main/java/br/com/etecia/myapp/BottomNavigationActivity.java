package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {
        BottomNavigationView idBottomNavView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_layout);

       idBottomNavView = findViewById(R.id.BottomNavView);

       idBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.mNavFav:
                       startActivity(new Intent(getApplicationContext(), MainActivity.class));
                       break;
                   case R.id.mMUsic:
                       Toast.makeText(getApplicationContext(),"Cliquei no Music",Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.mPlace:
                       Toast.makeText(getApplicationContext(),"Cliquei no Place",Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.mNewspaper:
                       Toast.makeText(getApplicationContext(),"Cliquei no NewsPaper",Toast.LENGTH_SHORT).show();
                       break;
               }
               return false;
           }
       });
    }
}