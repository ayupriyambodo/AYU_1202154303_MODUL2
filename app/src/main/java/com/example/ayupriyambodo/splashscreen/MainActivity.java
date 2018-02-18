package com.example.ayupriyambodo.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioDinein;
    RadioButton radioTakeaway;
    Button buttonPesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "AYU_1202154303", Toast.LENGTH_LONG).show();

        radioGroup = (RadioGroup) findViewById(R.id.radioButton);
        radioDinein = (RadioButton) findViewById(R.id.radioDinein);
        radioTakeaway = (RadioButton) findViewById(R.id.radioTakeaway);
        buttonPesanan = (Button) findViewById(R.id.buttonPesanan);

        buttonPesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int RadioGroup = radioGroup.getCheckedRadioButtonId();
                switch (RadioGroup){
                    case R.id.radioDinein:
                        Toast.makeText(getBaseContext(), "Dene In", Toast.LENGTH_LONG).show();

                        Intent DineIn = new Intent(getApplication(), DineIn.class);
                        startActivity(DineIn);
                        break;
                    case R.id.radioTakeaway:
                        Toast.makeText(getBaseContext(), "Take away", Toast.LENGTH_LONG).show();

                        Intent TakeAway = new Intent(getApplication(), com.example.ayupriyambodo.splashscreen.TakeAway.class);
                        startActivity(TakeAway);
                        break;
                }
            }
        });
    }

    public void DineIn(View view) {
    }

    public void TakeAway(View view) {
    }
}
