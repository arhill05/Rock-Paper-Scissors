package com.wesleyreisz.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by arhil on 9/18/2016.
 */
public class LinearLayoutActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = LinearLayoutActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_example);

        Button submit = (Button)findViewById(R.id.submitBtn);
        submit.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if(id == R.id.linear_layout_example){
            Intent intent = new Intent(this, LinearLayoutActivity.class);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        EditText nameTxt = (EditText)findViewById(R.id.nameTxt),
                cityTxt = (EditText)findViewById(R.id.cityTxt),
                stateTxt = (EditText)findViewById(R.id.stateTxt),
                zipTxt = (EditText)findViewById(R.id.zipTxt);
        String name = nameTxt.getText().toString(),
                city = cityTxt.getText().toString(),
                state = stateTxt.getText().toString(),
                zip = zipTxt.getText().toString();

        Log.d(TAG, name + ", " + city + ", " + state + ", " + zip);
        Toast toast = Toast.makeText(this, "Results logged to debug log!\n" +
                "Name: " + name +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip, Toast.LENGTH_SHORT);
        toast.show();
    }

}
