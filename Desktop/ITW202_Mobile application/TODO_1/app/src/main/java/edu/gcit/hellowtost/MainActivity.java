package edu.gcit.hellowtost;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int c = 0;
    Button bt;
    Button bt1;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.button);
        bt1 =(Button)findViewById(R.id.button2);
        tv =(TextView)findViewById(R.id.tv);

    }
   public void toast(View view) {

        Toast.makeText(this, "hello toast", Toast.LENGTH_SHORT).show();
   }
   public void count(View view){
        c++;
        tv.setText(Integer.toString(c));

    }
}