package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hwlogsmodel.LogUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes7.dex */
public class ecn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f32746c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1'};

    public static int b(int i, int i2) {
        return (i - 1) | (((i2 >> 4) - 1) << 5);
    }

    public static byte[] b() {
        return new byte[16];
    }

    public static String a() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            return Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.e("GenerateUtil", "generateKey catch NoSuchAlgorithmException");
            return "";
        }
    }

    public static byte[] e(int i) {
        byte[] bArr = new byte[i];
        qrf.b().nextBytes(bArr);
        return bArr;
    }

    public static int e(byte[] bArr) {
        if (bArr == null) {
            return 255;
        }
        int i = 255;
        for (byte b2 : bArr) {
            i ^= b2 & 255;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = i & 1;
                i >>= 1;
                if (i3 != 0) {
                    i ^= 184;
                }
            }
        }
        return i;
    }

    public static int e() {
        return new SecureRandom().nextInt(920) + 58080;
    }

    public static String a(int i) {
        if (i <= 0) {
            LogUtil.j("GenerateUtil", "parameter is null!");
            return "";
        }
        SecureRandom secureRandom = new SecureRandom();
        char[] cArr = new char[i];
        int iNextInt = secureRandom.nextInt();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i % 5) {
            cArr[i3] = f32746c[iNextInt & 63];
            iNextInt >>= 6;
            i2++;
            i3++;
        }
        for (int i4 = 0; i4 < i / 5; i4++) {
            int iNextInt2 = secureRandom.nextInt();
            int i5 = 0;
            while (i5 < 5) {
                cArr[i3] = f32746c[iNextInt2 & 63];
                iNextInt2 >>= 6;
                i5++;
                i3++;
            }
        }
        return new String(cArr, 0, i);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("GenerateUtil", "illegal argument!");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            stringBuffer.append(str);
            stringBuffer.append(".");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }
}
