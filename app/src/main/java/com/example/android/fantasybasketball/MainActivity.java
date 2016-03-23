package com.example.android.fantasybasketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayscoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayscoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForA(View view) {
    scoreForTeamA = scoreForTeamA + 3;
        displayscoreForTeamA(scoreForTeamA);
    }
    public void addTwoForA(View view) {
        scoreForTeamA = scoreForTeamA + 2;
        displayscoreForTeamA(scoreForTeamA);
    }
    public void addOneForA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayscoreForTeamA(scoreForTeamA);
    }
    public void addThreeForB(View view) {
        scoreForTeamB = scoreForTeamB + 3;
        displayscoreForTeamB(scoreForTeamB);
    }
    public void addTwoForB(View view) {
        scoreForTeamB = scoreForTeamB + 2;
        displayscoreForTeamB(scoreForTeamB);
    }
    public void addOneForB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayscoreForTeamB(scoreForTeamB);
    }

    public void reset(View view) {
        scoreForTeamB = 0;
        scoreForTeamA = 0;
        displayscoreForTeamB(scoreForTeamB);
        displayscoreForTeamA(scoreForTeamA);
    }
}

