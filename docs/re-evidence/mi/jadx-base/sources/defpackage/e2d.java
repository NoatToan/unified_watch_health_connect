package defpackage;

import cn.hutool.core.exceptions.UtilException;

/* JADX INFO: loaded from: classes.dex */
public class e2d {
    public static long a(long j) {
        byte[] bArrC = sjg.c();
        if (bArrC != null) {
            return (((((long) bArrC[bArrC.length - 2]) & 255) | ((((long) bArrC[bArrC.length - 1]) << 8) & 65280)) >> 6) % (j + 1);
        }
        return 1L;
    }

    public static long b(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        try {
            sb.append(h5l.a());
        } catch (UtilException unused) {
        }
        return ((long) (sb.toString().hashCode() & 65535)) % (j2 + 1);
    }
}
