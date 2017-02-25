package com.cursoandroid.cursoandroid;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.usuariotxt);
        password = (EditText)findViewById(R.id.contraceniatxt);
        Button login = (Button)findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passValidation()){

                }
            }

            private boolean passValidation() {
                boolean band = false;
                username.setError(null);
                String usernametext = username.getText().toString();
                if (usernametext.length()==0){
                    username.setError("El campo usuario no deve estar vacio");
                    band=true;
                }
                return false;
            }
        });
    }
}
