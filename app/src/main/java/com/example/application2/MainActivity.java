// MainActivity.java
package com.example.application2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.application2.LearnShapesActivity;
import com.example.application2.QuizActivity;
//import com.example.application2.LearnColorsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLearnColors = findViewById(R.id.btnLearnColors);
        Button btnLearnShapes = findViewById(R.id.btnLearnShapes);
        Button btnQuiz = findViewById(R.id.btnQuiz);

        btnLearnColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LearnColorsActivity.class);
                startActivity(intent);
            }
        });

        btnLearnShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LearnShapesActivity.class);
                startActivity(intent);
            }
        });

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}