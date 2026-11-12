package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public class l98 {
    public static String a(byte b2) {
        int i = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
                messageDigest.update(bArr, 0, bArr.length);
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(a(b2));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return "";
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : b(str.getBytes());
    }
}
