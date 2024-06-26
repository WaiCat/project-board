package org.example.projectboard.repository;

import org.example.projectboard.domain.Article;
import org.example.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}