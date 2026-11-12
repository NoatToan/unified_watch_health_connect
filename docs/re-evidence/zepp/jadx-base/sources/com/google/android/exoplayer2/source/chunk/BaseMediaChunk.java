package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    private BaseMediaChunkOutput a;
    private int[] b;
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long startTimeUs, long endTimeUs, long clippedStartTimeUs, long clippedEndTimeUs, long chunkIndex) {
        super(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, chunkIndex);
        this.clippedStartTimeUs = clippedStartTimeUs;
        this.clippedEndTimeUs = clippedEndTimeUs;
    }

    public final int getFirstSampleIndex(int trackIndex) {
        return ((int[]) Assertions.checkStateNotNull(this.b))[trackIndex];
    }

    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.a);
    }

    public void init(BaseMediaChunkOutput output) {
        this.a = output;
        this.b = output.getWriteIndices();
    }
}
