package org.conscrypt;

import am.j;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import kg.f;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i14) throws InvalidKeyException {
        if (i14 != 32) {
            throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 32)"));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
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

    @Override // org.conscrypt.OpenSSLAeadCipher
    public long getEVP_AEAD(int i14) {
        if (i14 == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        f.n(j.h(i14, "Unexpected key length: "));
        return 0L;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i14) {
        boolean zIsEncrypting = isEncrypting();
        int i15 = this.bufCount;
        return zIsEncrypting ? i15 + i14 + 16 : Math.max(0, (i15 + i14) - 16);
    }
}
