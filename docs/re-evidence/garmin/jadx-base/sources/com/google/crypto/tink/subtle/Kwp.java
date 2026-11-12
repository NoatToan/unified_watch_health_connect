package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.KeyWrap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class Kwp implements KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = {-90, 89, 89, -90};
    static final int ROUNDS = 6;
    private final SecretKey aesKey;

    public Kwp(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == 16 || bArr.length == 32) {
            this.aesKey = new SecretKeySpec(bArr, "AES");
        } else {
            a.t("Unsupported key length");
            throw null;
        }
    }

    private byte[] computeW(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length <= 8 || bArr2.length > 2147483631 || bArr.length != 8) {
            a.t("computeW called with invalid parameters");
            return null;
        }
        int iWrappingSize = wrappingSize(bArr2.length);
        byte[] bArr3 = new byte[iWrappingSize];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, 8, bArr2.length);
        int i14 = 1;
        int i15 = (iWrappingSize / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.aesKey);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        int i16 = 0;
        while (i16 < 6) {
            int i17 = 0;
            while (i17 < i15) {
                int i18 = i17 + 1;
                int i19 = i18 * 8;
                System.arraycopy(bArr3, i19, bArr4, 8, 8);
                engineFactory.doFinal(bArr4, 0, 16, bArr4);
                int i24 = (i16 * i15) + i17 + i14;
                for (int i25 = 0; i25 < 4; i25++) {
                    int i26 = 7 - i25;
                    bArr4[i26] = (byte) (((byte) (i24 & 255)) ^ bArr4[i26]);
                    i24 >>>= 8;
                }
                System.arraycopy(bArr4, 8, bArr3, i19, 8);
                i17 = i18;
                i14 = 1;
            }
            i16++;
            i14 = 1;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, 8);
        return bArr3;
    }

    private byte[] invertW(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < 24 || bArr.length % 8 != 0) {
            a.t("Incorrect data size");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int length = bArrCopyOf.length / 8;
        int i14 = length - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.aesKey);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArrCopyOf, 0, bArr2, 0, 8);
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = length - 2; i16 >= 0; i16--) {
                int i17 = (i16 + 1) * 8;
                System.arraycopy(bArrCopyOf, i17, bArr2, 8, 8);
                int i18 = (i15 * i14) + i16 + 1;
                for (int i19 = 0; i19 < 4; i19++) {
                    int i24 = 7 - i19;
                    bArr2[i24] = (byte) (bArr2[i24] ^ ((byte) (i18 & 255)));
                    i18 >>>= 8;
                }
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                System.arraycopy(bArr2, 8, bArrCopyOf, i17, 8);
            }
        }
        System.arraycopy(bArr2, 0, bArrCopyOf, 0, 8);
        return bArrCopyOf;
    }

    private int wrappingSize(int i14) {
        return (7 - ((i14 + 7) % 8)) + i14 + 8;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] bArr) throws GeneralSecurityException {
        int i14;
        if (bArr.length < wrappingSize(16)) {
            a.t("Wrapped key size is too small");
            return null;
        }
        if (bArr.length > wrappingSize(4096)) {
            a.t("Wrapped key size is too large");
            return null;
        }
        if (bArr.length % 8 != 0) {
            a.t("Wrapped key size must be a multiple of 8 bytes");
            return null;
        }
        byte[] bArrInvertW = invertW(bArr);
        boolean z14 = true;
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= 4) {
                break;
            }
            if (PREFIX[i15] != bArrInvertW[i15]) {
                z14 = false;
            }
            i15++;
        }
        int i16 = 0;
        for (i14 = 4; i14 < 8; i14++) {
            i16 = (i16 << 8) + (bArrInvertW[i14] & UnsignedBytes.MAX_VALUE);
        }
        if (wrappingSize(i16) == bArrInvertW.length) {
            for (int i17 = i16 + 8; i17 < bArrInvertW.length; i17++) {
                if (bArrInvertW[i17] != 0) {
                    z14 = false;
                }
            }
            z15 = z14;
        }
        if (z15) {
            return Arrays.copyOfRange(bArrInvertW, 8, i16 + 8);
        }
        throw new BadPaddingException("Invalid padding");
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < 16) {
            a.t("Key size of key to wrap too small");
            return null;
        }
        if (bArr.length > 4096) {
            a.t("Key size of key to wrap too large");
            return null;
        }
        byte[] bArr2 = new byte[8];
        byte[] bArr3 = PREFIX;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        for (int i14 = 0; i14 < 4; i14++) {
            bArr2[i14 + 4] = (byte) ((bArr.length >> ((3 - i14) * 8)) & 255);
        }
        return computeW(bArr2, bArr);
    }
}
