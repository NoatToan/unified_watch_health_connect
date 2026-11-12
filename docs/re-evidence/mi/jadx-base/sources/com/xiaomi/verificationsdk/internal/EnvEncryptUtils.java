package com.xiaomi.verificationsdk.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.utils.AESCoder;
import com.xiaomi.passport.utils.PassportEnvEncryptUtils;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public class EnvEncryptUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f14351a = "-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWgAwIBAgIJAOMjETkYAg3lMA0GCSqGSIb3DQEBCwUAMEUxCzAJBgNV\nBAYTAkFVMRMwEQYDVQQIDApTb21lLVN0YXRlMSEwHwYDVQQKDBhJbnRlcm5ldCBX\naWRnaXRzIFB0eSBMdGQwHhcNMTgwMTExMDk0ODQ3WhcNMTgwMjEwMDk0ODQ3WjBF\nMQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEhMB8GA1UECgwYSW50\nZXJuZXQgV2lkZ2l0cyBQdHkgTHRkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\nCgKCAQEArxfNLkuAQ/BYHzkzVwtug+0abmYRBVCEScSzGxJIOsfxVzcuqaKO87H2\no2wBcacD3bRHhMjTkhSEqxPjQ/FEXuJ1cdbmr3+b3EQR6wf/cYcMx2468/QyVoQ7\nBADLSPecQhtgGOllkC+cLYN6Md34Uii6U+VJf0p0q/saxUTZvhR2ka9fqJ4+6C6c\nOghIecjMYQNHIaNW+eSKunfFsXVU+QfMD0q2EM9wo20aLnos24yDzRjh9HJc6xfr\n37jRlv1/boG/EABMG9FnTm35xWrVR0nw3cpYF7GZg13QicS/ZwEsSd4HyboAruMx\nJBPvK3Jdr4ZS23bpN0cavWOJsBqZVwIDAQABo1AwTjAdBgNVHQ4EFgQU0AWcCdJQ\nruwyc3Hjt2dEmYXmUCUwHwYDVR0jBBgwFoAU0AWcCdJQruwyc3Hjt2dEmYXmUCUw\nDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOCAQEASssjoOG4RbRjy6ivCDkZ\nteOLur7jQ6/AZru8n8Fow8WGd9zM1uFZs9+c6okvlmUeCPuOiYDxps6xfL23hkQc\nKghkMofjBn2eLoqTiQ+woAoZHAqLuiFUHae85KH7185EV8NTm2LpJJoqh2x5KU4Q\nlCWm+5uadtqPEbO9wmI1er5Kob/njPI0QtQn2/5H9u7t71MCjHIGuQ5OSrZmmyzV\nTFUVbdkf0mwoL44JO7ErbdOQ/nq+dElYiGnq7tI9gdt78k3Pgi7ykU5W7pnDbxLN\no66M6umwCy2ies0zzsxS9pKzurddXd+Zt4NBh74MV0RCf2PbDCtUODTBowLeDluq\nXw==\n-----END CERTIFICATE-----\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile PublicKey f14352b;
    public static volatile SecretKey c;
    public static volatile String d;

    public static class EncryptException extends Exception {
        public EncryptException(Throwable th) {
            super(th);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14354b;
    }

    public static String a(String str, SecretKey secretKey) throws EncryptException {
        try {
            return new AESCoder(secretKey.getEncoded()).encrypt(str);
        } catch (CipherException e) {
            throw new EncryptException(e);
        }
    }

    public static a b(String str) throws EncryptException {
        a aVar = new a();
        synchronized (PassportEnvEncryptUtils.class) {
            try {
                if (c == null || d == null) {
                    c = e();
                    d = h(Base64.encodeToString(c.getEncoded(), 10), f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f14353a = a(str, c);
        aVar.f14354b = d;
        return aVar;
    }

    public static String c(String str, Key key, String str2) throws EncryptException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(Base64.encode(d(str.getBytes("UTF-8"), key, str2), 10), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new EncryptException(e);
        }
    }

    public static byte[] d(byte[] bArr, Key key, String str) throws EncryptException {
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, key);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new EncryptException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new EncryptException(e2);
        } catch (BadPaddingException e3) {
            throw new EncryptException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new EncryptException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new EncryptException(e5);
        }
    }

    public static SecretKey e() throws EncryptException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptException(e);
        }
    }

    public static PublicKey f() throws EncryptException {
        if (f14352b != null) {
            return f14352b;
        }
        try {
            f14352b = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(f14351a.getBytes("UTF-8")))).getPublicKey();
            return f14352b;
        } catch (UnsupportedEncodingException e) {
            throw new EncryptException(e);
        } catch (CertificateException e2) {
            throw new EncryptException(e2);
        }
    }

    public static String g() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }

    public static String h(String str, PublicKey publicKey) throws EncryptException {
        return c(str, publicKey, SignUtils.CIPHER_RSA);
    }
}
