package com.google.crypto.tink.subtle;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.internal.measurement.a;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.Aead;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f53629b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f53630p;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e4) {
                l2.p(e4);
                return null;
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e4) {
                l2.p(e4);
                return null;
            }
        }
    };

    public AesEaxJce(byte[] bArr, int i14) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i14 != 12 && i14 != 16) {
            h.s("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.ivSizeInBytes = i14;
        Validators.validateAesKeySize(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.keySpec = secretKeySpec;
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrMultiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
        this.f53629b = bArrMultiplyByX;
        this.f53630p = multiplyByX(bArrMultiplyByX);
    }

    private static byte[] multiplyByX(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i14 = 0;
        while (i14 < 15) {
            int i15 = i14 + 1;
            bArr2[i14] = (byte) (((bArr[i14] << 1) ^ ((bArr[i15] & UnsignedBytes.MAX_VALUE) >>> 7)) & 255);
            i14 = i15;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO) != 0 ? TsExtractor.TS_STREAM_TYPE_E_AC3 : 0));
        return bArr2;
    }

    private byte[] omac(Cipher cipher, int i14, byte[] bArr, int i15, int i16) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i14;
        if (i16 == 0) {
            return cipher.doFinal(xor(bArr2, this.f53629b));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i17 = 0;
        while (i16 - i17 > 16) {
            for (int i18 = 0; i18 < 16; i18++) {
                bArrDoFinal[i18] = (byte) (bArrDoFinal[i18] ^ bArr[(i15 + i17) + i18]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i17 += 16;
        }
        return cipher.doFinal(xor(bArrDoFinal, pad(Arrays.copyOfRange(bArr, i17 + i15, i15 + i16))));
    }

    private byte[] pad(byte[] bArr) {
        if (bArr.length == 16) {
            return xor(bArr, this.f53629b);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f53630p, 16);
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ bArr[i14]);
        }
        bArrCopyOf[bArr.length] = (byte) (bArrCopyOf[bArr.length] ^ UnsignedBytes.MAX_POWER_OF_TWO);
        return bArrCopyOf;
    }

    private static byte[] xor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            bArr3[i14] = (byte) (bArr[i14] ^ bArr2[i14]);
        }
        return bArr3;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.ivSizeInBytes) - 16;
        if (length < 0) {
            a.t("ciphertext too short");
            return null;
        }
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] bArrOmac = omac(cipher, 0, bArr, 0, this.ivSizeInBytes);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrOmac2 = omac(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrOmac3 = omac(cipher, 2, bArr, this.ivSizeInBytes, length);
        int length2 = bArr.length - 16;
        byte b14 = 0;
        for (int i14 = 0; i14 < 16; i14++) {
            b14 = (byte) (b14 | (((bArr[length2 + i14] ^ bArrOmac2[i14]) ^ bArrOmac[i14]) ^ bArrOmac3[i14]));
        }
        if (b14 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(bArrOmac));
        return cipher2.doFinal(bArr, this.ivSizeInBytes, length);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i14 = this.ivSizeInBytes;
        if (length > 2147483631 - i14) {
            a.t("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + i14 + 16];
        byte[] bArrRandBytes = Random.randBytes(i14);
        System.arraycopy(bArrRandBytes, 0, bArr3, 0, this.ivSizeInBytes);
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] bArrOmac = omac(cipher, 0, bArrRandBytes, 0, bArrRandBytes.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrOmac2 = omac(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(bArrOmac));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.ivSizeInBytes);
        byte[] bArrOmac3 = omac(cipher, 2, bArr3, this.ivSizeInBytes, bArr.length);
        int length2 = bArr.length + this.ivSizeInBytes;
        for (int i15 = 0; i15 < 16; i15++) {
            bArr3[length2 + i15] = (byte) ((bArrOmac2[i15] ^ bArrOmac[i15]) ^ bArrOmac3[i15]);
        }
        return bArr3;
    }
}
