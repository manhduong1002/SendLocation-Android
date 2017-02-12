package com.sendlocation.net.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by admin on 2/12/2017.
 */

public class LoginActivity extends AppCompatActivity {
    private EditText editUsername;
    private EditText editPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUsername = editUsername.getText().toString();
                String strPassword = editPassword.getText().toString();
                if (strUsername != null && strUsername.length() > 0 && strPassword != null && strPassword.length() > 0) {
                    if (strUsername.equals("admin") && strPassword.equals("1234")) {
                        openMainGoogleMap();
                    } else {
                        Toast.makeText(getApplicationContext(), "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }

    private void openMainGoogleMap() {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        //intent.putExtra(Config.INFO_LOGIN_KEY, userLoginRespone.getData().getUser().getUserId());
        //intent.putExtra(Config.TITLE_FILE_NAME_VIDEO, userLoginRespone.getData().getFileName());
        //intent.putExtra(Config.TITLE_FILE_PATH_VIDEO, userLoginRespone.getData().getFilePath());
        //intent.putExtra(Config.TITLE_NAME, userLoginRespone.getData().getUser().getDisplayname() + "様");
        startActivity(intent);
    }
}
