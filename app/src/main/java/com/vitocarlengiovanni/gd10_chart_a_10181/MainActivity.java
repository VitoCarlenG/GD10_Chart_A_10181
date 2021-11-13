package com.vitocarlengiovanni.gd10_chart_a_10181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.vitocarlengiovanni.gd10_chart_a_10181.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //view binding digunakan utnuk mengurangi boilerplate code
    // findViewById() dan untuk memberikan scoped id
    // untuk komponen pada layout yang dibind
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setup view binding agar bisa mendapat refrensi ke layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // setup navigation
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavController navController = navHostFragment.getNavController();

        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);
    }
}