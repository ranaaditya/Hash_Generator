package com.ranaaditya.hash_generator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Hashes.HashGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText user_data= findViewById(R.id.data_edittext);
        final TextView hash_sha256=findViewById(R.id.sha256);
        final TextView Sha1_hash=findViewById(R.id.sha1);
        final TextView md5=findViewById(R.id.md_5);
        user_data.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                     if (user_data.getText().toString().isEmpty()){
                         hash_sha256.setText(HashGenerator.generate_md5(""));
                     }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String hash = HashGenerator.generate_md5(user_data.getText().toString());
            String sha1hash=HashGenerator.generate_sha1(user_data.getText().toString());
            String sha256hash=HashGenerator.generate_sha256(user_data.getText().toString());
            if (!hash.isEmpty() && !sha1hash.isEmpty()){

                hash_sha256.setText(sha256hash);
                Sha1_hash.setText(sha1hash);
                md5.setText(hash);
               // Toast.makeText(MainActivity.this,sha256hash,Toast.LENGTH_SHORT).show();
                Log.d("HASH_CODE", hash);
                Log.d("SHA1HASHCODE",sha1hash);
            }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
