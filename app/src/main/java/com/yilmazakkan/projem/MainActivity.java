package com.yilmazakkan.projem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View view)
    {
        String ad;
        String soyad;

        EditText editText = (EditText) findViewById(R.id.myText);
        EditText editText2 = (EditText) findViewById(R.id.myText2);
        ad=editText.getText().toString();
        soyad=editText2.getText().toString();
        Toast.makeText(getApplicationContext(),"Hosgeldiniz " +ad +" " +soyad,Toast.LENGTH_LONG).show();
    }
}
