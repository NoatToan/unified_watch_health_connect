package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfs extends y0 {
    private static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);

    @Nullable
    private e0 b;

    @Nullable
    private e0 c;
    private final PriorityBlockingQueue<d0<?>> d;
    private final BlockingQueue<d0<?>> e;
    private final Thread.UncaughtExceptionHandler f;
    private final Thread.UncaughtExceptionHandler g;
    private final Object h;
    private final Semaphore i;
    private volatile boolean j;

    public zzfs(zzfv zzfvVar) {
        super(zzfvVar);
        this.h = new Object();
        this.i = new Semaphore(2);
        this.d = new PriorityBlockingQueue<>();
        this.e = new LinkedBlockingQueue();
        this.f = new c0(this, "Thread death: Uncaught exception on worker thread");
        this.g = new c0(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean j(zzfs zzfsVar) {
        boolean z = zzfsVar.j;
        return false;
    }

    private final void k(d0<?> d0Var) {
        synchronized (this.h) {
            this.d.add(d0Var);
            e0 e0Var = this.b;
            if (e0Var == null) {
                e0 e0Var2 = new e0(this, "Measurement Worker", this.d);
                this.b = e0Var2;
                e0Var2.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                e0Var.a();
            }
        }
    }

    @Nullable
    public final <T> T e(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzs.zzaz().zzp(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.zzs.zzay().zzk().zza(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            this.zzs.zzay().zzk().zza(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    @Override // com.google.android.gms.measurement.internal.x0
    public final void zzax() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.y0
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.x0
    public final void zzg() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final <V> Future<V> zzh(Callable<V> callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        d0<?> d0Var = new d0<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.b) {
            if (!this.d.isEmpty()) {
                this.zzs.zzay().zzk().zza("Callable skipped the worker queue.");
            }
            d0Var.run();
        } else {
            k(d0Var);
        }
        return d0Var;
    }

    public final <V> Future<V> zzi(Callable<V> callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        d0<?> d0Var = new d0<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.b) {
            d0Var.run();
        } else {
            k(d0Var);
        }
        return d0Var;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        d0<?> d0Var = new d0<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.h) {
            this.e.add(d0Var);
            e0 e0Var = this.c;
            if (e0Var == null) {
                e0 e0Var2 = new e0(this, "Measurement Network", this.e);
                this.c = e0Var2;
                e0Var2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                e0Var.a();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        k(new d0<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        k(new d0<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.b;
    }
}
