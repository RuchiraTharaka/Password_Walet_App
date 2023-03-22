package com.example.password_walet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Sign_Up extends AppCompatActivity {

    TextInputEditText username,gmail,password;
    Button signUpButton;
    String usernameDB=null,gmailDB=null,passwordDB=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = findViewById(R.id.username);
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        signUpButton = findViewById(R.id.signupbutton);

        username.setText(usernameDB);   //Set the older username
        gmail.setText(gmailDB);         //Set the older gmail

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameDB==null && gmailDB==null && passwordDB==null){
                    if(username.getText().toString().length()<10){} //Check whether username is longer than 10 characters
                    else if(gmail.getText().toString().indexOf('@')==-1){}  //Check whether it is an gmail
                    else if(password.getText().toString().length()<6){}     //Check whether password is longer than 6 characters
                    else{
                        //Store them in database
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);  //Go to the main activity
                        password.setText("");
                        startActivity(i);
                    }
                }else if(username.getText().toString().equals(usernameDB) && gmail.getText().toString().equals(gmailDB) && password.getText().toString().equals(passwordDB)){
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);  //If they are correct, go to the main activity
                    password.setText("");
                    startActivity(i);
                }
            }
        });
    }
}