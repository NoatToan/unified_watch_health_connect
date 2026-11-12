package com.huami.watch.companion.xiaomiai;

/* JADX INFO: loaded from: classes16.dex */
public class AudioBufferManager {
    private byte[] mBuffer;
    private int mCurrentIndex;
    public int mDefaultLen;

    public AudioBufferManager() {
        this(1024);
    }

    private void reAllocateBuffer(int i) {
        byte[] bArr = this.mBuffer;
        byte[] bArr2 = new byte[i + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.mBuffer = bArr2;
    }

    public void addBuffer(byte[] bArr, int i) {
        int length = (this.mCurrentIndex + i) - this.mBuffer.length;
        if (length > 0) {
            reAllocateBuffer(this.mDefaultLen * ((int) Math.ceil((length * 1.0f) / this.mDefaultLen)));
        }
        System.arraycopy(bArr, 0, this.mBuffer, this.mCurrentIndex, i);
        this.mCurrentIndex += i;
    }

    public byte[] getAudioBuffer() {
        int i = this.mCurrentIndex;
        byte[] bArr = new byte[i];
        System.arraycopy(this.mBuffer, 0, bArr, 0, i);
        return bArr;
    }

    public AudioBufferManager(int i) {
        this.mDefaultLen = 0;
        this.mBuffer = new byte[1024];
        this.mDefaultLen = i;
    }
}
