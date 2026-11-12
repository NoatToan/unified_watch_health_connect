package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import java.security.InvalidKeyException;
import java.util.Arrays;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
@Alpha
public final class X25519 {
    public static byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            e.q("Private key must have 32 bytes.");
            return null;
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b14 = (byte) (bArrCopyOf[31] & Ascii.DEL);
        bArrCopyOf[31] = b14;
        bArrCopyOf[31] = (byte) (b14 | SignedBytes.MAX_POWER_OF_TWO);
        Curve25519.curveMult(jArr, bArrCopyOf, bArr2);
        return Field25519.contract(jArr);
    }

    public static byte[] generatePrivateKey() {
        byte[] bArrRandBytes = Random.randBytes(32);
        bArrRandBytes[0] = (byte) (bArrRandBytes[0] | 7);
        byte b14 = (byte) (bArrRandBytes[31] & 63);
        bArrRandBytes[31] = b14;
        bArrRandBytes[31] = (byte) (b14 | UnsignedBytes.MAX_POWER_OF_TWO);
        return bArrRandBytes;
    }

    public static byte[] publicFromPrivate(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            e.q("Private key must have 32 bytes.");
            return null;
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return computeSharedSecret(bArr, bArr2);
    }
}
