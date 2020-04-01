package com.example.digsec.traffic_signal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout layout;
    RadioGroup rd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.l1);
        rd=findViewById(R.id.g);
        rd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.b1:
                        layout.setBackgroundColor(Color.parseColor("#D63031"));
                        break;
                    case R.id.b2:
                        layout.setBackgroundColor(Color.parseColor("#FFF222"));
                        break;
                    case R.id.b3:
                        layout.setBackgroundColor(Color.parseColor("#019031"));
                        break;



            }

            }
        });




    }
}
