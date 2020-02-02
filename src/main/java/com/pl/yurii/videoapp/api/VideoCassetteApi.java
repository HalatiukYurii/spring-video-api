package com.pl.yurii.videoapp.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pl.yurii.videoapp.dao.entity.VideoCassette;
import com.pl.yurii.videoapp.manager.VideoCassetteManager;
@RequestMapping("/api/cassetts")
@RestController
public class VideoCassetteApi {
	

	private VideoCassetteManager videoCassettes;
	
	
	
	
	@Autowired
	public VideoCassetteApi(VideoCassetteManager videoCassettes) {
		this.videoCassettes = videoCassettes;
	}

	@GetMapping("/all")
	public Iterable<VideoCassette> getAll(){
		return videoCassettes.findAll();
	}
	
	@GetMapping
	public Optional<VideoCassette> getById(@RequestParam Long index){
		return videoCassettes.findById(index);
	}
	
	@PostMapping
	public VideoCassette addVideo(@RequestBody VideoCassette videoCassette){
		return videoCassettes.save(videoCassette);
	}

	@PutMapping
	public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette){
		return videoCassettes.save(videoCassette);
	}
	
	@DeleteMapping
	public void deleteVideo(@RequestParam Long index){
		 videoCassettes.deleteById(index);
	}
}
