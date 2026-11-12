package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes20.dex */
public interface SchedulerMultiWorkerSupport {

    /* JADX INFO: loaded from: classes46.dex */
    public interface WorkerCallback {
        void onWorker(int i, Scheduler.Worker worker);
    }

    void createWorkers(int i, WorkerCallback workerCallback);
}
