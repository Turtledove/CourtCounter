package com.example.user6.codecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dispayForTeamA(0);
    }
    public void addOneForTeamA(View v)
    {
        scoreTeamA+=1;
        dispayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v)
    {
        scoreTeamA+=2;
        dispayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View v)
    {
        scoreTeamA+=3;
        dispayForTeamA(scoreTeamA);
    }

    public void dispayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.id_a_score);
        scoreView.setText(String.valueOf(score));
    }

// TeamB calculations
    public void addOneForTeamB(View v)
    {
        scoreTeamB+=1;
        dispayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v)
    {
        scoreTeamB+=2;
        dispayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View v)
    {
        scoreTeamB+=3;
        dispayForTeamB(scoreTeamB);
    }

    public void dispayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.id_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Reset(View view)
    {
        scoreTeamA=0;
        dispayForTeamA(scoreTeamA*0);
        scoreTeamB=0;
        dispayForTeamB(scoreTeamB*0);


    }
}
