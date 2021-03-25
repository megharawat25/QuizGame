package com.example.knowledgeenhancerquizgame.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.knowledgeenhancerquizgame.Models.CatagoryModel;
import com.example.knowledgeenhancerquizgame.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CatagoryAdapter extends RecyclerView.Adapter<CatagoryAdapter.MyViewHolder>
{
    private List<CatagoryModel> catagoryModelList;
    private Context context;

    public CatagoryAdapter(List<CatagoryModel> catagoryModelList, Context context) {
        this.catagoryModelList = catagoryModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.catagories_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CatagoryModel cm = catagoryModelList.get(position);
        holder.textViewTitle.setText(cm.getTitle());
        Glide.with(context).load(cm.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return catagoryModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imageView;
        private TextView textViewTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view_circle);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
        }

//        private void setData(String url, String title)
//        {
//            Glide.with(context).load(url).into(imageView);
//            this.textViewTitle.setText(title);
//        }
    }
}
