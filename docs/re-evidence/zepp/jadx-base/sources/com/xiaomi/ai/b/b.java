package com.xiaomi.ai.b;

import com.xiaomi.ai.log.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    public static String a(String str) {
        String str2;
        if (f.a(str)) {
            return null;
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            str2 = "UnsupportedEncodingException";
            Logger.d("DigestUtils", str2);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "NoSuchAlgorithmException";
            Logger.d("DigestUtils", str2);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }
}
