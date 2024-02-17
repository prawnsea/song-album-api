package com.albumapi.songalbumapi.controller;

import com.albumapi.songalbumapi.model.Album;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/albumapi")

public class AlbumAPI {

    Album album;

    @GetMapping("{albumTag}")
   public Album getAlbumDetail(String albumTag){
       return album;
   }
   @PostMapping
    public  String addAlbum(@RequestBody Album album){
        this.album = album;
        return "Album added!";
   }
    @PutMapping("{albumName}")
    public String updateAlbum(@RequestBody Album album){
        this.album = album;
        return "Album updated!";
    }
    @DeleteMapping("{albumName}")
    public String deleteAlbum(Album album){
        this.album = null;
        return "Album deleted!";
    }
}
