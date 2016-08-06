package kr.appjam.appjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onKeyDown(int keycode, KeyEvent event)


    {

        switch (keycode) {
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                Toast.makeText(MainActivity.this, "d", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.kakao.talk");
                startActivity(launchIntent);


                break;


            case KeyEvent.KEYCODE_VOLUME_UP:
                Toast.makeText(MainActivity.this, "o", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;


    }






}