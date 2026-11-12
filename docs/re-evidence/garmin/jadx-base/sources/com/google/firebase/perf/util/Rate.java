package com.google.firebase.perf.util;

import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    /* JADX INFO: renamed from: com.google.firebase.perf.util.Rate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Rate(long j8, long j14, TimeUnit timeUnit) {
        this.numTokensPerTotalTimeUnit = j8;
        this.numTimeUnits = j14;
        this.timeUnit = timeUnit;
    }

    public double getTokensPerSeconds() {
        int i14 = AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()];
        if (i14 == 1) {
            return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * C.NANOS_PER_SECOND;
        }
        if (i14 == 2) {
            return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * 1000000;
        }
        long j8 = this.numTokensPerTotalTimeUnit;
        return i14 != 3 ? j8 / this.timeUnit.toSeconds(this.numTimeUnits) : (j8 / this.numTimeUnits) * 1000;
    }
}
