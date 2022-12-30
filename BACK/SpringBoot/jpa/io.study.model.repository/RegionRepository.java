package io.star.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.star.model.entity.RegionEntity;

@Repository
public interface RegionRepository extends JpaRepository<RegionEntity, Integer>{

	Optional<RegionEntity> findByRegionName(String regionName);
	
}
