package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DecoderOutputBuffer extends Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends DecoderOutputBuffer> {
        void releaseOutputBuffer(S s8);
    }

    public abstract void release();
}
