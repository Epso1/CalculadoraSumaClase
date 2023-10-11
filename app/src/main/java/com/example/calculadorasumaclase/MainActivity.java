package com.example.calculadorasumaclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butPlus, butEquals, butClear, butMinus;
    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        but4 = findViewById(R.id.button4);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but7 = findViewById(R.id.button7);
        but8 = findViewById(R.id.button8);
        but9 = findViewById(R.id.button9);
        but0 = findViewById(R.id.button0);
        butPlus = findViewById(R.id.plusButton);
        butEquals = findViewById(R.id.equalsButton);
        butClear = findViewById(R.id.clearButton);
        screen = findViewById(R.id.screenTextView);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("1");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "1");
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("2");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "2");
                }
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("3");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "3");
                }
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("4");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "4");
                }
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("5");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "5");
                }
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("6");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "6");
                }
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("7");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "7");
                }
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("8");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "8");
                }
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("9");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "9");
                }
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("0");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "0");
                }
            }
        });

        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = screen.getText();
                screen.setText(text + "+");
            }
        });

        butEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screenText = screen.getText().toString();
                int result = calculate(screenText);
                screen.setText(String.valueOf(result));
            }
        });

        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("0");
            }
        });
    }

    public int calculate(String input) {
        System.out.println("El valor en pantalla es: " + input);
        int result;
        if (input.contains("++") || input.contains("--")) {
            result = -1;
        } else if (!input.contains("+") && !input.contains("-")) {
            result = Integer.parseInt(input);
        } else {

            int plusIndex = input.indexOf("+");
            String string1 = input.substring(0, plusIndex);
            String string2 = input.substring(plusIndex + 1, input.length());
            System.out.println("El valor de string1 es: " + string1);
            System.out.println("El valor de string2 es: " + string2);
            result = calculate(string1) + calculate(string2);

        }
        return result;
    }

}
