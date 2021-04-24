package com.example.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private ArrayList<Movie> movieList ;
    private Context context;

    public MovieAdapter(ArrayList<Movie> movie, Context context) {
        this.movieList= movie;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rowdata, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movie movie = movieList.get(position);
        // Glide digunakan untuk mengambil gambar dari internet
        Glide.with(holder.itemView.getContext())
                .load(movie.getPic())
                .apply(new RequestOptions().override(55,55))
                .into(holder.ava);
        holder.tvId.setText(movie.getId());
        holder.tvTitle.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvGenre,tvId;
        ImageView ava;
        CardView cvMovie;
        LinearLayout llLinearLayout;

            public ViewHolder(View itemView){
                super(itemView);
                tvId = itemView.findViewById(R.id.tvId);
                tvTitle = itemView.findViewById(R.id.tvTitle);
                ava = itemView.findViewById(R.id.ava);
                cvMovie = itemView.findViewById(R.id.cvMovie);
                llLinearLayout = itemView.findViewById(R.id.ll_linear);
            }
     }
}




