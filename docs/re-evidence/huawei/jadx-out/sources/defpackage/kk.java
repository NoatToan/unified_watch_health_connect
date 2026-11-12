package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class kk {
    public static String b(String str) {
        try {
            if (kj.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
