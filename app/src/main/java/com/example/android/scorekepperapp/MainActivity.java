package com.example.android.scorekepperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekepperapp.R;


public class MainActivity extends AppCompatActivity {

    int groupAScore = 0;
    int groupBScore = 0;

    int groupBNonStarter = 0;
    int groupANonStarter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //group A Updates

    public void incrementGroupAScore(View view) {

        groupAScore++;
        displayGroupAScore();

    }

    public void displayGroupAScore() {

        TextView v = (TextView) findViewById(R.id.teamAScoreView);
        v.setText(String.valueOf(groupAScore) + " Runs");
    }

    public void incrementGroupBNonStarter(View view) {

        groupBNonStarter++;
        displayGroupBNonStarter();

    }

    private void displayGroupANonStarter() {

        TextView v = (TextView) findViewById(R.id.groupBScoreView);
        v.setText(String.valueOf(groupBNonStarter) + " nonStarter");

    }

    //Group B Updates

    public void incrementGroupBScore(View view) {

        groupBScore++;
        displayGroupBScore();

    }

    public void displayGroupBScore() {

        TextView v = (TextView) findViewById(R.id.groupBScoreView);
        v.setText(String.valueOf(groupBScore) + " Runs");
    }

    public void incrementsGroupBNonStarter(View view) {

        groupBNonStarter++;
        displayGroupBNonStarter();

    }

    private void displayGroupBNonStarter() {

        TextView v = (TextView) findViewById(R.id.teamBFoulView);
        v.setText(String.valueOf(groupBNonStarter) + " Fouls");

    }

    //Resets


    public void resetGame(View v) {
        groupBScore = 0;
        groupAScore = 0;
        groupANonStarter = 0;
        groupBNonStarter = 0;

        displayGroupANonStarter();
        displayGroupAScore();
        displayGroupBNonStarter();
        displayGroupBScore();

    }

    public void resetSwimA(View v) {

        groupANonStarter = 0;
        displayGroupANonStarter();

    }

    public void resetSwimB(View v) {

        groupBNonStarter = 0;
        displayGroupBNonStarter();

    }

}