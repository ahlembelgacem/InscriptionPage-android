package com.example.blabla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tp extends AppCompatActivity {
    Button button;
    EditText e,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("admin") || e2.getText().toString().equals("admin"))
                {
                    Intent intent= new Intent(Tp.this,DisplayAlert.class);
                    intent.putExtra("key",e2.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast t= Toast.makeText(Tp.this,"failed",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

    }
}