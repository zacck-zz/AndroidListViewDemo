package com.zacck.androidlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lets instantiate the listview

        ListView mDemoListView = (ListView)findViewById(R.id.mDemoListView);

        ArrayList<String> mFamily = new ArrayList<String>();
        mFamily.add("Isaac");
        mFamily.add("Samuel");
        mFamily.add("Janet");
        mFamily.add("Vanessa");
        mFamily.add("Rose");

        //Lets Use an array adapter to put the list items in the listview
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mFamily);

        mDemoListView.setAdapter(mArrayAdapter);

    }
}
