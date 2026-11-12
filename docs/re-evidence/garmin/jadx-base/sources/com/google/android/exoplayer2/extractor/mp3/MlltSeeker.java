package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] jArr, long[] jArr2, long j8) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j8 == C.TIME_UNSET ? Util.msToUs(jArr2[jArr2.length - 1]) : j8;
    }

    public static MlltSeeker create(long j8, MlltFrame mlltFrame, long j14) {
        int length = mlltFrame.bytesDeviations.length;
        int i14 = length + 1;
        long[] jArr = new long[i14];
        long[] jArr2 = new long[i14];
        jArr[0] = j8;
        long j15 = 0;
        jArr2[0] = 0;
        for (int i15 = 1; i15 <= length; i15++) {
            int i16 = i15 - 1;
            j8 += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i16]);
            j15 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i16]);
            jArr[i15] = j8;
            jArr2[i15] = j15;
        }
        return new MlltSeeker(jArr, jArr2, j14);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j8, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j8, true, true);
        long j14 = jArr[iBinarySearchFloor];
        long j15 = jArr2[iBinarySearchFloor];
        int i14 = iBinarySearchFloor + 1;
        if (i14 == jArr.length) {
            return Pair.create(Long.valueOf(j14), Long.valueOf(j15));
        }
        long j16 = jArr[i14];
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((j16 == j14 ? 0.0d : (j8 - j14) / (j16 - j14)) * (jArr2[i14] - j15))) + j15));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j8, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        return Util.msToUs(((Long) linearlyInterpolate(j8, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
