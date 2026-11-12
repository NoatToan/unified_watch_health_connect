package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class da8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15300a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static char[] a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f15300a;
            cArr[i] = cArr2[(b2 & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return cArr;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            tpe.i("EncryptUtil", "getMD5String error, null value");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.reset();
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            String str2 = new String(a(messageDigest.digest()));
            tpe.a("EncryptUtil", "getMD5String result value=" + str + ", md5=" + str2);
            return str2;
        } catch (Exception e) {
            tpe.d("EncryptUtil", "MessageDigest hex MD5 error", e);
            return str;
        }
    }
}
