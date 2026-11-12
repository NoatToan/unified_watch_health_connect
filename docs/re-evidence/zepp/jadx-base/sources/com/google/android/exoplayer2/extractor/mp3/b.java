package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class b implements Seeker {

    @VisibleForTesting
    public static final long e = 100000;
    private final long a;
    private final LongArray b;
    private final LongArray c;
    private long d;

    public b(long durationUs, long dataStartPosition, long dataEndPosition) {
        this.d = durationUs;
        this.a = dataEndPosition;
        LongArray longArray = new LongArray();
        this.b = longArray;
        LongArray longArray2 = new LongArray();
        this.c = longArray2;
        longArray.add(0L);
        longArray2.add(dataStartPosition);
    }

    public boolean a(long timeUs) {
        LongArray longArray = this.b;
        return timeUs - longArray.get(longArray.size() - 1) < e;
    }

    public void b(long timeUs, long position) {
        if (a(timeUs)) {
            return;
        }
        this.b.add(timeUs);
        this.c.add(position);
    }

    public void c(long durationUs) {
        this.d = durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.b, timeUs, true, true);
        SeekPoint seekPoint = new SeekPoint(this.b.get(iBinarySearchFloor), this.c.get(iBinarySearchFloor));
        if (seekPoint.timeUs == timeUs || iBinarySearchFloor == this.b.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.b.get(i), this.c.get(i)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long position) {
        return this.b.get(Util.binarySearchFloor(this.c, position, true, true));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
