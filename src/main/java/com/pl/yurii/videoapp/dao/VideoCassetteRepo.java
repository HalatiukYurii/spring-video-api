package com.pl.yurii.videoapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pl.yurii.videoapp.dao.entity.VideoCassette;
@Repository
public interface  VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {

}
