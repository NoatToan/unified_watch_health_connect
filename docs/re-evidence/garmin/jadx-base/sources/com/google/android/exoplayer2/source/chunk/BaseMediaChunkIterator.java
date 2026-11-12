package com.google.android.exoplayer2.source.chunk;

import c22.t;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j8, long j14) {
        this.fromIndex = j8;
        this.toIndex = j14;
        reset();
    }

    public final void checkInBounds() {
        long j8 = this.currentIndex;
        if (j8 < this.fromIndex || j8 > this.toIndex) {
            t.g();
        }
    }

    public final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }
}
