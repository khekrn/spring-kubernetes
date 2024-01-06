package com.khekrn.bookmarker.domain.dto;

import java.time.Instant;

public record BookmarkDTO(Long id, String title, String url, Instant createdAt) { }