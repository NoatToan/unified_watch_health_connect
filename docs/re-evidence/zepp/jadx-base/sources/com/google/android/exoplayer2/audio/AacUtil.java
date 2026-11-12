package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    public static final int AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND = 7000;
    public static final int AAC_LC_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_LC_MAX_RATE_BYTES_PER_SECOND = 100000;
    public static final int AAC_LD_AUDIO_SAMPLE_COUNT = 512;
    public static final int AAC_XHE_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_XHE_MAX_RATE_BYTES_PER_SECOND = 256000;
    public static final int AUDIO_OBJECT_TYPE_AAC_ELD = 23;
    public static final int AUDIO_OBJECT_TYPE_AAC_ER_BSAC = 22;
    public static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    public static final int AUDIO_OBJECT_TYPE_AAC_PS = 29;
    public static final int AUDIO_OBJECT_TYPE_AAC_SBR = 5;
    public static final int AUDIO_OBJECT_TYPE_AAC_XHE = 42;
    private static final String a = "AacUtil";
    private static final int b = 15;
    private static final int d = -1;
    private static final String f = "mp4a.40.";
    private static final int g = 31;
    private static final int[] c = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class Config {
        public final int channelCount;
        public final String codecs;
        public final int sampleRateHz;

        private Config(int sampleRateHz, int channelCount, String codecs) {
            this.sampleRateHz = sampleRateHz;
            this.channelCount = channelCount;
            this.codecs = codecs;
        }
    }

    private AacUtil() {
    }

    private static int a(ParsableBitArray bitArray) {
        int bits = bitArray.readBits(5);
        return bits == 31 ? bitArray.readBits(6) + 32 : bits;
    }

    private static int b(ParsableBitArray bitArray) throws ParserException {
        int bits = bitArray.readBits(4);
        if (bits == 15) {
            return bitArray.readBits(24);
        }
        if (bits < 13) {
            return c[bits];
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static byte[] buildAacLcAudioSpecificConfig(int sampleRate, int channelCount) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = c;
            if (i2 >= iArr.length) {
                break;
            }
            if (sampleRate == iArr[i2]) {
                i3 = i2;
            }
            i2++;
        }
        int i4 = -1;
        while (true) {
            int[] iArr2 = e;
            if (i >= iArr2.length) {
                break;
            }
            if (channelCount == iArr2[i]) {
                i4 = i;
            }
            i++;
        }
        if (sampleRate != -1 && i4 != -1) {
            return buildAudioSpecificConfig(2, i3, i4);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(sampleRate);
        sb.append(", ");
        sb.append(channelCount);
        throw new IllegalArgumentException(sb.toString());
    }

    public static byte[] buildAudioSpecificConfig(int audioObjectType, int sampleRateIndex, int channelConfig) {
        return new byte[]{(byte) (((audioObjectType << 3) & 248) | ((sampleRateIndex >> 1) & 7)), (byte) (((sampleRateIndex << 7) & 128) | ((channelConfig << 3) & 120))};
    }

    private static void c(ParsableBitArray bitArray, int audioObjectType, int channelConfiguration) {
        if (bitArray.readBit()) {
            Log.w(a, "Unexpected frameLengthFlag = 1");
        }
        if (bitArray.readBit()) {
            bitArray.skipBits(14);
        }
        boolean bit = bitArray.readBit();
        if (channelConfiguration == 0) {
            throw new UnsupportedOperationException();
        }
        if (audioObjectType == 6 || audioObjectType == 20) {
            bitArray.skipBits(3);
        }
        if (bit) {
            if (audioObjectType == 22) {
                bitArray.skipBits(16);
            }
            if (audioObjectType == 17 || audioObjectType == 19 || audioObjectType == 20 || audioObjectType == 23) {
                bitArray.skipBits(3);
            }
            bitArray.skipBits(1);
        }
    }

    public static int getEncodingForAudioObjectType(int audioObjectType) {
        if (audioObjectType == 2) {
            return 10;
        }
        if (audioObjectType == 5) {
            return 11;
        }
        if (audioObjectType == 29) {
            return 12;
        }
        if (audioObjectType == 42) {
            return 16;
        }
        if (audioObjectType != 22) {
            return audioObjectType != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static Config parseAudioSpecificConfig(byte[] audioSpecificConfig) throws ParserException {
        return parseAudioSpecificConfig(new ParsableBitArray(audioSpecificConfig), false);
    }

    public static Config parseAudioSpecificConfig(ParsableBitArray bitArray, boolean forceReadToEnd) throws ParserException {
        int iA = a(bitArray);
        int iB = b(bitArray);
        int bits = bitArray.readBits(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append(f);
        sb.append(iA);
        String string = sb.toString();
        if (iA == 5 || iA == 29) {
            iB = b(bitArray);
            iA = a(bitArray);
            if (iA == 22) {
                bits = bitArray.readBits(4);
            }
        }
        if (forceReadToEnd) {
            if (iA != 1 && iA != 2 && iA != 3 && iA != 4 && iA != 6 && iA != 7 && iA != 17) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iA);
                        throw ParserException.createForUnsupportedContainerFeature(sb2.toString());
                }
            }
            c(bitArray, iA, bits);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = bitArray.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        StringBuilder sb3 = new StringBuilder(33);
                        sb3.append("Unsupported epConfig: ");
                        sb3.append(bits2);
                        throw ParserException.createForUnsupportedContainerFeature(sb3.toString());
                    }
                    break;
            }
        }
        int i = e[bits];
        if (i != -1) {
            return new Config(iB, i, string);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }
}
