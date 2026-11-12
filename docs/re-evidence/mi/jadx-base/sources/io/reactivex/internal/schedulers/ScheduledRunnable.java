package io.reactivex.internal.schedulers;

import defpackage.jz6;
import defpackage.kz6;
import defpackage.t5l;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, jz6 {
    static final int FUTURE_INDEX = 1;
    static final int PARENT_INDEX = 0;
    static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;
    static final Object PARENT_DISPOSED = new Object();
    static final Object SYNC_DISPOSED = new Object();
    static final Object ASYNC_DISPOSED = new Object();
    static final Object DONE = new Object();

    public ScheduledRunnable(Runnable runnable, kz6 kz6Var) {
        super(3);
        this.actual = runnable;
        lazySet(0, kz6Var);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // defpackage.jz6
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == DONE || obj5 == (obj3 = SYNC_DISPOSED) || obj5 == (obj4 = ASYNC_DISPOSED)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == DONE || obj == (obj2 = PARENT_DISPOSED) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((kz6) obj).c(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == PARENT_DISPOSED || obj == DONE;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            try {
                t5l.p(th);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != PARENT_DISPOSED && compareAndSet(0, obj3, DONE) && obj3 != null) {
                    ((kz6) obj3).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == SYNC_DISPOSED || obj == ASYNC_DISPOSED) {
                        break;
                    }
                } while (!compareAndSet(1, obj, DONE));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != PARENT_DISPOSED && compareAndSet(0, obj4, DONE) && obj4 != null) {
            ((kz6) obj4).c(this);
        }
        do {
            obj = get(1);
            Object obj5 = SYNC_DISPOSED;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!compareAndSet(1, obj, DONE));
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == DONE) {
                return;
            }
            if (obj == SYNC_DISPOSED) {
                future.cancel(false);
                return;
            } else if (obj == ASYNC_DISPOSED) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
