package com.example.recyclerviewfromfirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<DataSet> dataSet;

    public MyAdapter (Context c, ArrayList<DataSet> d){
        context = c;
        dataSet = d;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textViewState.setText(dataSet.get(position).getState());
        holder.textViewCity.setText(dataSet.get(position).getCity());

        Picasso.get().load(dataSet.get(position).getImgLink()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewState, textViewCity;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewState = (TextView) itemView.findViewById(R.id.textViewState);
            textViewCity = (TextView) itemView.findViewById(R.id.textViewCity);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
