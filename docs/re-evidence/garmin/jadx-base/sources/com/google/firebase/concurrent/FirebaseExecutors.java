package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseExecutors {

    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private FirebaseExecutors() {
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int i14) {
        return new LimitedConcurrencyExecutor(executor, i14);
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int i14) {
        return new LimitedConcurrencyExecutorService(executorService, i14);
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int i14) {
        return new DelegatingScheduledExecutorService(newLimitedConcurrencyExecutorService(executorService, i14), ExecutorsRegistrar.SCHEDULER.get());
    }

    public static PausableExecutor newPausableExecutor(Executor executor) {
        return new PausableExecutorImpl(false, executor);
    }

    public static PausableExecutorService newPausableExecutorService(ExecutorService executorService) {
        return new PausableExecutorServiceImpl(false, executorService);
    }

    public static PausableScheduledExecutorService newPausableScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return new PausableScheduledExecutorServiceImpl(newPausableExecutorService(scheduledExecutorService), ExecutorsRegistrar.SCHEDULER.get());
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
