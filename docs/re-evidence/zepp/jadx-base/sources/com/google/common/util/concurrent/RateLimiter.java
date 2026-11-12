package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class RateLimiter {
    private final a a;

    @MonotonicNonNullDecl
    private volatile Object b;

    public static abstract class a {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.RateLimiter$a$a, reason: collision with other inner class name */
        public static class C0237a extends a {
            public final Stopwatch a = Stopwatch.createStarted();

            @Override // com.google.common.util.concurrent.RateLimiter.a
            public long b() {
                return this.a.elapsed(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.RateLimiter.a
            public void c(long j) {
                if (j > 0) {
                    Uninterruptibles.sleepUninterruptibly(j, TimeUnit.MICROSECONDS);
                }
            }
        }

        public static a a() {
            return new C0237a();
        }

        public abstract long b();

        public abstract void c(long j);
    }

    public RateLimiter(a aVar) {
        this.a = (a) Preconditions.checkNotNull(aVar);
    }

    private boolean a(long j, long j2) {
        return h(j) - j2 <= j;
    }

    private static void b(int i) {
        Preconditions.checkArgument(i > 0, "Requested permits (%s) must be positive", i);
    }

    @VisibleForTesting
    public static RateLimiter c(double d, long j, TimeUnit timeUnit, double d2, a aVar) {
        t.c cVar = new t.c(aVar, j, timeUnit, d2);
        cVar.setRate(d);
        return cVar;
    }

    public static RateLimiter create(double d) {
        return d(d, a.a());
    }

    @VisibleForTesting
    public static RateLimiter d(double d, a aVar) {
        t.b bVar = new t.b(aVar, 1.0d);
        bVar.setRate(d);
        return bVar;
    }

    private Object g() {
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                obj = this.b;
                if (obj == null) {
                    obj = new Object();
                    this.b = obj;
                }
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    public abstract double e();

    public abstract void f(double d, long j);

    public final double getRate() {
        double dE;
        synchronized (g()) {
            dE = e();
        }
        return dE;
    }

    public abstract long h(long j);

    public final long i(int i) {
        long j;
        b(i);
        synchronized (g()) {
            j = j(i, this.a.b());
        }
        return j;
    }

    public final long j(int i, long j) {
        return Math.max(k(i, j) - j, 0L);
    }

    public abstract long k(int i, long j);

    public final void setRate(double d) {
        Preconditions.checkArgument(d > 0.0d && !Double.isNaN(d), "rate must be positive");
        synchronized (g()) {
            f(d, this.a.b());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j, TimeUnit timeUnit) {
        return tryAcquire(1, j, timeUnit);
    }

    public static RateLimiter create(double d, long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "warmupPeriod must not be negative: %s", j);
        return c(d, j, timeUnit, 3.0d, a.a());
    }

    @CanIgnoreReturnValue
    public double acquire(int i) {
        long jI = i(i);
        this.a.c(jI);
        return (jI * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j), 0L);
        b(i);
        synchronized (g()) {
            long jB = this.a.b();
            if (!a(jB, jMax)) {
                return false;
            }
            this.a.c(j(i, jB));
            return true;
        }
    }
}
