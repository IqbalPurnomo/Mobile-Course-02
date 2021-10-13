package com.hadioz.formapps;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.inputName);
        EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.inputPhone);
        EditText inputPassword = (EditText) findViewById(R.id.inputPassword);

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(getPackageName()+" Name", inputName.getText().toString());
                Log.d(getPackageName()+" Email", inputEmail.getText().toString());
                Log.d(getPackageName()+" Phone", inputPhone.getText().toString());
                Log.d(getPackageName()+" Password", inputPassword.getText().toString());
            }
        });


    }
}