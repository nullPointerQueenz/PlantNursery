package com.example.app1;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Room1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1);  // Das Layout für Room1 (room1.xml)

        // Button finden
        @SuppressLint("WrongViewCast") ImageButton enterButton = findViewById(R.id.plantButton1);

        // Klick-Listener setzen
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Room1Activity.this, Plant1.class);
                startActivity(intent);
            }
        });
    }
}

