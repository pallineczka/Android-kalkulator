package com.example.kalkulator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Simple extends AppCompatActivity {

    private static final String TAG = "Equation";
    private TextView textView;
    String first = "";
    String second = "";
    String operator = "";
    String result = "";
    String eq = "";
    String value = "";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("first", first );
        outState.putString("second", second);
        outState.putString("operator", operator);
        outState.putString("result", String.valueOf(textView.getText()));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        textView = findViewById(R.id.textView);

        if (savedInstanceState != null) {
            first = savedInstanceState.getString("first");
            second = savedInstanceState.getString("second");
            operator = savedInstanceState.getString("operator");

            if(!first.equals("") && second.equals("") && !operator.equals("")){
                result=first+operator;
                textView.setText(first.concat(operator));
                textView.setText(savedInstanceState.getString("result"));
            } else if(!first.equals("") && !second.equals("") && !operator.equals("")){
                result=first+operator+second;
                textView.setText(first.concat(operator).concat(second));
                textView.setText(savedInstanceState.getString("result"));
            } else if(!first.equals("") && second.equals("") && operator.equals("")){
                result=first;
                textView.setText(first);
                textView.setText(savedInstanceState.getString("result"));
            }
        }

        Button buttonAC = (Button) findViewById(R.id.buttonAC);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonPlusMinus = (Button) findViewById(R.id.buttonPlusMinus);
        Button buttonS7 = (Button) findViewById(R.id.buttonS7);
        Button buttonS8 = (Button) findViewById(R.id.buttonS8);
        Button buttonS9 = (Button) findViewById(R.id.buttonS9);
        Button buttonS4 = (Button) findViewById(R.id.buttonS4);
        Button buttonS5 = (Button) findViewById(R.id.buttonS5);
        Button buttonS6 = (Button) findViewById(R.id.buttonS6);
        Button buttonS1 = (Button) findViewById(R.id.buttonS1);
        Button buttonS2 = (Button) findViewById(R.id.buttonS2);
        Button buttonS3 = (Button) findViewById(R.id.buttonS3);
        Button buttonS0 = (Button) findViewById(R.id.buttonS0);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonSub = (Button) findViewById(R.id.buttonSub);
        Button buttonKr = (Button) findViewById(R.id.buttonKr);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);

        buttonS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("1");
                    result = result.concat("1");
                    textView.setText(result);
                } else{
                    second = second.concat("1");
                    result = result.concat("1");
                    textView.setText(result);
                }
            }
        });
        buttonS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("2");
                    result = result.concat("2");
                    textView.setText(result);
                } else{
                    second = second.concat("2");
                    result = result.concat("2");
                    textView.setText(result);
                }
            }
        });
        buttonS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("3");
                    result = result.concat("3");
                    textView.setText(result);
                } else{
                    second = second.concat("3");
                    result = result.concat("3");
                    textView.setText(result);
                }
            }
        });
        buttonS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("4");
                    result = result.concat("4");
                    textView.setText(result);
                } else{
                    second = second.concat("4");
                    result = result.concat("4");
                    textView.setText(result);
                }
            }
        });
        buttonS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("5");
                    result = result.concat("5");
                    textView.setText(result);
                } else{
                    second = second.concat("5");
                    result = result.concat("5");
                    textView.setText(result);
                }
            }
        });
        buttonS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("6");
                    result = result.concat("6");
                    textView.setText(result);
                } else{
                    second = second.concat("6");
                    result = result.concat("6");
                    textView.setText(result);
                }
            }
        });
        buttonS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("7");
                    result = result.concat("7");
                    textView.setText(result);
                } else{
                    second = second.concat("7");
                    result = result.concat("7");
                    textView.setText(result);
                }
            }
        });
        buttonS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("8");
                    result = result.concat("8");
                    textView.setText(result);
                } else{
                    second = second.concat("8");
                    result = result.concat("8");
                    textView.setText(result);
                }
            }
        });
        buttonS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("9");
                    result = result.concat("9");
                    textView.setText(result);
                } else{
                    second = second.concat("9");
                    result = result.concat("9");
                    textView.setText(result);
                }
            }
        });
        buttonS0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    first = first.concat("0");
                    result = result.concat("0");
                    textView.setText(result);
                } else{
                    second = second.concat("0");
                    result = result.concat("0");
                    textView.setText(result);
                }
            }
        });
        buttonKr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator.equals("")) {
                    if(!first.contains(".")){
                        if(first.equals("")){
                            first = first.concat("0");
                            result = result.concat("0");
                            textView.setText(result);
                        }
                        first = first.concat(".");
                        result = result.concat(".");
                        textView.setText(result);
                    }
                } else{
                    if(!second.contains(".")){
                        if(second.equals("")){
                            second = second.concat("0");
                            result = result.concat("0");
                            textView.setText(result);
                        }
                        second = second.concat(".");
                        result = result.concat(".");
                        textView.setText(result);
                    }
                }
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator.equals("")){
                    result = String.valueOf(result.subSequence(0,result.length()-1));
                    textView.setText(result);
                }
                if(first.equals("")) {
                    first = first.concat("0");
                    result = result + first;
                }
                if(first.charAt(first.length()-1) == '.' || first.charAt(first.length()-1) == ','){
                    first = first.substring(0, first.length() - 1);
                    result = result.substring(0, result.length() - 1);
                    textView.setText(result);
                }
                if(!value.equals("")){
                    textView2.setText("");
                    if(value.contains(",")){
                        value = value.replace(",", ".");
                    }
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    result = result + operator;
                    textView.setText(result);
                }
                if(second.equals("")){
                    operator = "+";
                    result = result + operator;
                    textView.setText(result);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator.equals("")){
                    result = String.valueOf(result.subSequence(0,result.length()-1));
                    textView.setText(result);
                }
                if(first.equals("")) {
                    first = first.concat("0");
                    result = result + first;
                }
                if(first.charAt(first.length()-1) == '.' || first.charAt(first.length()-1) == ','){
                    first = first.substring(0, first.length() - 1);
                    result = result.substring(0, result.length() - 1);
                    textView.setText(result);
                }
                if(!value.equals("")){
                    textView2.setText("");
                    if(value.contains(",")){
                        value = value.replace(",", ".");
                    }
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    result = result + operator;
                    textView.setText(result);
                }
                if(second.equals("")){
                    operator = "-";
                    result = result + operator;
                    textView.setText(result);
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator.equals("")){
                    result = String.valueOf(result.subSequence(0,result.length()-1));
                    textView.setText(result);
                }
                if(first.equals("")) {
                    first = first.concat("0");
                    result = result + first;
                }
                if(first.charAt(first.length()-1) == '.' || first.charAt(first.length()-1) == ','){
                    first = first.substring(0, first.length() - 1);
                    result = result.substring(0, result.length() - 1);
                    textView.setText(result);
                }
                if(!value.equals("")){
                    textView2.setText("");
                    if(value.contains(",")){
                        value = value.replace(",", ".");
                    }
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    result = result + operator;
                    textView.setText(result);
                }
                if(second.equals("")){
                    operator = "*";
                    result = result + operator;
                    textView.setText(result);
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator.equals("")){
                    result = String.valueOf(result.subSequence(0,result.length()-1));
                    textView.setText(result);
                }
                if(first.equals("")) {
                    first = first.concat("0");
                    result = result + first;
                }
                if(first.charAt(first.length()-1) == '.' || first.charAt(first.length()-1) == ','){
                    first = first.substring(0, first.length() - 1);
                    result = result.substring(0, result.length() - 1);
                    textView.setText(result);
                }
                if(!value.equals("")){
                    textView2.setText("");
                    if(value.contains(",")){
                        value = value.replace(",", ".");
                    }
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    result = result + operator;
                    textView.setText(result);
                }
                if(second.equals("")){
                    operator = "/";
                    result = result + operator;
                    textView.setText(result);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                if(second.equals("")) {
                    second = second.concat("0");
                    result = result + second;
                    textView.setText(result);
                }
                if(second.charAt(second.length()-1) == '.' || second.charAt(second.length()-1) == ','){
                    second = second.substring(0, second.length() - 1);
                    result = result.substring(0, result.length() - 1);
                    textView.setText(result);
                }
                if(operator.equals("+")){
                    eq = String.format("%.5f", Double.parseDouble(first) + Double.parseDouble(second));
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
                } else if(operator.equals("-")){
                    eq = String.format("%.5f", Double.parseDouble(first) - Double.parseDouble(second));
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
                } else if(operator.equals("*")){
                    eq = String.format("%.5f", Double.parseDouble(first) * Double.parseDouble(second));
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
                } else if(operator.equals("/")){
                    if(Double.parseDouble(second) == 0){
                        Toast message = Toast.makeText(getBaseContext(), "Error", Toast.LENGTH_LONG);
                        message.show();
                    } else {
                        eq = String.format("%.5f", Double.parseDouble(first) / Double.parseDouble(second));
                        value = textView2.getText() + eq;
                        while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                            if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                                value = value.substring(0, value.length() - 1);
                                break;
                            } else value = value.substring(0, value.length() - 1);
                        }
                        textView2.setText(value);
                    }
                }
                Log.d(TAG, "first: " + first + "\t operator: " + operator + "\t second: " + second + "\t result: " + result + "\t eq: " + eq + "\t value: " + value);
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = "";
                operator = "";
                second = "";
                result = "";
                value = "";
                eq = "";
                textView.setText("");
                textView2.setText("");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "";
                textView2.setText("");
                if(first.equals("")){
                    textView.setText("");
                } else if(second.equals("")){
                    if(operator.equals("")){
                        first = String.valueOf(first.subSequence(0,first.length()-1));
                        result = String.valueOf(result.subSequence(0,result.length()-1));
                        textView.setText(result);
                    } else{
                        operator = "";
                        result = String.valueOf(result.subSequence(0,result.length()-1));
                        textView.setText(result);
                    }
                } else{
                    second = String.valueOf(second.subSequence(0,second.length()-1));
                    result = String.valueOf(result.subSequence(0,result.length()-1));
                    textView.setText(result);
                }
            }
        });
        buttonPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.equals("")){
                    textView.setText("");
                } else if(first.equals("0") && second.equals("")){
                    first = first;
                } else if(second.equals("")){
                    first = String.valueOf(Double.parseDouble(first) * (-1));
                    textView.getText();
                    while (first.contains(".") || first.charAt(first.length()-1) == '0' || first.charAt(first.length()-1) == ',' || first.charAt(first.length()-1) == '.'){
                        if(first.charAt(first.length()-1) == '.' || first.charAt(first.length()-1) == ','){
                            first = first.substring(0, first.length() - 1);
                            break;
                        } else first = first.substring(0, first.length() - 1);
                    }
                    result = first+operator+second;
                    textView.setText(result);
                } else{
                    if(operator == "+"){
                        operator = "-";
                    } else if(operator == "-"){
                        operator = "+";
                    } else if(operator == "*" || operator == "/"){
                        second = String.valueOf(Double.parseDouble(second) * (-1));
                        textView.getText();
                    }
                    while (second.contains(".") || second.contains(",") && second.charAt(second.length()-1) == '0' || second.charAt(second.length()-1) == ',' || second.charAt(second.length()-1) == '.'){
                        if(second.charAt(second.length()-1) == '.' || second.charAt(second.length()-1) == ','){
                            second = second.substring(0, second.length() - 1);
                            break;
                        } else second = second.substring(0, second.length() - 1);
                    }
                    result = first+operator+second;
                    textView.setText(result);
                }
            }
        });
    }
}