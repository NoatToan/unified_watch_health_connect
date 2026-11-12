package org.conscrypt;

import am.j;
import j20.x;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kg.f;
import o2.c;
import org.apache.commons.lang3.e;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLCipher extends CipherSpi {
    private int blockSize;
    byte[] encodedKey;
    private boolean encrypting;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    byte[] f133489iv;
    Mode mode;
    private Padding padding;

    public enum Mode {
        NONE,
        CBC,
        CTR,
        ECB,
        GCM,
        GCM_SIV,
        POLY1305;

        public static Mode getNormalized(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.equals("GCM-SIV")) {
                return GCM_SIV;
            }
            if (!upperCase.equals("GCM_SIV")) {
                return valueOf(upperCase);
            }
            h.s("Invalid mode");
            return null;
        }
    }

    public enum Padding {
        NOPADDING,
        PKCS5PADDING,
        PKCS7PADDING;

        public static Padding getNormalized(String str) {
            Padding paddingValueOf = valueOf(str.toUpperCase(Locale.US));
            return paddingValueOf == PKCS7PADDING ? PKCS5PADDING : paddingValueOf;
        }
    }

    public OpenSSLCipher(Mode mode, Padding padding) {
        this.mode = Mode.ECB;
        Padding padding2 = Padding.NOPADDING;
        this.mode = mode;
        this.padding = padding;
        this.blockSize = getCipherBlockSize();
    }

    private byte[] checkAndSetEncodedKey(int i14, Key key) throws InvalidKeyException {
        if (i14 == 1 || i14 == 3) {
            this.encrypting = true;
        } else {
            if (i14 != 2 && i14 != 4) {
                throw new InvalidParameterException(j.h(i14, "Unsupported opmode "));
            }
            this.encrypting = false;
        }
        if (!(key instanceof SecretKey)) {
            e.q("Only SecretKey is supported");
            return null;
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            e.q("key.getEncoded() == null");
            return null;
        }
        checkSupportedKeySize(encoded.length);
        this.encodedKey = encoded;
        return encoded;
    }

    public abstract void checkSupportedKeySize(int i14);

    public abstract void checkSupportedMode(Mode mode);

    public abstract void checkSupportedPadding(Padding padding);

    public abstract int doFinalInternal(byte[] bArr, int i14, int i15);

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i14, int i15) {
        int iUpdateInternal;
        int outputSizeForFinal = getOutputSizeForFinal(i15);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i15 > 0) {
            try {
                iUpdateInternal = updateInternal(bArr, i14, i15, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e4) {
                q2.v("our calculated buffer was too small", e4);
                return null;
            }
        } else {
            iUpdateInternal = 0;
        }
        try {
            int iDoFinalInternal = iUpdateInternal + doFinalInternal(bArr2, iUpdateInternal, outputSizeForFinal - iUpdateInternal);
            if (iDoFinalInternal == outputSizeForFinal) {
                return bArr2;
            }
            return iDoFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iDoFinalInternal);
        } catch (ShortBufferException e14) {
            q2.v("our calculated buffer was too small", e14);
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.blockSize;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return this.f133489iv;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (!(key instanceof SecretKey)) {
            e.q("Only SecretKey is supported");
            return 0;
        }
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            checkSupportedKeySize(encoded.length);
            return encoded.length * 8;
        }
        e.q("key.getEncoded() == null");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i14) {
        return Math.max(getOutputSizeForUpdate(i14), getOutputSizeForFinal(i14));
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f133489iv;
        if (bArr != null && bArr.length > 0) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(getBaseCipherName());
                algorithmParameters.init(new IvParameterSpec(this.f133489iv));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException | InvalidParameterSpecException unused) {
            }
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i14, key);
        try {
            engineInitInternal(this.encodedKey, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e4) {
            c.p(e4);
        }
    }

    public abstract void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            Mode normalized = Mode.getNormalized(str);
            checkSupportedMode(normalized);
            this.mode = normalized;
        } catch (IllegalArgumentException e4) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(fb1.c.n("No such mode: ", str));
            noSuchAlgorithmException.initCause(e4);
            throw noSuchAlgorithmException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        try {
            Padding normalized = Padding.getNormalized(str);
            checkSupportedPadding(normalized);
            this.padding = normalized;
        } catch (IllegalArgumentException e4) {
            NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException(fb1.c.n("No such padding: ", str));
            noSuchPaddingException.initCause(e4);
            throw noSuchPaddingException;
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
        int outputSizeForUpdate = getOutputSizeForUpdate(i15);
        byte[] bArr2 = outputSizeForUpdate > 0 ? new byte[outputSizeForUpdate] : EmptyArray.BYTE;
        try {
            int iUpdateInternal = updateInternal(bArr, i14, i15, bArr2, 0, outputSizeForUpdate);
            if (bArr2.length == iUpdateInternal) {
                return bArr2;
            }
            return iUpdateInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iUpdateInternal);
        } catch (ShortBufferException unused) {
            f.n(j.h(outputSizeForUpdate, "calculated buffer size was wrong: "));
            return null;
        }
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

    public abstract String getBaseCipherName();

    public abstract int getCipherBlockSize();

    public abstract int getOutputSizeForFinal(int i14);

    public abstract int getOutputSizeForUpdate(int i14);

    public Padding getPadding() {
        return this.padding;
    }

    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        try {
            return algorithmParameters.getParameterSpec(IvParameterSpec.class);
        } catch (InvalidParameterSpecException e4) {
            throw new InvalidAlgorithmParameterException("Params must be convertible to IvParameterSpec", e4);
        }
    }

    public boolean isEncrypting() {
        return this.encrypting;
    }

    public boolean supportsVariableSizeIv() {
        return false;
    }

    public boolean supportsVariableSizeKey() {
        return false;
    }

    public abstract int updateInternal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16, int i17);

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i14, key);
        engineInitInternal(this.encodedKey, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i14, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException {
        engineInit(i14, key, getParameterSpec(algorithmParameters), secureRandom);
    }

    public OpenSSLCipher() {
        this.mode = Mode.ECB;
        this.padding = Padding.PKCS5PADDING;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        return updateInternal(bArr, i14, i15, bArr2, i16, getOutputSizeForUpdate(i15));
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        byte[] bArr3;
        int iUpdateInternal;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i15);
            if (i15 > 0) {
                bArr3 = bArr2;
                iUpdateInternal = updateInternal(bArr, i14, i15, bArr3, i16, outputSizeForFinal);
                i16 += iUpdateInternal;
                outputSizeForFinal -= iUpdateInternal;
            } else {
                bArr3 = bArr2;
                iUpdateInternal = 0;
            }
            return doFinalInternal(bArr3, i16, outputSizeForFinal) + iUpdateInternal;
        }
        x.l("output == null");
        return 0;
    }
}
