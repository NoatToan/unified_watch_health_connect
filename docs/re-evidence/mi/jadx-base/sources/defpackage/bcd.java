package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bcd implements Callable<Void>, jz6 {
    public static final FutureTask<Void> f = new FutureTask<>(hua.f20466b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4054a;
    public final ExecutorService d;
    public Thread e;
    public final AtomicReference<Future<?>> c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Future<?>> f4055b = new AtomicReference<>();

    public bcd(Runnable runnable, ExecutorService executorService) {
        this.f4054a = runnable;
        this.d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.e = Thread.currentThread();
        try {
            this.f4054a.run();
            c(this.d.submit(this));
            this.e = null;
        } catch (Throwable th) {
            this.e = null;
            t5l.p(th);
        }
        return null;
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.c.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
        } while (!d8i.a(this.c, future2, future));
    }

    public void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f4055b.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
        } while (!d8i.a(this.f4055b, future2, future));
    }

    @Override // defpackage.jz6
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.c;
        FutureTask<Void> futureTask = f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f4055b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.e != Thread.currentThread());
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.c.get() == f;
    }
}
