package com.wesleyreisz.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "Rock, Paper, Scissors";
    public static final String PLAYER_CHOICE = "com.wesleyreisz.rock_paper_scissors.player_choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton rock = (ImageButton)findViewById(R.id.btnRock);
        rock.setOnClickListener(this);
        ImageButton page = (ImageButton)findViewById(R.id.btnPaper);
        page.setOnClickListener(this);
        ImageButton scissors = (ImageButton)findViewById(R.id.btnScissors);
        scissors.setOnClickListener(this);
        ImageButton page1 = (ImageButton)findViewById(R.id.btnPaper1);
        page1.setOnClickListener(this);
        ImageButton rock1 = (ImageButton)findViewById(R.id.btnRock1);
        rock1.setOnClickListener(this);
        ImageButton rock2 = (ImageButton)findViewById(R.id.btnRock2);
        rock2.setOnClickListener(this);
        ImageButton lizard = (ImageButton)findViewById(R.id.btnLizard);
        lizard.setOnClickListener(this);
        ImageButton lizard1 = (ImageButton)findViewById(R.id.btnLizard1);
        lizard1.setOnClickListener(this);
        ImageButton spock = (ImageButton)findViewById(R.id.btnSpock);
        spock.setOnClickListener(this);
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
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        //adds animation to the click

        // rock/paper/scissors logic

       //final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
       //v.startAnimation(animAlpha);

       //Intent intent = new Intent(this, GameResultActivity.class);
       //intent.putExtra(PLAYER_CHOICE, v.getId());
       //startActivity(intent);


        String buttonType = determineButtonType(v);
        Toast toast = Toast.makeText(this, buttonType + " was clicked", Toast.LENGTH_SHORT);
        toast.show();
    }

    private String determineButtonType(View v) {
        switch(v.getId()){
            case R.id.btnPaper:
                return "Paper";
            case R.id.btnPaper1:
                return "Paper";
            case R.id.btnRock:
                return "Rock";
            case R.id.btnRock1:
                return "Rock";
            case R.id.btnRock2:
                return "Rock";
            case R.id.btnScissors:
                return "Scissors";
            case R.id.btnLizard:
                return "Lizard";
            case R.id.btnLizard1:
                return "Lizard";
            case R.id.btnSpock:
                return "Spock";
            default:
                return "I don't know which one";
        }
    }
}
