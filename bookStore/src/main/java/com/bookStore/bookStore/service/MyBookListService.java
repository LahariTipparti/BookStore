package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repo.MyBookRepo;

import com.bookStore.bookStore.repo.MyBookRepo;





@Service
public class MyBookListService {
    @Autowired
	private MyBookRepo mybook;  
	
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	public List<MyBookList> getAllMyBooks() {
		return mybook.findAll();
	}
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
