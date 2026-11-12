package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import o2.c;

/* JADX INFO: loaded from: classes13.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j8, int i14, long j14, long j15, long[] jArr) {
        this.dataStartPosition = j8;
        this.xingFrameSize = i14;
        this.durationUs = j14;
        this.tableOfContents = jArr;
        this.dataSize = j15;
        this.dataEndPosition = j15 != -1 ? j8 + j15 : -1L;
    }

    public static XingSeeker create(long j8, long j14, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        int i14 = header.samplesPerFrame;
        int i15 = header.sampleRate;
        int i16 = parsableByteArray.readInt();
        if ((i16 & 1) != 1 || (unsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedIntToInt, ((long) i14) * 1000000, i15);
        if ((i16 & 6) != 6) {
            return new XingSeeker(j14, header.frameSize, jScaleLargeTimestamp);
        }
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i17 = 0; i17 < 100; i17++) {
            jArr[i17] = parsableByteArray.readUnsignedByte();
        }
        if (j8 != -1) {
            long j15 = j14 + unsignedInt;
            if (j8 != j15) {
                StringBuilder sb3 = new StringBuilder(67);
                sb3.append("XING data size mismatch: ");
                sb3.append(j8);
                sb3.append(", ");
                sb3.append(j15);
                Log.w(TAG, sb3.toString());
            }
        }
        return new XingSeeker(j14, header.frameSize, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    private long getTimeUsForTableIndex(int i14) {
        return (this.durationUs * ((long) i14)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j8, 0L, this.durationUs);
        double d14 = (jConstrainValue * 100.0d) / this.durationUs;
        double dB = 0.0d;
        if (d14 > 0.0d) {
            if (d14 >= 100.0d) {
                dB = 256.0d;
            } else {
                int i14 = (int) d14;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
                double d15 = jArr[i14];
                dB = c.b(i14 == 99 ? 256.0d : jArr[i14 + 1], d15, d14 - ((double) i14), d15);
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((dB / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        long j14 = j8 - this.dataStartPosition;
        if (!isSeekable() || j14 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d14 = (j14 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d14, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j15 = jArr[iBinarySearchFloor];
        int i14 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i14);
        long j16 = iBinarySearchFloor == 99 ? 256L : jArr[i14];
        return Math.round((j15 == j16 ? 0.0d : (d14 - j15) / (j16 - j15)) * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j8, int i14, long j14) {
        this(j8, i14, j14, -1L, null);
    }
}
