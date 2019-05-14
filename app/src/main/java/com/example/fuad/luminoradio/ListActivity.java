package com.example.fuad.luminoradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {

    public Button lb1;
    public Button lb2;
    public Button lb3;
    public Button lb4;
    public Button lb5;
    public Button lb6;

    public void abcRadio(){
        lb1=(Button)findViewById(R.id.lb1);
        lb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button1Activity.class);

                startActivity(jump);
            }
        });
    }

    public void dhakaFm(){
        lb2=(Button)findViewById(R.id.lb2);
        lb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button2Activity.class);

                startActivity(jump);
            }
        });
    }

    public void radioToday(){
        lb3=(Button)findViewById(R.id.lb3);
        lb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button3Activity.class);

                startActivity(jump);
            }
        });
    }

    public void radioBhumi(){
        lb4=(Button)findViewById(R.id.lb4);
        lb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button4Activity.class);

                startActivity(jump);
            }
        });
    }

    public void capitalFm(){
        lb5=(Button)findViewById(R.id.lb5);
        lb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button5Activity.class);

                startActivity(jump);
            }
        });
    }

    public void radioNext(){
        lb6=(Button)findViewById(R.id.lb6);
        lb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ListActivity.this,Button6Activity.class);

                startActivity(jump);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        abcRadio();
        dhakaFm();
        radioToday();
        radioBhumi();
        capitalFm();
        radioNext();
    }
}
