package com.example.demo.classes;

public class Song {
	private int id;
	private String title;
	
	
	public Song(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	@Override
	public String toString() {
		return title;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	
}
