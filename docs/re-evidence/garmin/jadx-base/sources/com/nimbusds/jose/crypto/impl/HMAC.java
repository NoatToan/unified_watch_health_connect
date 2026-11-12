package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class HMAC {
    public static byte[] compute(String str, SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        Mac initMac = getInitMac(str, secretKey, provider);
        initMac.update(bArr);
        return initMac.doFinal();
    }

    public static Mac getInitMac(String str, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Mac mac = provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e4) {
            throw new JOSEException("Invalid HMAC key: " + e4.getMessage(), e4);
        } catch (NoSuchAlgorithmException e14) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e14.getMessage(), e14);
        }
    }

    @Deprecated
    public static byte[] compute(String str, byte[] bArr, byte[] bArr2, Provider provider) {
        return compute(str, new SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static byte[] compute(SecretKey secretKey, byte[] bArr, Provider provider) {
        return compute(secretKey.getAlgorithm(), secretKey, bArr, provider);
    }

    public static Mac getInitMac(SecretKey secretKey, Provider provider) {
        return getInitMac(secretKey.getAlgorithm(), secretKey, provider);
    }
}
