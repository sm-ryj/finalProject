package com.example.seochonbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rabbitActivity extends AppCompatActivity {

    Button backmain, goinsta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit);

        backmain = (Button) findViewById(R.id.backButton);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rabbitActivity.this, MapsActivity.class));
            }
        });

    }
}