package com.example.blabla;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayAlert extends AppCompatActivity {
    TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_alert);
        T=findViewById(R.id.textview);
        Bundle x=getIntent().getExtras();
        String  S=x.getString("key");
        T.setText("Good Morning  "+S);
        String s= "http//www.google.com";
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(s));
        startActivity(intent1);
    }
}