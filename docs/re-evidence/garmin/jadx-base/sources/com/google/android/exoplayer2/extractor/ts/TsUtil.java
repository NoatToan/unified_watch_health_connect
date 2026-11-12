package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes13.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i14, int i15) {
        while (i14 < i15 && bArr[i14] != 71) {
            i14++;
        }
        return i14;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i14, int i15, int i16) {
        int i17 = 0;
        for (int i18 = -4; i18 <= 4; i18++) {
            int i19 = (i18 * TsExtractor.TS_PACKET_SIZE) + i16;
            if (i19 < i14 || i19 >= i15 || bArr[i19] != 71) {
                i17 = 0;
            } else {
                i17++;
                if (i17 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i14, int i15) {
        parsableByteArray.setPosition(i14);
        if (parsableByteArray.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int i16 = parsableByteArray.readInt();
        if ((8388608 & i16) != 0 || ((2096896 & i16) >> 8) != i15 || (i16 & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
