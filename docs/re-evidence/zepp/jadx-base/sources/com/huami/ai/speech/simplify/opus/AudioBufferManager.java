package com.huami.ai.speech.simplify.opus;

/* JADX INFO: loaded from: classes3.dex */
public class AudioBufferManager {
    private byte[] a;
    private int b;
    public int c;

    public AudioBufferManager() {
        this(1024);
    }

    private void a(int i) {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[i + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.a = bArr2;
    }

    public void addBuffer(byte[] bArr, int i) {
        int length = (this.b + i) - this.a.length;
        if (length > 0) {
            a(this.c * ((int) Math.ceil((length * 1.0f) / this.c)));
        }
        System.arraycopy(bArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public byte[] getAudioBuffer() {
        int i = this.b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, 0, bArr, 0, i);
        return bArr;
    }

    public AudioBufferManager(int i) {
        this.a = new byte[1024];
        this.c = i;
    }
}
