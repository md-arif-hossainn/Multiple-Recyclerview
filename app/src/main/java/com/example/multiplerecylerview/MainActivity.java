package com.example.multiplerecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.multiplerecylerview.adpter.TripsAdapter;
import com.example.multiplerecylerview.models.Ads;
import com.example.multiplerecylerview.models.Item;
import com.example.multiplerecylerview.models.News;
import com.example.multiplerecylerview.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Item> items = new ArrayList<>();

        Trip trip1 = new Trip(R.drawable.a1,"village Park","Summer 2021-20days");
        items.add(new Item(0,trip1));

        Ads ads1 = new Ads("summer holiday","50% off on this summer");
        items.add(new Item(1,ads1));

        News news1 = new News(
                "swizerland","there are very good place.So much beautiful.If you visit one time you will really love this place"
        );
        items.add(new Item(2,news1));

        Trip trip2 = new Trip(R.drawable.a2,"fantasy park","Winter Vacation");
        items.add(new Item(0,trip2));

        News news2 = new News("Polland","20% offer any time.Come to visit this place and its really good place");
        items.add(new Item(2,news2));

        Trip trip3 = new Trip(R.drawable.a3,"fantasy park","Winter Vacation");
        items.add(new Item(0,trip3));

        Ads ads2 = new Ads("summer holiday","50% off on this summer");
        items.add(new Item(1,ads2));

        recyclerView.setAdapter(new TripsAdapter(items));
    }

}