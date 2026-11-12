package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjuster {
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private static final long e = 8589934592L;

    @GuardedBy("this")
    private long a;

    @GuardedBy("this")
    private long b;

    @GuardedBy("this")
    private long c;
    private final ThreadLocal<Long> d = new ThreadLocal<>();

    public TimestampAdjuster(long firstSampleTimestampUs) {
        reset(firstSampleTimestampUs);
    }

    public static long ptsToUs(long pts) {
        return (pts * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long us) {
        return (us * 90000) / 1000000;
    }

    public static long usToWrappedPts(long us) {
        return usToNonWrappedPts(us) % e;
    }

    public synchronized long adjustSampleTimestamp(long timeUs) {
        if (timeUs == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.b == C.TIME_UNSET) {
            long jLongValue = this.a;
            if (jLongValue == MODE_SHARED) {
                jLongValue = ((Long) Assertions.checkNotNull(this.d.get())).longValue();
            }
            this.b = jLongValue - timeUs;
            notifyAll();
        }
        this.c = timeUs;
        return timeUs + this.b;
    }

    public synchronized long adjustTsTimestamp(long pts90Khz) {
        if (pts90Khz == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j = this.c;
        if (j != C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j);
            long j2 = (4294967296L + jUsToNonWrappedPts) / e;
            long j3 = ((j2 - 1) * e) + pts90Khz;
            pts90Khz += j2 * e;
            if (Math.abs(j3 - jUsToNonWrappedPts) < Math.abs(pts90Khz - jUsToNonWrappedPts)) {
                pts90Khz = j3;
            }
        }
        return adjustSampleTimestamp(ptsToUs(pts90Khz));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        j = this.c;
        return j != C.TIME_UNSET ? j + this.b : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.b;
    }

    public synchronized void reset(long firstSampleTimestampUs) {
        this.a = firstSampleTimestampUs;
        this.b = firstSampleTimestampUs == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean canInitialize, long nextSampleTimestampUs) throws InterruptedException {
        Assertions.checkState(this.a == MODE_SHARED);
        if (this.b != C.TIME_UNSET) {
            return;
        }
        if (canInitialize) {
            this.d.set(Long.valueOf(nextSampleTimestampUs));
        } else {
            while (this.b == C.TIME_UNSET) {
                wait();
            }
        }
    }
}
