/* --------------- STUDENT DETAILS ----------------
Name: Kane Landolina
ID: 218692411
UNIT Code: SIT708
 */


package com.example.task31q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create variables
    EditText firstEditTextNumber, secondEditTextNumber;

    Button addButton, subtractButton;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect variables with layout items
        firstEditTextNumber = findViewById(R.id.firstEditTextNumber);
        secondEditTextNumber = findViewById(R.id.secondEditTextNumber);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        resultTextView = findViewById(R.id.resultTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //if addition button clicked, get both values and check if numbers are entered
            //if numbers are entered, add numbers and show result in textView
            //if both numbers are not entered, alter user to enter numbers
            public void onClick(View view) {
                String firstValue = firstEditTextNumber.getText().toString().trim();
                String secondValue = secondEditTextNumber.getText().toString().trim();
                if (firstValue == "" || secondValue == "") {
                    Toast.makeText(MainActivity.this, "Please enter a value for both numbers.", Toast.LENGTH_SHORT).show();
                } else {
                    int firstValueInt = Integer.parseInt(firstValue);
                    int secondValueInt = Integer.parseInt(secondValue);
                    int resultValue = firstValueInt + secondValueInt;
                    //Log.v("result", String.valueOf(firstValueInt));
                    resultTextView.setText(String.valueOf(resultValue));
                }
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //if subtraction button clicked, get both values and check if numbers are entered
            //if numbers are entered, subtract second number from first number and show result in textView
            //if both numbers are not entered, alter user to enter numbers
            public void onClick(View view) {
                String firstValue = firstEditTextNumber.getText().toString().trim();
                String secondValue = secondEditTextNumber.getText().toString().trim();
                if (firstValue == "" || secondValue == "") {
                    Toast.makeText(MainActivity.this, "Please enter a value for both numbers.", Toast.LENGTH_SHORT).show();
                } else {
                    int firstValueInt = Integer.parseInt(firstValue);
                    int secondValueInt = Integer.parseInt(secondValue);
                    int resultValue = firstValueInt - secondValueInt;
                    //Log.v("result", String.valueOf(firstValueInt));
                    resultTextView.setText(String.valueOf(resultValue));
                }
            }
        });


    }
}