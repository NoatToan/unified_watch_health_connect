package com.xiaomi.ai.mibrain;

/* JADX INFO: loaded from: classes18.dex */
public abstract class MibrainDecoder {
    public MibrainDecoderIO mMibrainDecoderIO;

    public static class AudioInfo {
        public int bit;
        public int bitrate;
        public int chinels;
        public int mpeg_layer;
        public int sample_rate;

        public AudioInfo(int i, int i2, int i3, int i4, int i5) {
            this.sample_rate = i;
            this.bitrate = i2;
            this.chinels = i3;
            this.mpeg_layer = i4;
            this.bit = i5;
        }
    }

    public interface MibrainDecoderIO {
        int read(byte[] bArr, int i);

        int write(byte[] bArr, int i, AudioInfo audioInfo);
    }

    public MibrainDecoder(MibrainDecoderIO mibrainDecoderIO) {
        this.mMibrainDecoderIO = mibrainDecoderIO;
    }

    public abstract int cancel();

    public abstract int init();

    public abstract void release();

    public abstract int start();

    public abstract int stop();
}
