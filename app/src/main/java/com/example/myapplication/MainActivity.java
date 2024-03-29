package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button divideButton,addButton,subButton,multiButton,clearButton,equalButton,
            bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0;

    TextView ResultBox,FirstNumber,SecondNumber,symbolView;

    float Value1,Value2;

    boolean addFLAG=false,subFLAG=false,divFLAG=false,multiFLAG=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt0 = findViewById(R.id.bt0);



        divideButton = findViewById(R.id.divideButton);

        addButton = findViewById(R.id.addButton);

        subButton =  findViewById(R.id.subButton);

        multiButton = findViewById(R.id.multiButton);

        FirstNumber = findViewById(R.id.FirstNumber);

        symbolView = findViewById(R.id.symbolView);

        SecondNumber = findViewById(R.id.SecondNumber);

        ResultBox = findViewById(R.id.ResultBox);

        clearButton = findViewById(R.id.clearButton);

        equalButton = findViewById(R.id.equalButton);







        // Chavales Diairesh
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divFLAG=true;
                addFLAG=false;
                subFLAG=false;
                multiFLAG=false;

                SecondNumber.setText(FirstNumber.getText());
                FirstNumber.setText("");
                symbolView.setText("/");



            }
        });
        
        //Savvas Pollaplasiasmos
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondNumber.setText(FirstNumber.getText());
                FirstNumber.setText("");
                symbolView.setText("*");

                multiFLAG=true;

                divFLAG=false;
                addFLAG=false;
                subFLAG=false;

            }
        });

        //Kyriakos
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondNumber.setText(FirstNumber.getText());
                FirstNumber.setText("");
                symbolView.setText("+");

                addFLAG=true;

                divFLAG=false;
                subFLAG=false;
                multiFLAG=false;
            }
        });

        //Bertkas Afairesi
         subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondNumber.setText(FirstNumber.getText());
                FirstNumber.setText("");
                symbolView.setText("-");

                subFLAG=true;

                divFLAG=false;
                addFLAG=false;
                multiFLAG=false;

            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addFLAG == true) {
                    Value1 = Float.parseFloat(FirstNumber.getText() + "");

                    Value2 = Float.parseFloat(SecondNumber.getText() + "");

                    ResultBox.setText(Value1 + Value2 + "");
                    addFLAG = false;
                }
                else if (divFLAG == true)
                {
                    Value1 = Float.parseFloat(FirstNumber.getText() + "");

                    Value2 = Float.parseFloat(SecondNumber.getText() + "");

                    ResultBox.setText(Value1 / Value2 + "");

                    divFLAG=false;
                }
                else if(subFLAG==true)
                {
                    Value1 = Float.parseFloat(FirstNumber.getText() +"");

                    Value2 = Float.parseFloat(SecondNumber.getText() +"");

                    ResultBox.setText(Value1 - Value2 + "");

                    subFLAG=false;

                }
                else if(multiFLAG==true)
                {
                    Value1 = Float.parseFloat(FirstNumber.getText() +"");

                    Value2 = Float.parseFloat(SecondNumber.getText() +"");

                    ResultBox.setText(Value1 * Value2 + "");

                    multiFLAG=false;

                }

            }
        });





        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText("");

                SecondNumber.setText("");

                ResultBox.setText("");

                symbolView.setText("");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstNumber.setText(FirstNumber.getText()+"0");
            }
        });






    }
}
