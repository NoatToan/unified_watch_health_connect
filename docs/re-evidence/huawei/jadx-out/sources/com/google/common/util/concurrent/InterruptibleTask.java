package com.google.common.util.concurrent;

import defpackage.aqz;
import defpackage.arc;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable PARKED;

    protected abstract void afterRanInterruptiblyFailure(Throwable th);

    protected abstract void afterRanInterruptiblySuccess(@ParametricNullness T t);

    protected abstract boolean isDone();

    @ParametricNullness
    protected abstract T runInterruptibly() throws Exception;

    protected abstract String toPendingString();

    static final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        private b() {
        }
    }

    static {
        DONE = new b();
        PARKED = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zIsDone = isDone();
            if (!zIsDone) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    try {
                        arc.e(th);
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        afterRanInterruptiblyFailure(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            afterRanInterruptiblySuccess(aqz.e(null));
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, DONE)) {
                waitForInterrupt(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            afterRanInterruptiblySuccess(aqz.e(objRunInterruptibly));
        }
    }

    private void waitForInterrupt(Thread thread) {
        Runnable runnable = get();
        c cVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof c;
            if (!z2 && runnable != PARKED) {
                break;
            }
            if (z2) {
                cVar = (c) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(cVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            c cVar = new c();
            cVar.d(Thread.currentThread());
            if (compareAndSet(runnable, cVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    static final class c extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterruptibleTask<?> f4700b;

        @Override // java.lang.Runnable
        public void run() {
        }

        private c(InterruptibleTask<?> interruptibleTask) {
            this.f4700b = interruptibleTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f4700b.toString();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + toPendingString();
    }
}
