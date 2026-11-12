package org.conscrypt;

import am.j;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kg.f;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLCipherRSA extends CipherSpi {
    private byte[] buffer;
    private int bufferOffset;
    boolean encrypting;
    private boolean inputTooLarge;
    OpenSSLKey key;
    int padding;
    boolean usingPrivateKey;

    public static abstract class DirectRSA extends OpenSSLCipherRSA {
        public DirectRSA(int i14) {
            super(i14);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) throws IllegalBlockSizeException {
            boolean z14 = this.encrypting;
            boolean z15 = this.usingPrivateKey;
            if (z14) {
                return z15 ? NativeCrypto.RSA_private_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            }
            try {
                return z15 ? NativeCrypto.RSA_private_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            } catch (SignatureException e4) {
                IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
                illegalBlockSizeException.initCause(e4);
                throw illegalBlockSizeException;
            }
        }
    }

    public static final class PKCS1 extends DirectRSA {
        public PKCS1() {
            super(1);
        }
    }

    public static final class Raw extends DirectRSA {
        public Raw() {
            super(3);
        }
    }

    public OpenSSLCipherRSA(int i14) {
        this.padding = i14;
    }

    public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) {
    }

    public abstract int doCryptoOperation(byte[] bArr, byte[] bArr2);

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i14, int i15) throws IllegalBlockSizeException {
        if (bArr != null) {
            engineUpdate(bArr, i14, i15);
        }
        if (this.inputTooLarge) {
            throw new IllegalBlockSizeException(j.q(new StringBuilder("input must be under "), this.buffer.length, " bytes"));
        }
        int i16 = this.bufferOffset;
        byte[] bArrCopyOf = this.buffer;
        if (i16 != bArrCopyOf.length) {
            if (this.padding == 3) {
                byte[] bArr2 = new byte[bArrCopyOf.length];
                System.arraycopy(bArrCopyOf, 0, bArr2, bArrCopyOf.length - i16, i16);
                bArrCopyOf = bArr2;
            } else {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
            }
        }
        int length = this.buffer.length;
        byte[] bArrCopyOf2 = new byte[length];
        int iDoCryptoOperation = doCryptoOperation(bArrCopyOf, bArrCopyOf2);
        if (!this.encrypting && iDoCryptoOperation != length) {
            bArrCopyOf2 = Arrays.copyOf(bArrCopyOf2, iDoCryptoOperation);
        }
        this.bufferOffset = 0;
        return bArrCopyOf2;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.encrypting ? paddedBlockSizeBytes() : keySizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (key instanceof OpenSSLRSAPrivateKey) {
            return ((OpenSSLRSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateCrtKey) {
            return ((RSAPrivateCrtKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof OpenSSLRSAPublicKey) {
            return ((OpenSSLRSAPublicKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        if (key == null) {
            e.q("RSA private or public key is null");
            return 0;
        }
        e.q("Need RSA private or public key");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i14) {
        return this.encrypting ? keySizeBytes() : paddedBlockSizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters != null) {
            throw new InvalidAlgorithmParameterException("unknown param type: ".concat(algorithmParameters.getClass().getName()));
        }
        engineInitInternal(i14, key, null);
    }

    public void engineInitInternal(int i14, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (i14 == 1 || i14 == 3) {
            this.encrypting = true;
        } else {
            if (i14 != 2 && i14 != 4) {
                throw new InvalidParameterException(j.h(i14, "Unsupported opmode "));
            }
            this.encrypting = false;
        }
        if (key instanceof OpenSSLRSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = ((OpenSSLRSAPrivateKey) key).getOpenSSLKey();
        } else if (key instanceof RSAPrivateCrtKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) key);
        } else if (key instanceof RSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) key);
        } else if (key instanceof OpenSSLRSAPublicKey) {
            this.usingPrivateKey = false;
            this.key = ((OpenSSLRSAPublicKey) key).getOpenSSLKey();
        } else {
            if (!(key instanceof RSAPublicKey)) {
                if (key == null) {
                    e.q("RSA private or public key is null");
                    return;
                } else {
                    e.q("Need RSA private or public key");
                    return;
                }
            }
            this.usingPrivateKey = false;
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) key);
        }
        this.buffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.bufferOffset = 0;
        this.inputTooLarge = false;
        doCryptoInit(algorithmParameterSpec);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (!"NONE".equals(upperCase) && !"ECB".equals(upperCase)) {
            throw new NoSuchAlgorithmException("mode not supported: ".concat(str));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if ("PKCS1PADDING".equals(upperCase)) {
            this.padding = 1;
        } else {
            if (!"NOPADDING".equals(upperCase)) {
                throw new NoSuchPaddingException("padding not supported: ".concat(str));
            }
            this.padding = 3;
        }
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i14) throws InvalidKeyException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i14 == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i14 == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i14 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            throw new UnsupportedOperationException("wrappedKeyType == " + i14);
        } catch (InvalidKeySpecException e4) {
            throw new InvalidKeyException(e4);
        } catch (BadPaddingException e14) {
            throw new InvalidKeyException(e14);
        } catch (IllegalBlockSizeException e15) {
            throw new InvalidKeyException(e15);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i14, int i15) {
        int i16 = this.bufferOffset;
        int i17 = i16 + i15;
        byte[] bArr2 = this.buffer;
        if (i17 > bArr2.length) {
            this.inputTooLarge = true;
            return EmptyArray.BYTE;
        }
        System.arraycopy(bArr, i14, bArr2, i16, i15);
        this.bufferOffset += i15;
        return EmptyArray.BYTE;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException {
        try {
            byte[] encoded = key.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e4) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e4);
            throw illegalBlockSizeException;
        }
    }

    public boolean isInitialized() {
        return this.key != null;
    }

    public int keySizeBytes() {
        if (isInitialized()) {
            return NativeCrypto.RSA_size(this.key.getNativeRef());
        }
        h.z("cipher is not initialized");
        return 0;
    }

    public int paddedBlockSizeBytes() {
        int iKeySizeBytes = keySizeBytes();
        return this.padding == 1 ? iKeySizeBytes - 11 : iKeySizeBytes;
    }

    public static class OAEP extends OpenSSLCipherRSA {
        private byte[] label;
        private long mgf1Md;
        private long oaepMd;
        private int oaepMdSizeBytes;
        private NativeRef.EVP_PKEY_CTX pkeyCtx;

        public static final class SHA1 extends OAEP {
            public SHA1() {
                super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
            }
        }

        public static final class SHA224 extends OAEP {
            public SHA224() {
                super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
            }
        }

        public static final class SHA256 extends OAEP {
            public SHA256() {
                super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
            }
        }

        public static final class SHA384 extends OAEP {
            public SHA384() {
                super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
            }
        }

        public static final class SHA512 extends OAEP {
            public SHA512() {
                super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
            }
        }

        public OAEP(long j8, int i14) {
            super(4);
            this.mgf1Md = j8;
            this.oaepMd = j8;
            this.oaepMdSizeBytes = i14;
        }

        private void readOAEPParameters(OAEPParameterSpec oAEPParameterSpec) throws InvalidAlgorithmParameterException {
            String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
            Locale locale = Locale.US;
            String upperCase = mGFAlgorithm.toUpperCase(locale);
            AlgorithmParameterSpec mGFParameters = oAEPParameterSpec.getMGFParameters();
            if ((!"MGF1".equals(upperCase) && !"1.2.840.113549.1.1.8".equals(upperCase)) || !(mGFParameters instanceof MGF1ParameterSpec)) {
                e.t("Only MGF1 supported as mask generation function");
                return;
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) mGFParameters;
            String upperCase2 = oAEPParameterSpec.getDigestAlgorithm().toUpperCase(locale);
            try {
                this.oaepMd = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(upperCase2);
                this.oaepMdSizeBytes = EvpMdRef.getDigestSizeBytesByJcaDigestAlgorithmStandardName(upperCase2);
                this.mgf1Md = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(mGF1ParameterSpec.getDigestAlgorithm());
                PSource pSource = oAEPParameterSpec.getPSource();
                if ("PSpecified".equals(pSource.getAlgorithm()) && (pSource instanceof PSource.PSpecified)) {
                    this.label = ((PSource.PSpecified) pSource).getValue();
                } else {
                    e.t("Only PSpecified accepted for PSource");
                }
            } catch (NoSuchAlgorithmException e4) {
                throw new InvalidAlgorithmParameterException(e4);
            }
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            boolean z14 = this.encrypting;
            OpenSSLKey openSSLKey = this.key;
            this.pkeyCtx = new NativeRef.EVP_PKEY_CTX(z14 ? NativeCrypto.EVP_PKEY_encrypt_init(openSSLKey.getNativeRef()) : NativeCrypto.EVP_PKEY_decrypt_init(openSSLKey.getNativeRef()));
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                readOAEPParameters((OAEPParameterSpec) algorithmParameterSpec);
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(this.pkeyCtx.address, 4);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_md(this.pkeyCtx.address, this.oaepMd);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_mgf1_md(this.pkeyCtx.address, this.mgf1Md);
            byte[] bArr = this.label;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_label(this.pkeyCtx.address, bArr);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) {
            boolean z14 = this.encrypting;
            NativeRef.EVP_PKEY_CTX evp_pkey_ctx = this.pkeyCtx;
            return z14 ? NativeCrypto.EVP_PKEY_encrypt(evp_pkey_ctx, bArr2, 0, bArr, 0, bArr.length) : NativeCrypto.EVP_PKEY_decrypt(evp_pkey_ctx, bArr2, 0, bArr, 0, bArr.length);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public AlgorithmParameters engineGetParameters() {
            if (!isInitialized()) {
                return null;
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("OAEP");
                algorithmParameters.init(new OAEPParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.oaepMd), "MGF1", new MGF1ParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.mgf1Md)), this.label == null ? PSource.PSpecified.DEFAULT : new PSource.PSpecified(this.label)));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException e4) {
                throw ((Error) new AssertionError("OAEP not supported").initCause(e4));
            } catch (InvalidParameterSpecException unused) {
                f.n("No providers of AlgorithmParameters.OAEP available");
                return null;
            }
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineInit(int i14, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
            OAEPParameterSpec oAEPParameterSpec;
            if (algorithmParameters != null) {
                try {
                    oAEPParameterSpec = (OAEPParameterSpec) algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
                } catch (InvalidParameterSpecException e4) {
                    throw new InvalidAlgorithmParameterException("Only OAEP parameters are supported", e4);
                }
            } else {
                oAEPParameterSpec = null;
            }
            engineInitInternal(i14, key, oAEPParameterSpec);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public void engineInitInternal(int i14, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
            if (i14 == 1 || i14 == 3) {
                if (!(key instanceof PublicKey)) {
                    e.q("Only public keys may be used to encrypt");
                    return;
                }
            } else if ((i14 == 2 || i14 == 4) && !(key instanceof PrivateKey)) {
                e.q("Only private keys may be used to decrypt");
                return;
            }
            super.engineInitInternal(i14, key, algorithmParameterSpec);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineSetPadding(String str) throws NoSuchPaddingException {
            if (!str.toUpperCase(Locale.US).equals("OAEPPADDING")) {
                throw new NoSuchPaddingException("Only OAEP padding is supported");
            }
            this.padding = 4;
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int paddedBlockSizeBytes() {
            return keySizeBytes() - ((this.oaepMdSizeBytes * 2) + 2);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineInit(int i14, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
            if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                e.t("Only OAEPParameterSpec accepted in OAEP mode");
            } else {
                engineInitInternal(i14, key, algorithmParameterSpec);
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        engineUpdate(bArr, i14, i15);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInitInternal(i14, key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown param type: ".concat(algorithmParameterSpec.getClass().getName()));
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInitInternal(i14, key, null);
        } catch (InvalidAlgorithmParameterException e4) {
            throw new InvalidKeyException("Algorithm parameters rejected when none supplied", e4);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) throws IllegalBlockSizeException, ShortBufferWithoutStackTraceException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i14, i15);
        int length = bArrEngineDoFinal.length + i16;
        if (length <= bArr2.length) {
            System.arraycopy(bArrEngineDoFinal, 0, bArr2, i16, bArrEngineDoFinal.length);
            return bArrEngineDoFinal.length;
        }
        throw new ShortBufferWithoutStackTraceException("output buffer is too small " + bArr2.length + " < " + length);
    }
}
