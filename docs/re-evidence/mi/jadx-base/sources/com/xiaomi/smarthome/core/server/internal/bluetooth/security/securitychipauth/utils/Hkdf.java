package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private final String algorithm;
    private SecretKey prk = null;
    private final Provider provider;

    private Hkdf(String str) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            this.provider = null;
        } else {
            throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
        }
    }

    private void assertInitialized() throws IllegalStateException {
        if (this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }

    private Mac createMac() {
        try {
            Provider provider = this.provider;
            Mac mac = provider != null ? Mac.getInstance(this.algorithm, provider) : Mac.getInstance(this.algorithm);
            mac.init(this.prk);
            return mac;
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Hkdf getInstance(String str) throws NoSuchAlgorithmException {
        Mac.getInstance(str);
        return new Hkdf(str);
    }

    public byte[] deriveKey(String str, int i) throws IllegalStateException {
        return deriveKey(str != null ? str.getBytes(Charset.forName("UTF-8")) : null, i);
    }

    public void init(byte[] bArr) {
        init(bArr, null);
    }

    public void unsafeInitWithoutKeyExtraction(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey.getAlgorithm().equals(this.algorithm)) {
            this.prk = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + secretKey.getAlgorithm());
    }

    public byte[] deriveKey(byte[] bArr, int i) throws IllegalStateException {
        byte[] bArr2 = new byte[i];
        try {
            deriveKey(bArr, i, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? EMPTY_ARRAY : (byte[]) bArr2.clone();
        byte[] bArrDoFinal = EMPTY_ARRAY;
        try {
            try {
                Provider provider = this.provider;
                Mac mac = provider != null ? Mac.getInstance(this.algorithm, provider) : Mac.getInstance(this.algorithm);
                if (bArr3.length == 0) {
                    bArr3 = new byte[mac.getMacLength()];
                    Arrays.fill(bArr3, (byte) 0);
                }
                mac.init(new SecretKeySpec(bArr3, this.algorithm));
                bArrDoFinal = mac.doFinal(bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, this.algorithm);
                Arrays.fill(bArrDoFinal, (byte) 0);
                unsafeInitWithoutKeyExtraction(secretKeySpec);
                Arrays.fill(bArrDoFinal, (byte) 0);
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("Unexpected exception", e);
            }
        } catch (Throwable th) {
            Arrays.fill(bArrDoFinal, (byte) 0);
            throw th;
        }
    }

    public static Hkdf getInstance(String str, String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
        return new Hkdf(str, Mac.getInstance(str, str2).getProvider());
    }

    public static Hkdf getInstance(String str, Provider provider) throws NoSuchAlgorithmException {
        return new Hkdf(str, Mac.getInstance(str, provider).getProvider());
    }

    public void deriveKey(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, ShortBufferException {
        assertInitialized();
        if (i >= 0) {
            if (bArr2.length >= i2 + i) {
                Mac macCreateMac = createMac();
                if (i <= macCreateMac.getMacLength() * 255) {
                    byte[] bArrDoFinal = EMPTY_ARRAY;
                    byte b2 = 1;
                    int i3 = 0;
                    while (i3 < i) {
                        try {
                            macCreateMac.update(bArrDoFinal);
                            macCreateMac.update(bArr);
                            macCreateMac.update(b2);
                            bArrDoFinal = macCreateMac.doFinal();
                            int i4 = 0;
                            while (i4 < bArrDoFinal.length && i3 < i) {
                                bArr2[i3] = bArrDoFinal[i4];
                                i4++;
                                i3++;
                            }
                            b2 = (byte) (b2 + 1);
                        } catch (Throwable th) {
                            Arrays.fill(bArrDoFinal, (byte) 0);
                            throw th;
                        }
                    }
                    Arrays.fill(bArrDoFinal, (byte) 0);
                    return;
                }
                throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
            }
            throw new ShortBufferException();
        }
        throw new IllegalArgumentException("Length must be a non-negative value.");
    }

    private Hkdf(String str, Provider provider) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            this.provider = provider;
        } else {
            throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
        }
    }
}
