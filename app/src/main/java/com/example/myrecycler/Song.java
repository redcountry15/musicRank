package com.example.myrecycler;

public class Song {
    private String name,singer,year;
    private int pic,rank;

    public Song(String name,String singer,int rank,int pic){
        this.name = name;
        this.singer = singer;
        this.rank = rank;
        this.pic = pic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


}
