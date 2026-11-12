package com.xiaomi.smarthome.library.crypto.rc4coder;

import com.xiaomi.smarthome.library.crypto.Base64Coder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Coder {
    private static final String HMAC_SHA1 = "HmacSHA1";
    public static final String KEY_MAC = "HmacMD5";
    public static final String KEY_MD5 = "MD5";
    public static final String KEY_PBKDF2 = "PBKDF2WithHmacSHA1";
    public static final String KEY_SHA = "SHA";
    private static final String KEY_SHA256 = "SHA-256";

    public static byte[] createPBKDF2Key(char[] cArr, byte[] bArr, int i, int i2) throws InvalidKeySpecException, NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(KEY_PBKDF2).generateSecret(new PBEKeySpec(cArr, bArr, i, i2)).getEncoded();
    }

    public static byte[] decryptBASE64(String str) {
        return Base64Coder.decode(str);
    }

    public static String encryptBASE64(byte[] bArr) {
        return String.valueOf(Base64Coder.encode(bArr));
    }

    public static byte[] encryptHMAC(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, KEY_MAC);
        Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
        mac.init(secretKeySpec);
        return mac.doFinal(bArr);
    }

    public static byte[] encryptHMACSha1(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, HMAC_SHA1);
        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    public static byte[] encryptMD5(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(KEY_MD5);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] encryptSHA(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static String initMacKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_MAC);
        keyGenerator.init(new SecureRandom());
        return encryptBASE64(keyGenerator.generateKey().getEncoded());
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static byte[] sha256Hash(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] encryptMD5(byte[]... bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(KEY_MD5);
        for (byte[] bArr2 : bArr) {
            if (!isEmpty(bArr2)) {
                messageDigest.update(bArr2);
            }
        }
        return messageDigest.digest();
    }

    public static byte[] encryptHMAC(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(decryptBASE64(str), KEY_MAC);
        Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
        mac.init(secretKeySpec);
        return mac.doFinal(bArr);
    }
}
