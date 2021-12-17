package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView tvName,tvNumber;
        Button btncCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(MainActivity.this,MyServices.class);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            startForegroundService(intent);
        }
        else{
            startService(intent);
        }

        tvName=findViewById(R.id.tv_name);
        tvNumber=findViewById(R.id.tv_number);
        btncCall=findViewById(R.id.btn_call);

        btncCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SingleTonDataPass.class));
            }
        });

        Singleton singleton= Singleton.getInstance();

        singleton.setName("Kamran ");
        singleton.setNum("033312345678");

        tvName.setText(singleton.getName());
        tvNumber.setText(singleton.getNum());
    }

}