package com.khekrn.bookmarker.domain;

import com.khekrn.bookmarker.domain.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
