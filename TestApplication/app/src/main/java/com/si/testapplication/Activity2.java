package com.si.testapplication;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sandesh.shetty on 18-06-2016.
 */
public class Activity2 extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        textView = (TextView)findViewById(R.id.textView);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBackPressed() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Activity2.this,textView,"translate");
        startActivity(new Intent(Activity2.this,MainActivity.class),options.toBundle());
        finish();
    }
}
