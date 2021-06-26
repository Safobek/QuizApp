package com.example.quizzapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;
    Button button;
    int trueAnswers;
    int numOfQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView=findViewById(R.id.text_result);
        button=findViewById(R.id.finish);

        trueAnswers = getIntent().getIntExtra("key",3);
        numOfQuestions = getIntent().getIntExtra("key_questions",3);

        textView.setText("Sizning natijangiz " + numOfQuestions + " savoldan " + trueAnswers);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity3.this);

        dialog.setTitle("Ilovadan Chiqish");
        dialog.setMessage("Rostan ham ilovadan chiqmoqchimisiz");

        dialog.setPositiveButton("HA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity3.this, "Chiqaman", Toast.LENGTH_SHORT).show();
                finish();
                finish();
                finish();
                System.exit(0);

            }

        });
        dialog.setNegativeButton("YO'Q", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity3.this, "Chiqmiman", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNeutralButton("Orqaga", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity3.this, "Orqaga", Toast.LENGTH_SHORT).show();
            }



        });
        dialog.show();
        dialog.create();
    }
}