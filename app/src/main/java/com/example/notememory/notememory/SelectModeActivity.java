package com.example.notememory.notememory;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectModeActivity extends AppCompatActivity {
    boolean isRecordLayoutVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);
        Button rhythm;
        Button solo;
        //TextView trhythm,tsolo;
        //initializewidgets();
        rhythm = (Button) findViewById(R.id.rhythm_butt);
        solo = (Button) findViewById(R.id.solo_butt);

        rhythm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectModeActivity.this,RhythmActivity.class);
                startActivity(i);
                //finish();
            }
        });

        solo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectModeActivity.this, MainActivity.class);
                startActivity(i);
                //finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_database) {
            goToDatabaseActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void goToDatabaseActivity() {
        if(!isRecordLayoutVisible) {
            Intent intent = new Intent(this, DatabaseActivity.class);
            startActivity(intent);
        }
    }

}
