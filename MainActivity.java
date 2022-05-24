package com.example.listview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);

        list.add("RPL");
        list.add("TKJ");
        list.add("MM");
        list.add("AVI");
        list.add("TOI");

        ArrayAdapter arrayAdapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}
