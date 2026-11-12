package com.google.android.exoplayer2.audio;

import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.material.internal.ViewUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class DtsUtil {
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, GDIRealtimeSettingsProto.AppWellKnownCompositionId.INVALID_VALUE};

    private DtsUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] bArr) {
        int i14;
        byte b14;
        int i15;
        int i16;
        byte b15;
        boolean z14 = false;
        byte b16 = bArr[0];
        if (b16 != -2) {
            if (b16 == -1) {
                i16 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b15 = bArr[9];
            } else if (b16 != 31) {
                i14 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b14 = bArr[7];
            } else {
                i16 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b15 = bArr[8];
            }
            i15 = (((b15 & 60) >> 2) | i16) + 1;
            z14 = true;
            if (z14) {
                return (i15 * 16) / 14;
            }
            return i15;
        }
        i14 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b14 = bArr[6];
        i15 = (((b14 & 240) >> 4) | i14) + 1;
        if (z14) {
            return (i15 * 16) / 14;
        }
        return i15;
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == 127) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i14 = 0; i14 < bArrCopyOf.length - 1; i14 += 2) {
                byte b14 = bArrCopyOf[i14];
                int i15 = i14 + 1;
                bArrCopyOf[i14] = bArrCopyOf[i15];
                bArrCopyOf[i15] = b14;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b14 = bArr[0];
        return b14 == -2 || b14 == -1;
    }

    public static boolean isSyncWord(int i14) {
        return i14 == SYNC_VALUE_BE || i14 == SYNC_VALUE_LE || i14 == SYNC_VALUE_14B_BE || i14 == SYNC_VALUE_14B_LE;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i14;
        byte b14;
        int i15;
        byte b15;
        int iPosition = byteBuffer.position();
        byte b16 = byteBuffer.get(iPosition);
        if (b16 != -2) {
            if (b16 == -1) {
                i14 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b15 = byteBuffer.get(iPosition + 7);
            } else if (b16 != 31) {
                i14 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b14 = byteBuffer.get(iPosition + 5);
            } else {
                i14 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b15 = byteBuffer.get(iPosition + 6);
            }
            i15 = b15 & 60;
            return (((i15 >> 2) | i14) + 1) * 32;
        }
        i14 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b14 = byteBuffer.get(iPosition + 4);
        i15 = b14 & 252;
        return (((i15 >> 2) | i14) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        ParsableBitArray normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i14 = CHANNELS_BY_AMODE[normalizedFrameHeader.readBits(6)];
        int i15 = SAMPLE_RATE_BY_SFREQ[normalizedFrameHeader.readBits(4)];
        int bits = normalizedFrameHeader.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i16 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrameHeader.skipBits(10);
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i16).setChannelCount(i14 + (normalizedFrameHeader.readBits(2) > 0 ? 1 : 0)).setSampleRate(i15).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i14;
        byte b14;
        int i15;
        byte b15;
        byte b16 = bArr[0];
        if (b16 != -2) {
            if (b16 == -1) {
                i14 = (bArr[4] & 7) << 4;
                b15 = bArr[7];
            } else if (b16 != 31) {
                i14 = (bArr[4] & 1) << 6;
                b14 = bArr[5];
            } else {
                i14 = (bArr[5] & 7) << 4;
                b15 = bArr[6];
            }
            i15 = b15 & 60;
            return (((i15 >> 2) | i14) + 1) * 32;
        }
        i14 = (bArr[5] & 1) << 6;
        b14 = bArr[4];
        i15 = b14 & 252;
        return (((i15 >> 2) | i14) + 1) * 32;
    }
}
