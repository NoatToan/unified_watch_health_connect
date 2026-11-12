package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class kcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f23714a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f23715b = BigInteger.valueOf(1);
    public static final BigInteger c = BigInteger.valueOf(2);
    public static final BigInteger d = BigInteger.valueOf(4);
    public static final int[] e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    public static SecureRandom f = null;
    public static final int[] g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
