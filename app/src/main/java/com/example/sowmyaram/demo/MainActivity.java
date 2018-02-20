package com.example.sowmyaram.demo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    static String[] nameArray = {"Apple", "Banana", "Grapes", "Orange", "Pineapple", "Papaya", "Cherry","Water melon", "Corn", "Kiwi", "Leamon"};
    static String[] versionArray = {"Vitamin A", "Vitamin c", "Vitamin D", "Vitamin E", "Vitamin A", "Vitamin B12", "Foloc acid", "Vitamin C", "Vitamin E", "Vitamin K","Vitamin A"};

    static Integer[] drawableArray = {R.drawable.aple, R.drawable.bana, R.drawable.gra,
            R.drawable.oran, R.drawable.pine, R.drawable.paapa, R.drawable.chery,
            R.drawable.water, R.drawable.corn, R.drawable.kiwi,R.drawable.leamn};

    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    private static RecyclerView recyclerview;
    static View.OnClickListener myOnclicklistner;
    private  static RecyclerView.Adapter adapter;
    private   RecyclerView.LayoutManager layoutManager;
    private static ArrayList<DataModel> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);

        myOnclicklistner = new MyOnClicklistener(this);

        recyclerview = (RecyclerView) findViewById(R.id.my_recycler_view);
      //  recyclerview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModel>();

        for(int i=0;i<nameArray.length;i++){
            data.add(new DataModel( nameArray[i],versionArray[i],id_[i],drawableArray[i]));
        }
        adapter= new CustomAdapter(data);
        recyclerview.setAdapter(adapter);

    }

    private static  class  MyOnClicklistener implements View.OnClickListener{

        private final Context context;
        public MyOnClicklistener(Context context) {
            this.context=context;

        }

        @Override
        public void onClick(View view) {

        }
    }
}
