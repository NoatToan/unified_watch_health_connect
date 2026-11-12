package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class c implements Seeker {
    private final long[] a;
    private final long[] b;
    private final long c;

    private c(long[] referencePositions, long[] referenceTimesMs, long durationUs) {
        this.a = referencePositions;
        this.b = referenceTimesMs;
        this.c = durationUs == C.TIME_UNSET ? C.msToUs(referenceTimesMs[referenceTimesMs.length - 1]) : durationUs;
    }

    public static c a(long firstFramePosition, MlltFrame mlltFrame, long durationUs) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = firstFramePosition;
        long j = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            firstFramePosition += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3]);
            j += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3]);
            jArr[i2] = firstFramePosition;
            jArr2[i2] = j;
        }
        return new c(jArr, jArr2, durationUs);
    }

    private static Pair<Long, Long> b(long x, long[] xReferences, long[] yReferences) {
        int iBinarySearchFloor = Util.binarySearchFloor(xReferences, x, true, true);
        long j = xReferences[iBinarySearchFloor];
        long j2 = yReferences[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        if (i == xReferences.length) {
            return Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
        long j3 = xReferences[i];
        return Pair.create(Long.valueOf(x), Long.valueOf(((long) ((j3 == j ? 0.0d : (x - j) / (j3 - j)) * (yReferences[i] - j2))) + j2));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        Pair<Long, Long> pairB = b(C.usToMs(Util.constrainValue(timeUs, 0L, this.c)), this.b, this.a);
        return new SeekMap.SeekPoints(new SeekPoint(C.msToUs(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long position) {
        return C.msToUs(((Long) b(position, this.a, this.b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
