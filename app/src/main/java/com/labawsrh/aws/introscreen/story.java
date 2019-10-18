package com.labawsrh.aws.introscreen;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        Button btn = findViewById(R.id.btn_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText password = (EditText)findViewById(R.id.input_password);
                    String text = password.getText().toString();
                    Log.i("text",text);
                    String text2 = "get.set.go!!";
                    if(text.equals(text2)){
                        Intent intent = new Intent(story.this,Question1.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid password! ",Toast.LENGTH_LONG).show();
                    }

            }
        });
    }
}
