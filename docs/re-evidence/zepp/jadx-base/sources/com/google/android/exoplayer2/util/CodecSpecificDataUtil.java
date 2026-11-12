package com.google.android.exoplayer2.util;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CodecSpecificDataUtil {
    private static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    private CodecSpecificDataUtil() {
    }

    private static int a(byte[] data, int index) {
        int length = data.length - a.length;
        while (index <= length) {
            if (b(data, index)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private static boolean b(byte[] data, int index) {
        if (data.length - index <= a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = a;
            if (i >= bArr.length) {
                return true;
            }
            if (data[index + i] != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    public static String buildAvcCodecString(int profileIdc, int constraintsFlagsAndReservedZero2Bits, int levelIdc) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(profileIdc), Integer.valueOf(constraintsFlagsAndReservedZero2Bits), Integer.valueOf(levelIdc));
    }

    public static List<byte[]> buildCea708InitializationData(boolean isWideAspectRatio) {
        return Collections.singletonList(isWideAspectRatio ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecStringFromSps(ParsableNalUnitBitArray bitArray) {
        bitArray.skipBits(24);
        int bits = bitArray.readBits(2);
        boolean bit = bitArray.readBit();
        int bits2 = bitArray.readBits(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (bitArray.readBit()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = bitArray.readBits(8);
        }
        int bits3 = bitArray.readBits(8);
        Object[] objArr = new Object[5];
        objArr[0] = b[bits];
        objArr[1] = Integer.valueOf(bits2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(bit ? 'H' : 'L');
        objArr[4] = Integer.valueOf(bits3);
        StringBuilder sb = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] buildNalUnit(byte[] data, int offset, int length) {
        byte[] bArr = a;
        byte[] bArr2 = new byte[bArr.length + length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(data, offset, bArr2, bArr.length, length);
        return bArr2;
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] audioSpecificConfig) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(audioSpecificConfig);
        parsableByteArray.setPosition(9);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> initializationData) {
        return initializationData.size() == 1 && initializationData.get(0).length == 1 && initializationData.get(0)[0] == 1;
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] data) {
        if (!b(data, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        do {
            arrayList.add(Integer.valueOf(iA));
            iA = a(data, iA + a.length);
        } while (iA != -1);
        byte[][] bArr = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : data.length) - iIntValue;
            byte[] bArr2 = new byte[iIntValue2];
            System.arraycopy(data, iIntValue, bArr2, 0, iIntValue2);
            bArr[i] = bArr2;
            i++;
        }
        return bArr;
    }
}
