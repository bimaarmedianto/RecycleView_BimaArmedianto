package com.example.tugas_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView titel, desc;

    public Holder(@NonNull View itemView){
        super(itemView);
        this.image = itemView.findViewById(R.id.imageItem);
        this.titel = itemView.findViewById(R.id.titelItem);
        this.desc = itemView.findViewById(R.id.descItem);
    }
}
