package com.example.sampledoctorsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.example.sampledoctorsapp.fragments.AudioCall;

public class SubscribeVideoDialog extends Dialog {
    Context context;
    public SubscribeVideoDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_dialog);
        Button payment = findViewById(R.id.buttonAudio);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, VideoCall.class));
            }
        });
    }
}
