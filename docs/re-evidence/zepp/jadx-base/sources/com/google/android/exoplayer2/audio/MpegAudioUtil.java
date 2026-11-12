package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final String[] a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] b = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] c = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000};
    private static final int[] e = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 320000, 384000};
    private static final int[] f = {32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, 256000, 320000};
    private static final int[] g = {8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    private static final int h = 384;
    private static final int i = 1152;
    private static final int j = 1152;
    private static final int k = 576;

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int headerData) {
            int i;
            int i2;
            int i3;
            int i4;
            if (!MpegAudioUtil.k(headerData) || (i = (headerData >>> 19) & 3) == 1 || (i2 = (headerData >>> 17) & 3) == 0 || (i3 = (headerData >>> 12) & 15) == 0 || i3 == 15 || (i4 = (headerData >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i;
            this.mimeType = MpegAudioUtil.a[3 - i2];
            int i5 = MpegAudioUtil.b[i4];
            this.sampleRate = i5;
            if (i == 2) {
                this.sampleRate = i5 / 2;
            } else if (i == 0) {
                this.sampleRate = i5 / 4;
            }
            int i6 = (headerData >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.j(i, i2);
            if (i2 == 3) {
                int i7 = i == 3 ? MpegAudioUtil.c[i3 - 1] : MpegAudioUtil.d[i3 - 1];
                this.bitrate = i7;
                this.frameSize = (((i7 * 12) / this.sampleRate) + i6) * 4;
            } else {
                if (i == 3) {
                    int i8 = i2 == 2 ? MpegAudioUtil.e[i3 - 1] : MpegAudioUtil.f[i3 - 1];
                    this.bitrate = i8;
                    this.frameSize = ((i8 * 144) / this.sampleRate) + i6;
                } else {
                    int i9 = MpegAudioUtil.g[i3 - 1];
                    this.bitrate = i9;
                    this.frameSize = (((i2 == 1 ? 72 : 144) * i9) / this.sampleRate) + i6;
                }
            }
            this.channels = ((headerData >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int headerData) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!k(headerData) || (i2 = (headerData >>> 19) & 3) == 1 || (i3 = (headerData >>> 17) & 3) == 0 || (i4 = (headerData >>> 12) & 15) == 0 || i4 == 15 || (i5 = (headerData >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (headerData >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int version, int layer) {
        if (layer == 1) {
            return version == 3 ? 1152 : 576;
        }
        if (layer == 2) {
            return 1152;
        }
        if (layer == 3) {
            return h;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(int headerData) {
        return (headerData & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int headerData) {
        int i2;
        int i3;
        if (!k(headerData) || (i2 = (headerData >>> 19) & 3) == 1 || (i3 = (headerData >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (headerData >>> 12) & 15;
        int i5 = (headerData >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return j(i2, i3);
    }
}
