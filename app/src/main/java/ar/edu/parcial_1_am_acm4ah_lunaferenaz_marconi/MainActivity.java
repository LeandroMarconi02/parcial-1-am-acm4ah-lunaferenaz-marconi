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

    Button btn1;
//    ActivityMainBinding binding;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1= (Button) findViewById(R.id.btnBuscarLibro);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            }
        });


//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        replaceFragment(new InicioFragment());
//
//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            switch (item.getItemId()){
//                case R.id.inicio:
//                    replaceFragment(new InicioFragment());
//                    break;
//                case R.id.venta:
//                    replaceFragment(new VentaFragment());
//                    break;
//                case R.id.inventario:
//                    replaceFragment(new InventoryFragment());
//                    break;
//
//            }
//            return true;
//
//        });

//    }
////
////    private void replaceFragment(Fragment fragment){
////        FragmentManager fragmentManager = getSupportFragmentManager();
////        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////        fragmentTransaction.replace(R.id.frame_layout, fragment);
////        fragmentTransaction.commit();
//
    }




    public void eventoBotonBuscar(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}

