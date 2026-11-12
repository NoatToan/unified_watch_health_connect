package com.google.android.gms.internal.fitness;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhc {
    public static final Charset a = Charset.forName("UTF-8");
    private static final Charset b = Charset.forName("ISO-8859-1");
    private static final ByteBuffer c;
    private static final zzgj d;
    public static final byte[] zzyl;

    static {
        byte[] bArr = new byte[0];
        zzyl = bArr;
        c = ByteBuffer.wrap(bArr);
        d = zzgj.a(bArr, 0, bArr.length, false);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static <T> T c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static Object d(Object obj, Object obj2) {
        return ((zzik) obj).zzbt().zza((zzik) obj2).zzbz();
    }

    public static boolean e(zzik zzikVar) {
        if (!(zzikVar instanceof zzfq)) {
            return false;
        }
        return false;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int iB = b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public static int zzc(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zzc(byte[] bArr) {
        return u4.e(bArr);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int zzj(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
