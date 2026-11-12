package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacSeekTableSeekMap implements SeekMap {
    private final FlacStreamMetadata a;
    private final long b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long firstFrameOffset) {
        this.a = flacStreamMetadata;
        this.b = firstFrameOffset;
    }

    private SeekPoint a(long sampleNumber, long offsetFromFirstFrame) {
        return new SeekPoint((sampleNumber * 1000000) / ((long) this.a.sampleRate), this.b + offsetFromFirstFrame);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        Assertions.checkStateNotNull(this.a.seekTable);
        FlacStreamMetadata flacStreamMetadata = this.a;
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.seekTable;
        long[] jArr = seekTable.pointSampleNumbers;
        long[] jArr2 = seekTable.pointOffsets;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, flacStreamMetadata.getSampleNumber(timeUs), true, false);
        SeekPoint seekPointA = a(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPointA.timeUs == timeUs || iBinarySearchFloor == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPointA);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPointA, a(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
