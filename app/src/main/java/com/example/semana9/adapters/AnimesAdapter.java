package com.example.semana9.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana9.Anime;
import com.example.semana9.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimesAdapter extends RecyclerView.Adapter{
    private Context context;
    private List<Anime> items;
    public List<Anime> getItems() {
        return items;
    }
    public AnimesAdapter(List<Anime> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_string, parent, false);
        AnimesAdapter.AnimeViewHolder viewHolder = new AnimesAdapter.AnimeViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Anime item = items.get(position);
        View view = holder.itemView;

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvCelular = view.findViewById(R.id.tvCelular);
        ImageView imageView = view.findViewById(R.id.imageView);
        ImageView imageViewEstrella = view.findViewById(R.id.imageViewEstrella);
        ImageView imageViewEstrellao = view.findViewById(R.id.imageViewEstrellao);
        tvName.setText(item.getNombre());
        tvCelular.setText(item.getDescripcion());
        Picasso.get().load(item.getImagenes()).into(imageView);
        if (item.isFavorito()) {
            imageViewEstrella.setVisibility(View.GONE);
            imageViewEstrellao.setVisibility(View.VISIBLE);
        } else {
            imageViewEstrella.setVisibility(View.VISIBLE);
            imageViewEstrellao.setVisibility(View.GONE);
        }

        final int itemPosition = position;
        imageViewEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setFavorito(!item.isFavorito());
                notifyItemChanged(itemPosition);
            }
        });
        imageViewEstrellao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setFavorito(!item.isFavorito());
                notifyItemChanged(itemPosition);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
