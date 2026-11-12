package com.ximalaya.ting.android.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class BufferItem {
    private static final String TAG = "dl_mp3";
    public ByteBuffer bBuffer;
    private int dataSize;
    public int errorCode;
    public boolean fails;
    private int index = -1;
    private boolean lastChunk;

    public BufferItem() {
        Logger.log(TAG, "======================BufferItem Constructor()");
        this.lastChunk = false;
        this.dataSize = 0;
        this.fails = false;
    }

    public ByteBuffer getBuffer() {
        return this.bBuffer.hasArray() ? ByteBuffer.wrap(this.bBuffer.array()) : ByteBuffer.allocate(0);
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isLastChunk() {
        return this.lastChunk;
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            this.bBuffer = ByteBuffer.wrap(byteBuffer.array());
            this.dataSize = byteBuffer.array().length;
            Logger.log(TAG, "======================BufferItem setBuffer0(" + this.dataSize + ")");
        }
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLastChunk() {
        this.lastChunk = true;
    }

    public void setBuffer(byte[] bArr) {
        if (bArr != null) {
            this.bBuffer = ByteBuffer.wrap(bArr);
            this.dataSize = bArr.length;
            Logger.log(TAG, "======================BufferItem setBuffer1(" + this.dataSize + ")");
        }
    }
}
