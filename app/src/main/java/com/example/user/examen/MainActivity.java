package com.example.user.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button enviar, anterior, siguiente;
    Persona [] mPersonas = new Persona[]{
            new Persona("Yoi","Nose","111"),
            new Persona("Jose","antonio","222")
    };
    String d="mana";
    TextView info;
    private static final String KEY_INDEX ="indice";

    private int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar=findViewById(R.id.idenviar);

        anterior=findViewById(R.id.btnanterior);
        siguiente=findViewById(R.id.btnsig);
         info = findViewById(R.id.txtnombres);




        updatePersona();
        Intent i = new Intent(getBaseContext(),Main2Activity.class);
        if(savedInstanceState!=null) {
            index = savedInstanceState.getInt(KEY_INDEX,
                    0);
        }

        String id = getIntent().getStringExtra("ids");
        info.setText(id);

    }
    private void updatePersona(){


        info.setText(mPersonas[index].getNombre()+"\n"+
        mPersonas[index].getApelldido()+"\n"+
        mPersonas[index].getId());
        Intent i = new Intent(getBaseContext(),Main2Activity.class);


    }
    public void change(View view){
        Intent i = new Intent(getBaseContext(), Main2Activity.class);
        i.putExtra("id",mPersonas[index].getId());
        i.putExtra("nombre",mPersonas[index].getNombre());
        i.putExtra("apellido",mPersonas[index].getNombre());
        startActivity(i);

    }
    public void previo(View view){
        index=(index+mPersonas.length-1)%(mPersonas.length);
        updatePersona();
    }
    public void siguiente(View view){
        index=(index+1)% (mPersonas.length);
     //   Log.d(TAG, "el balor del indice es : " + mCurrentIndex);
updatePersona();
    }

}
