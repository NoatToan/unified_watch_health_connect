package com.huami.watch.opus;

/* JADX INFO: loaded from: classes16.dex */
public class OpusCodecEncoder {
    private static final int d = 0;
    private long a;
    private int b;
    private int c;

    public enum OPUS_APPLICATION {
        OPUS_APPLICATION_VOIP(0),
        OPUS_APPLICATION_AUDIO(1),
        OPUS_APPLICATION_RESTRICTED_LOWDELAY(2);

        private int mApplication;

        OPUS_APPLICATION(int i) {
            this.mApplication = 0;
            this.mApplication = i;
        }

        public int getApplication() {
            return this.mApplication;
        }
    }

    public enum OPUS_FRAME_DURATION {
        TIME_2_HALF(2.5f),
        TIME_5(5.0f),
        TIME_10(10.0f),
        TIME_20(20.0f),
        TIME_40(40.0f),
        TIME_60(60.0f);

        private float duration;

        OPUS_FRAME_DURATION(float f) {
            this.duration = f;
        }

        public float getDuration() {
            return this.duration;
        }
    }

    static {
        System.loadLibrary("opus-jni");
    }

    private int a(byte[] bArr, int i) {
        if (i + 4 >= bArr.length) {
            throw new RuntimeException("error");
        }
        return bArr[i + 3] | (bArr[i] << 24) | (bArr[i + 1] << 16) | (bArr[i + 2] << 8);
    }

    private native int opusDecodeCreate(int i, int i2);

    private native void opusDecoderDestroy();

    private native long opusEncodeCreate(int i, int i2, int i3);

    private native int opusEncodeCtl(long j, int i);

    private native void opusEncoderDestroy(long j);

    private native int opusEncoderGetSize(int i);

    private native int opusEncoderInit(long j, int i, int i2, int i3);

    private native byte[] opusIntOpusDecode(byte[] bArr, float f, int i);

    private native byte[] opusIntOpusEncode(long j, byte[] bArr, float f, int i, int i2);

    public boolean createOpusDecoder(int i, int i2) {
        return opusDecodeCreate(i, i2) == 0;
    }

    public boolean createOpusEncoder(int i, int i2, OPUS_APPLICATION opus_application) {
        this.b = i2;
        this.c = i;
        this.a = opusEncodeCreate(i, i2, opus_application.getApplication());
        return true;
    }

    public void destroyOpusDecoder() {
        opusDecoderDestroy();
    }

    public void destroyOpusEncoder() {
        opusEncoderDestroy(this.a);
    }

    public int getChannelCount() {
        return this.b;
    }

    public int getFrameCount(int i, OPUS_FRAME_DURATION opus_frame_duration) {
        return (int) (((opus_frame_duration.getDuration() * 2.0f) * i) / 2000.0f);
    }

    public int getInputByteBufferSize(int i, OPUS_FRAME_DURATION opus_frame_duration, int i2) {
        return getFrameCount(i, opus_frame_duration) * i2 * 2;
    }

    public int getOpusEncoderSize(int i) {
        return opusEncoderGetSize(i);
    }

    public int getSampling() {
        return this.c;
    }

    public boolean initOpusEncoder(int i, int i2, OPUS_APPLICATION opus_application) {
        return opusEncoderInit(this.a, i, i2, opus_application.getApplication()) == 0;
    }

    public byte[] opusDecode(byte[] bArr, OPUS_FRAME_DURATION opus_frame_duration, int i) {
        return opusIntOpusDecode(bArr, opus_frame_duration.getDuration(), i);
    }

    public byte[] opusEncode(byte[] bArr, OPUS_FRAME_DURATION opus_frame_duration, int i) {
        return opusIntOpusEncode(this.a, bArr, opus_frame_duration.getDuration(), i, 16000);
    }

    public void setOpusEncodeCtrl(int i) {
        opusEncodeCtl(this.a, i);
    }
}
