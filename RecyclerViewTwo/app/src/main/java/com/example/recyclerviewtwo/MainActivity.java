package com.example.recyclerviewtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;

    List <Pojo> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        arrayList.add(new Pojo(R.drawable.veg_noodles,"Veg Noodles","Noodles","8 Votes","₹ 89",""));
        arrayList.add(new Pojo(0,"Veg Noodles with Veg Ball Manchurian","In Combos","21 votes","₹ 149","4 pc Manchurian"));
        arrayList.add(new Pojo(R.drawable.nonveg_beryani1,"The Biryani","Briyani,Mughlai","246 Votes","₹ 180",""));
        arrayList.add(new Pojo(R.drawable.rolls1,"Afiaa Rolls","Rolls","56 Votes","₹ 49",""));
        arrayList.add(new Pojo(R.drawable.paneer_biryani,"Paneer Biryani","Veg-Biryani","156 Votes","₹ 149",""));
        arrayList.add(new Pojo(0,"Special Veg Rolls","Rolls","66 Votes","₹ 39","3 pc combo comes under ₹100 "));
        arrayList.add(new Pojo(R.drawable.paneer_rolls,"Paneer Rolls","In Veg,Rolls","86 Votes","₹ 49",""));
        arrayList.add(new Pojo(0,"Veg Noodles","Noodles","8 Votes","₹ 89","Superb Veg Noodles"));
        arrayList.add(new Pojo(R.drawable.veg_beryani,"Veg Biryani","Veg-Biryani","116 Votes","₹ 109",""));
        arrayList.add(new Pojo(R.drawable.nonveg_beryani1,"The Biryani","Briyani,Mughlai","246 Votes","₹ 180",""));

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);
        adapter = new TestAdapter(arrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
