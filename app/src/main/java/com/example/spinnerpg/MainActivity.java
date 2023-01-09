package com.example.spinnerpg;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] characters={"a","b","c","d","e","f"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,characters);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Selected alphabet is : "+characters[i], Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}