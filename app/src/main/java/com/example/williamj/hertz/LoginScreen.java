package com.example.williamj.hertz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


    }

    EditText username = (EditText)findViewById(R.id.userName);
    EditText password = (EditText)findViewById(R.id.passwordInput);
    int counter = 3;

    //Login Function
    public void login(View view) {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {

            //correct password

        } else {

            //wrong password
            counter--;
        }

        //Too many login sessions
        if(counter == 0){

            //exceeded the number of login sessions

        }

    }

    //Register Function
    public void register(View view) {

        //register function

    }

    //Forgot Password Function
    public void forgotPassword(View view) {

        //register function

    }


    //Testing
    //Testing Windows machine on Guo's classroom computers, works fine
    //Testing Windows machine on Zal's classroom computers, works fine

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
