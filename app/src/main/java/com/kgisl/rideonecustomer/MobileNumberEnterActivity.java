package com.kgisl.rideonecustomer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MobileNumberEnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_enter);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.back)
    public void onBackPressed(){
        finish();
    }

    @OnClick(R.id.continueLogin)
    public void continueLogin(){
        startActivity(new Intent(getApplicationContext(),PasswordActivity.class));
    }
}
