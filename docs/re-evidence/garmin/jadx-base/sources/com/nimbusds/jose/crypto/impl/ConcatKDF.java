package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jca.JCAAware;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class ConcatKDF implements JCAAware<JCAContext> {
    private final JCAContext jcaContext = new JCAContext();
    private final String jcaHashAlg;

    public ConcatKDF(String str) {
        if (str != null) {
            this.jcaHashAlg = str;
        } else {
            h.s("The JCA hash algorithm must not be null");
            throw null;
        }
    }

    public static byte[] composeOtherInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return ByteUtils.concat(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int computeDigestCycles(int i14, int i15) {
        return ((i15 + i14) - 1) / i14;
    }

    public static byte[] encodeDataWithLength(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return ByteUtils.concat(IntegerUtils.toBytes(bArr.length), bArr);
    }

    public static byte[] encodeIntData(int i14) {
        return IntegerUtils.toBytes(i14);
    }

    public static byte[] encodeNoData() {
        return new byte[0];
    }

    public static byte[] encodeStringData(String str) {
        return encodeDataWithLength(str != null ? str.getBytes(StandardCharset.UTF_8) : null);
    }

    private MessageDigest getMessageDigest() throws JOSEException {
        Provider provider = getJCAContext().getProvider();
        String str = this.jcaHashAlg;
        try {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        } catch (NoSuchAlgorithmException e4) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e4.getMessage(), e4);
        }
    }

    public SecretKey deriveKey(SecretKey secretKey, int i14, byte[] bArr) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigest = getMessageDigest();
        for (int i15 = 1; i15 <= computeDigestCycles(ByteUtils.safeBitLength(messageDigest.getDigestLength()), i14); i15++) {
            messageDigest.update(IntegerUtils.toBytes(i15));
            messageDigest.update(secretKey.getEncoded());
            if (bArr != null) {
                messageDigest.update(bArr);
            }
            try {
                byteArrayOutputStream.write(messageDigest.digest());
            } catch (IOException e4) {
                throw new JOSEException("Couldn't write derived key: " + e4.getMessage(), e4);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int iByteLength = ByteUtils.byteLength(i14);
        return byteArray.length == iByteLength ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(ByteUtils.subArray(byteArray, 0, iByteLength), "AES");
    }

    public String getHashAlgorithm() {
        return this.jcaHashAlg;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public JCAContext getJCAContext() {
        return this.jcaContext;
    }

    public static byte[] composeOtherInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return ByteUtils.concat(bArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }

    public static byte[] encodeDataWithLength(Base64URL base64URL) {
        return encodeDataWithLength(base64URL != null ? base64URL.decode() : null);
    }

    public SecretKey deriveKey(SecretKey secretKey, int i14, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return deriveKey(secretKey, i14, composeOtherInfo(bArr, bArr2, bArr3, bArr4, bArr5));
    }

    public SecretKey deriveKey(SecretKey secretKey, int i14, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return deriveKey(secretKey, i14, composeOtherInfo(bArr, bArr2, bArr3, bArr4, bArr5, bArr6));
    }
}
