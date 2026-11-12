package com.google.common.util.concurrent;

import com.google.common.math.LongMath;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    abstract double coolDownIntervalMicros();

    abstract void doSetRate(double d, double d2);

    abstract long storedPermitsToWaitTime(double d, double d2);

    static final class b extends SmoothRateLimiter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f4716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f4717c;
        private final long d;
        private double e;

        b(RateLimiter.SleepingStopwatch sleepingStopwatch, long j, TimeUnit timeUnit, double d) {
            super(sleepingStopwatch);
            this.d = timeUnit.toMicros(j);
            this.f4716b = d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double d, double d2) {
            double d3;
            double d4 = this.maxPermits;
            double d5 = this.f4716b * d2;
            double d6 = this.d;
            double d7 = (0.5d * d6) / d2;
            this.f4717c = d7;
            this.maxPermits = d7 + ((d6 * 2.0d) / (d2 + d5));
            this.e = (d5 - d2) / (this.maxPermits - this.f4717c);
            if (d4 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d4 == 0.0d) {
                d3 = this.maxPermits;
            } else {
                d3 = (this.storedPermits * this.maxPermits) / d4;
            }
            this.storedPermits = d3;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double d, double d2) {
            long jB;
            double d3 = d - this.f4717c;
            if (d3 > 0.0d) {
                double dMin = Math.min(d3, d2);
                jB = (long) (((b(d3) + b(d3 - dMin)) * dMin) / 2.0d);
                d2 -= dMin;
            } else {
                jB = 0;
            }
            return jB + ((long) (this.stableIntervalMicros * d2));
        }

        private double b(double d) {
            return this.stableIntervalMicros + (d * this.e);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
            return this.d / this.maxPermits;
        }
    }

    static final class e extends SmoothRateLimiter {
        final double e;

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double d, double d2) {
            return 0L;
        }

        e(RateLimiter.SleepingStopwatch sleepingStopwatch, double d) {
            super(sleepingStopwatch);
            this.e = d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double d, double d2) {
            double d3 = this.maxPermits;
            this.maxPermits = this.e * d;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.storedPermits = this.maxPermits;
            } else {
                this.storedPermits = d3 != 0.0d ? (this.storedPermits * this.maxPermits) / d3 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }
    }

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final void doSetRate(double d, long j) {
        resync(j);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d;
        this.stableIntervalMicros = micros;
        doSetRate(d, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final double doGetRate() {
        return TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long queryEarliestAvailable(long j) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long reserveEarliestAvailable(int i, long j) {
        resync(j);
        long j2 = this.nextFreeTicketMicros;
        double d = i;
        double dMin = Math.min(d, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.b(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, dMin) + ((long) ((d - dMin) * this.stableIntervalMicros)));
        this.storedPermits -= dMin;
        return j2;
    }

    void resync(long j) {
        long j2 = this.nextFreeTicketMicros;
        if (j > j2) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j - j2) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j;
        }
    }
}
