package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.math.LongMath;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    public static final class SmoothBursty extends SmoothRateLimiter {
        final double maxBurstSeconds;

        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d14) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d14;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d14, double d15) {
            double d16 = this.maxPermits;
            double d17 = this.maxBurstSeconds * d14;
            this.maxPermits = d17;
            if (d16 == Double.POSITIVE_INFINITY) {
                this.storedPermits = d17;
            } else {
                this.storedPermits = d16 != 0.0d ? (this.storedPermits * d17) / d16 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d14, double d15) {
            return 0L;
        }
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j8, TimeUnit timeUnit, double d14) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j8);
            this.coldFactor = d14;
        }

        private double permitsToTime(double d14) {
            return (d14 * this.slope) + this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d14, double d15) {
            double d16 = this.maxPermits;
            double d17 = this.coldFactor * d15;
            long j8 = this.warmupPeriodMicros;
            double d18 = (j8 * 0.5d) / d15;
            this.thresholdPermits = d18;
            double d19 = ((j8 * 2.0d) / (d15 + d17)) + d18;
            this.maxPermits = d19;
            this.slope = (d17 - d15) / (d19 - d18);
            if (d16 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d16 != 0.0d) {
                d19 = (this.storedPermits * d19) / d16;
            }
            this.storedPermits = d19;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d14, double d15) {
            long jPermitsToTime;
            double d16 = d14 - this.thresholdPermits;
            if (d16 > 0.0d) {
                double dMin = Math.min(d16, d15);
                jPermitsToTime = (long) (((permitsToTime(d16) + permitsToTime(d16 - dMin)) * dMin) / 2.0d);
                d15 -= dMin;
            } else {
                jPermitsToTime = 0;
            }
            return jPermitsToTime + ((long) (this.stableIntervalMicros * d15));
        }
    }

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    public abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
        return 1000000 / this.stableIntervalMicros;
    }

    public abstract void doSetRate(double d14, double d15);

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double d14, long j8) {
        resync(j8);
        double d15 = 1000000 / d14;
        this.stableIntervalMicros = d15;
        doSetRate(d14, d15);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long j8) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int i14, long j8) {
        resync(j8);
        long j14 = this.nextFreeTicketMicros;
        double d14 = i14;
        double dMin = Math.min(d14, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, dMin) + ((long) ((d14 - dMin) * this.stableIntervalMicros)));
        this.storedPermits -= dMin;
        return j14;
    }

    public void resync(long j8) {
        long j14 = this.nextFreeTicketMicros;
        if (j8 > j14) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j8 - j14) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j8;
        }
    }

    public abstract long storedPermitsToWaitTime(double d14, double d15);
}
