package com.example.spinnerindent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    String src,dest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView) findViewById(R.id.tvid);
        Bundle b = getIntent().getExtras();
        if (b!=null){
            src=b.getString("source");
            dest=b.getString("destination");
            t1.setText("Your Scour is "+src+" and your Destination is "+dest);
        }
    }
}