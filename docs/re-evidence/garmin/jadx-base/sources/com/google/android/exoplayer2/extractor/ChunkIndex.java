package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import java.util.Arrays;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class ChunkIndex implements SeekMap {
    private final long durationUs;
    public final long[] durationsUs;
    public final int length;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length > 0) {
            this.durationUs = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.durationUs = 0L;
        }
    }

    public int getChunkIndex(long j8) {
        return Util.binarySearchFloor(this.timesUs, j8, true, true);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        int chunkIndex = getChunkIndex(j8);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[chunkIndex], this.offsets[chunkIndex]);
        if (seekPoint.timeUs >= j8 || chunkIndex == this.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i14 = chunkIndex + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i14], this.offsets[i14]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        int i14 = this.length;
        String string = Arrays.toString(this.sizes);
        String string2 = Arrays.toString(this.offsets);
        String string3 = Arrays.toString(this.timesUs);
        String string4 = Arrays.toString(this.durationsUs);
        StringBuilder sb3 = new StringBuilder(v.a(v.a(v.a(v.a(71, string), string2), string3), string4));
        sb3.append("ChunkIndex(length=");
        sb3.append(i14);
        sb3.append(", sizes=");
        sb3.append(string);
        sn.a.t(sb3, ", offsets=", string2, ", timeUs=", string3);
        return e0.h(sb3, ", durationsUs=", string4, ")");
    }
}
