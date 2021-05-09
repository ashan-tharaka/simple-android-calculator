package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal,Percent;
Button button_clear,button_del,button_percent,button_division,button_seven,button_eight,button_nine,button_multiplication,
        button_five,button_four,button_three,button_two,button_one,button_six,button_subtraction,button_addition,button_dot,button_zero,button_equal;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        textView.setText("0");

        button_clear=(Button) findViewById(R.id.button_clear);
        button_del=(Button) findViewById(R.id.button_del);
        button_percent=(Button) findViewById(R.id.button_percent);
        button_division=(Button) findViewById(R.id.button_division);
        button_seven=(Button) findViewById(R.id.button_seven);
        button_eight=(Button) findViewById(R.id.button_eight);
        button_nine=(Button) findViewById(R.id.button_nine);
        button_multiplication=(Button)findViewById(R.id.button_multiplication);
        button_five=(Button)findViewById(R.id.button_five);
        button_four=(Button) findViewById(R.id.button_four);
        button_three=(Button) findViewById(R.id.button_three);
        button_two=(Button) findViewById(R.id.button_two);
        button_one=(Button)findViewById(R.id.button_one);
        button_six=(Button) findViewById(R.id.button_six);
        button_subtraction=(Button) findViewById(R.id.button_subtraction);
        button_addition=(Button) findViewById(R.id.button_addition);
        button_dot=(Button)findViewById(R.id.button_dot);
        button_zero=(Button)findViewById(R.id.button_zero);
        button_equal=(Button)findViewById(R.id.button_equal);

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");

            }
        });

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("1");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"1");


                }
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("2");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"2");


                }
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("3");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"3");


                }
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("4");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"4");


                }
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("5");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"5");


                }
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("6");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"6");


                }
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("7");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"7");


                }
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("8");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"8");


                }
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("9");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"9");


                }
            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("0");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+"0");


                }
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("0.");
                        decimal=true;

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {
                    textView.setText(textView.getText()+".");
                    decimal=true;


                }
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if("0".contentEquals(textView.getText().subSequence(0,textView.length()-1))){
                        textView.setText("0");
                    }
else{
                        textView.setText(textView.getText().subSequence(0,textView.length()-1));


                    }


                }catch (Exception e){
                    e.fillInStackTrace();
                }
            }
        });

        button_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("0+");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {

                    if (textView.getText().length() != 0) {
                        input1 = Float.parseFloat(textView.getText() + "");
                        Addition = true;
                        decimal = false;
                        textView.setText(null);
                    }

                }

            }
        });
        button_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("0".contentEquals(textView.getText())){
                    try{
                        textView.setText("0-");

                    }catch (Exception e){
                        e.fillInStackTrace();
                    }
                }
                else {

                    if (textView.getText().length() != 0) {
                        input1 = Float.parseFloat(textView.getText() + "");
                        Subtract= true;
                        decimal = false;
                        textView.setText(null);
                    }

                }
            }
        });
button_multiplication.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if("0".contentEquals(textView.getText())){
            try{
                textView.setText("0X");

            }catch (Exception e){
                e.fillInStackTrace();
            }
        }
        else {

            if (textView.getText().length() != 0) {
                input1 = Float.parseFloat(textView.getText() + "");
                Multiplication= true;
                decimal = false;
                textView.setText(null);
            }

        }

    }
});
button_division.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if("0".contentEquals(textView.getText())){
            try{
                textView.setText("0/");

            }catch (Exception e){
                e.fillInStackTrace();
            }
        }
        else {

            if (textView.getText().length() != 0) {
                input1 = Float.parseFloat(textView.getText() + "");
                Division= true;
                decimal = false;
                textView.setText(null);
            }

        }
    }
});
button_percent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if("0".contentEquals(textView.getText())){
            try{
                textView.setText("0/");

            }catch (Exception e){
                e.fillInStackTrace();
            }
        }
        else {

            if (textView.getText().length() != 0) {
                input1 = Float.parseFloat(textView.getText() + "");
                Percent= true;
                decimal = false;
                textView.setText(null);
            }

        }
    }
});
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Addition || Subtract || Multiplication || Division || mRemainder) {
                        input2 = Float.parseFloat(textView.getText() + "");
                    }

                    if (Addition) {

                        textView.setText(input1 + input2 + "");
                        Addition = false;
                    }
                    if(Subtract){
                        textView.setText(input1-input2+"");
                        Subtract=false;

                    }
                    if(Multiplication){
                        textView.setText(input1*input2+"");
                        Multiplication=false;
                    }
                    if(Division){
                        textView.setText(input1/input2+"");
                        Division=false;
                    }
                    if(Percent){
                        textView.setText(input1/100+"");
                        Percent=false;
                    }

                }catch (Exception e){
                    e.fillInStackTrace();

                }
            }
        });






    }
}