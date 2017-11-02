package com.example.diveshkumar.intent_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button press;
    private TextView textView2,textView3;
    private static  int SPLASH_TIME_OUT = 2700;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    press = (Button) findViewById(R.id.press) ;
    press.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "dATA tRANSFER oCCUR", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,Switched.class);
            intent.putExtra("a","SUCEEFULLY DATA PASSED TO OTHER ACTIVITY");
            startActivity(intent);

        }
    });


    textView2 = (TextView)findViewById(R.id.textView2);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.myanim);
        textView2.startAnimation(anim);
        press.startAnimation(anim);

    textView3 = (TextView) findViewById(R.id.textView3);
    String s2 = getIntent().getStringExtra("b");
    textView3.setText(s2);

    }
}
