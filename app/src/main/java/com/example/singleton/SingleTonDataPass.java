package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SingleTonDataPass extends AppCompatActivity {
    TextView name,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_ton_data_pass);

        Singleton singleton= Singleton.getInstance();
        name=findViewById(R.id.tvname);
        num=findViewById(R.id.tvnumber);

        try {
            name.setText(singleton.getName());
            num.setText(singleton.getNum());
        }catch (Exception e)
        {
            Toast.makeText(this, "No Value", Toast.LENGTH_SHORT).show();
        }
    }
}