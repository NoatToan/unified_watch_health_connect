package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.KeyUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class AESKW {
    private AESKW() {
    }

    public static SecretKey unwrapCEK(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AESWrap", provider) : Cipher.getInstance("AESWrap");
            cipher.init(4, KeyUtils.toAESKey(secretKey));
            return (SecretKey) cipher.unwrap(bArr, "AES", 3);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new JOSEException("Couldn't unwrap AES key: " + e4.getMessage(), e4);
        }
    }

    public static byte[] wrapCEK(SecretKey secretKey, SecretKey secretKey2, Provider provider) throws JOSEException {
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AESWrap", provider) : Cipher.getInstance("AESWrap");
            cipher.init(3, secretKey2);
            return cipher.wrap(secretKey);
        } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            throw new JOSEException("Couldn't wrap AES key: " + e4.getMessage(), e4);
        }
    }
}
