package com.company.prime_neon_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeActivity extends AppCompatActivity {

    EditText prim;
    Button check_prime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        prim = (EditText) findViewById(R.id.prim);

        check_prime = (Button) findViewById(R.id.checkPrime);

        check_prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = prim.getText().toString();
                int num = Integer.parseInt(temp);

                int flag = 0;
                for (int i=2; i<num; i++) {
                    if(num % i == 0) {
                        flag = 1;
                    }
                }

                if (flag == 0){
                    Toast.makeText(getApplicationContext(), "Prime" , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Not Prime" , Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
