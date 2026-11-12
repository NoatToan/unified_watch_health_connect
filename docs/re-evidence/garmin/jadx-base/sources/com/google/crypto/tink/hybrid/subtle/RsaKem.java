package com.google.crypto.tink.hybrid.subtle;

import com.airbnb.lottie.animation.keyframe.a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = new byte[0];
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    private RsaKem() {
    }

    public static int bigIntSizeInBytes(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static byte[] bigIntToByteArray(BigInteger bigInteger, int i14) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i14) {
            return byteArray;
        }
        byte[] bArr = new byte[i14];
        if (byteArray.length == i14 + 1) {
            if (byteArray[0] == 0) {
                System.arraycopy(byteArray, 1, bArr, 0, i14);
                return bArr;
            }
            h.s("Value is one-byte longer than the expected size, but its first byte is not 0");
            return null;
        }
        if (byteArray.length < i14) {
            System.arraycopy(byteArray, 0, bArr, i14 - byteArray.length, byteArray.length);
            return bArr;
        }
        e.s("Value has invalid length, must be of length at most (%d + 1), but got %d", new Object[]{Integer.valueOf(i14), Integer.valueOf(byteArray.length)});
        return null;
    }

    public static KeyPair generateRsaKeyPair(int i14) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(i14);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e4) {
            a.x("No support for RSA algorithm.", e4);
            return null;
        }
    }

    public static byte[] generateSecret(BigInteger bigInteger) {
        int iBigIntSizeInBytes = bigIntSizeInBytes(bigInteger);
        SecureRandom secureRandom = new SecureRandom();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(bigInteger.bitLength(), secureRandom);
            if (bigInteger2.signum() > 0 && bigInteger2.compareTo(bigInteger) < 0) {
                return bigIntToByteArray(bigInteger2, iBigIntSizeInBytes);
            }
        }
    }

    public static void validateRsaModulus(BigInteger bigInteger) throws GeneralSecurityException {
        if (bigInteger.bitLength() < 2048) {
            throw new GeneralSecurityException(String.format("RSA key must be of at least size %d bits, but got %d", 2048, Integer.valueOf(bigInteger.bitLength())));
        }
    }
}
