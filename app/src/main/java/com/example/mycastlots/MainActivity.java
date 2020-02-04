package com.example.mycastlots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button[] btn;
    private int randNum;

    private int setRandom(){
        int rand = (int)(Math.random()*4)+1;//1,2,3,4
        android.util.Log.d("KDJ",Integer.toString(rand));
        return rand;
    }
    private void setTxt(int rnd, int idx){
        if(rnd==idx+1){
            textView.setText("true");
        }
        else{
            textView.setText("false");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = new Button[5];

        textView=(TextView)findViewById(R.id.textview);
        btn[0] = (Button) findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);
        btn[3] = (Button)findViewById(R.id.button4);
        btn[4] = (Button)findViewById(R.id.button5);
        randNum=setRandom();
        for(int i=0;i<btn.length;i++){
            final int index=i;
            btn[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(index){
                        case 0:
                            setTxt(randNum,index);
                            break;
                        case 1:
                            setTxt(randNum,index);
                            break;
                        case 2:
                            setTxt(randNum,index);
                            break;
                        case 3:
                            setTxt(randNum,index);
                            break;
                        case 4:
                            randNum=setRandom();
                            break;
                    }
                }
            });
        }

    }
}
