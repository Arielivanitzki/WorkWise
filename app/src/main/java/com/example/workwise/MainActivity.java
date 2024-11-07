package com.example.workwise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button LogBtn;
    Button SignBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogBtn = findViewById(R.id.LoginBtn);
        SignBtn = findViewById(R.id.SignUpBtn);


        LogBtn.setOnClickListener(this);
        SignBtn.setOnClickListener(this);


    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main, fragment).commit();
    }

    @Override
    public void onClick(View view) {
        if(view == LogBtn){
            loadFragment(new LoginFragment());

        }

        if(view == SignBtn){
            loadFragment(new SignUpFragment());

        }

    }
}