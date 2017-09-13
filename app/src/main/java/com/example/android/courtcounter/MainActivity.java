package com.example.android.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.txtScoreTeamB;

public class MainActivity extends Activity
        implements View.OnClickListener {

    static private int scoreTeamA = 0;
    static private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerComponentCallbacks(this);
        findViewById(R.id.btnAddThreeForTeamA).setOnClickListener(this);
        findViewById(R.id.btnAddTwoForTeamA).setOnClickListener(this);
        findViewById(R.id.btnAddOneForTeamA).setOnClickListener(this);
        findViewById(R.id.btnAddThreeForTeamB).setOnClickListener(this);
        findViewById(R.id.btnAddTwoForTeamB).setOnClickListener(this);
        findViewById(R.id.btnAddOneForTeamB).setOnClickListener(this);
        findViewById(R.id.btnScoreReset).setOnClickListener(this);

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }

    public void displayScoreForTeamA(int score) {
        ((TextView) findViewById(R.id.txtScoreTeamA)).setText(""+score);
    }

    public void displayScoreForTeamB(int score) {
        ((TextView) findViewById(txtScoreTeamB)).setText(""+score);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnAddThreeForTeamA:
                scoreTeamA ++;
            case R.id.btnAddTwoForTeamA:
                scoreTeamA ++;
            case R.id.btnAddOneForTeamA:
                scoreTeamA ++;
                displayScoreForTeamA(scoreTeamA);
                break;
            case R.id.btnAddThreeForTeamB:
                scoreTeamB ++;
            case R.id.btnAddTwoForTeamB:
                scoreTeamB ++;
            case R.id.btnAddOneForTeamB:
                scoreTeamB ++;
                displayScoreForTeamB(scoreTeamB);
                break;
            case R.id.btnScoreReset:
                scoreTeamA = scoreTeamB = 0;
                displayScoreForTeamA(scoreTeamA);
                displayScoreForTeamB(scoreTeamB);
            default: break;
        }

    }
}
