package com.arjuna.quiz15jan_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtdes;
    Button btnok;
    EditText etangka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtdes = (TextView) findViewById(R.id.txtdes);
        btnok = (Button) findViewById(R.id.btnok);
        etangka = (EditText) findViewById(R.id.etangka);

    }


    public void proses(View view) {

        String nangka = etangka.getText().toString();

        int aAngka = Integer.parseInt(nangka);

        //kondisi panjang nya kosong
        if (aAngka >= 1 && aAngka <= 9) {
            //memberikan warning berupa eror
            txtdes.setText(" Number is Not Null");
        } else if (aAngka == 0){
            txtdes.setText("Number is Null");

        }


    }
}
