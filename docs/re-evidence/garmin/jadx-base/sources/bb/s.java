package bb;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17253a;
    }

    private s() {
    }

    public static boolean a(fa.r rVar, v vVar, int i14, a aVar) {
        long jW = rVar.w();
        long j8 = jW >>> 16;
        if (j8 != i14) {
            return false;
        }
        boolean z14 = (j8 & 1) == 1;
        int i15 = (int) ((jW >> 12) & 15);
        int i16 = (int) ((jW >> 8) & 15);
        int i17 = (int) ((jW >> 4) & 15);
        int i18 = (int) ((jW >> 1) & 7);
        boolean z15 = (jW & 1) == 1;
        if (i17 <= 7) {
            if (i17 != vVar.f17263g - 1) {
                return false;
            }
        } else if (i17 > 10 || vVar.f17263g != 2) {
            return false;
        }
        if (!(i18 == 0 || i18 == vVar.f17265i) || z15) {
            return false;
        }
        try {
            long jB = rVar.B();
            if (!z14) {
                jB *= (long) vVar.f17258b;
            }
            aVar.f17253a = jB;
            int iB = b(i15, rVar);
            if (iB == -1 || iB > vVar.f17258b) {
                return false;
            }
            int i19 = vVar.f17261e;
            if (i16 != 0) {
                if (i16 <= 11) {
                    if (i16 != vVar.f17262f) {
                        return false;
                    }
                } else if (i16 != 12) {
                    if (i16 > 14) {
                        return false;
                    }
                    int iA = rVar.A();
                    if (i16 == 14) {
                        iA *= 10;
                    }
                    if (iA != i19) {
                        return false;
                    }
                } else if (rVar.u() * 1000 != i19) {
                    return false;
                }
            }
            int iU = rVar.u();
            int i24 = rVar.f70055b;
            byte[] bArr = rVar.f70054a;
            int i25 = i24 - 1;
            int i26 = 0;
            for (int i27 = rVar.f70055b; i27 < i25; i27++) {
                i26 = fa.z.f70085o[i26 ^ (bArr[i27] & UnsignedBytes.MAX_VALUE)];
            }
            int i28 = fa.z.f70071a;
            return iU == i26;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i14, fa.r rVar) {
        switch (i14) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i14 - 2);
            case 6:
                return rVar.u() + 1;
            case 7:
                return rVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i14 - 8);
            default:
                return -1;
        }
    }
}
