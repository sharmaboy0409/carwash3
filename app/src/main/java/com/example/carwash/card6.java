package com.example.carwash;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.auth.FirebaseAuth;


public class card6 extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button mLogOutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card6);
        mLogOutBtn = findViewById(R.id.log_out_btn);
        mAuth = FirebaseAuth.getInstance();

        mLogOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(card6.this , LoginActivity.class));
                finish();
            }
        });



    }
}