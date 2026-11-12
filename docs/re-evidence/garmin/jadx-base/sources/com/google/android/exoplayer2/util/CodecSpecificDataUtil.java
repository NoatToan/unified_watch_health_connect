package com.google.android.exoplayer2.util;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CodecSpecificDataUtil {
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};

    private CodecSpecificDataUtil() {
    }

    public static String buildAvcCodecString(int i14, int i15, int i16) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z14) {
        return Collections.singletonList(z14 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i14, boolean z14, int i15, int i16, int[] iArr, int i17) {
        StringBuilder sb3 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i14], Integer.valueOf(i15), Integer.valueOf(i16), Character.valueOf(z14 ? 'H' : 'L'), Integer.valueOf(i17)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i18 = 0; i18 < length; i18++) {
            sb3.append(String.format(".%02X", Integer.valueOf(iArr[i18])));
        }
        return sb3.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i15];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i14, bArr3, bArr2.length, i15);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i14) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i14 <= length) {
            if (isNalStartCode(bArr, i14)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    private static boolean isNalStartCode(byte[] bArr, int i14) {
        if (bArr.length - i14 <= NAL_START_CODE.length) {
            return false;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i15 >= bArr2.length) {
                return true;
            }
            if (bArr[i14 + i15] != bArr2[i15]) {
                return false;
            }
            i15++;
        }
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + NAL_START_CODE.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i14 = 0;
        while (i14 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i14)).intValue();
            int iIntValue2 = (i14 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i14 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i14] = bArr3;
            i14++;
        }
        return bArr2;
    }
}
