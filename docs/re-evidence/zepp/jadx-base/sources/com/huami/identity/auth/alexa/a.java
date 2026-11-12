package com.huami.identity.auth.alexa;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
class a {
    private static a b;
    private String a;

    private a() {
    }

    private String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private String c() {
        return a(d());
    }

    @SuppressLint({"TrulyRandom"})
    private byte[] d() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static a f() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public String b(String str, String str2) throws NoSuchAlgorithmException {
        if (ConstantsKt.SHA_256.equalsIgnoreCase(str2)) {
            return a(MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        }
        if (ConstantsKt.PLAIN.equalsIgnoreCase(str2)) {
            return str;
        }
        throw new NoSuchAlgorithmException();
    }

    public String e() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            this.a = c();
        }
        return this.a;
    }
}
