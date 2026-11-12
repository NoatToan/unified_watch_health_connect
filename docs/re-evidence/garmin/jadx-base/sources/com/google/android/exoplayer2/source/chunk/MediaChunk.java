package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i14, Object obj, long j8, long j14, long j15) {
        super(dataSource, dataSpec, 1, format, i14, obj, j8, j14);
        Assertions.checkNotNull(format);
        this.chunkIndex = j15;
    }

    public long getNextChunkIndex() {
        long j8 = this.chunkIndex;
        if (j8 != -1) {
            return j8 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
