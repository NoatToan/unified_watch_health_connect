package org.conscrypt;

import am.j;
import b71.i;
import j20.x;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLAeadCipher extends OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    private static final boolean ENABLE_BYTEBUFFER_OPTIMIZATIONS = true;
    private static int lastGlobalMessageSize = 32;
    private byte[] aad;
    byte[] buf;
    int bufCount;
    long evpAead;
    private boolean mustInitialize;
    private byte[] previousIv;
    private byte[] previousKey;
    int tagLengthInBytes;

    public OpenSSLAeadCipher(OpenSSLCipher.Mode mode) {
        super(mode, OpenSSLCipher.Padding.NOPADDING);
    }

    private boolean arraysAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            i14 |= bArr[i15] ^ bArr2[i15];
        }
        return i14 == 0;
    }

    private void checkInitialization() {
        if (this.mustInitialize) {
            h.z("Cannot re-use same key and IV for multiple encryptions");
        }
    }

    private void expand(int i14) {
        int i15 = this.bufCount;
        int i16 = i15 + i14;
        byte[] bArr = this.buf;
        if (i16 <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[(i14 + i15) * 2];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        this.buf = bArr2;
    }

    private void reset() {
        this.aad = null;
        int i14 = lastGlobalMessageSize;
        byte[] bArr = this.buf;
        if (bArr == null) {
            this.buf = new byte[i14];
        } else {
            int i15 = this.bufCount;
            if (i15 > 0 && i15 != i14) {
                lastGlobalMessageSize = i15;
                if (bArr.length != i15) {
                    this.buf = new byte[i15];
                }
            }
        }
        this.bufCount = 0;
    }

    private void throwAEADBadTagExceptionIfAvailable(String str, Throwable th3) throws BadPaddingException {
        BadPaddingException badPaddingException;
        try {
            BadPaddingException badPaddingException2 = null;
            try {
                try {
                    badPaddingException = (BadPaddingException) Class.forName("javax.crypto.AEADBadTagException").getConstructor(String.class).newInstance(str);
                    try {
                        badPaddingException.initCause(th3);
                    } catch (IllegalAccessException | InstantiationException unused) {
                        badPaddingException2 = badPaddingException;
                        badPaddingException = badPaddingException2;
                    }
                } catch (InvocationTargetException e4) {
                    throw ((BadPaddingException) new BadPaddingException().initCause(e4.getTargetException()));
                }
            } catch (IllegalAccessException | InstantiationException unused2) {
            }
            if (badPaddingException != null) {
                throw badPaddingException;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean allowsNonceReuse() {
        return false;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding for AEAD ciphers");
        }
    }

    public void checkSupportedTagLength(int i14) throws InvalidAlgorithmParameterException {
        if (i14 % 8 != 0) {
            throw new InvalidAlgorithmParameterException(j.h(i14, "Tag length must be a multiple of 8; was "));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i14, int i15) throws BadPaddingException {
        checkInitialization();
        try {
            boolean zIsEncrypting = isEncrypting();
            long j8 = this.evpAead;
            int iEVP_AEAD_CTX_seal = zIsEncrypting ? NativeCrypto.EVP_AEAD_CTX_seal(j8, this.encodedKey, this.tagLengthInBytes, bArr, i14, this.f133489iv, this.buf, 0, this.bufCount, this.aad) : NativeCrypto.EVP_AEAD_CTX_open(j8, this.encodedKey, this.tagLengthInBytes, bArr, i14, this.f133489iv, this.buf, 0, this.bufCount, this.aad);
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            reset();
            return iEVP_AEAD_CTX_seal;
        } catch (BadPaddingException e4) {
            throwAEADBadTagExceptionIfAvailable(e4.getMessage(), e4.getCause());
            throw e4;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws BadPaddingException, ShortBufferWithoutStackTraceException {
        if (byteBuffer == null || byteBuffer2 == null) {
            x.l("Null ByteBuffer Error");
            return 0;
        }
        if (getOutputSizeForFinal(byteBuffer.remaining()) > byteBuffer2.remaining()) {
            throw new ShortBufferWithoutStackTraceException("Insufficient Bytes for Output Buffer");
        }
        if (byteBuffer2.isReadOnly()) {
            h.s("Cannot write to Read Only ByteBuffer");
            return 0;
        }
        if (this.bufCount != 0) {
            return super.engineDoFinal(byteBuffer, byteBuffer2);
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.mark();
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.reset();
            byteBuffer = byteBufferAllocateDirect;
        }
        if (byteBuffer2.isDirect()) {
            int iDoFinalInternal = doFinalInternal(byteBuffer, byteBuffer2);
            byteBuffer2.position(byteBuffer2.position() + iDoFinalInternal);
            byteBuffer.position(byteBuffer.limit());
            return iDoFinalInternal;
        }
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(getOutputSizeForFinal(byteBuffer.remaining()));
        int iDoFinalInternal2 = doFinalInternal(byteBuffer, byteBufferAllocateDirect2);
        byteBuffer2.put(byteBufferAllocateDirect2);
        byteBuffer.position(byteBuffer.limit());
        return iDoFinalInternal2;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        byte[] iv3 = null;
        int tLen = 128;
        if (algorithmParameterSpec != null) {
            GCMParameters gCMParametersFromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
            if (gCMParametersFromGCMParameterSpec != null) {
                iv3 = gCMParametersFromGCMParameterSpec.getIV();
                tLen = gCMParametersFromGCMParameterSpec.getTLen();
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                iv3 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            }
        }
        checkSupportedTagLength(tLen);
        this.tagLengthInBytes = tLen / 8;
        boolean zIsEncrypting = isEncrypting();
        long evp_aead = getEVP_AEAD(bArr.length);
        this.evpAead = evp_aead;
        int iEVP_AEAD_nonce_length = NativeCrypto.EVP_AEAD_nonce_length(evp_aead);
        if (iv3 != null || iEVP_AEAD_nonce_length == 0) {
            if (iEVP_AEAD_nonce_length == 0 && iv3 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (iv3 != null && iv3.length != iEVP_AEAD_nonce_length) {
                StringBuilder sbI = i.i(iEVP_AEAD_nonce_length, "Expected IV length of ", " but was ");
                sbI.append(iv3.length);
                throw new InvalidAlgorithmParameterException(sbI.toString());
            }
        } else {
            if (!zIsEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            iv3 = new byte[iEVP_AEAD_nonce_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(iv3);
            } else {
                NativeCrypto.RAND_bytes(iv3);
            }
        }
        if (isEncrypting() && iv3 != null && !allowsNonceReuse()) {
            byte[] bArr2 = this.previousKey;
            if (bArr2 != null && this.previousIv != null && arraysAreEqual(bArr2, bArr) && arraysAreEqual(this.previousIv, iv3)) {
                this.mustInitialize = true;
                e.t("When using AEAD key and IV must not be re-used");
                return;
            } else {
                this.previousKey = bArr;
                this.previousIv = iv3;
            }
        }
        this.mustInitialize = false;
        this.f133489iv = iv3;
        reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        checkInitialization();
        byte[] bArr = this.aad;
        if (bArr == null) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.aad = bArr2;
            byteBuffer.get(bArr2);
        } else {
            byte[] bArr3 = new byte[byteBuffer.remaining() + bArr.length];
            byte[] bArr4 = this.aad;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            byteBuffer.get(bArr3, this.aad.length, byteBuffer.remaining());
            this.aad = bArr3;
        }
    }

    public abstract long getEVP_AEAD(int i14);

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i14) {
        return this.bufCount + i14 + (isEncrypting() ? NativeCrypto.EVP_AEAD_max_overhead(this.evpAead) : 0);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i14) {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16, int i17) {
        checkInitialization();
        if (this.buf == null) {
            h.z("Cipher not initialized");
            return 0;
        }
        ArrayUtils.checkOffsetAndCount(bArr.length, i14, i15);
        if (i15 <= 0) {
            return 0;
        }
        expand(i15);
        System.arraycopy(bArr, i14, this.buf, this.bufCount, i15);
        this.bufCount += i15;
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i14, int i15) {
        checkInitialization();
        byte[] bArr2 = this.aad;
        if (bArr2 == null) {
            this.aad = Arrays.copyOfRange(bArr, i14, i15 + i14);
            return;
        }
        byte[] bArr3 = new byte[bArr2.length + i15];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i14, bArr3, this.aad.length, i15);
        this.aad = bArr3;
    }

    public int doFinalInternal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws BadPaddingException {
        int iEVP_AEAD_CTX_open_buf;
        checkInitialization();
        try {
            boolean zIsEncrypting = isEncrypting();
            long j8 = this.evpAead;
            if (zIsEncrypting) {
                iEVP_AEAD_CTX_open_buf = NativeCrypto.EVP_AEAD_CTX_seal_buf(j8, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f133489iv, byteBuffer, this.aad);
            } else {
                iEVP_AEAD_CTX_open_buf = NativeCrypto.EVP_AEAD_CTX_open_buf(j8, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f133489iv, byteBuffer, this.aad);
            }
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            return iEVP_AEAD_CTX_open_buf;
        } catch (BadPaddingException e4) {
            throwAEADBadTagExceptionIfAvailable(e4.getMessage(), e4.getCause());
            throw e4;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) throws ShortBufferWithoutStackTraceException {
        if (bArr2 != null && getOutputSizeForFinal(i15) > bArr2.length - i16) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        return super.engineDoFinal(bArr, i14, i15, bArr2, i16);
    }
}
