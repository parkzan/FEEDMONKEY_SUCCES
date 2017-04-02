package com.example.parkzan.feedmonkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btnreplay = (Button)findViewById(R.id.replay);
        TextView textcore = (TextView)findViewById(R.id.text_score_4);
        btnreplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        String score = intent.getStringExtra("score");
        textcore.setText(score);

    }
}
