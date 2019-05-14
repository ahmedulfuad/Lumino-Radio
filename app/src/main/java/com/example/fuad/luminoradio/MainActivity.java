package com.example.fuad.luminoradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button mb1;
    public Button mb2;

    public void tuneIn(){
        mb1=(Button)findViewById(R.id.mb1);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(MainActivity.this,ListActivity.class);

                startActivity(jump);
            }
        });
    }

    public void createAccount(){
        mb2=(Button)findViewById(R.id.mb2);
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(MainActivity.this,AccountActivity.class);

                startActivity(jump);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuneIn();
        createAccount();
    }
}
