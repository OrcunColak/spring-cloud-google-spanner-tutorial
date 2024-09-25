package com.colak.springtutorial.repository;

import com.colak.springtutorial.entity.Yoga;
import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YogaRepository extends SpannerRepository<Yoga, String> {
}
