package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCtrJceCipher implements IndCpaCipher {
    private static final String CIPHER_ALGORITHM = "AES/CTR/NoPadding";
    private static final String KEY_ALGORITHM = "AES";
    private static final int MIN_IV_SIZE_IN_BYTES = 12;
    private static final ThreadLocal<Cipher> localCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesCtrJceCipher.1
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance(AesCtrJceCipher.CIPHER_ALGORITHM);
            } catch (GeneralSecurityException e4) {
                l2.p(e4);
                return null;
            }
        }
    };
    private final int blockSize;
    private final int ivSize;
    private final SecretKeySpec keySpec;

    public AesCtrJceCipher(byte[] bArr, int i14) throws GeneralSecurityException {
        Validators.validateAesKeySize(bArr.length);
        this.keySpec = new SecretKeySpec(bArr, KEY_ALGORITHM);
        int blockSize = localCipher.get().getBlockSize();
        this.blockSize = blockSize;
        if (i14 < 12 || i14 > blockSize) {
            a.t("invalid IV size");
            throw null;
        }
        this.ivSize = i14;
    }

    private void doCtr(byte[] bArr, int i14, int i15, byte[] bArr2, int i16, byte[] bArr3, boolean z14) throws GeneralSecurityException {
        Cipher cipher = localCipher.get();
        byte[] bArr4 = new byte[this.blockSize];
        System.arraycopy(bArr3, 0, bArr4, 0, this.ivSize);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.keySpec;
        if (z14) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i14, i15, bArr2, i16) == i15) {
            return;
        }
        a.t("stored output's length does not match input's length");
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i14 = this.ivSize;
        if (length < i14) {
            a.t("ciphertext too short");
            return null;
        }
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, 0, bArr2, 0, i14);
        int length2 = bArr.length;
        int i15 = this.ivSize;
        byte[] bArr3 = new byte[length2 - i15];
        doCtr(bArr, i15, bArr.length - i15, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i14 = this.ivSize;
        if (length > Integer.MAX_VALUE - i14) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.ivSize));
        }
        byte[] bArr2 = new byte[bArr.length + i14];
        byte[] bArrRandBytes = Random.randBytes(i14);
        System.arraycopy(bArrRandBytes, 0, bArr2, 0, this.ivSize);
        doCtr(bArr, 0, bArr.length, bArr2, this.ivSize, bArrRandBytes, true);
        return bArr2;
    }
}
