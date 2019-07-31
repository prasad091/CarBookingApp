package com.kgisl.rideonecustomer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntroLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.mobileLogin)
    public void mobileLogin(){
        Intent intent = new Intent(getApplicationContext(),MobileNumberEnterActivity.class);
        startActivity(intent);
    }
}
