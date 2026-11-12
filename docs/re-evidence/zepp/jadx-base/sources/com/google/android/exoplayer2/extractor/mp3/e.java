package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class e implements Seeker {
    private static final String g = "XingSeeker";
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    @Nullable
    private final long[] f;

    private e(long dataStartPosition, int xingFrameSize, long durationUs) {
        this(dataStartPosition, xingFrameSize, durationUs, -1L, null);
    }

    @Nullable
    public static e a(long inputLength, long position, MpegAudioUtil.Header mpegAudioHeader, ParsableByteArray frame) {
        int unsignedIntToInt;
        int i = mpegAudioHeader.samplesPerFrame;
        int i2 = mpegAudioHeader.sampleRate;
        int i3 = frame.readInt();
        if ((i3 & 1) != 1 || (unsignedIntToInt = frame.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedIntToInt, ((long) i) * 1000000, i2);
        if ((i3 & 6) != 6) {
            return new e(position, mpegAudioHeader.frameSize, jScaleLargeTimestamp);
        }
        long unsignedInt = frame.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = frame.readUnsignedByte();
        }
        if (inputLength != -1) {
            long j = position + unsignedInt;
            if (inputLength != j) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(inputLength);
                sb.append(", ");
                sb.append(j);
                Log.w(g, sb.toString());
            }
        }
        return new e(position, mpegAudioHeader.frameSize, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    private long b(int tableIndex) {
        return (this.c * ((long) tableIndex)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.a + ((long) this.b)));
        }
        long jConstrainValue = Util.constrainValue(timeUs, 0L, this.c);
        double d = (jConstrainValue * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.f);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.a + Util.constrainValue(Math.round((d2 / 256.0d) * this.d), this.b, this.d - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long position) {
        long j = position - this.a;
        if (!isSeekable() || j <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.f);
        double d = (j * 256.0d) / this.d;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true, true);
        long jB = b(iBinarySearchFloor);
        long j2 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long jB2 = b(i);
        long j3 = iBinarySearchFloor == 99 ? 256L : jArr[i];
        return jB + Math.round((j2 == j3 ? 0.0d : (d - j2) / (j3 - j2)) * (jB2 - jB));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.f != null;
    }

    private e(long dataStartPosition, int xingFrameSize, long durationUs, long dataSize, @Nullable long[] tableOfContents) {
        this.a = dataStartPosition;
        this.b = xingFrameSize;
        this.c = durationUs;
        this.f = tableOfContents;
        this.d = dataSize;
        this.e = dataSize != -1 ? dataStartPosition + dataSize : -1L;
    }
}
