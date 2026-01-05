package com.zhuminov.rococo.service.artist;

import com.zhuminov.rococo.data.ArtistRepository;
import com.zhuminov.rococo.model.ArtistJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Component
public class DbArtistService implements ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public DbArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public ArtistJson getArtistById(UUID id) {
        return artistRepository.findById(id).map(
                artistEntity ->
                        new ArtistJson(
                                artistEntity.getId(),
                                artistEntity.getName(),
                                artistEntity.getBiography(),
                                new String(artistEntity.getPhoto(), StandardCharsets.UTF_8))

        ).get();
    }
}
