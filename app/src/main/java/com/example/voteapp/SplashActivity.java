package com.example.voteapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
//    มีหลายตัวที่เริ่มก่อนหน้านี้ด้วย
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ///parameter ที่เราส่งให้ postdelayed
                //todo:โค้ดที่ต้องการให้ทำงานหลังจาก delay ครบ 3 วิ
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                //                            contex(class ปัจจุบันแล้วจุด this มัน)    flow ไปอีกหน้าหนึ่ง
                //                                        ออกสอบเทำ layout และ เขียนเชื่อมไปอีกหน้า
                startActivity(intent);
                finish();// เหมือนการกด back (ปิดหน้าจอนั้นๆ)
            }
        }, 3000);// overload method

    /*android os*/

    }
}
