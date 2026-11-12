package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleOutputBuffer extends OutputBuffer {
    private final OutputBuffer.Owner<SimpleOutputBuffer> b;

    @Nullable
    public ByteBuffer data;

    public SimpleOutputBuffer(OutputBuffer.Owner<SimpleOutputBuffer> owner) {
        this.b = owner;
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long timeUs, int size) {
        this.timeUs = timeUs;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < size) {
            this.data = ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(size);
        return this.data;
    }

    @Override // com.google.android.exoplayer2.decoder.OutputBuffer
    public void release() {
        this.b.releaseOutputBuffer(this);
    }
}
