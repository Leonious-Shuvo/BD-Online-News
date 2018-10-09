package com.example.shubratodev.onlineshoppinghelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsLinks extends AppCompatActivity {

    List<News> lstNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_links);

        lstNews = new ArrayList<>();
        lstNews.add(new News("Prothom Alo","Catagory News","News Description",R.drawable.prothomalo));
        lstNews.add(new News("Somokal","Catagory News","News Description",R.drawable.somokal));
        lstNews.add(new News("Janakontha","Catagory News","News Description",R.drawable.janakantha));
        lstNews.add(new News("Bangla News 24","Catagory News","News Description",R.drawable.bngnews));
        lstNews.add(new News("The Daily Star","Catagory News","News Description",R.drawable.dailystar));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstNews);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
