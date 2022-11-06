package com.example.lifevet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class Dashboard extends AppCompatActivity {

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        nav = findViewById(R.id.nav);


        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.homebutton:
                        Toast.makeText(Dashboard.this,"home",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.search:
                        Toast.makeText(Dashboard.this,"search",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.stethoscope:
                        Toast.makeText(Dashboard.this,"stethoscope",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.pets:
                        Toast.makeText(Dashboard.this,"pets",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.messages:
                        Toast.makeText(Dashboard.this,"messages",Toast.LENGTH_LONG).show();
                        break;

                    default:
                }






                return true;
            }
        });
    }
}