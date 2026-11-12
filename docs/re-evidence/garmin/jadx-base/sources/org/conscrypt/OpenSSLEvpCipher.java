package org.conscrypt;

import b71.i;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLEvpCipher extends OpenSSLCipher {
    private boolean calledUpdate;
    private final NativeRef.EVP_CIPHER_CTX cipherCtx;
    private int modeBlockSize;

    public OpenSSLEvpCipher(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
        this.cipherCtx = new NativeRef.EVP_CIPHER_CTX(NativeCrypto.EVP_CIPHER_CTX_new());
    }

    private void reset() {
        NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, this.encodedKey, this.f133489iv, isEncrypting());
        this.calledUpdate = false;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i14, int i15) throws ShortBufferWithoutStackTraceException {
        int iEVP_CipherFinal_ex;
        if (!isEncrypting() && !this.calledUpdate) {
            return 0;
        }
        int length = bArr.length - i14;
        if (length >= i15) {
            iEVP_CipherFinal_ex = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr, i14);
        } else {
            byte[] bArr2 = new byte[i15];
            int iEVP_CipherFinal_ex2 = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr2, 0);
            if (iEVP_CipherFinal_ex2 > length) {
                throw new ShortBufferWithoutStackTraceException(k.e(iEVP_CipherFinal_ex2, length, "buffer is too short: ", " > "));
            }
            if (iEVP_CipherFinal_ex2 > 0) {
                System.arraycopy(bArr2, 0, bArr, i14, iEVP_CipherFinal_ex2);
            }
            iEVP_CipherFinal_ex = iEVP_CipherFinal_ex2;
        }
        reset();
        return (iEVP_CipherFinal_ex + i14) - i14;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        byte[] iv3 = algorithmParameterSpec instanceof IvParameterSpec ? ((IvParameterSpec) algorithmParameterSpec).getIV() : null;
        long jEVP_get_cipherbyname = NativeCrypto.EVP_get_cipherbyname(getCipherName(bArr.length, this.mode));
        if (jEVP_get_cipherbyname == 0) {
            throw new InvalidAlgorithmParameterException("Cannot find name for key length = " + (bArr.length * 8) + " and mode = " + this.mode);
        }
        boolean zIsEncrypting = isEncrypting();
        int iEVP_CIPHER_iv_length = NativeCrypto.EVP_CIPHER_iv_length(jEVP_get_cipherbyname);
        if (iv3 != null || iEVP_CIPHER_iv_length == 0) {
            if (iEVP_CIPHER_iv_length == 0 && iv3 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (iv3 != null && iv3.length != iEVP_CIPHER_iv_length) {
                StringBuilder sbI = i.i(iEVP_CIPHER_iv_length, "expected IV length of ", " but was ");
                sbI.append(iv3.length);
                throw new InvalidAlgorithmParameterException(sbI.toString());
            }
        } else {
            if (!zIsEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            iv3 = new byte[iEVP_CIPHER_iv_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(iv3);
            } else {
                NativeCrypto.RAND_bytes(iv3);
            }
        }
        this.f133489iv = iv3;
        boolean zSupportsVariableSizeKey = supportsVariableSizeKey();
        NativeRef.EVP_CIPHER_CTX evp_cipher_ctx = this.cipherCtx;
        if (zSupportsVariableSizeKey) {
            NativeCrypto.EVP_CipherInit_ex(evp_cipher_ctx, jEVP_get_cipherbyname, null, null, zIsEncrypting);
            NativeCrypto.EVP_CIPHER_CTX_set_key_length(this.cipherCtx, bArr.length);
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, bArr, iv3, isEncrypting());
        } else {
            NativeCrypto.EVP_CipherInit_ex(evp_cipher_ctx, jEVP_get_cipherbyname, bArr, iv3, zIsEncrypting);
        }
        NativeCrypto.EVP_CIPHER_CTX_set_padding(this.cipherCtx, getPadding() == OpenSSLCipher.Padding.PKCS5PADDING);
        this.modeBlockSize = NativeCrypto.EVP_CIPHER_CTX_block_size(this.cipherCtx);
        this.calledUpdate = false;
    }

    public abstract String getCipherName(int i14, OpenSSLCipher.Mode mode);

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i14) {
        if (this.modeBlockSize == 1) {
            return i14;
        }
        int i15 = NativeCrypto.get_EVP_CIPHER_CTX_buf_len(this.cipherCtx);
        if (getPadding() == OpenSSLCipher.Padding.NOPADDING) {
            return i15 + i14;
        }
        int i16 = i14 + i15 + (NativeCrypto.get_EVP_CIPHER_CTX_final_used(this.cipherCtx) ? this.modeBlockSize : 0);
        int i17 = i16 + ((i16 % this.modeBlockSize != 0 || isEncrypting()) ? this.modeBlockSize : 0);
        return i17 - (i17 % this.modeBlockSize);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i14) {
        return getOutputSizeForFinal(i14);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16, int i17) throws ShortBufferWithoutStackTraceException {
        int length = bArr2.length - i16;
        if (length < i17) {
            throw new ShortBufferWithoutStackTraceException(k.e(length, i17, "output buffer too small during update: ", " < "));
        }
        int iEVP_CipherUpdate = i16 + NativeCrypto.EVP_CipherUpdate(this.cipherCtx, bArr2, i16, bArr, i14, i15);
        this.calledUpdate = true;
        return iEVP_CipherUpdate - i16;
    }
}
