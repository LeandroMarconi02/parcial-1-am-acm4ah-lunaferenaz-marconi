package ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi;
import static ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.R.id.inventario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btnBuscarLibro;


        btnBuscarLibro = (Button) findViewById(R.id.btnBuscarLibro);

        btnBuscarLibro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"El libro no existee",Toast.LENGTH_SHORT).show();
            }
        });

}}

