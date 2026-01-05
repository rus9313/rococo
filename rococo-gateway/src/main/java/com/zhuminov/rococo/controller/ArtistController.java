package com.zhuminov.rococo.controller;

import com.zhuminov.rococo.model.ArtistJson;
import com.zhuminov.rococo.service.artist.ArtistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/{id}")
    public ArtistJson getArtistById(@PathVariable("id") String id) {
        return artistService.getArtistById(UUID.fromString(id));
    }
}
