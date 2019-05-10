package com.mgashraf.springbootquartzsample.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SampleJob extends QuartzJobBean {

    private String name;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(String.format("Hello %s!", this.name));
    }

    public void setName(String name) {
        this.name = name;
    }
}
