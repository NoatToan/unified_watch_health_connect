package com.xiaomi.ai.android.utils;

import android.util.Log;
import com.xiaomi.ai.log.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    public static int a(String str) {
        int i = 0;
        int i2 = 1;
        for (byte b : str.getBytes()) {
            i2 = (i2 + b) % 65521;
            i = (i + i2) % 65521;
        }
        return (i << 16) | i2;
    }

    public static String a(int i) {
        byte[] bArr = new byte[(i + 1) / 2];
        new SecureRandom().nextBytes(bArr);
        return a(bArr).replace(":", "").substring(0, i);
    }

    public static String a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger.d("DigestUtil", Log.getStackTraceString(e));
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
                sb.append(JsonLexerKt.COLON);
            }
        }
        return sb.toString();
    }
}
