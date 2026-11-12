package defpackage;

import androidx.annotation.RequiresApi;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ct3<I, O> extends kua<O> implements Runnable {
    public fl1<? super I, ? extends O> c;
    public final BlockingQueue<Boolean> d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public lhe<? extends I> f;
    public volatile lhe<? extends O> g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lhe f14691a;

        public a(lhe lheVar) {
            this.f14691a = lheVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ct3.this.b(oua.e(this.f14691a));
                } catch (CancellationException unused) {
                    ct3.this.cancel(false);
                } catch (ExecutionException e) {
                    ct3.this.c(e.getCause());
                }
            } finally {
                ct3.this.g = null;
            }
        }
    }

    public ct3(fl1<? super I, ? extends O> fl1Var, lhe<? extends I> lheVar) {
        this.c = (fl1) g6i.g(fl1Var);
        this.f = (lhe) g6i.g(lheVar);
    }

    @Override // defpackage.kua, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        g(this.d, Boolean.valueOf(z));
        f(this.f, z);
        f(this.g, z);
        return true;
    }

    public final void f(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    public final <E> void g(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.kua, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            lhe<? extends I> lheVar = this.f;
            if (lheVar != null) {
                lheVar.get();
            }
            this.e.await();
            lhe<? extends O> lheVar2 = this.g;
            if (lheVar2 != null) {
                lheVar2.get();
            }
        }
        return (O) super.get();
    }

    public final <E> E h(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fl1<? super I, ? extends O>, lhe<? extends I>] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = (fl1<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            lhe<? extends O> lheVarApply = this.c.apply(oua.e(this.f));
                            this.g = lheVarApply;
                            if (!isCancelled()) {
                                lheVarApply.addListener(new a(lheVarApply), li3.a());
                            } else {
                                lheVarApply.cancel(((Boolean) h(this.d)).booleanValue());
                                this.g = null;
                            }
                        } catch (Exception e) {
                            c(e);
                        }
                    } catch (Error e2) {
                        c(e2);
                    }
                } finally {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                c(e3.getCause());
            }
        } catch (UndeclaredThrowableException e4) {
            c(e4.getCause());
        }
    }

    @Override // defpackage.kua, java.util.concurrent.Future
    public O get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            lhe<? extends I> lheVar = this.f;
            if (lheVar != null) {
                long jNanoTime = System.nanoTime();
                lheVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                lhe<? extends O> lheVar2 = this.g;
                if (lheVar2 != null) {
                    lheVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
