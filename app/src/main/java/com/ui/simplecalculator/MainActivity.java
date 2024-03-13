package com.ui.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPercent, btnPlus,
            btnMinus, btnMultipication, btnDivision, btnEqualls, btnClear, btnDot, btnBracket;
    TextView tvInput, tvOutput;
    String process;
    boolean checkBracket = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultipication = findViewById(R.id.btnMultipication);
        btnDivision = findViewById(R.id.btnDivision);
        btnPercent = findViewById(R.id.btnPercent);

        btnEqualls = findViewById(R.id.btnEqualls);
        btnDot = findViewById(R.id.btnDot);
        btnClear = findViewById(R.id.btnClear);
        btnBracket = findViewById(R.id.btnBracket);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 0", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 1", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 2", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 3", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 4", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 5", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 6", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 7", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 8", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pressed 9", Toast.LENGTH_SHORT).show();
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "-");
            }
        });

        btnMultipication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "*");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "/");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "%");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();
                tvInput.setText(process + ".");
            }
        });



        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBracket) {
                    process = tvInput.getText().toString();
                    tvInput.setText(process + ")");
                    checkBracket = false;
                } else
                {
                    process = tvInput.getText().toString();
                    tvInput.setText(process+"(");
                    checkBracket = true;
                }
            }

        });

        btnEqualls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvInput.getText().toString();

                process = process.replace("x","*");
                process = process.replace("%","/100");
                process = process.replace("÷","/");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";
                try {
                    Scriptable scriptable = rhino.initSafeStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();

                }catch (Exception e)
                {
                    finalResult = "0";
                }
                tvOutput.setText(finalResult);



            }
        });



    }
}