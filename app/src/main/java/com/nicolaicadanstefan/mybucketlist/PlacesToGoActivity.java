package com.nicolaicadanstefan.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    // Creating objects for the list (places to go) and setting them
    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("New York", "Maybe one day I will live here, not just visit", R.drawable.new_york, 5),
                new BucketListEntry("Paris", "I will try to understand baguette language and visit all monuments/museums", R.drawable.paris, 4),
                new BucketListEntry("Sweden", "Sweden is famous for it's abundant forests and lakes.", R.drawable.sweden, 4.5f),
                new BucketListEntry("Switzerland", "I would like to make a Christmas on the top of one of the many Switzerland alpine mountains!", R.drawable.switzerland, 5),
                new BucketListEntry("Seattle", "A good place to live if you want to keep all your money (0 income tax).", R.drawable.seattle, 3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}