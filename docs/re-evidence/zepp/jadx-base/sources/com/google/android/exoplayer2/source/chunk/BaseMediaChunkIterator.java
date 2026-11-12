package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private final long a;
    private final long b;
    private long c;

    public BaseMediaChunkIterator(long fromIndex, long toIndex) {
        this.a = fromIndex;
        this.b = toIndex;
        reset();
    }

    public final void checkInBounds() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            throw new NoSuchElementException();
        }
    }

    public final long getCurrentIndex() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.c > this.b;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        this.c++;
        return !isEnded();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
        this.c = this.a - 1;
    }
}
