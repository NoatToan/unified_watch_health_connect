package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import defpackage.aro;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class RateLimiter {

    @CheckForNull
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    abstract double doGetRate();

    abstract void doSetRate(double d, long j);

    abstract long queryEarliestAvailable(long j);

    abstract long reserveEarliestAvailable(int i, long j);

    public static RateLimiter create(double d) {
        return create(d, SleepingStopwatch.createFromSystemTimer());
    }

    static RateLimiter create(double d, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.e eVar = new SmoothRateLimiter.e(sleepingStopwatch, 1.0d);
        eVar.setRate(d);
        return eVar;
    }

    public static RateLimiter create(double d, long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "warmupPeriod must not be negative: %s", j);
        return create(d, j, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    static RateLimiter create(double d, long j, TimeUnit timeUnit, double d2, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.b bVar = new SmoothRateLimiter.b(sleepingStopwatch, j, timeUnit, d2);
        bVar.setRate(d);
        return bVar;
    }

    private Object mutex() {
        Object obj;
        Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.mutexDoNotUseDirectly;
            if (obj == null) {
                obj = new Object();
                this.mutexDoNotUseDirectly = obj;
            }
        }
        return obj;
    }

    RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    public final void setRate(double d) {
        Preconditions.checkArgument(d > 0.0d && !Double.isNaN(d), "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d, this.stopwatch.readMicros());
        }
    }

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    public double acquire() {
        return acquire(1);
    }

    public double acquire(int i) {
        long jReserve = reserve(i);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    final long reserve(int i) {
        long jReserveAndGetWaitLength;
        checkPermits(i);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(i, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    public boolean tryAcquire(long j, TimeUnit timeUnit) {
        return tryAcquire(1, j, timeUnit);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j), 0L);
        checkPermits(i);
        synchronized (mutex()) {
            long micros = this.stopwatch.readMicros();
            if (!canAcquire(micros, jMax)) {
                return false;
            }
            this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i, micros));
            return true;
        }
    }

    private boolean canAcquire(long j, long j2) {
        return queryEarliestAvailable(j) - j2 <= j;
    }

    final long reserveAndGetWaitLength(int i, long j) {
        return Math.max(reserveEarliestAvailable(i, j) - j, 0L);
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    static abstract class SleepingStopwatch {
        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long j);

        protected SleepingStopwatch() {
        }

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final Stopwatch e = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected long readMicros() {
                    return this.e.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected void sleepMicrosUninterruptibly(long j) {
                    if (j > 0) {
                        aro.a(j, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }
    }

    private static void checkPermits(int i) {
        Preconditions.checkArgument(i > 0, "Requested permits (%s) must be positive", i);
    }
}
