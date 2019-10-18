package com.company.prime_neon_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NeonActivity extends AppCompatActivity {

    Button check_neon;
    EditText neon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neon);

        check_neon = (Button) findViewById(R.id.checkNeon);
        neon = (EditText) findViewById(R.id.neo);

        check_neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = neon.getText().toString();
                int num = Integer.parseInt(temp);
                int square,sum=0;
                square = (num*num);

                while(square>0)
                {
                    sum=sum+square%10;
                    square=square/10;
                }
                if(sum==num)
                    Toast.makeText(getApplicationContext(), "Neon",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Not Neon" , Toast.LENGTH_LONG).show();
            }
        });
    }
}
