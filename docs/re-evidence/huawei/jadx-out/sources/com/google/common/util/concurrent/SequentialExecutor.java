package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import defpackage.aqy;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aqy f4707a = new aqy(SequentialExecutor.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque<Runnable> f4709c;
    private final e d;
    private final Executor e;
    private WorkerRunningState i;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long a(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.f4708b;
        sequentialExecutor.f4708b = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f4709c) {
            if (this.i != WorkerRunningState.RUNNING && this.i != WorkerRunningState.QUEUED) {
                long j = this.f4708b;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.5
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.f4709c.add(runnable2);
                this.i = WorkerRunningState.QUEUING;
                try {
                    this.e.execute(this.d);
                    if (this.i != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.f4709c) {
                        if (this.f4708b == j && this.i == WorkerRunningState.QUEUING) {
                            this.i = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.f4709c) {
                        boolean z = (this.i == WorkerRunningState.IDLE || this.i == WorkerRunningState.QUEUING) && this.f4709c.removeLastOccurrence(runnable2);
                        if (!(th instanceof RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            this.f4709c.add(runnable);
        }
    }

    final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        Runnable f4711b;
        final /* synthetic */ SequentialExecutor d;

        @Override // java.lang.Runnable
        public void run() {
            try {
                e();
            } catch (Error e) {
                synchronized (this.d.f4709c) {
                    this.d.i = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r0 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            r8.f4711b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.f4707a.b().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f4711b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            r8.f4711b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void e() {
            Runnable runnable;
            boolean zInterrupted = false;
            boolean z = false;
            while (true) {
                try {
                    synchronized (this.d.f4709c) {
                        if (!z) {
                            if (this.d.i != WorkerRunningState.RUNNING) {
                                SequentialExecutor.a(this.d);
                                this.d.i = WorkerRunningState.RUNNING;
                                z = true;
                                runnable = (Runnable) this.d.f4709c.poll();
                                this.f4711b = runnable;
                                if (runnable == null) {
                                    this.d.i = WorkerRunningState.IDLE;
                                }
                            }
                        } else {
                            runnable = (Runnable) this.d.f4709c.poll();
                            this.f4711b = runnable;
                            if (runnable == null) {
                                this.d.i = WorkerRunningState.IDLE;
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                    this.f4711b = null;
                } catch (Throwable th) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            Thread.currentThread().interrupt();
        }

        public String toString() {
            Runnable runnable = this.f4711b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + this.d.i + "}";
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.e + "}";
    }
}
