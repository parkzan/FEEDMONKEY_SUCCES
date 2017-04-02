package com.example.parkzan.feedmonkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tap = (TextView)findViewById(R.id.tap_to_start);
        TextView textScore = (TextView) findViewById(R.id.text_score);
        final String score = textScore.getText().toString();
        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });
    }
}
