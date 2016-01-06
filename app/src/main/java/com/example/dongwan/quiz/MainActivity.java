package com.example.dongwan.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 1001;
    ListView listView;
    ArrayAdapter<String> mGameListAdapter;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.main_listView);
        textView = (TextView) findViewById(R.id.main_textView);
        String[] gameArray = {
                "World of Warcraft",
                "GTA 5",
                "Hearthstone",
                "Starcraft 2",
                "League of Legends",
                "Fifa 16",
                "Diablo 3",
                "Treeofsavior ",
                "Ancient Blue",
                "The Last of us"
        };

        List<String> gameList = new ArrayList<String>(Arrays.asList(gameArray));
        mGameListAdapter = new ArrayAdapter<String>(
                this,
                R.layout.activity_main,
                R.id.main_textView,
                gameList
        );
        listView.setAdapter(mGameListAdapter);
        listView.setOnItemClickListener(itemClickListener);
    }
    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selectedGame = (String)parent.getAdapter().getItem(position);
            Intent intent = new Intent(getBaseContext(),secondActivity.class);
            intent.putExtra("gameTitle", selectedGame);
            intent.putExtra("gameIndex", position);
            startActivity(intent);
        }
    };
}
