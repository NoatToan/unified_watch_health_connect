package defpackage;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class jwe {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            StringBuilder sb = new StringBuilder();
            messageDigest.update(bArr, 0, bArr.length);
            for (byte b2 : messageDigest.digest()) {
                sb.append(b(b2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String b(byte b2) {
        int i = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }
}
