package com.zacck.androidlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lets instantiate the listview

        ListView mDemoListView = (ListView)findViewById(R.id.mDemoListView);

        final ArrayList<String> mFamily = new ArrayList<String>();
        mFamily.add("Isaac");
        mFamily.add("Samuel");
        mFamily.add("Janet");
        mFamily.add("Vanessa");
        mFamily.add("Rose");
        mFamily.add("Alice");

        //Lets Use an array adapter to put the list items in the listview
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mFamily);

        mDemoListView.setAdapter(mArrayAdapter);

        //making the listview interactive
        mDemoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //takes in an adapterview takes in the kind of item that contains what has been clicked
            @Override
            public void onItemClick(/* this is the view with a child that has been clicked*/AdapterView<?> parent,
                                    /*This represents the actual tapped item*/View view,
                                    /*this is the potition of item tapped*/ int position, long id) {
                Log.i(getPackageName(), mFamily.get(position));
                Toast.makeText(getApplicationContext(),"Hello "+mFamily.get(position),Toast.LENGTH_LONG).show();
            }
        });

    }
}
