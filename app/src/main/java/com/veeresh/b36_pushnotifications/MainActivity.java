package com.veeresh.b36_pushnotifications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SENDING CODE
        Student s = new Student(1, "satish");
        Intent in = new Intent(MainActivity.this, MainActivity.class);
        in.putExtra("myobject", s);
        startActivity(in);

        //HOW TO RECEIVE
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Student obj = bundle.getParcelable("myobject");
        //now we got student object...
    }
}
