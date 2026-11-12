package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes20.dex */
public class ylv {
    public static String e(String str, SecretKey secretKey) {
        if (str == null || secretKey == null) {
            return "";
        }
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKey);
            return c(mac.doFinal(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            yit.b("HmacSha256Util", "getHmacSha256 UnsupportedEncodingException");
            return "";
        } catch (InvalidKeyException unused2) {
            yit.b("HmacSha256Util", "getHmacSha256 InvalidKeyException");
            return "";
        } catch (NoSuchAlgorithmException unused3) {
            yit.b("HmacSha256Util", "getHmacSha256 NoSuchAlgorithmException");
            return "";
        }
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            return "";
        }
        try {
            return e(str, new SecretKeySpec(str2.getBytes("UTF-8"), "HmacSHA256"));
        } catch (UnsupportedEncodingException unused) {
            yit.b("HmacSha256Util", "getHmacSha256 UnsupportedEncodingException");
            return "";
        }
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toUpperCase(Locale.US).trim();
    }
}
