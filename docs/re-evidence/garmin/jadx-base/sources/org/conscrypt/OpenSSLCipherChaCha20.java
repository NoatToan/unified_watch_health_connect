package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.e;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int currentBlockConsumedBytes = 0;
    private int blockCounter = 0;

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i14) throws InvalidKeyException {
        if (i14 != 32) {
            throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 32)"));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.NONE) {
            throw new NoSuchAlgorithmException("Mode must be NONE");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i14, int i15) {
        reset();
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length == 12) {
                this.f133489iv = ivParameterSpec.getIV();
                return;
            } else {
                e.t("IV must be 12 bytes long");
                return;
            }
        }
        if (!isEncrypting()) {
            e.t("IV must be specified when decrypting");
            return;
        }
        byte[] bArr2 = new byte[12];
        this.f133489iv = bArr2;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            NativeCrypto.RAND_bytes(bArr2);
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i14) {
        return i14;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i14) {
        return i14;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16, int i17) throws ShortBufferWithoutStackTraceException {
        int i18;
        int i19;
        int i24;
        if (i15 > bArr2.length - i16) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        int i25 = this.currentBlockConsumedBytes;
        if (i25 > 0) {
            int iMin = Math.min(64 - i25, i15);
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[64];
            System.arraycopy(bArr, i14, bArr3, this.currentBlockConsumedBytes, iMin);
            NativeCrypto.chacha20_encrypt_decrypt(bArr3, 0, bArr4, 0, 64, this.encodedKey, this.f133489iv, this.blockCounter);
            System.arraycopy(bArr4, this.currentBlockConsumedBytes, bArr2, i16, iMin);
            int i26 = this.currentBlockConsumedBytes + iMin;
            this.currentBlockConsumedBytes = i26;
            if (i26 < 64) {
                return iMin;
            }
            this.currentBlockConsumedBytes = 0;
            this.blockCounter++;
            i18 = i15 - iMin;
            i24 = i16 + iMin;
            i19 = i14 + iMin;
        } else {
            i18 = i15;
            i19 = i14;
            i24 = i16;
        }
        NativeCrypto.chacha20_encrypt_decrypt(bArr, i19, bArr2, i24, i18, this.encodedKey, this.f133489iv, this.blockCounter);
        this.currentBlockConsumedBytes = i18 % 64;
        this.blockCounter = (i18 / 64) + this.blockCounter;
        return i15;
    }
}
