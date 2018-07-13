package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreTeamA(int score) {

        TextView scoreTeamA = (TextView) findViewById(R.id.score_of_team_a);
        scoreTeamA.setText("" + score);
    }

    public void addFiveForA(View view) {
        scoreTeamA += 5;
        displayScoreTeamA(scoreTeamA);
    }

    public void subtractOneForA(View view) {
        scoreTeamA += -1;
        displayScoreTeamA(scoreTeamA);
    }

    public void subtractTwoForA(View view) {
        scoreTeamA += -2;
        displayScoreTeamA(scoreTeamA);
    }


    public void displayScoreTeamB(int score) {

        TextView scoreTeamB = (TextView) findViewById(R.id.score_of_team_b);
        scoreTeamB.setText("" + score);
    }

    public void addFiveForB(View view) {
        scoreTeamB += 5;
        displayScoreTeamB(scoreTeamB);
    }

    public void subtractOneForB(View view) {
        scoreTeamB += -1;
        displayScoreTeamB(scoreTeamB);
    }

    public void subtractTwoForB(View view) {
        scoreTeamB += -2;
        displayScoreTeamB(scoreTeamB);
    }


    public void resetScore (View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
