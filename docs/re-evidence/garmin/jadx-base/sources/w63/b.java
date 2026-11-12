package w63;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e.a f183326a = new e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f183327b = -1234567890;

    public static final boolean a(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        bArr.getClass();
        bArr2.getClass();
        for (int i17 = 0; i17 < i16; i17++) {
            if (bArr[i17 + i14] != bArr2[i17 + i15]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j8, long j14, long j15) {
        if ((j14 | j15) < 0 || j14 > j8 || j8 - j14 < j15) {
            StringBuilder sbK = ds.e0.k(j8, "size=", " offset=");
            sbK.append(j14);
            sbK.append(" byteCount=");
            sbK.append(j15);
            throw new ArrayIndexOutOfBoundsException(sbK.toString());
        }
    }

    public static final String c(byte b14) {
        char[] cArr = x63.b.f189310a;
        return new String(new char[]{cArr[(b14 >> 4) & 15], cArr[b14 & Ascii.SI]});
    }

    public static final String d(int i14) {
        if (i14 == 0) {
            return "0";
        }
        char[] cArr = x63.b.f189310a;
        int i15 = 0;
        char[] cArr2 = {cArr[(i14 >> 28) & 15], cArr[(i14 >> 24) & 15], cArr[(i14 >> 20) & 15], cArr[(i14 >> 16) & 15], cArr[(i14 >> 12) & 15], cArr[(i14 >> 8) & 15], cArr[(i14 >> 4) & 15], cArr[i14 & 15]};
        while (i15 < 8 && cArr2[i15] == '0') {
            i15++;
        }
        p13.c.f134916a.getClass();
        p13.c.a.a(i15, 8, 8);
        return new String(cArr2, i15, 8 - i15);
    }
}
