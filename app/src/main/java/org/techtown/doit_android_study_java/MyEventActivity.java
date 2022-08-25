package org.techtown.doit_android_study_java;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyEventActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_event);

        textView = findViewById(R.id.textView);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                int action = event.getAction(); //정수값이 들어간다.

                float curX = event.getX();
                float curY = event.getY();

                if(action == MotionEvent.ACTION_DOWN) {
                    println("손가락 눌림 :" + curX + ", " + curY);
                }else if(action == MotionEvent.ACTION_MOVE){
                    println("손가락 움직임 : "+curX + ", "+curY);
                }else if(action ==MotionEvent.ACTION_UP){
                    println("손가락 뗌 : " + curX + ", " + curY);
                }
                return true;
            }
        });
    }
    //출력 함수를 만든다.
    public void println(String data){
        textView.append(data + "\n");
    }
}