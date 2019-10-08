package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,plus,minus,multiply,divide,equals,numdot,clear=null,bracket1,bracket2;
    private TextView result,del,history=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_mail);
        initialize();
        onClick();
    }
    private void initialize() {
        num0 =  findViewById(R.id.num0);
        num1 =  findViewById(R.id.num1);
        num2 =  findViewById(R.id.num2);
        num3 =  findViewById(R.id.num3);
        num4 =  findViewById(R.id.num4);
        num5 =  findViewById(R.id.num5);
        num6 =  findViewById(R.id.num6);
        num7 =  findViewById(R.id.num7);
        num8 =  findViewById(R.id.num8);
        num9 =  findViewById(R.id.num9);
        numdot =  findViewById(R.id.numdot);
        plus =  findViewById(R.id.plus);
        minus =  findViewById(R.id.minus);
        multiply =  findViewById(R.id.multiply);
        divide =  findViewById(R.id.divide);
        equals =  findViewById(R.id.equals);
        clear =  findViewById(R.id.clear);
        result =  findViewById(R.id.Result);
        history =  findViewById(R.id.history);
        del=findViewById(R.id.del);
        bracket1= findViewById(R.id.bracket1);
        bracket2 = findViewById(R.id.bracket2);
    }
    private void onClick()
    {
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("0"));
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("1"));
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("2"));
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("3"));
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("4"));
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("5"));
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("6"));
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("7"));
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("8"));
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("9"));
            }
        });
        numdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("."));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("+"));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("-"));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("*"));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("/"));
            }
        });
        bracket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("("));
            }
        });
        bracket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat(")"));
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp = InfixToPostFix.getFinalExp(getResult());
                String value= EvaluatePostFix.getValue(exp);
                history.setText(value);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"The Screen is Already Cleared!",Toast.LENGTH_SHORT).show();
                history.setText("");
                result.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"The Screen is Already Cleared!",Toast.LENGTH_SHORT).show();
                else
                    result.setText(result.getText().toString().substring(0,result.getText().toString().length()-1));
            }
        });
    }
    public String getResult()
    {
        return result.getText().toString();
    }
}
