package com.labawsrh.aws.introscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_login);
        final EditText password = (EditText)findViewById(R.id.input_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String text = password.getText().toString();
                    Log.i("text",text);
                    String text2 = "Allthebest";
                    if(text.equals(text2)){
                        Intent intent = new Intent(MainActivity.this,Question1.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid password! ",Toast.LENGTH_LONG).show();
                    }

            }
        });
    }
}
