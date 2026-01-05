package com.zhuminov.rococo.service.artist;

import com.zhuminov.rococo.model.ArtistJson;

import java.util.UUID;

public interface ArtistService {
    ArtistJson getArtistById(UUID id);
}
