package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j8, long j14) {
        Assertions.checkArgument(j8 >= 0);
        Assertions.checkArgument(j14 >= 0);
        this.toleranceBeforeUs = j8;
        this.toleranceAfterUs = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long resolveSeekPositionUs(long j8, long j14, long j15) {
        long j16 = this.toleranceBeforeUs;
        if (j16 == 0 && this.toleranceAfterUs == 0) {
            return j8;
        }
        long jSubtractWithOverflowDefault = Util.subtractWithOverflowDefault(j8, j16, Long.MIN_VALUE);
        long jAddWithOverflowDefault = Util.addWithOverflowDefault(j8, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z14 = false;
        boolean z15 = jSubtractWithOverflowDefault <= j14 && j14 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j15 && j15 <= jAddWithOverflowDefault) {
            z14 = true;
        }
        if (z15 && z14) {
            if (Math.abs(j14 - j8) <= Math.abs(j15 - j8)) {
                return j14;
            }
            return j15;
        }
        if (!z15) {
            if (z14) {
                return j15;
            }
            return jSubtractWithOverflowDefault;
        }
        return j14;
    }
}
