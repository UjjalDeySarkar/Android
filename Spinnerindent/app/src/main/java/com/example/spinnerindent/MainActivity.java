package com.example.spinnerindent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner source, destination;
    ArrayAdapter<String> saa,daa;
    String strSorce[], strDest[], srcBundle, destBundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        source=(Spinner) findViewById(R.id.sourceId);
        destination=(Spinner) findViewById(R.id.destinationId);

        strSorce=getResources().getStringArray(R.array.sourceList);
        strDest=getResources().getStringArray(R.array.destinationList);

        saa=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,strSorce);
        saa.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        source.setAdapter(saa);

        daa=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,strDest);
        daa.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        destination.setAdapter(saa);

        source.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int ind=adapterView.getSelectedItemPosition();
                if(strSorce[ind].equals("Select City")){
                    Toast.makeText(MainActivity.this, "Source city", Toast.LENGTH_SHORT).show();
                    srcBundle="Not Selected";
                }else {
                    Toast.makeText(MainActivity.this, "Source list", Toast.LENGTH_SHORT).show();
                    srcBundle=strSorce[ind];

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        destination.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int ind=adapterView.getSelectedItemPosition();
                if(strDest[ind].equals("Select City")){
                    Toast.makeText(MainActivity.this, "Dest city", Toast.LENGTH_SHORT).show();
                    destBundle="Not selected";
                }else {
                    Toast.makeText(MainActivity.this, "dest list", Toast.LENGTH_SHORT).show();
                    destBundle=strDest[ind];

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    public void next(View button){
        
    }
}