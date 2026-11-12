package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OutputBuffer extends Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends OutputBuffer> {
        void releaseOutputBuffer(S outputBuffer);
    }

    public abstract void release();
}
