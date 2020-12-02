package com.example.fourthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> addArray =new ArrayList<String>();
    static EditText txt1 ;
    EditText txt2 ;
    EditText txt3 ;
    EditText txt4 ;
    EditText txt5 ;
    EditText txt6 ;
    EditText txt7 ;
    EditText txt8 ;
    EditText txt9 ;
    EditText txt10 ;

    Button btnDisplay1;
    TextView display;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=(findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);
        txt6=findViewById(R.id.txt6);
        txt7=findViewById(R.id.txt7);
        txt8=findViewById(R.id.txt8);
        txt9=findViewById(R.id.txt9);
        txt10=findViewById(R.id.txt10);
        btnDisplay1= findViewById(R.id.btnDisplay1);
        display = findViewById(R.id.answer);

        btnDisplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class sixth {
                    static void sort(String s[]){
                        int i, j;
                        String temp = "";
                        for(i = 0; i < 10; i++){
                            for(j = i+1; j < 10; j++){
                                if(s[i].length() < s[j].length()){
                                    temp = s[i];
                                    s[i] = s[j];
                                    s[j] = temp;
                                }
                            }
                        }
                    }

                    public static void main(String args[]){
                            String [] s1 = new String[10];
                        s1[0]= txt1.getText().toString();
                            int i;
                            for(i = 0; i < 10; i++)
                                s1[i] = .next();
                            sort(s1);
                            for(i = 0; i < 10; i++)

                                display.setText((s1[i]);
                        }
                    }
                }

            }
            }
        });

    }
}