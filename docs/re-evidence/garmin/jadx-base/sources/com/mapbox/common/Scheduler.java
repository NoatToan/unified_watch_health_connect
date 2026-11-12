package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface Scheduler {
    SchedulerType getType();

    void schedule(Task task, TaskOptions taskOptions);
}
