package com.bobo.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class intentActivity extends AppCompatActivity {
    public static final String KEY_NAME = "KEY_NAME";
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        button = (Button) findViewById(R.id.b_back);
        editText = (EditText) findViewById(R.id.e_name);
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            String name = editText.getText().toString();
            intent.setClass(intentActivity.this, MainActivity.class);
            intent.putExtra(KEY_NAME, name);
            startActivity(intent);

        }
    };
}
