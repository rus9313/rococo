package com.zhuminov.rococo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record ArtistJson(
        @JsonProperty("id")
        UUID id,
        @Size(min = 3, max = 50, message = "Allowed name length should be from 3 to 50 characters")
        @JsonProperty("name")
        String name,
        @JsonProperty("biography")
        String biography,
        @JsonProperty("photo")
        String photo) {
}
