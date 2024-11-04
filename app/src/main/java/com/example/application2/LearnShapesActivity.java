// LearnShapesActivity.java
package com.example.application2;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class LearnShapesActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shapes);

        // Initialize Text-to-Speech
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });

        // Setup shape buttons with click listeners
        Button shapeCircle = findViewById(R.id.shapeCircle);
        Button shapeSquare = findViewById(R.id.shapeSquare);
        Button shapeTriangle = findViewById(R.id.shapeTriangle);

        shapeCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakShape("Circle");
            }
        });

        shapeSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakShape("Square");
            }
        });

        shapeTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakShape("Triangle");
            }
        });
    }

    private void speakShape(String shape) {
        if (textToSpeech != null) {
            textToSpeech.speak(shape, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }
}
