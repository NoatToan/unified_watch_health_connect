package defpackage;

import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class cqq {
    public static byte[] d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.d("Sha256", "digest occur NoSuchAlgorithmException.");
            return new byte[0];
        }
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            LogUtil.e("Sha256", "getHashCodeForString source or type is empty.");
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes("UTF-8"));
            return e(messageDigest.digest());
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("Sha256", "getHashCodeForString occur UnsupportedEncodingException.");
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("Sha256", "getHashCodeForString occur NoSuchAlgorithmException.");
            return "";
        }
    }

    private static String e(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            LogUtil.e("Sha256", "getHashCodeForString sourceByte is empty.");
            return "";
        }
        StringBuilder sb = new StringBuilder((bArr.length * 2) + 1);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }
}
