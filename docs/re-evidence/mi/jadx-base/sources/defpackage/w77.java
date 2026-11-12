package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class w77 {
    public static byte[] a(char[] cArr) throws IllegalArgumentException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            int iD = (d(cArr[i], i) << 4) | d(cArr[i3], i3);
            i += 2;
            bArr[i2] = (byte) (iD & 255);
            i2++;
        }
        return bArr;
    }

    public static ECPublicKey b(byte[] bArr, ECParameterSpec eCParameterSpec) throws Exception {
        if (bArr[0] != 4) {
            throw new IllegalArgumentException("Invalid uncompressedPoint encoding, no uncompressed point indicator");
        }
        int iBitLength = (eCParameterSpec.getOrder().bitLength() + 7) / 8;
        if (bArr.length != (iBitLength * 2) + 1) {
            throw new IllegalArgumentException("Invalid uncompressedPoint encoding, not the correct size");
        }
        int i = 1 + iBitLength;
        return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, iBitLength + i))), eCParameterSpec));
    }

    public static byte[] c(ECPublicKey eCPublicKey) throws IllegalArgumentException {
        ECPoint w = eCPublicKey.getW();
        String string = w.getAffineX().toString(16);
        String string2 = w.getAffineY().toString(16);
        StringBuilder sb = new StringBuilder();
        sb.append("04");
        for (int i = 0; i < 64 - string.length(); i++) {
            sb.append(0);
        }
        sb.append(string);
        for (int i2 = 0; i2 < 64 - string2.length(); i2++) {
            sb.append(0);
        }
        sb.append(string2);
        return a(sb.toString().toCharArray());
    }

    public static int d(char c, int i) throws IllegalArgumentException {
        int iDigit = Character.digit(c, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character " + c + " at index " + i);
    }
}
