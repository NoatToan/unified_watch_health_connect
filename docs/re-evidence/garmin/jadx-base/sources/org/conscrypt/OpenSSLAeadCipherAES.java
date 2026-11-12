package org.conscrypt;

import am.j;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import kg.f;
import org.apache.commons.lang3.e;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    public static class GCM extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i14) throws InvalidKeyException {
                if (i14 != 16) {
                    throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        public static class AES_256 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i14) throws InvalidKeyException {
                if (i14 != 32) {
                    throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i14) {
            if (i14 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i14 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            f.n(j.h(i14, "Unexpected key length: "));
            return 0L;
        }
    }

    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i14) throws InvalidKeyException {
                if (i14 != 16) {
                    throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        public static class AES_256 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i14) throws InvalidKeyException {
                if (i14 != 32) {
                    throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public boolean allowsNonceReuse() {
            return true;
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public void checkSupportedTagLength(int i14) throws InvalidAlgorithmParameterException {
            if (i14 == 128) {
                return;
            }
            e.t("Tag length must be 128 bits");
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i14) {
            if (i14 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i14 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            f.n(j.h(i14, "Unexpected key length: "));
            return 0L;
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i14) throws InvalidKeyException {
        if (i14 != 16 && i14 != 32) {
            throw new InvalidKeyException(e0.f(i14, "Unsupported key size: ", " bytes (must be 16 or 32)"));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f133489iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("GCM");
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e4) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e4));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i14) {
        boolean zIsEncrypting = isEncrypting();
        int i15 = this.bufCount;
        return zIsEncrypting ? i15 + i14 + this.tagLengthInBytes : Math.max(0, (i15 + i14) - this.tagLengthInBytes);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecFromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return algorithmParameterSpecFromGCMParameters != null ? algorithmParameterSpecFromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
