package com.example.p0111_resvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        TextView tvTop = (TextView) findViewById(R.id.tvTop);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        Button btnTop = (Button) findViewById(R.id.btnTop);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);
        ImageView TopImage = (ImageView) findViewById(R.id.imageView2);
        ImageView BottomImage = (ImageView) findViewById(R.id.imageView);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnBottom:
                        tvBottom.setText("Нижняя кнопка");
                        break;
                    case R.id.btnTop:
                        tvTop.setText("Верхняя кнопка");
                        break;


                }

            }

        };

        btnBottom.setOnClickListener(oclBtn);
        btnTop.setOnClickListener(oclBtn);


    }
}