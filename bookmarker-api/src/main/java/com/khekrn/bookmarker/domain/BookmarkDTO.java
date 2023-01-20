package com.khekrn.bookmarker.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class BookmarkDTO {

    private List<Bookmark> data;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    private boolean hasNext;
    private boolean hasPrevious;
    @JsonProperty("isFirst")
    private boolean isFirst;
    @JsonProperty("isLast")
    private boolean isLast;

    public BookmarkDTO(Page<Bookmark> pageable) {
        this.data = pageable.getContent();
        this.totalElements = pageable.getTotalElements();
        this.totalPages = pageable.getTotalPages();
        this.currentPage = pageable.getNumber() + 1;
        this.hasNext = pageable.hasNext();
        this.hasPrevious = pageable.hasPrevious();
        this.isFirst = pageable.isFirst();
        this.isLast = pageable.isLast();
    }
}
