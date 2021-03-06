package com.example.xesshan.alertdailog;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnButtonClick();
    }
    public void OnButtonClick(){
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button_sbm =(Button)findViewById(R.id.button);
                        AlertDialog.Builder a_builder= new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Do You Want to Close this  app !!!")
                                .setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();;
                                    }
                                });
                        AlertDialog alert =a_builder.create();
                        alert.setTitle("Alert !!!");
                        alert.show();
                    }
                }
        );
    }
}
