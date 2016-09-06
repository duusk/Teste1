package com.example.atecdroid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class vMaquilhada extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_maquilhada);

        mApp.setTransvalor("5");

        Button bt = new Button(this);
        bt.setText("Pinheiro");

        bt.setLayoutParams(new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rel_root);

        rl.addView(bt);

    }

    public void clicou(View v) {
        Toast.makeText(this, "Bem-vindo ah melhor academia do mundo!", Toast.LENGTH_SHORT).show();
    }
}
