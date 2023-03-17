package edu.uic.cs478.spring23.mp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button OrlandoBtn;
    Button NewYorkBtn;
    String ACTION_CITY_SELECTED = "edu.uic.cs478.spring23.mp3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OrlandoBtn = (Button) findViewById(R.id.OrlandoBtn);
        NewYorkBtn = (Button) findViewById(R.id.NewYorkBtn);


        OrlandoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadcastCitySelected("Orlando");
            }
        });

            NewYorkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadcastCitySelected("New York City");
            }
        });
    }


    // Broadcast the selected city
    private void broadcastCitySelected(String city) {
        Intent intent = new Intent();
        intent.setAction(ACTION_CITY_SELECTED);
        intent.putExtra("city", city);
        sendBroadcast(intent);
    }
}



//    final Intent intent = new Intent();
//intent.setAction("com.pkg.perform.Ruby");
//intent.putExtra("KeyName", "code1id");
//intent.setComponent(new ComponentName("com.pkg.AppB", "com.pkg.AppB.MainActivity"));
//    sendBroadcast(intent);
