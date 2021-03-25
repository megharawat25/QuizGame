package com.example.knowledgeenhancerquizgame;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.knowledgeenhancerquizgame.Adapters.CatagoryAdapter;
import com.example.knowledgeenhancerquizgame.Models.CatagoryModel;

import java.util.ArrayList;
import java.util.List;

public class CatagoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
//    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories);
//        toolbar = findViewById(R.id.tool_bar);
        recyclerView = findViewById(R.id.recycler_view);
//
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Categories");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<CatagoryModel> list = new ArrayList<>();
        list.add(new CatagoryModel("@mip", "Category1"));
        list.add(new CatagoryModel("", "Category2"));
        list.add(new CatagoryModel("", "Category3"));
        list.add(new CatagoryModel("", "Category4"));
        list.add(new CatagoryModel("", "Category5"));
        list.add(new CatagoryModel("", "Category6"));
        list.add(new CatagoryModel("", "Category7"));
        list.add(new CatagoryModel("", "Category8"));
        list.add(new CatagoryModel("", "Category9"));
        list.add(new CatagoryModel("", "Category10"));
        list.add(new CatagoryModel("", "Category11"));
        list.add(new CatagoryModel("", "Category12"));

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);

        CatagoryAdapter catagoryAdapter = new CatagoryAdapter(list, getApplicationContext());
        recyclerView.setAdapter(catagoryAdapter);
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId() == android.R.id.home)
//        {
//            finish();
//        }
//        return super.onOptionsItemSelected(item);
//    }

}