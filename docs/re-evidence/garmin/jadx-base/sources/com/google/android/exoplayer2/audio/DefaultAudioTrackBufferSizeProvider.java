package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i14) {
            this.ac3BufferMultiplicationFactor = i14;
            return this;
        }

        public Builder setMaxPcmBufferDurationUs(int i14) {
            this.maxPcmBufferDurationUs = i14;
            return this;
        }

        public Builder setMinPcmBufferDurationUs(int i14) {
            this.minPcmBufferDurationUs = i14;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i14) {
            this.offloadBufferDurationUs = i14;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i14) {
            this.passthroughBufferDurationUs = i14;
            return this;
        }

        public Builder setPcmBufferMultiplicationFactor(int i14) {
            this.pcmBufferMultiplicationFactor = i14;
            return this;
        }
    }

    public DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
    }

    public static int durationUsToBytes(int i14, int i15, int i16) {
        return Ints.checkedCast(((((long) i14) * ((long) i15)) * ((long) i16)) / 1000000);
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i14) {
        switch (i14) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            case 13:
            default:
                h.w();
                return 0;
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }

    public int get1xBufferSizeInBytes(int i14, int i15, int i16, int i17, int i18) {
        if (i16 == 0) {
            return getPcmBufferSizeInBytes(i14, i18, i17);
        }
        if (i16 == 1) {
            return getOffloadBufferSizeInBytes(i15);
        }
        if (i16 == 2) {
            return getPassthroughBufferSizeInBytes(i15);
        }
        h.w();
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i14, int i15, int i16, int i17, int i18, double d14) {
        return (((Math.max(i14, (int) (((double) get1xBufferSizeInBytes(i14, i15, i16, i17, i18)) * d14)) + i17) - 1) / i17) * i17;
    }

    public int getOffloadBufferSizeInBytes(int i14) {
        return Ints.checkedCast((((long) this.offloadBufferDurationUs) * ((long) getMaximumEncodedRateBytesPerSecond(i14))) / 1000000);
    }

    public int getPassthroughBufferSizeInBytes(int i14) {
        int i15 = this.passthroughBufferDurationUs;
        if (i14 == 5) {
            i15 *= this.ac3BufferMultiplicationFactor;
        }
        return Ints.checkedCast((((long) i15) * ((long) getMaximumEncodedRateBytesPerSecond(i14))) / 1000000);
    }

    public int getPcmBufferSizeInBytes(int i14, int i15, int i16) {
        return Util.constrainValue(i14 * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i15, i16), durationUsToBytes(this.maxPcmBufferDurationUs, i15, i16));
    }
}
