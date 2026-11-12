package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexSeekMap implements SeekMap {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public IndexSeekMap(long[] positions, long[] timesUs, long durationUs) {
        Assertions.checkArgument(positions.length == timesUs.length);
        int length = timesUs.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || timesUs[0] <= 0) {
            this.a = positions;
            this.b = timesUs;
        } else {
            int i = length + 1;
            long[] jArr = new long[i];
            this.a = jArr;
            long[] jArr2 = new long[i];
            this.b = jArr2;
            System.arraycopy(positions, 0, jArr, 1, length);
            System.arraycopy(timesUs, 0, jArr2, 1, length);
        }
        this.c = durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        if (!this.d) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.b, timeUs, true, true);
        SeekPoint seekPoint = new SeekPoint(this.b[iBinarySearchFloor], this.a[iBinarySearchFloor]);
        if (seekPoint.timeUs == timeUs || iBinarySearchFloor == this.b.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.b[i], this.a[i]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.d;
    }
}
