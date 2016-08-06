package kr.appjam.appjam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {


    TextView AppName;
    String ss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);



        AppName = (TextView)findViewById(R.id.AppName);

        ss = ("실행시킬 앱을 선택해주세요");





        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        ss = pref.getString("hi", "");

        AppName.setText(ss);




















    }


}
