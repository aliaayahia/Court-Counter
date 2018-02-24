package com.example.aliaayahia.omactest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.scoreTeamA);
        text2=(TextView)findViewById(R.id.scoreTeamB);
    }


    public void threePointsTeamA(View view) {
        scoreTeamA+=3;
        text1.setText(""+scoreTeamA);
    }

    public void twoPointsTeamA(View view) {
        scoreTeamA+=2;
        text1.setText(""+scoreTeamA);
    }

    public void onePointTeamA(View view) {
        scoreTeamA+=1;
        text1.setText(""+scoreTeamA);
    }

    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        text1.setText(""+scoreTeamA);
        text2.setText(""+scoreTeamB);
    }

    public void onePointTeamB(View view) {
        scoreTeamB+=1;
        text2.setText(""+scoreTeamB);
    }

    public void twoPointsTeamB(View view) {
        scoreTeamB+=2;
        text2.setText(""+scoreTeamB);
    }

    public void threePointsTeamB(View view) {
        scoreTeamB+=3;
        text2.setText(""+scoreTeamB);
    }
}
