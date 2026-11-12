package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public ConstantBitrateSeekMap(long inputLength, long firstFrameBytePosition, int bitrate, int frameSize) {
        this.a = inputLength;
        this.b = firstFrameBytePosition;
        this.c = frameSize == -1 ? 1 : frameSize;
        this.e = bitrate;
        if (inputLength == -1) {
            this.d = -1L;
            this.f = C.TIME_UNSET;
        } else {
            this.d = inputLength - firstFrameBytePosition;
            this.f = b(inputLength, firstFrameBytePosition, bitrate);
        }
    }

    private long a(long timeUs) {
        long j = (timeUs * ((long) this.e)) / 8000000;
        int i = this.c;
        return this.b + Util.constrainValue((j / ((long) i)) * ((long) i), 0L, this.d - ((long) i));
    }

    private static long b(long position, long firstFrameBytePosition, int bitrate) {
        return ((Math.max(0L, position - firstFrameBytePosition) * 8) * 1000000) / ((long) bitrate);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        if (this.d == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.b));
        }
        long jA = a(timeUs);
        long timeUsAtPosition = getTimeUsAtPosition(jA);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, jA);
        if (timeUsAtPosition < timeUs) {
            int i = this.c;
            if (((long) i) + jA < this.a) {
                long j = jA + ((long) i);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j), j));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long position) {
        return b(position, this.b, this.e);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.d != -1;
    }
}
