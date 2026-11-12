package com.huami.tools.analytics.internal.utils;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.identity.auth.alexa.ConstantsKt;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.UUID;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public class Crypto {
    public static final Charset UTF_8;
    private static final byte[] c;
    private static final int d = 10;
    private static final int e = 256;
    private static volatile Crypto f;
    private final Object a = new Object();
    private volatile SecretKeyFactory b;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        UTF_8 = charsetForName;
        c = "thisisasaltfor2018huami".getBytes(charsetForName);
    }

    private Crypto() {
    }

    @Nullable
    private SecretKeyFactory a() {
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

    private byte[] b(String str, byte[] bArr, int i, int i2) {
        SecretKey secretKeyGenerateSecret;
        SecretKeyFactory secretKeyFactoryA = a();
        if (secretKeyFactoryA == null) {
            return null;
        }
        try {
            secretKeyGenerateSecret = secretKeyFactoryA.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i, i2));
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
            secretKeyGenerateSecret = null;
        }
        if (secretKeyGenerateSecret != null) {
            return secretKeyGenerateSecret.getEncoded();
        }
        return null;
    }

    public static String base64Encode(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), UTF_8);
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static Crypto get() {
        if (f == null) {
            synchronized (Crypto.class) {
                if (f == null) {
                    f = new Crypto();
                }
            }
        }
        return f;
    }

    @NonNull
    public static String getDigestOrRandomId(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String sha256 = getSHA256(str);
        return sha256.isEmpty() ? UUID.randomUUID().toString() : sha256;
    }

    @NonNull
    public static String getSHA256(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(str.getBytes());
            return c(messageDigest.digest());
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getPbkdf2Digest(String str) {
        byte[] bArrB = b(str, c, 10, 256);
        return bArrB == null ? "" : base64Encode(bArrB);
    }
}
