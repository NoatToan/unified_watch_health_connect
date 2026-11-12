package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;

    public a(int formatType, int numChannels, int frameRateHz, int averageBytesPerSecond, int blockSize, int bitsPerSample, byte[] extraData) {
        this.a = formatType;
        this.b = numChannels;
        this.c = frameRateHz;
        this.d = averageBytesPerSecond;
        this.e = blockSize;
        this.f = bitsPerSample;
        this.g = extraData;
    }
}
