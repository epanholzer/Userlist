package com.example.panholze15.userlist;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowUserActivity extends AppCompatActivity {
    private Cats cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        cat = (Cats) intent.getExtras().get("cats");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewOwner = (TextView) findViewById(R.id.textViewOwner);
        TextView viewAge = (TextView) findViewById(R.id.textViewAge);
        TextView viewColor = (TextView) findViewById(R.id.textViewColor);

        viewName.setText(cat.getName());
        viewOwner.setText(cat.getOwner());
        viewAge.setText(cat.getAge());
        viewColor.setText(cat.getColor());

    }

    public void showCats(View view) {
        // Map point based on address
        Uri webpage = Uri.parse("http://www.cats.com");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(mapIntent);
    }

    public void searchCats(View view) {
        String searchCats = cat.getColor() + " Cat";
        Intent searchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        searchIntent.putExtra(SearchManager.QUERY,searchCats);
        startActivity(searchIntent);
    }

}
