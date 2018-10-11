package com.gameconnect3.ujjwal.firebasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdMainActivity extends AppCompatActivity {

    Button logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);
        logoutbtn=findViewById(R.id.logout);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                Toast.makeText(ThirdMainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                SharedPrefManager.getInstance(getApplicationContext()).login_status(false);
                SharedPrefManager.getInstance(getApplicationContext()).User_Login(false);
            }
        });
    }
}
