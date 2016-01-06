package com.example.dongwan.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

/**
 * Created by DongWan on 2016-01-06.
 */
public class secondActivity extends Activity{
    TextView second_gameTitle, second_gameReleaseDate;
    Button returnBtn;
    Toast toast;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        second_gameTitle = (TextView) findViewById(R.id.second_gameTitle);
        second_gameReleaseDate = (TextView) findViewById(R.id.second_gameReleaseDate);
        returnBtn = (Button) findViewById(R.id.second_returnBtn);
        Intent intent = getIntent();
        String gameTitle = intent.getStringExtra("gameTitle");
        int gameIndex = intent.getExtras().getInt("gameIndex");
        switch (gameIndex) {
            case 0:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2004년 11월 23일" );
                break;
            case 1:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2013년 9월 17일" );
                break;
            case 2:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2014년 1월 24일" );
                break;
            case 3:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2010년 7월 27일" );
                break;
            case 4:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2009년 10월 27일" );
                break;
            case 5:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2015년 9월 17일" );
                break;
            case 6:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2012년 5월 15일" );
                break;
            case 7:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2015년 12월 17일" );
                break;
            case 8:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2003년 11월 8일" );
                break;
            case 9:
                second_gameTitle.setText("선택하신 게임은 : "+ gameTitle + "입니다.");
                second_gameReleaseDate.setText("발매일 : 2014년 7월 29일" );
                break;
        }

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
