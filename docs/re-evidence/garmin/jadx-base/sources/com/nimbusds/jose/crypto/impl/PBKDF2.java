package com.nimbusds.jose.crypto.impl;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2 {
    static final long MAX_DERIVED_KEY_LENGTH = 4294967295L;
    public static final int MIN_SALT_LENGTH = 8;
    static final byte[] ZERO_BYTE = {0};

    private PBKDF2() {
    }

    public static SecretKey deriveKey(byte[] bArr, byte[] bArr2, int i14, PRFParams pRFParams, Provider provider) throws JOSEException {
        SecretKeyFactory secretKeyFactory;
        if (bArr2 == null) {
            p.p("The formatted salt must not be null");
            return null;
        }
        if (i14 < 1) {
            p.p("The iteration count must be greater than 0");
            return null;
        }
        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(bArr, StandardCharsets.UTF_8).toCharArray(), bArr2, i14, ByteUtils.bitLength(pRFParams.getDerivedKeyByteLength()));
        try {
            if (provider != null) {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2With" + pRFParams.getMACAlgorithm(), provider);
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2With" + pRFParams.getMACAlgorithm());
            }
            return new SecretKeySpec(secretKeyFactory.generateSecret(pBEKeySpec).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
            throw new JOSEException(e4.getLocalizedMessage(), e4);
        }
    }

    public static byte[] extractBlock(byte[] bArr, int i14, int i15, Mac mac) throws JOSEException {
        if (bArr == null) {
            p.p("The formatted salt must not be null");
            return null;
        }
        if (i14 < 1) {
            p.p("The iteration count must be greater than 0");
            return null;
        }
        byte[] bArrDoFinal = null;
        byte[] bArrDoFinal2 = null;
        for (int i16 = 1; i16 <= i14; i16++) {
            if (i16 == 1) {
                bArrDoFinal = mac.doFinal(ByteUtils.concat(bArr, IntegerUtils.toBytes(i15)));
                bArrDoFinal2 = bArrDoFinal;
            } else {
                bArrDoFinal2 = mac.doFinal(bArrDoFinal2);
                for (int i17 = 0; i17 < bArrDoFinal2.length; i17++) {
                    bArrDoFinal[i17] = (byte) (bArrDoFinal2[i17] ^ bArrDoFinal[i17]);
                }
            }
        }
        return bArrDoFinal;
    }

    public static byte[] formatSalt(JWEAlgorithm jWEAlgorithm, byte[] bArr) throws JOSEException {
        byte[] bytes = jWEAlgorithm.toString().getBytes(StandardCharset.UTF_8);
        if (bArr == null) {
            p.p("The salt must not be null");
            return null;
        }
        if (bArr.length < 8) {
            p.p("The salt must be at least 8 bytes long");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(ZERO_BYTE);
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }
}
