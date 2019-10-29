package com.example.tugas_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, getList());
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<Model> getList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("Eddy Purwanto");
        m.setDesc("Bapak");
        m.setImage(R.drawable.bapak);
        models.add(m);

        m = new Model();
        m.setTitle("Emi Sulastri");
        m.setDesc("Ibu");
        m.setImage(R.drawable.ibu);
        models.add(m);

        m = new Model();
        m.setTitle("Bima Armedianto");
        m.setDesc("Saya");
        m.setImage(R.drawable.bima);
        models.add(m);

        m = new Model();
        m.setTitle("Rio Armendo");
        m.setDesc("Adik");
        m.setImage(R.drawable.rio);
        models.add(m);

        m = new Model();
        m.setTitle("Alysha Zahra");
        m.setDesc("Adik");
        m.setImage(R.drawable.ara);
        models.add(m);

        return models;
    }
}
