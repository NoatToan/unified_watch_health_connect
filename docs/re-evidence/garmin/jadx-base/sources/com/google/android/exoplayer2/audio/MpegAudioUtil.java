package com.google.android.exoplayer2.audio;

import androidx.core.view.j;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            if (!MpegAudioUtil.isMagicPresent(i14) || (i15 = (i14 >>> 19) & 3) == 1 || (i16 = (i14 >>> 17) & 3) == 0 || (i17 = (i14 >>> 12) & 15) == 0 || i17 == 15 || (i18 = (i14 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i15;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i16];
            int i19 = MpegAudioUtil.SAMPLING_RATE_V1[i18];
            this.sampleRate = i19;
            if (i15 == 2) {
                this.sampleRate = i19 / 2;
            } else if (i15 == 0) {
                this.sampleRate = i19 / 4;
            }
            int i24 = (i14 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i15, i16);
            if (i16 == 3) {
                int i25 = i15 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i17 - 1] : MpegAudioUtil.BITRATE_V2_L1[i17 - 1];
                this.bitrate = i25;
                this.frameSize = (((i25 * 12) / this.sampleRate) + i24) * 4;
            } else {
                int i26 = SyslogConstants.LOG_LOCAL2;
                if (i15 == 3) {
                    int i27 = i16 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i17 - 1] : MpegAudioUtil.BITRATE_V1_L3[i17 - 1];
                    this.bitrate = i27;
                    this.frameSize = ((i27 * SyslogConstants.LOG_LOCAL2) / this.sampleRate) + i24;
                } else {
                    int i28 = MpegAudioUtil.BITRATE_V2[i17 - 1];
                    this.bitrate = i28;
                    if (i16 == 1) {
                        i26 = 72;
                    }
                    this.frameSize = ((i26 * i28) / this.sampleRate) + i24;
                }
            }
            this.channels = ((i14 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (!isMagicPresent(i14) || (i15 = (i14 >>> 19) & 3) == 1 || (i16 = (i14 >>> 17) & 3) == 0 || (i17 = (i14 >>> 12) & 15) == 0 || i17 == 15 || (i18 = (i14 >>> 10) & 3) == 3) {
            return -1;
        }
        int i24 = SAMPLING_RATE_V1[i18];
        if (i15 == 2) {
            i24 /= 2;
        } else if (i15 == 0) {
            i24 /= 4;
        }
        int i25 = (i14 >>> 9) & 1;
        if (i16 == 3) {
            return ((((i15 == 3 ? BITRATE_V1_L1[i17 - 1] : BITRATE_V2_L1[i17 - 1]) * 12) / i24) + i25) * 4;
        }
        if (i15 == 3) {
            i19 = i16 == 2 ? BITRATE_V1_L2[i17 - 1] : BITRATE_V1_L3[i17 - 1];
        } else {
            i19 = BITRATE_V2[i17 - 1];
        }
        int i26 = SyslogConstants.LOG_LOCAL2;
        if (i15 == 3) {
            return j.a(i19, SyslogConstants.LOG_LOCAL2, i24, i25);
        }
        if (i16 == 1) {
            i26 = 72;
        }
        return j.a(i26, i19, i24, i25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i14, int i15) {
        if (i15 == 1) {
            if (i14 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i15 == 2) {
            return 1152;
        }
        if (i15 == 3) {
            return SAMPLES_PER_FRAME_L1;
        }
        h.w();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i14) {
        return (i14 & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i14) {
        int i15;
        int i16;
        if (!isMagicPresent(i14) || (i15 = (i14 >>> 19) & 3) == 1 || (i16 = (i14 >>> 17) & 3) == 0) {
            return -1;
        }
        int i17 = (i14 >>> 12) & 15;
        int i18 = (i14 >>> 10) & 3;
        if (i17 == 0 || i17 == 15 || i18 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i15, i16);
    }
}
