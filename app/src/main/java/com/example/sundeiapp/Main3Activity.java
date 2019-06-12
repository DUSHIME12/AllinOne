package com.example.sundeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv = (ListView)findViewById(R.id.listView);
        ArrayList<String> mi = new ArrayList<String>();
        mi.add("one");
        mi.add("one");
        mi.add("one");
        mi.add("one");
        mi.add("one");
        mi.add("one");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mi);
        lv.setAdapter(adapter);
    }
}
