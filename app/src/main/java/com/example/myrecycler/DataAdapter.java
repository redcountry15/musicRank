package com.example.myrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Song> songList;

public static class  ViewHolder extends RecyclerView.ViewHolder{
    public TextView tvRank,tvSongName,tvSinger,tvYear;
    public ImageView ivAlbumCover;

    public ViewHolder(View v){
        super(v);
        tvRank = (TextView)v.findViewById(R.id.tv_rank);
        tvSongName = (TextView) v.findViewById(R.id.tv_song_name);
        tvSinger = (TextView) v.findViewById(R.id.tv_singer);
        tvYear = (TextView) v.findViewById(R.id.tv_year);
        ivAlbumCover = (ImageView) v.findViewById(R.id.iv_album_cover);

    }
}

public DataAdapter(List<Song> songList){
    this.songList = songList;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View lihat = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item,parent,false);

      ViewHolder penahanLihat = new ViewHolder(lihat);

      return penahanLihat;
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {
      Song song =  songList.get(position);
        holder.tvRank.setText(String.valueOf(song.getRank()));
        holder.tvSongName.setText(song.getName());
        holder.tvSinger.setText(song.getSinger());
        holder.tvYear.setText(song.getYear());
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvYear.setText("2016");
    }

    @Override
    public int getItemCount() {

    return songList.size();

    }
}
