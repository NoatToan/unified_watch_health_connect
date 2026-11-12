package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public class nbj {
    public static SecureRandom a(byte[] bArr) {
        return bArr == null ? new SecureRandom() : new SecureRandom(bArr);
    }

    public static ThreadLocalRandom b() {
        return ThreadLocalRandom.current();
    }

    public static SecureRandom c() {
        return d(null);
    }

    public static SecureRandom d(byte[] bArr) {
        return a(bArr);
    }

    public static byte[] e(int i) {
        byte[] bArr = new byte[i];
        b().nextBytes(bArr);
        return bArr;
    }

    public static int f(int i) {
        return b().nextInt(i);
    }

    public static String g(int i) {
        return h("abcdefghijklmnopqrstuvwxyz0123456789", i);
    }

    public static String h(String str, int i) {
        if (tt3.G(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i);
        if (i < 1) {
            i = 1;
        }
        int length = str.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str.charAt(f(length)));
        }
        return sb.toString();
    }
}
