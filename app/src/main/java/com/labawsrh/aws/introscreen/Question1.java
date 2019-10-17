package com.labawsrh.aws.introscreen;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.shuhart.stepview.StepView;

public class Question1 extends AppCompatActivity {

    private int currentStep = 0;
    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8,layout9;
    StepView stepView;

    EditText txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;


    private PinView verifyCodeET;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        layout3 = (LinearLayout) findViewById(R.id.layout3);
        layout4 = (LinearLayout) findViewById(R.id.layout4);
        layout5 = (LinearLayout) findViewById(R.id.layout5);
        layout6 = (LinearLayout) findViewById(R.id.layout6);
        layout7 = (LinearLayout) findViewById(R.id.layout7);
        layout8 = (LinearLayout) findViewById(R.id.layout8);
        layout9 = (LinearLayout) findViewById(R.id.layout9);

        btn1 = (Button) findViewById(R.id.submit1);
        btn2 = (Button) findViewById(R.id.submit2);
        btn3 = (Button) findViewById(R.id.submit3);
        btn4 = (Button) findViewById(R.id.submit4);
        btn5 = (Button) findViewById(R.id.submit5);
        btn6 = (Button) findViewById(R.id.submit6);
        btn7 = (Button) findViewById(R.id.submit7);
        btn8 = (Button) findViewById(R.id.submit8);

        txt1 = (EditText) findViewById(R.id.ans1);
        txt2 = (EditText) findViewById(R.id.ans2);
        txt3 = (EditText) findViewById(R.id.ans3);
        txt4 = (EditText) findViewById(R.id.ans4);
        txt5 = (EditText) findViewById(R.id.ans5);
        txt6 = (EditText) findViewById(R.id.ans6);
        txt7 = (EditText) findViewById(R.id.ans7);
        txt8 = (EditText) findViewById(R.id.ans8);



        stepView = findViewById(R.id.step_view);
        stepView.setStepsNumber(9);
        stepView.go(0, true);
        layout1.setVisibility(View.VISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text = txt1.getText().toString().toLowerCase();

                if(text.equals("exp!04e4")) {
                    if (currentStep < stepView.getStepCount() - 1) {
                        currentStep++;
                        stepView.go(currentStep, true);
                        Log.i("res", "HIIIii");
                    } else {
                        stepView.done(true);
                    }
                    layout1.setVisibility(View.GONE);
                    layout2.setVisibility(View.VISIBLE);
                }
                else{
                        Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                }
                }
            }
        );
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt2.getText().toString().toLowerCase();

                                        if(text.equals("ary@bh@||@")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }
                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.VISIBLE);
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }
                                    }
                                }
        );
        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt3.getText().toString().toLowerCase();

                                        if(text.equals("4@ng34")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }

                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.VISIBLE));
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }
                                    }


                                }
        );


        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt4.getText().toString().toLowerCase();

                                        if(text.equals("$putn!k")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }

                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.GONE));
                                            layout5.setVisibility(View.VISIBLE);
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }
                                    }
                                }
        );

        btn5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt5.getText().toString().toLowerCase();

                                        if(text.equals("r0h!n!")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }

                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.GONE));
                                            layout5.setVisibility(View.GONE);
                                            layout6.setVisibility(View.VISIBLE);
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }

                                    }
                                }
        );

        btn6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt6.getText().toString().toLowerCase();

                                        if(text.equals("bh@$k@4a")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }


                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.GONE));
                                            layout5.setVisibility(View.GONE);
                                            layout6.setVisibility(View.GONE);
                                            layout7.setVisibility(View.VISIBLE);
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }
                                    }
                                }
        );

        btn7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        String text = txt7.getText().toString().toLowerCase();

                                        if(text.equals("|un@u$s4")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }

                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.GONE));
                                            layout5.setVisibility(View.GONE);
                                            layout6.setVisibility(View.GONE);
                                            layout7.setVisibility(View.GONE);
                                            layout8.setVisibility(View.VISIBLE);

                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }

                                    }
                                }
        );


        btn8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String text = txt8.getText().toString().toLowerCase();

                                        if(text.equals("d0n3d0n3!")) {
                                            if (currentStep < stepView.getStepCount() - 1) {
                                                currentStep++;
                                                stepView.go(currentStep, true);
                                                Log.i("res", "HIIIii");
                                            } else {
                                                stepView.done(true);
                                            }


                                            layout1.setVisibility(View.GONE);
                                            layout2.setVisibility(View.GONE);
                                            layout3.setVisibility(View.GONE);
                                            layout4.setVisibility((View.GONE));
                                            layout5.setVisibility(View.GONE);
                                            layout6.setVisibility(View.GONE);
                                            layout7.setVisibility(View.GONE);
                                            layout8.setVisibility(View.GONE);
                                            layout9.setVisibility(View.VISIBLE);


                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                        }

                                    }
                                }
        );

//        verifyCodeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String verificationCode = verifyCodeET.getText().toString();
//                if(verificationCode.isEmpty()){
//                    Toast.makeText(Question1.this,"Enter verification code",Toast.LENGTH_SHORT).show();
//                }else {
////
////                    LayoutInflater inflater = getLayoutInflater();
//////                    View alertLayout= inflater.inflate(R.layout.processing_dialog,null);
//////                    AlertDialog.Builder show = new AlertDialog.Builder(Authentication.this);
////
////                    show.setView(alertLayout);
////                    show.setCancelable(false);
////                    dialog_verifying = show.create();
////                    dialog_verifying.show();
////
////                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, verificationCode);
////                    signInWithPhoneAuthCredential(credential);
//
//                }
//            }
//        });

//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });

    }

}
