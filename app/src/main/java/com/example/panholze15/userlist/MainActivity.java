package com.example.panholze15.userlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        private List<Cats> listCats;
        private ListView myListView;
        private CustomAdapter myAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            myListView = (ListView) findViewById(R.id.myUserList);

            listCats = new ArrayList<>();
            listCats.add(new Cats("Luna", "Elisabeth", "4", "black"));
            listCats.add(new Cats("Arteus", "Elisabeth", "3", "white"));
            listCats.add(new Cats("Pfoti", "Florian", "8", "orange"));
            listCats.add(new Cats("Sam", "Teresa", "7", "grey"));
            listCats.add(new Cats("John", "Dominik", "5", "grey and white"));
            listCats.add(new Cats("Harry", "Benjamin", "1", "orange"));

            myAdapter = new CustomAdapter(this,listCats);

            myListView.setAdapter(myAdapter);

            myListView.setOnItemClickListener(this);
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Cats selectedCat = listCats.get(i);
            Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
            intent.putExtra("cats",selectedCat);
            startActivity(intent);

        }

}
