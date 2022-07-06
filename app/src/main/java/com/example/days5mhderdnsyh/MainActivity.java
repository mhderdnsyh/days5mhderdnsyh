package com.example.days5mhderdnsyh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtToDo;
    Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);

        txtToDo = (TextView) findViewById(R.id.txtTodo);
        finish = (Button) findViewById(R.id.Finish);

        String informasi = "Life Cycle Arsitektur \n"
                +"1. New Instance (onCreate, onStart, onResume) \n"
                +"2. Back Arrow (onPause, onStop, onDestroy) \n"
                +"3. Finish  (onPause, onStop, onDestroy) \n"
                +"4. Reopen app (onRestart, onStart, onResume) \n"
                +"5. Home (onPause, onStop) \n"
                +"6. A receive a phone call/sms (onRestart, onStart, onResume) \n"
                +"7. roterate (vertical - kehorizontal) \n"
                +"(onPause,onStop,onDestroy,onCreate,onStart,onResume)";


        txtToDo.setText(informasi);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Toast.makeText(getBaseContext(),"onCreate",Toast.LENGTH_LONG).show();

    } //eo onCreate

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(),"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(),"onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(),"onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(),"onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(),"onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(),"onDestroy",Toast.LENGTH_LONG).show();
        Uri packageuri = Uri.parse("package:com.example.days5mhderdnsyh");
        Intent intent = new Intent(Intent.ACTION_DELETE,packageuri);
        startActivity(intent);
    }
}