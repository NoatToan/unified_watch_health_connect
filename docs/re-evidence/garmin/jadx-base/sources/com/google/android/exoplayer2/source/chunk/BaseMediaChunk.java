package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i14, Object obj, long j8, long j14, long j15, long j16, long j17) {
        super(dataSource, dataSpec, format, i14, obj, j8, j14, j17);
        this.clippedStartTimeUs = j15;
        this.clippedEndTimeUs = j16;
    }

    public final int getFirstSampleIndex(int i14) {
        return ((int[]) Assertions.checkStateNotNull(this.firstSampleIndices))[i14];
    }

    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
