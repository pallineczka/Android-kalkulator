package com.example.kalkulator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class Advanced extends AppCompatActivity {

    private static final String TAG = "Equation";
    String first = "";
    String second = "";
    String operator = "";
    String result = "";
    String eq = "";
    String value = "";
    String function = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

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
        Button buttonSin = (Button) findViewById(R.id.buttonSin);
        Button buttonCos = (Button) findViewById(R.id.buttonCos);
        Button buttonTan = (Button) findViewById(R.id.buttonTan);
        Button buttonLn = (Button) findViewById(R.id.buttonLn);
        Button buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        Button buttonX2 = (Button) findViewById(R.id.buttonX2);
        Button buttonXY = (Button) findViewById(R.id.buttonXY);
        Button buttonLog = (Button) findViewById(R.id.buttonLog);
        Button buttonProc = (Button) findViewById(R.id.buttonProc);

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
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    operator = "+";
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
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    operator = "-";
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
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    operator = "*";
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
                    first = value;
                    second = "";
                    value = "";
                    result = "";
                    result = result + first;
                    operator = "";
                    operator = "/";
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
                else if(function.equals("log") || function.equals("sin") || function.equals("cos") || function.equals("tan") || function.equals("ln") || function.equals("sqrt")){
                    result = result.concat(")");
                    textView.setText(result);
                    if(first.equals("log")) {
                        eq = String.format("%.5f", log10(Double.parseDouble(second)));
                    } else if(first.equals("sin")) {
                        eq = String.format("%.5f", sin(Double.parseDouble(second)));
                    } else if(first.equals("cos")) {
                        eq = String.format("%.5f", cos(Double.parseDouble(second)));
                    } else if(first.equals("tan")) {
                        eq = String.format("%.5f", tan(Double.parseDouble(second)));
                    } else if(first.equals("ln")) {
                        eq = String.format("%.5f", log(Double.parseDouble(second)));
                    } else if(first.equals("sqrt")) {
                        eq = String.format("%.5f", sqrt(Double.parseDouble(second)));
                    }
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
                }
                else if(function.equals("x2")){
                    eq = String.format("%.5f", pow(Double.parseDouble(first), Double.parseDouble(second)));
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
                }
                else if(function.equals("xy")){
                    eq = String.format("%.5f", pow(Double.parseDouble(first), Double.parseDouble(second)));
                    value = textView2.getText() + eq;
                    while (value.contains(".") || value.contains(",") && value.charAt(value.length()-1) == '0' || value.charAt(value.length()-1) == ',' || value.charAt(value.length()-1) == '.'){
                        if(value.charAt(value.length()-1) == '.' || value.charAt(value.length()-1) == ','){
                            value = value.substring(0, value.length() - 1);
                            break;
                        } else value = value.substring(0, value.length() - 1);
                    }
                    textView2.setText(value);
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
                function = "";
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
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("sin");
                first = first.concat("sin");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("cos");
                first = first.concat("cos");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("tan");
                first = first.concat("tan");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("ln");
                first = first.concat("ln");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("sqrt");
                first = first.concat("sqrt");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("x2");
                if(!first.equals("")) {
                    operator = "^";
                    second = "2";
                    result = result + operator + second;
                    textView.setText(result);
                }
            }
        });
        buttonXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("xy");
                if(!first.equals("")) {
                    operator = "^";
                    result = result + operator;
                    textView.setText(result);
                }
            }
        });
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function = function.concat("log");
                first = first.concat("log");
                operator = "(";
                result = first+operator;
                textView.setText(result);
            }
        });
        buttonProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.equals("")){
                    textView.setText("");
                } else if(second.equals("")){
                    first = String.valueOf(Double.parseDouble(first) * 0.01);
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
                    second = String.valueOf(Double.parseDouble(second) * 0.01);
                    textView.getText();
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