package com.xiaomi.ai.android.utils;

import android.util.Log;
import defpackage.wpe;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static int a(String str) {
        int i = 1;
        int i2 = 0;
        for (byte b2 : str.getBytes()) {
            i = (i + b2) % 65521;
            i2 = (i2 + i) % 65521;
        }
        return (i2 << 16) | i;
    }

    public static String a(int i) {
        byte[] bArr = new byte[(i + 1) / 2];
        new SecureRandom().nextBytes(bArr);
        return a(bArr).replace(":", "").substring(0, i);
    }

    public static String a(String str, byte[] bArr) {
        if (bArr == null) {
            wpe.e("DigestUtil", "byteStr is null");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            wpe.e("DigestUtil", Log.getStackTraceString(e));
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString);
            if (i < bArr.length - 1) {
                sb.append(AbstractJsonLexerKt.COLON);
            }
        }
        return sb.toString();
    }
}
