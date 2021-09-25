package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Button switchBtn;
    private TextView helloTv;
    private TextView worldTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private void initView() {
        switchBtn = (Button) this.findViewById(R.id.btnInit);
        helloTv = (TextView) this.findViewById(R.id.helloInit);
        worldTv = (TextView) this.findViewById(R.id.worldInit);

        switchBtn.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnInit:
                switchView();
                break;
        }
    }

    private void switchView() {
        String tmp = helloTv.getText().toString();
        helloTv.setText(worldTv.getText().toString());
        worldTv.setText(tmp);

    }
}