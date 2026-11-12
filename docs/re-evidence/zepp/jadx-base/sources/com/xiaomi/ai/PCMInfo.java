package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
public class PCMInfo {
    public int bit;
    public int channels;
    public boolean eof;
    public byte[] pcm;
    public int sample_rate;

    public PCMInfo(int i, int i2, int i3, boolean z, byte[] bArr) {
        this.sample_rate = i;
        this.channels = i2;
        this.bit = i3;
        this.eof = z;
        this.pcm = bArr;
    }

    public int getBit() {
        return this.bit;
    }

    public int getChannels() {
        return this.channels;
    }

    public boolean getEOF() {
        return this.eof;
    }

    public byte[] getPCM() {
        return this.pcm;
    }

    public int getSampleRate() {
        return this.sample_rate;
    }
}
