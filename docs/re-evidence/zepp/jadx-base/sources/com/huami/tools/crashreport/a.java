package com.huami.tools.crashreport;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes15.dex */
class a {
    public static final Charset c;
    private static final byte[] d;
    private static final int e = 10;
    private static final int f = 256;
    private static volatile a g;
    private final Object a = new Object();
    private volatile SecretKeyFactory b;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        c = charsetForName;
        d = "thisisasaltfor2018huami".getBytes(charsetForName);
    }

    private a() {
    }

    public static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), c);
    }

    public static a b() {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a();
                }
            }
        }
        return g;
    }

    private SecretKeyFactory d() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    try {
                        this.b = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                    } catch (NoSuchAlgorithmException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return this.b;
    }

    private byte[] e(String str, byte[] bArr, int i, int i2) {
        SecretKey secretKeyGenerateSecret;
        SecretKeyFactory secretKeyFactoryD = d();
        if (secretKeyFactoryD == null) {
            return null;
        }
        try {
            secretKeyGenerateSecret = secretKeyFactoryD.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i, i2));
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
            secretKeyGenerateSecret = null;
        }
        if (secretKeyGenerateSecret != null) {
            return secretKeyGenerateSecret.getEncoded();
        }
        return null;
    }

    public String c(String str) {
        byte[] bArrE = e(str, d, 10, 256);
        return bArrE == null ? "" : a(bArrE);
    }
}
