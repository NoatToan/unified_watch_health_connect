package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class SequentialExecutor implements Executor {
    private static final LazyLogger log = new LazyLogger(SequentialExecutor.class);
    private final Executor executor;

    @GuardedBy("queue")
    private final Deque<Runnable> queue = new ArrayDeque();

    @GuardedBy("queue")
    @LazyInit
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;

    @GuardedBy("queue")
    private long workerRunCount = 0;

    @RetainedWith
    private final QueueWorker worker = new QueueWorker();

    public final class QueueWorker implements Runnable {
        Runnable task;

        private QueueWorker() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.log.get().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            Runnable runnable;
            boolean z14 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.this.queue) {
                        if (z14) {
                            runnable = (Runnable) SequentialExecutor.this.queue.poll();
                            this.task = runnable;
                            if (runnable == null) {
                                SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                            }
                        } else {
                            WorkerRunningState workerRunningState = SequentialExecutor.this.workerRunningState;
                            WorkerRunningState workerRunningState2 = WorkerRunningState.RUNNING;
                            if (workerRunningState != workerRunningState2) {
                                SequentialExecutor.access$308(SequentialExecutor.this);
                                SequentialExecutor.this.workerRunningState = workerRunningState2;
                                z14 = true;
                                runnable = (Runnable) SequentialExecutor.this.queue.poll();
                                this.task = runnable;
                                if (runnable == null) {
                                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                    this.task = null;
                } catch (Throwable th3) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            Thread.currentThread().interrupt();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e4) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e4;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + StringSubstitutor.DEFAULT_VAR_END;
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.workerRunningState + StringSubstitutor.DEFAULT_VAR_END;
        }
    }

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j8 = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j8;
        return j8;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z14;
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            WorkerRunningState workerRunningState2 = this.workerRunningState;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j8 = this.workerRunCount;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    final /* synthetic */ SequentialExecutor this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.workerRunningState = workerRunningState3;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != workerRunningState3) {
                        return;
                    }
                    synchronized (this.queue) {
                        try {
                            if (this.workerRunCount == j8 && this.workerRunningState == workerRunningState3) {
                                this.workerRunningState = workerRunningState;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (this.queue) {
                        try {
                            WorkerRunningState workerRunningState4 = this.workerRunningState;
                            if (workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) {
                                z14 = false;
                            } else if (this.queue.removeLastOccurrence(runnable2)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!(th4 instanceof RejectedExecutionException) || z14) {
                                throw th4;
                            }
                            return;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            this.queue.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + StringSubstitutor.DEFAULT_VAR_END;
    }
}
