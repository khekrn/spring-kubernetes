package com.khekrn.bookmarker.domain.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class BookmarkDTO {

    private Long id;
    private String title;
    private String url;
    Instant createdAt;
}