package defpackage;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public final class e3s {
    public static String a(String str) {
        String str2;
        if (yrs.b(str)) {
            return null;
        }
        try {
            return b(MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            str2 = "UnsupportedEncodingException";
            wpe.e("DigestUtils", str2);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "NoSuchAlgorithmException";
            wpe.e("DigestUtils", str2);
            return null;
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }
}
