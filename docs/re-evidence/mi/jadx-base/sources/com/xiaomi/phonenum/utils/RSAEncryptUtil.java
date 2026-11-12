package com.xiaomi.phonenum.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.miuipub.internal.hybrid.SignUtils;
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
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes11.dex */
public class RSAEncryptUtil {
    public static String c = "-----BEGIN CERTIFICATE-----\nMIICDzCCAXigAwIBAgIEWMX4OjANBgkqhkiG9w0BAQUFADBMMQswCQYDVQQGEwJD\nTjEPMA0GA1UEChMGeGlhb21pMQ8wDQYDVQQLEwZ4aWFvbWkxGzAZBgNVBAMTEmFj\nY291bnQueGlhb21pLmNvbTAeFw0xNzAzMTMwMTM5MDZaFw0xODAzMTMwMTM5MDZa\nMEwxCzAJBgNVBAYTAkNOMQ8wDQYDVQQKEwZ4aWFvbWkxDzANBgNVBAsTBnhpYW9t\naTEbMBkGA1UEAxMSYWNjb3VudC54aWFvbWkuY29tMIGfMA0GCSqGSIb3DQEBAQUA\nA4GNADCBiQKBgQCRDQSxAwWUmA57Isfphgl7H+QHgw9qObsvZM0Xx1YeDzKYVB62\nypGPcPfxnvD0+EfpdhbsMQYeO495BPPzFk+TsFJl4aR47k9sstxrIu7AFeFbdvGg\nubcEu3y/cAk7CcFE7aqKaW7+WFJzLaPVTj6tn0IUe7lFpHXnBFkpzZMVxwIDAQAB\nMA0GCSqGSIb3DQEBBQUAA4GBAICkoEOZ9OtLeZDSQpTqzq8GfU19C/aJCD6Ex7sl\nYqqXVn/p6AozxihEyvIilM56hyaKlLzNJdxPVRYUim6nv6r+kOwE8i7yDRAfcaZD\nnbBeTATPI7E3iKXLF64gjm3Syq8Pw30Yi2azEdB9U+57GBRa0cxAU6wfhn5GSXM6\nW+j0\n-----END CERTIFICATE-----\n";
    public static volatile PublicKey d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f14019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14020b;

    public static class EncryptException extends Exception {
        public EncryptException(Throwable th) {
            super(th);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14022b;
    }

    public RSAEncryptUtil() throws EncryptException {
        SecretKey secretKeyG = g();
        this.f14019a = secretKeyG;
        this.f14020b = i(Base64.encodeToString(secretKeyG.getEncoded(), 10), h());
    }

    public static String b(String str, SecretKey secretKey) throws EncryptException {
        try {
            return new AESCoder(secretKey.getEncoded()).a(str);
        } catch (AESCoder.CipherException e) {
            throw new EncryptException(e);
        }
    }

    public static String c(String str, SecretKey secretKey) throws EncryptException {
        try {
            return new AESCoder(secretKey.getEncoded()).c(str);
        } catch (AESCoder.CipherException e) {
            throw new EncryptException(e);
        }
    }

    public static String e(String str, Key key, String str2) throws EncryptException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(Base64.encode(f(str.getBytes("UTF-8"), key, str2), 10), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new EncryptException(e);
        }
    }

    public static byte[] f(byte[] bArr, Key key, String str) throws EncryptException {
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

    public static SecretKey g() throws EncryptException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            new SecureRandom();
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptException(e);
        }
    }

    public static PublicKey h() throws EncryptException {
        if (d != null) {
            return d;
        }
        try {
            d = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(c.getBytes("UTF-8")))).getPublicKey();
            return d;
        } catch (UnsupportedEncodingException e) {
            throw new EncryptException(e);
        } catch (CertificateException e2) {
            throw new EncryptException(e2);
        }
    }

    public static String i(String str, PublicKey publicKey) throws EncryptException {
        return e(str, publicKey, SignUtils.CIPHER_RSA);
    }

    public String a(String str) throws EncryptException {
        return b(str, this.f14019a);
    }

    public a d(String str) throws EncryptException {
        a aVar = new a();
        aVar.f14021a = c(str, this.f14019a);
        aVar.f14022b = this.f14020b;
        return aVar;
    }
}
