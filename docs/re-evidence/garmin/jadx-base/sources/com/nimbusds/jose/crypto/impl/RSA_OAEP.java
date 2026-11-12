package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class RSA_OAEP {
    private static final String RSA_OEAP_JCA_ALG = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";

    private RSA_OAEP() {
    }

    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance(RSA_OEAP_JCA_ALG, provider);
            cipherHelper.init(4, privateKey);
            return (SecretKey) cipherHelper.unwrap(bArr, "AES", 3);
        } catch (Exception e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance(RSA_OEAP_JCA_ALG, provider);
            cipherHelper.init(3, rSAPublicKey, new SecureRandom());
            return cipherHelper.wrap(secretKey);
        } catch (InvalidKeyException e4) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e4);
        } catch (Exception e14) {
            throw new JOSEException(e14.getMessage(), e14);
        }
    }
}
