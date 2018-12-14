package com.example.user.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button saludo = findViewById(R.id.btnsaludo);
        Button modi = findViewById(R.id.bntnmod);
         info = findViewById(R.id.infomacion);



        saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = getIntent().getStringExtra("id");
                info.setText("Bienvenido "+String.valueOf(id));

            }
        });

        modi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                String content = info.getText().toString();
                i.putExtra("ids",content);
                startActivity(i);
            }
        });



    }

}
