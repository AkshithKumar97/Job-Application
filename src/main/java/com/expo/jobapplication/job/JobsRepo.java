package com.expo.jobapplication.job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepo extends JpaRepository<Job, Long>{
}
