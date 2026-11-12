package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.v;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
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
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final String CODECS_STRING_PREFIX = "mp4a.40.";
    private static final String TAG = "AacUtil";
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class Config {
        public final int channelCount;
        public final String codecs;
        public final int sampleRateHz;

        private Config(int i14, int i15, String str) {
            this.sampleRateHz = i14;
            this.channelCount = i15;
            this.codecs = str;
        }
    }

    private AacUtil() {
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i14, int i15) {
        int i16 = 0;
        int i17 = -1;
        int i18 = 0;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i18 >= iArr.length) {
                break;
            }
            if (i14 == iArr[i18]) {
                i17 = i18;
            }
            i18++;
        }
        int i19 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i16 >= iArr2.length) {
                break;
            }
            if (i15 == iArr2[i16]) {
                i19 = i16;
            }
            i16++;
        }
        if (i14 != -1 && i19 != -1) {
            return buildAudioSpecificConfig(2, i17, i19);
        }
        StringBuilder sb3 = new StringBuilder(67);
        sb3.append("Invalid sample rate or number of channels: ");
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(i15);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static byte[] buildAudioSpecificConfig(int i14, int i15, int i16) {
        return new byte[]{(byte) (((i14 << 3) & 248) | ((i15 >> 1) & 7)), (byte) (((i15 << 7) & 128) | ((i16 << 3) & 120))};
    }

    private static int getAudioObjectType(ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(5);
        return bits == 31 ? parsableBitArray.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(ParsableBitArray parsableBitArray) throws ParserException {
        int bits = parsableBitArray.readBits(4);
        if (bits == 15) {
            return parsableBitArray.readBits(24);
        }
        if (bits < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[bits];
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static Config parseAudioSpecificConfig(ParsableBitArray parsableBitArray, boolean z14) throws ParserException {
        int audioObjectType = getAudioObjectType(parsableBitArray);
        int samplingFrequency = getSamplingFrequency(parsableBitArray);
        int bits = parsableBitArray.readBits(4);
        String strB = v.b(19, audioObjectType, CODECS_STRING_PREFIX);
        if (audioObjectType == 5 || audioObjectType == 29) {
            samplingFrequency = getSamplingFrequency(parsableBitArray);
            audioObjectType = getAudioObjectType(parsableBitArray);
            if (audioObjectType == 22) {
                bits = parsableBitArray.readBits(4);
            }
        }
        if (z14) {
            if (audioObjectType != 1 && audioObjectType != 2 && audioObjectType != 3 && audioObjectType != 4 && audioObjectType != 6 && audioObjectType != 7 && audioObjectType != 17) {
                switch (audioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(42);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(audioObjectType);
                        throw ParserException.createForUnsupportedContainerFeature(sb3.toString());
                }
            }
            parseGaSpecificConfig(parsableBitArray, audioObjectType, bits);
            switch (audioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = parsableBitArray.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        StringBuilder sb4 = new StringBuilder(33);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(bits2);
                        throw ParserException.createForUnsupportedContainerFeature(sb4.toString());
                    }
                    break;
            }
        }
        int i14 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[bits];
        if (i14 != -1) {
            return new Config(samplingFrequency, i14, strB);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    private static void parseGaSpecificConfig(ParsableBitArray parsableBitArray, int i14, int i15) {
        if (parsableBitArray.readBit()) {
            Log.w(TAG, "Unexpected frameLengthFlag = 1");
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean bit = parsableBitArray.readBit();
        if (i15 == 0) {
            com.google.protobuf.a.m();
            return;
        }
        if (i14 == 6 || i14 == 20) {
            parsableBitArray.skipBits(3);
        }
        if (bit) {
            if (i14 == 22) {
                parsableBitArray.skipBits(16);
            }
            if (i14 == 17 || i14 == 19 || i14 == 20 || i14 == 23) {
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(1);
        }
    }

    public static Config parseAudioSpecificConfig(byte[] bArr) {
        return parseAudioSpecificConfig(new ParsableBitArray(bArr), false);
    }
}
