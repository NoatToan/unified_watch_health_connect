package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class c implements SeekMap {
    private final a a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public c(a wavHeader, int framesPerBlock, long dataStartPosition, long dataEndPosition) {
        this.a = wavHeader;
        this.b = framesPerBlock;
        this.c = dataStartPosition;
        long j = (dataEndPosition - dataStartPosition) / ((long) wavHeader.e);
        this.d = j;
        this.e = a(j);
    }

    private long a(long blockIndex) {
        return Util.scaleLargeTimestamp(blockIndex * ((long) this.b), 1000000L, this.a.c);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        long jConstrainValue = Util.constrainValue((((long) this.a.c) * timeUs) / (((long) this.b) * 1000000), 0L, this.d - 1);
        long j = this.c + (((long) this.a.e) * jConstrainValue);
        long jA = a(jConstrainValue);
        SeekPoint seekPoint = new SeekPoint(jA, j);
        if (jA >= timeUs || jConstrainValue == this.d - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j2 = jConstrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(a(j2), this.c + (((long) this.a.e) * j2)));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
