package com.example.sowmyaram.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sowmyaram on 7/3/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private  ArrayList<DataModel> dataset;

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataset=data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewname;
        TextView textviewversion;
        ImageView imageicn;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.textViewname=( TextView) itemView.findViewById(R.id.text1);
            this.textviewversion=( TextView) itemView.findViewById(R.id.text2);
            this.imageicn= (ImageView) itemView.findViewById(R.id.imageView1);
        }
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_card_view,parent,false);
        view.setOnClickListener(MainActivity.myOnclicklistner);

        MyViewHolder myviewholder = new MyViewHolder(view);
        return  myviewholder;


    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int listposition) {

        TextView textViewname = holder.textViewname;
        TextView textviewversion = holder.textviewversion;
        ImageView imageicn =holder.imageicn;


        textViewname.setText(dataset.get(listposition).getName());
        textviewversion.setText(dataset.get(listposition).getVersion());
        imageicn.setImageResource(dataset.get(listposition).getImage());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
