package com.example.password_walet;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.password_walet.adapters.NoteAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list;
    RecyclerView notelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notelist = findViewById(R.id.notelist);

        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.add("A4");
        list.add("A5");
        list.add("A6");
        list.add("A2");
        list.add("A1");
        list.add("A1");
        list.add("A1");
        list.add("A1");
        list.add("A1");
        list.add("A1");
        list.add("A1");


        NoteAdapter noteAdapter = new NoteAdapter(list,getApplicationContext());
        notelist.setAdapter(noteAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        notelist.setLayoutManager(layoutManager);

    }
}