package com.nicolaicadanstefan.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    // Creating objects for the list (things to do) and setting them
    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Fishing on a wonderful lake", "Take your time and relax!", R.drawable.fishing, 4.5f),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle, probably Norway or Sweden", R.drawable.northern_lights, 5),
                new BucketListEntry("Cycling to work", "You go to your dream job and in the same time doing sport", R.drawable.cycling, 4),
                new BucketListEntry("Aid Climbing", "Climbing using equipment, to assist in making upward progress.", R.drawable.climbing, 4.5f),
                new BucketListEntry("Road Trip across USA/Europe", "Hire a car and travel in all states/countries", R.drawable.road_trip, 3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}