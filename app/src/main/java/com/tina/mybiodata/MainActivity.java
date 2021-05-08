package com.tina.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.tina.mybiodata.R.id.fill;
import static com.tina.mybiodata.R.id.imageView3;

public class MainActivity extends AppCompatActivity {
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "085156911275";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.id/maps/place/KOTIM/@-6.2868,107.0930658,19z/data=!4m5!3m4!1s0x2e698faa94a497ff:0xd6115e1565e33166!8m2!3d-6.2869959!4d107.0937754"));
                startActivity(intent);
            }
        });

        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"tinaoktariyanti@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Testing");
                i.putExtra(Intent.EXTRA_TEXT   , "Isi Test Email");
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        }));

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tinatari.blogspot.com/"));
                startActivity(intent);
            }
        });
    }
}