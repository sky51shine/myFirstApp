package com.app.first.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    private TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        user = findViewById(R.id.user);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String username = bundle.getString("userName");
        String passwd = bundle.getString("passwd");

        user.setText("用户名：" + username + ", 密码:" + passwd);
    }

}
