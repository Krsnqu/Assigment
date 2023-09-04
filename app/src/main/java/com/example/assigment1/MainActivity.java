package com.example.assigment1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = " ACT ";
    EditText KomenText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KomenText = (EditText) findViewById(R.id.komentar1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onDestroy");

        SharedPreferences.Editor data = this.getSharedPreferences("Siklus Hidup", Context.MODE_PRIVATE).edit();
        data.putString("komentar","value");
        data.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onResume");
        //Data Tersimpan
        String dataTersimpan = getPreferences("Komentar");
    }
    private String getPreferences(String key){
        return this.getSharedPreferences("Siklus Hidup", Context.MODE_PRIVATE).getString(key,null);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT);
        System.out.println(TAG+"onRestart");
    }


}