package com.example.sahil.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(this,"onCREATE", Toast.LENGTH_SHORT);

        t.setGravity(Gravity.CENTER,0,0); //Q2 done here only....
        t.show();
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        Log.d("ActivityState","OnCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onSTART", Toast.LENGTH_SHORT).show();
       // Log.d(tag: "State",msg: "OnStart()");
        Log.d("ActivityState","OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onSTOP", Toast.LENGTH_SHORT).show();
        Log.d("ActivityState","OnStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onRESUME", Toast.LENGTH_SHORT).show();
        Log.d("ActivityState","OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPAUSE", Toast.LENGTH_SHORT).show();
        Log.d("ActivityState","OnPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("ActivityState","OnDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRESTART", Toast.LENGTH_SHORT).show();
        Log.d("ActivityState","OnRestart()");
    }

}
