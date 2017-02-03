package com.company;

import java.util.List;

/**
 * Created by lab on 03.02.2017.
 */
public class BslConfiguration{
    ConfigurationObject metadata;
    List<BslScheduledJob> ScheduledJobs;

    public void setMetadata(ConfigurationObject metadata) {
        this.metadata = metadata;
    }

    public void setScheduledJobs(List<BslScheduledJob> scheduledJobs) {
        ScheduledJobs = scheduledJobs;
    }
}