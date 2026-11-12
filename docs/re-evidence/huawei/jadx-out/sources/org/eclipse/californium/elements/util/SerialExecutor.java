package org.eclipse.californium.elements.util;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import defpackage.aaex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class SerialExecutor extends AbstractExecutorService implements CheckedExecutor {
    private static final Logger e = aaex.a((Class<?>) SerialExecutor.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f44501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f44502b;
    private final Executor d;
    private boolean i;
    private final Condition j;
    private final AtomicReference<Thread> h = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<ExecutionListener> f44503c = new AtomicReference<>();
    private final BlockingQueue<Runnable> g = new LinkedBlockingQueue();

    public interface ExecutionListener {
        void afterExecution();

        void beforeExecution();
    }

    public SerialExecutor(Executor executor) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f44501a = reentrantLock;
        this.j = reentrantLock.newCondition();
        if (executor == null) {
            this.i = true;
        } else if (executor instanceof SerialExecutor) {
            throw new IllegalArgumentException("Sequences of SerialExecutors are not supported!");
        }
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f44501a.lock();
        try {
            if (this.i) {
                throw new RejectedExecutionException("SerialExecutor already shutdown!");
            }
            this.g.offer(runnable);
            if (this.f44502b == null) {
                b();
            }
            this.f44501a.unlock();
        } catch (Throwable th) {
            this.f44501a.unlock();
            throw th;
        }
    }

    @Override // org.eclipse.californium.elements.util.CheckedExecutor
    public void assertOwner() {
        if (this.h.get() != Thread.currentThread()) {
            Thread thread = this.h.get();
            if (thread == null) {
                throw new ConcurrentModificationException(this + " is not owned!");
            }
            throw new ConcurrentModificationException(this + " owned by " + thread.getName() + "!");
        }
    }

    @Override // org.eclipse.californium.elements.util.CheckedExecutor
    public boolean checkOwner() {
        return this.h.get() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Thread thread = this.h.get();
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.h, null, Thread.currentThread())) {
            return;
        }
        if (thread == null) {
            throw new ConcurrentModificationException(this + " was already owned!");
        }
        throw new ConcurrentModificationException(this + " already owned by " + thread.getName() + "!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.h, Thread.currentThread(), null)) {
            return;
        }
        Thread thread = this.h.get();
        if (thread == null) {
            throw new ConcurrentModificationException(this + " is not owned, clear failed!");
        }
        throw new ConcurrentModificationException(this + " owned by " + thread.getName() + ", clear failed!");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f44501a.lock();
        try {
            this.i = true;
        } finally {
            this.f44501a.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        this.f44501a.lock();
        try {
            ArrayList arrayList = new ArrayList(this.g.size());
            b(arrayList);
            return arrayList;
        } finally {
            this.f44501a.unlock();
        }
    }

    public int b(Collection<Runnable> collection) {
        this.f44501a.lock();
        try {
            shutdown();
            return this.g.drainTo(collection);
        } finally {
            this.f44501a.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        this.f44501a.lock();
        try {
            return this.i;
        } finally {
            this.f44501a.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        this.f44501a.lock();
        try {
            return this.i && this.f44502b == null;
        } finally {
            this.f44501a.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        this.f44501a.lock();
        try {
            long nanos = timeUnit.toNanos(j);
            do {
                if (this.i && this.f44502b == null) {
                    break;
                }
                nanos = this.j.awaitNanos(nanos);
            } while (nanos > 0);
            return this.i && this.f44502b == null;
        } finally {
            this.f44501a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f44501a.lock();
        try {
            final Runnable runnablePoll = this.g.poll();
            this.f44502b = runnablePoll;
            if (runnablePoll != null) {
                this.d.execute(new Runnable() { // from class: org.eclipse.californium.elements.util.SerialExecutor.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            SerialExecutor.this.c();
                            ExecutionListener executionListener = (ExecutionListener) SerialExecutor.this.f44503c.get();
                            if (executionListener != null) {
                                try {
                                    executionListener.beforeExecution();
                                } catch (Throwable th) {
                                    try {
                                        SerialExecutor.e.error("unexpected error occurred:", th);
                                        if (executionListener != null) {
                                            try {
                                                executionListener.afterExecution();
                                            } catch (Throwable th2) {
                                                SerialExecutor.e.error("unexpected error occurred after execution:", th2);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (executionListener != null) {
                                            try {
                                                executionListener.afterExecution();
                                            } catch (Throwable th4) {
                                                SerialExecutor.e.error("unexpected error occurred after execution:", th4);
                                            }
                                        }
                                        SerialExecutor.this.e();
                                        throw th3;
                                    }
                                }
                            }
                            runnablePoll.run();
                            if (executionListener != null) {
                                try {
                                    executionListener.afterExecution();
                                } catch (Throwable th5) {
                                    SerialExecutor.e.error("unexpected error occurred after execution:", th5);
                                }
                            }
                            SerialExecutor.this.e();
                            try {
                                SerialExecutor.this.b();
                            } catch (RejectedExecutionException e2) {
                                SerialExecutor.e.debug("shutdown?", (Throwable) e2);
                            }
                        } catch (Throwable th6) {
                            try {
                                SerialExecutor.this.b();
                            } catch (RejectedExecutionException e3) {
                                SerialExecutor.e.debug("shutdown?", (Throwable) e3);
                            }
                            throw th6;
                        }
                    }
                });
            } else if (this.i) {
                this.j.signalAll();
            }
        } finally {
            this.f44501a.unlock();
        }
    }

    public ExecutionListener e(ExecutionListener executionListener) {
        return this.f44503c.getAndSet(executionListener);
    }
}
