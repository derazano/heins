package com.sut.cpe.healthInsurance.repository;

import com.sut.cpe.healthInsurance.entity.HealthInsurance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, Long> {
}