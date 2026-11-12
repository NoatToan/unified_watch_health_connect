package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
final class WavSeekMap implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final WavFormat wavFormat;

    public WavSeekMap(WavFormat wavFormat, int i14, long j8, long j14) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i14;
        this.firstBlockPosition = j8;
        long j15 = (j14 - j8) / ((long) wavFormat.blockSize);
        this.blockCount = j15;
        this.durationUs = blockIndexToTimeUs(j15);
    }

    private long blockIndexToTimeUs(long j8) {
        return Util.scaleLargeTimestamp(j8 * ((long) this.framesPerBlock), 1000000L, this.wavFormat.frameRateHz);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        long jConstrainValue = Util.constrainValue((((long) this.wavFormat.frameRateHz) * j8) / (((long) this.framesPerBlock) * 1000000), 0L, this.blockCount - 1);
        long j14 = (((long) this.wavFormat.blockSize) * jConstrainValue) + this.firstBlockPosition;
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        SeekPoint seekPoint = new SeekPoint(jBlockIndexToTimeUs, j14);
        if (jBlockIndexToTimeUs >= j8 || jConstrainValue == this.blockCount - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j15 = jConstrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j15), (((long) this.wavFormat.blockSize) * j15) + this.firstBlockPosition));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
