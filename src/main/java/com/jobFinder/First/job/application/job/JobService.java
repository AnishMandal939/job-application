package com.jobFinder.First.job.application.job;

import java.util.List;

public interface JobService {
    List<Job>findAll();
    void createJob(Job job);

    Job getJobById(Long id);
}
