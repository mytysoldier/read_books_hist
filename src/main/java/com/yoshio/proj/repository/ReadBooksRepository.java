package com.yoshio.proj.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yoshio.proj.repository.entity.ReadBooks;

public interface ReadBooksRepository extends PagingAndSortingRepository<ReadBooks, Integer> {

}
