package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes13.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j8, long j14, int i14, int i15, boolean z14) {
        this.inputLength = j8;
        this.firstFrameBytePosition = j14;
        this.frameSize = i15 == -1 ? 1 : i15;
        this.bitrate = i14;
        this.allowSeeksIfLengthUnknown = z14;
        if (j8 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j8 - j14;
            this.durationUs = getTimeUsAtPosition(j8, j14, i14);
        }
    }

    private long getFramePositionForTimeUs(long j8) {
        long j14 = (j8 * ((long) this.bitrate)) / 8000000;
        int i14 = this.frameSize;
        long jMin = (j14 / ((long) i14)) * ((long) i14);
        long j15 = this.dataSize;
        if (j15 != -1) {
            jMin = Math.min(jMin, j15 - ((long) i14));
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }

    private static long getTimeUsAtPosition(long j8, long j14, int i14) {
        return (Math.max(0L, j8 - j14) * 8000000) / ((long) i14);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j8);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j8) {
            int i14 = this.frameSize;
            if (((long) i14) + framePositionForTimeUs < this.inputLength) {
                long j14 = framePositionForTimeUs + ((long) i14);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j14), j14));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public long getTimeUsAtPosition(long j8) {
        return getTimeUsAtPosition(j8, this.firstFrameBytePosition, this.bitrate);
    }

    public ConstantBitrateSeekMap(long j8, long j14, int i14, int i15) {
        this(j8, j14, i14, i15, false);
    }
}
