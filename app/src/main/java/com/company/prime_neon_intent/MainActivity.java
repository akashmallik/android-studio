package com.company.prime_neon_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button prime, neon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prime = (Button) findViewById(R.id.prim);
        neon = (Button) findViewById(R.id.neo);

        prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, PrimeActivity.class);
                startActivity(a);
                finish();
            }
        });

        neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, NeonActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}
