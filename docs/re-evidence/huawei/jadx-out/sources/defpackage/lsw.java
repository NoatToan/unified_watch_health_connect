package defpackage;

import health.compact.a.ReleaseLogUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class lsw {
    public static SecureRandom e() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            ReleaseLogUtil.b("R_SecureRandomUtil", "getSecureRandom exception ", e);
            return new SecureRandom();
        }
    }

    public static int b(int i) {
        if (i <= 0) {
            ReleaseLogUtil.d("R_SecureRandomUtil", "getSecureRandomForInt bound ", Integer.valueOf(i));
            return 0;
        }
        return e().nextInt(i);
    }

    public static int d(long j, int i, int i2) {
        if (j <= i) {
            return b(i2);
        }
        return 0;
    }

    public static int e(int i, int i2) {
        return e(lsl.r(System.currentTimeMillis()), i, i2);
    }

    public static int e(long j, int i, int i2) {
        return d(Math.abs(System.currentTimeMillis() - j), i, i2);
    }
}
