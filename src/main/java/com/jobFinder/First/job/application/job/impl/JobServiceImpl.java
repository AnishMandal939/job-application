package com.jobFinder.First.job.application.job.impl;

import com.jobFinder.First.job.application.job.Job;
import com.jobFinder.First.job.application.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++); // if no ID is present then it will add ID based on json data object
        jobs.add(job);
    }
}
