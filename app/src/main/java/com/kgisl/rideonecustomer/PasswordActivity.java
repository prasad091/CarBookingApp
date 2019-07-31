package com.kgisl.rideonecustomer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submit)
    public void onSubmit(){
        Intent intent = new Intent(getApplicationContext(),BookingMainActivity.class);
        startActivity(intent);
    }
}
