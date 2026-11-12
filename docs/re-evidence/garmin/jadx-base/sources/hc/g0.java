package hc;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private g0() {
    }

    public static long a(fa.r rVar, int i14, int i15) {
        rVar.G(i14);
        if (rVar.a() < 5) {
            return C.TIME_UNSET;
        }
        int iG = rVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i15 || (iG & 32) == 0 || rVar.u() < 7 || rVar.a() < 7 || (rVar.u() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        rVar.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
