package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class DtsUtil {
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int a = 2147385345;
    private static final int b = 536864768;
    private static final int c = -25230976;
    private static final int d = -14745368;
    private static final byte e = 127;
    private static final byte f = 31;
    private static final byte g = -2;
    private static final byte h = -1;
    private static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, RaceId.RACE_NVKEY_READFULLKEY, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, RaceId.RACE_GET_BOOT_REASON};

    private DtsUtil() {
    }

    private static ParsableBitArray a(byte[] frameHeader) {
        if (frameHeader[0] == 127) {
            return new ParsableBitArray(frameHeader);
        }
        byte[] bArrCopyOf = Arrays.copyOf(frameHeader, frameHeader.length);
        if (b(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
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

    private static boolean b(byte[] frameHeader) {
        return frameHeader[0] == -2 || frameHeader[0] == -1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] data) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = data[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((data[7] & 3) << 12) | ((data[6] & 255) << 4);
                b3 = data[9];
            } else if (b4 != 31) {
                i2 = ((data[5] & 3) << 12) | ((data[6] & 255) << 4);
                b2 = data[7];
            } else {
                i4 = ((data[6] & 3) << 12) | ((data[7] & 255) << 4);
                b3 = data[8];
            }
            i3 = (((b3 & MiLiProProfile.ECF_COMMAND_SET_BEEP) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((data[4] & 3) << 12) | ((data[7] & 255) << 4);
        b2 = data[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static boolean isSyncWord(int word) {
        return word == a || word == c || word == b || word == d;
    }

    public static int parseDtsAudioSampleCount(byte[] data) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = data[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (data[4] & 7) << 4;
                b3 = data[7];
            } else if (b4 != 31) {
                i2 = (data[4] & 1) << 6;
                b2 = data[5];
            } else {
                i2 = (data[5] & 7) << 4;
                b3 = data[6];
            }
            i3 = b3 & MiLiProProfile.ECF_COMMAND_SET_BEEP;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (data[5] & 1) << 6;
        b2 = data[4];
        i3 = b2 & FileDownloadStatus.warn;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] frame, @Nullable String trackId, @Nullable String language, @Nullable DrmInitData drmInitData) {
        ParsableBitArray parsableBitArrayA = a(frame);
        parsableBitArrayA.skipBits(60);
        int i2 = i[parsableBitArrayA.readBits(6)];
        int i3 = j[parsableBitArrayA.readBits(4)];
        int bits = parsableBitArrayA.readBits(5);
        int[] iArr = k;
        int i4 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        parsableBitArrayA.skipBits(10);
        return new Format.Builder().setId(trackId).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i4).setChannelCount(i2 + (parsableBitArrayA.readBits(2) > 0 ? 1 : 0)).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(language).build();
    }

    public static int parseDtsAudioSampleCount(ByteBuffer buffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int iPosition = buffer.position();
        byte b4 = buffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (buffer.get(iPosition + 4) & 7) << 4;
                b3 = buffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i2 = (buffer.get(iPosition + 4) & 1) << 6;
                b2 = buffer.get(iPosition + 5);
            } else {
                i2 = (buffer.get(iPosition + 5) & 7) << 4;
                b3 = buffer.get(iPosition + 6);
            }
            i3 = b3 & MiLiProProfile.ECF_COMMAND_SET_BEEP;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (buffer.get(iPosition + 5) & 1) << 6;
        b2 = buffer.get(iPosition + 4);
        i3 = b2 & FileDownloadStatus.warn;
        return (((i3 >> 2) | i2) + 1) * 32;
    }
}
