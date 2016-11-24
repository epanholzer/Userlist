package com.example.panholze15.userlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by panholze15 on 18.11.2016.
 */
public class CustomAdapter extends BaseAdapter{

    List<Cats> listCats;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Cats> listCats) {
        this.context = applicationContext;
        this.listCats= listCats;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listCats.size();
    }

    @Override
    public Object getItem(int i) {
        return listCats.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewColor=(TextView)view.findViewById(R.id.textViewListColor);
        TextView viewAge=(TextView)view.findViewById(R.id.textViewListAge);

        Cats cat = listCats.get(i);
        viewName.setText(cat.getName());
        viewColor.setText(cat.getColor());
        viewAge.setText(cat.getAge());

        return view;
    }
}
