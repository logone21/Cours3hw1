package com.example.cours3hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email;
        EditText theme;
        EditText message;
        Button next;

email = findViewById(R.id.email);
theme = findViewById(R.id.theme);
message = findViewById(R.id.message);
next = findViewById(R.id.send);
next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL ,email.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
        startActivity(intent);
    }
});
    }

}
