package com.example.scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contentButton = new Button(this);
        contentButton.setText(R.string.contentButtonText);
        contentButton.setBackgroundColor(+R.color.crimson);

        LinearLayout content = findViewById(R.id.content);
        content.addView(contentButton);

        contentButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView contentTitle = findViewById(R.id.contentTitle);
                contentTitle.setText("El texto fue actualizado");
                contentTitle.setBackgroundColor(+R.color.black);

                CharSequence msg = "Estado actualizado";
                Toast toast = Toast.makeText(contentButton.getContext(), msg, Toast.LENGTH_SHORT);
                toast.show ();


            }

        });
    }



}