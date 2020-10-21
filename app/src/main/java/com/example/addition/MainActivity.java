package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText Num1;
    private EditText Num2;
    private Button Btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=(EditText)findViewById(R.id.etNumber1);
        Num2=(EditText)findViewById(R.id.etNumber2);
        Btn=(Button)findViewById(R.id.button1);
        result=(TextView)findViewById(R.id.textView1);


        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int number1=Integer.parseInt(Num1.getText().toString());
            int number2=Integer.parseInt(Num2.getText().toString());
            int sum= number1+number2;
            result.setText("Answer is" + String.valueOf(sum));
            }
        });
    }
}