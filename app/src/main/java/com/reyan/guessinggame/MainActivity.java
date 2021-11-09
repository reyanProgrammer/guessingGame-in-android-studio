package com.reyan.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView result;
    private EditText numberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining views
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        numberEditText = findViewById(R.id.number);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(20);

                String s = numberEditText.getText().toString();
                int reNumber = Integer.parseInt(s);
                if(reNumber==randomNumber){
                    result.setText("you win");
                }else {
                    result.setText("you lose");
                    button.setEnabled(false);
                }
            }
        });
    }
}