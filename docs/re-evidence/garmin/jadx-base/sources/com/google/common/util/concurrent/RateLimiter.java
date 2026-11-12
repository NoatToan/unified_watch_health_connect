package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class RateLimiter {
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    public static abstract class SleepingStopwatch {
        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final Stopwatch stopwatch = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public long readMicros() {
                    return this.stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public void sleepMicrosUninterruptibly(long j8) {
                    if (j8 > 0) {
                        Uninterruptibles.sleepUninterruptibly(j8, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        public abstract long readMicros();

        public abstract void sleepMicrosUninterruptibly(long j8);
    }

    public RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean canAcquire(long j8, long j14) {
        return queryEarliestAvailable(j8) - j14 <= j8;
    }

    private static void checkPermits(int i14) {
        Preconditions.checkArgument(i14 > 0, "Requested permits (%s) must be positive", i14);
    }

    public static RateLimiter create(double d14, long j8, TimeUnit timeUnit) {
        Preconditions.checkArgument(j8 >= 0, "warmupPeriod must not be negative: %s", j8);
        return create(d14, j8, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    private Object mutex() {
        Object obj;
        Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.mutexDoNotUseDirectly;
                if (obj == null) {
                    obj = new Object();
                    this.mutexDoNotUseDirectly = obj;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire(int i14) {
        long jReserve = reserve(i14);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / 1000000;
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double d14, long j8);

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    public abstract long queryEarliestAvailable(long j8);

    public final long reserve(int i14) {
        long jReserveAndGetWaitLength;
        checkPermits(i14);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(i14, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    public final long reserveAndGetWaitLength(int i14, long j8) {
        return Math.max(reserveEarliestAvailable(i14, j8) - j8, 0L);
    }

    public abstract long reserveEarliestAvailable(int i14, long j8);

    public final void setRate(double d14) {
        Preconditions.checkArgument(d14 > 0.0d, "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d14, this.stopwatch.readMicros());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(int i14, long j8, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j8), 0L);
        checkPermits(i14);
        synchronized (mutex()) {
            try {
                long micros = this.stopwatch.readMicros();
                if (!canAcquire(micros, jMax)) {
                    return false;
                }
                this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i14, micros));
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    @VisibleForTesting
    public static RateLimiter create(double d14, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d14);
        return smoothBursty;
    }

    public static RateLimiter create(double d14) {
        return create(d14, SleepingStopwatch.createFromSystemTimer());
    }

    @VisibleForTesting
    public static RateLimiter create(double d14, long j8, TimeUnit timeUnit, double d15, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j8, timeUnit, d15);
        smoothWarmingUp.setRate(d14);
        return smoothWarmingUp;
    }

    public boolean tryAcquire(int i14) {
        return tryAcquire(i14, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(long j8, TimeUnit timeUnit) {
        return tryAcquire(1, j8, timeUnit);
    }
}
