package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ECCPointConvert {
    private static final byte UNCOMPRESSED_POINT_INDICATOR = 4;

    private static byte[] decodeHex(char[] cArr) throws IllegalArgumentException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            int digit = (toDigit(cArr[i], i) << 4) | toDigit(cArr[i3], i3);
            i += 2;
            bArr[i2] = (byte) (digit & 255);
            i2++;
        }
        return bArr;
    }

    public static ECPublicKey fromUncompressedPoint(byte[] bArr, ECParameterSpec eCParameterSpec) throws Exception {
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

    public static byte[] privateKeyToBytes(ECPrivateKey eCPrivateKey) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        String string = eCPrivateKey.getS().toString(16);
        for (int i = 0; i < 64 - string.length(); i++) {
            sb.append(0);
        }
        sb.append(string);
        return decodeHex(sb.toString().toCharArray());
    }

    public static byte[] publicKeyToBytes(ECPublicKey eCPublicKey) throws IllegalArgumentException {
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
        return decodeHex(sb.toString().toCharArray());
    }

    private static int toDigit(char c, int i) throws IllegalArgumentException {
        int iDigit = Character.digit(c, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character " + c + " at index " + i);
    }

    public static byte[] toUncompressedPoint(ECPublicKey eCPublicKey) {
        int iBitLength = (eCPublicKey.getParams().getOrder().bitLength() + 7) / 8;
        byte[] bArr = new byte[(iBitLength * 2) + 1];
        bArr[0] = 4;
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        if (byteArray.length <= iBitLength) {
            System.arraycopy(byteArray, 0, bArr, (1 + iBitLength) - byteArray.length, byteArray.length);
        } else {
            if (byteArray.length != iBitLength + 1 || byteArray[0] != 0) {
                throw new IllegalStateException("x value is too large");
            }
            System.arraycopy(byteArray, 1, bArr, 1, iBitLength);
        }
        int i = 1 + iBitLength;
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        if (byteArray2.length <= iBitLength) {
            System.arraycopy(byteArray2, 0, bArr, (i + iBitLength) - byteArray2.length, byteArray2.length);
        } else {
            if (byteArray2.length != iBitLength + 1 || byteArray2[0] != 0) {
                throw new IllegalStateException("y value is too large");
            }
            System.arraycopy(byteArray2, 1, bArr, i, iBitLength);
        }
        return bArr;
    }
}
