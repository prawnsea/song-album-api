package com.albumapi.songalbumapi.model;

import org.springframework.core.SpringVersion;

public class Album {



    private String albumTag;
    private String albumName;
    private String artistName;
    private String genre;
    private int trackNumber;

    public Album() {
    }

    public Album(String albumTag, String albumName, String artistName, String genre, int trackNumber) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.genre = genre;
        this.trackNumber = trackNumber;
    }
    public void setAlbumTag(String albumTag) {
        this.albumTag = albumTag;
    }
    public String getAlbumTag() {
        return albumTag;
    }

    public String setAlbumTag(){
        this.albumTag = albumTag;
        return albumTag;
    }
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
