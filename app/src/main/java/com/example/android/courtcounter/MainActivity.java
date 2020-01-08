package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void Reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void ThreeA(View view){
        scoreTeamA = scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }

    public void TwoA(View view){
        scoreTeamA = scoreTeamA+4;
        displayForTeamA(scoreTeamA);
    }
    public void OneA(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void ThreeB(View view){
        scoreTeamB = scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }

    public void TwoB(View view){
        scoreTeamB = scoreTeamB+4;
        displayForTeamB(scoreTeamB);
    }
    public void OneB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
