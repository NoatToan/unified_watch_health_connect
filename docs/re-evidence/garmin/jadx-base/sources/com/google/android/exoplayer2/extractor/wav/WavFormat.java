package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes13.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i14, int i15, int i16, int i17, int i18, int i19, byte[] bArr) {
        this.formatType = i14;
        this.numChannels = i15;
        this.frameRateHz = i16;
        this.averageBytesPerSecond = i17;
        this.blockSize = i18;
        this.bitsPerSample = i19;
        this.extraData = bArr;
    }
}
