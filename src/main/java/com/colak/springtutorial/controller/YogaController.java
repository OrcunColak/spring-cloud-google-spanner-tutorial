package com.colak.springtutorial.controller;

import com.colak.springtutorial.entity.Yoga;
import com.colak.springtutorial.repository.YogaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class YogaController {

    private final YogaRepository yogaRepository;


    @GetMapping("/")
    public List<Yoga> getAllBooks() {
        Page<Yoga> all = yogaRepository.findAll(Pageable.unpaged());
        return all.getContent();
    }
}
