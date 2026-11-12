package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes14.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j8) {
        reset(j8);
    }

    public static long ptsToUs(long j8) {
        return (j8 * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j8) {
        return (j8 * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j8) {
        return usToNonWrappedPts(j8) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (this.timestampOffsetUs == C.TIME_UNSET) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j8;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j8;
            return j8 + this.timestampOffsetUs;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized long adjustTsTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j14 = this.lastUnadjustedTimestampUs;
            if (j14 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j14);
                long j15 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j16 = ((j15 - 1) * MAX_PTS_PLUS_ONE) + j8;
                long j17 = (j15 * MAX_PTS_PLUS_ONE) + j8;
                j8 = Math.abs(j16 - jUsToNonWrappedPts) < Math.abs(j17 - jUsToNonWrappedPts) ? j16 : j17;
            }
            return adjustSampleTimestamp(ptsToUs(j8));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j8;
        j8 = this.firstSampleTimestampUs;
        if (j8 == Long.MAX_VALUE || j8 == MODE_SHARED) {
            j8 = C.TIME_UNSET;
        }
        return j8;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j8;
        try {
            j8 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th3) {
            throw th3;
        }
        return j8 != C.TIME_UNSET ? j8 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j8) {
        this.firstSampleTimestampUs = j8;
        this.timestampOffsetUs = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z14, long j8) {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (this.timestampOffsetUs != C.TIME_UNSET) {
                return;
            }
            if (z14) {
                this.nextSampleTimestampUs.set(Long.valueOf(j8));
            } else {
                while (this.timestampOffsetUs == C.TIME_UNSET) {
                    wait();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
