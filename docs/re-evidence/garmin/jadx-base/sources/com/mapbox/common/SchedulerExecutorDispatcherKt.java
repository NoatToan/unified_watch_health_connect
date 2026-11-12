package com.mapbox.common;

import java.util.concurrent.Executor;
import o53.c1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/Scheduler;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;", "Lo53/c1;", "asDispatcher", "(Lcom/mapbox/common/Scheduler;)Lo53/c1;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SchedulerExecutorDispatcherKt {
    public static final c1 asDispatcher(Scheduler scheduler) {
        scheduler.getClass();
        return new SchedulerExecutorDispatcher(asExecutor(scheduler));
    }

    public static final Executor asExecutor(final Scheduler scheduler) {
        scheduler.getClass();
        return new Executor() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt.asExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(final Runnable command) {
                scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1$execute$1
                    @Override // com.mapbox.common.Task
                    public void run() {
                        Runnable runnable = command;
                        runnable.getClass();
                        runnable.run();
                    }
                }, new TaskOptions(0L, TaskPriority.DEFAULT));
            }
        };
    }
}
