package com.example.vdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VerificationActivity extends Activity implements View.OnClickListener {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(this,"验证码发送成功：1234",Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.button2:
                Toast.makeText(this,"验证成功",Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
        }
    }

    private void init() {
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
}
