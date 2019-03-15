package com.example.dictionaryone;


import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    String[] wordArray = {"Cacophony","Cantankerous","Defy","Benevolent",
            "Effervescence","Flaccid","Garish","Hiatus","Abscond","Insipid","Jaunty","Kindle","Affable","Laconic",
            "Magnanimous", "Neophyte","Judicious","Nostalgic","Obliterate","Paltry",
            "Philanthropy","Redolent "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] wordArray = {"Cacophony","Cantankerous","Defy","Benevolent",
                "Effervescence","Flaccid","Garish","Hiatus","Abscond","Insipid",
                "Jaunty","Kindle","Affable","Laconic",
                "Magnanimous", "Neophyte","Judicious","Nostalgic"};


        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, wordArray);

        ListView listView = (ListView) findViewById(R.id.word_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(view.getContext(),Main2Activity.class);
                     intent.putExtra("position", position);
                     intent.putExtra("Word",wordArray[position]);
                    startActivity(intent);

            }
        });
    }


}
