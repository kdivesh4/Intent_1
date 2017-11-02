package com.example.diveshkumar.intent_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Switched extends AppCompatActivity {
    TextView textView;
    Button button;
    String s2="Say_Hello_To_Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switched);

        textView = (TextView) findViewById(R.id.textView);
        String s1 = getIntent().getStringExtra("a").concat(s2);
        textView.setText(s1);
        Toast.makeText(this, "Switched_TO_SECOND_ACTIVITY", Toast.LENGTH_SHORT).show();

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Switched.this,MainActivity.class);
                intent1.putExtra("b","Main_Activity");
                startActivity(intent1);
            }
        });


    }
}
