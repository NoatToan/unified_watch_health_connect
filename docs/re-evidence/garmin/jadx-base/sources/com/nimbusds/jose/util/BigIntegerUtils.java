package com.nimbusds.jose.util;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class BigIntegerUtils {
    private BigIntegerUtils() {
    }

    public static byte[] toBytesUnsigned(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i14 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i14 = 0;
        }
        int i15 = iBitLength / 8;
        int i16 = i15 - length;
        byte[] bArr = new byte[i15];
        System.arraycopy(byteArray, i14, bArr, i16, length);
        return bArr;
    }
}
