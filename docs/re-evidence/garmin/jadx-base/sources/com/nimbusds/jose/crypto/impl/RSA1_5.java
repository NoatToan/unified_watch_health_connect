package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.ByteUtils;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class RSA1_5 {
    private RSA1_5() {
    }

    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, int i14, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(2, privateKey);
            byte[] bArrDoFinal = cipherHelper.doFinal(bArr);
            if (ByteUtils.safeBitLength(bArrDoFinal) != i14) {
                return null;
            }
            return new SecretKeySpec(bArrDoFinal, "AES");
        } catch (Exception e4) {
            throw new JOSEException("Couldn't decrypt Content Encryption Key (CEK): " + e4.getMessage(), e4);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(1, rSAPublicKey);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e4) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e4);
        } catch (Exception e14) {
            throw new JOSEException("Couldn't encrypt Content Encryption Key (CEK): " + e14.getMessage(), e14);
        }
    }
}
