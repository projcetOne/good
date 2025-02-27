package com.example.op.repository;



import com.example.op.model.Book;
import com.example.op.model.Lend;
import com.example.op.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}