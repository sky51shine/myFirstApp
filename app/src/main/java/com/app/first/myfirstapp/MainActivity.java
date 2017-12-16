package com.app.first.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText userName;

    private EditText passwd;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.username);

        passwd = (EditText) findViewById(R.id.passwd);

        login = (Button) findViewById(R.id.loginButton);
        Log.d("username", userName.getText().toString().trim());

        login.setOnClickListener((View v) -> {
            String name = userName.getText().toString();
            String pwd = passwd.getText().toString();
            if (!"liuk".equals(name) || !"123".equals(pwd)) {
                Toast toast = Toast.makeText(MainActivity.this, "login failed!!", Toast.LENGTH_LONG);
                toast.show();
            } else {
                Intent intent = new Intent(MainActivity.this, IndexActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("userName", name);
                bundle.putString("passwd", pwd);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
