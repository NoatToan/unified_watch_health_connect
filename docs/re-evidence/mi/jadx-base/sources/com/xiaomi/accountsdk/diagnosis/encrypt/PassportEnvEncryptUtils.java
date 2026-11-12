package com.xiaomi.accountsdk.diagnosis.encrypt;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.accountsdk.utils.RSACoder;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class PassportEnvEncryptUtils {

    public static class EncryptException extends Exception {
        public EncryptException(Throwable th) {
            super(th);
        }
    }

    public static class EncryptResult {
        public String content;
        public String encryptedKey;
    }

    private static String a(String str, SecretKey secretKey) throws EncryptException {
        try {
            return new a(secretKey.getEncoded()).a(str);
        } catch (b e) {
            throw new EncryptException(e);
        }
    }

    public static EncryptResult encrypt(String str) throws EncryptException {
        EncryptResult encryptResult = new EncryptResult();
        SecretKey secretKeyA = a();
        try {
            String strEncodeToString = Base64.encodeToString(f.a(Base64.encode(secretKeyA.getEncoded(), 10), f.a(RSACoder.SPECIFIED_RSA_PUBLIC_KEY)), 10);
            encryptResult.content = a(str, secretKeyA);
            encryptResult.encryptedKey = strEncodeToString;
            return encryptResult;
        } catch (c e) {
            throw new EncryptException(e);
        }
    }

    private static SecretKey a() throws EncryptException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(new SecureRandom());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptException(e);
        }
    }

    public static EncryptResult encrypt(String[] strArr) {
        return encrypt(TextUtils.join(":", strArr));
    }
}
