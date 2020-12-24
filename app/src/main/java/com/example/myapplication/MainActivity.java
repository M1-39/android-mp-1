package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.SumPathEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining variables and connecting to XML
          final EditText x= findViewById(R.id.quizes);
        EditText y= findViewById(R.id.HW);
        EditText z= findViewById(R.id.mid);
        EditText l= findViewById(R.id.finall);
        TextView n= findViewById(R.id.calculated);
        Button cal= findViewById(R.id.button);
        Button reset= findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText("");
                y.setText("");
                z.setText("");
                l.setText("");
                n.setText("");
            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String quizesString = x.getText().toString();
                double q =Double.parseDouble(quizesString);
                String HWString= y.getText().toString();
               double H= Double.parseDouble(HWString);
                String midString = z.getText().toString();
               double mid= Double.parseDouble(midString);
                String finallString = l.getText().toString();
               double fin= Double.parseDouble(finallString);

                double res= q+H+mid+fin;
                if (res>=90 && res<=100){
                    n.setText("A");
                    n.setTextColor(Color.GREEN);
                }
                else if(res>=80 && res<90){
                    n.setText("B");
                    n.setTextColor(Color.BLUE);

                }
                else if(res>=70 && res<80){
                    n.setText("C");
                    n.setTextColor(Color.CYAN);

                }
                else if(res>=60 && res<70){
                    n.setText("D");
                    n.setTextColor(Color.YELLOW);
                }
                else if(res<60){
                    n.setText("F");
                    n.setTextColor(Color.RED);
                }

            }
        });

   ; }
}