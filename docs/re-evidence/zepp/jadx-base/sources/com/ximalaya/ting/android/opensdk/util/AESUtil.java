package com.ximalaya.ting.android.opensdk.util;

import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes22.dex */
public class AESUtil {
    private static final Charset CHARSET_UTF_8 = Charset.forName("utf-8");
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String KEY_ALGORITHM = "AES";

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            cipher.init(2, getSecretKey(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String decryptAsString(String str, String str2) {
        Charset charset = CHARSET_UTF_8;
        return decryptAsString(str.getBytes(charset), str2.getBytes(charset));
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            cipher.init(1, getSecretKey(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encryptAsString(String str, String str2) {
        Charset charset = CHARSET_UTF_8;
        return encryptAsString(str.getBytes(charset), str2.getBytes(charset));
    }

    private static SecretKey getSecretKey(byte[] bArr) throws Exception {
        return new SecretKeySpec(bArr, "AES");
    }

    public static String decryptAsString(byte[] bArr, byte[] bArr2) {
        return new String(decrypt(bArr, bArr2));
    }

    public static String encryptAsString(byte[] bArr, byte[] bArr2) {
        return new String(encrypt(bArr, bArr2));
    }

    public static byte[] decrypt(String str, String str2) {
        Charset charset = CHARSET_UTF_8;
        return decrypt(str.getBytes(charset), str2.getBytes(charset));
    }

    public static byte[] encrypt(String str, String str2) {
        try {
            Charset charset = CHARSET_UTF_8;
            return encrypt(str.getBytes(charset), str2.getBytes(charset));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
