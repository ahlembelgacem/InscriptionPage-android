 package com.example.blabla;

 import android.app.AlertDialog;
 import android.content.DialogInterface;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {
    private EditText p;
    private Button display;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = findViewById(R.id.nom);
        btn2=findViewById(R.id.btn2);
        display = findViewById(R.id.btn1);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast t = Toast.makeText(MainActivity.this, p.getText().toString(), Toast.LENGTH_LONG);
                //t.show();
                Intent intent= new Intent(MainActivity.this,DisplayAlert.class);
                intent.putExtra("key",p.getText().toString());
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("ATTENTION!");
                ab.setMessage("Voulez Vous  Vraiment quitter cette pages définitivement");
                ab.setPositiveButton("oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                ab.setNegativeButton("non",null);
                ab.show();
            }
        });

    }

}
