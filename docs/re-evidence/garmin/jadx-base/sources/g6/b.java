package g6;

import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final long a(int i14, int i15, int i16, int i17) {
        if (!((i16 >= 0) & (i15 >= i14) & (i17 >= i16) & (i14 >= 0))) {
            j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i14, i15, i16, i17);
    }

    public static /* synthetic */ long b(int i14, int i15, int i16) {
        if ((i16 & 2) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        if ((i16 & 8) != 0) {
            i15 = Integer.MAX_VALUE;
        }
        return a(0, i14, 0, i15);
    }

    public static final int c(int i14) {
        if (i14 < 8191) {
            return 13;
        }
        if (i14 < 32767) {
            return 15;
        }
        if (i14 < 65535) {
            return 16;
        }
        return i14 < 262143 ? 18 : 255;
    }

    public static final long d(long j8, long j14) {
        int i14 = (int) (j14 >> 32);
        int iL = a.l(j8);
        int iJ = a.j(j8);
        if (i14 < iL) {
            i14 = iL;
        }
        if (i14 <= iJ) {
            iJ = i14;
        }
        int i15 = (int) (j14 & 4294967295L);
        int iK = a.k(j8);
        int i16 = a.i(j8);
        if (i15 < iK) {
            i15 = iK;
        }
        if (i15 <= i16) {
            i16 = i15;
        }
        long j15 = (((long) iJ) << 32) | (((long) i16) & 4294967295L);
        m.a aVar = m.f76012b;
        return j15;
    }

    public static final long e(long j8, long j14) {
        int iL = a.l(j8);
        int iJ = a.j(j8);
        int iK = a.k(j8);
        int i14 = a.i(j8);
        int iL2 = a.l(j14);
        if (iL2 < iL) {
            iL2 = iL;
        }
        if (iL2 > iJ) {
            iL2 = iJ;
        }
        int iJ2 = a.j(j14);
        if (iJ2 >= iL) {
            iL = iJ2;
        }
        if (iL <= iJ) {
            iJ = iL;
        }
        int iK2 = a.k(j14);
        if (iK2 < iK) {
            iK2 = iK;
        }
        if (iK2 > i14) {
            iK2 = i14;
        }
        int i15 = a.i(j14);
        if (i15 >= iK) {
            iK = i15;
        }
        if (iK <= i14) {
            i14 = iK;
        }
        return a(iL2, iJ, iK2, i14);
    }

    public static final int f(int i14, long j8) {
        int iK = a.k(j8);
        int i15 = a.i(j8);
        if (i14 < iK) {
            i14 = iK;
        }
        return i14 > i15 ? i15 : i14;
    }

    public static final int g(int i14, long j8) {
        int iL = a.l(j8);
        int iJ = a.j(j8);
        if (i14 < iL) {
            i14 = iL;
        }
        return i14 > iJ ? iJ : i14;
    }

    public static final long h(int i14, int i15, int i16, int i17) {
        int i18 = i17 == Integer.MAX_VALUE ? i16 : i17;
        int iC = c(i18);
        int i19 = i15 == Integer.MAX_VALUE ? i14 : i15;
        int iC2 = c(i19);
        if (iC + iC2 > 31) {
            k(i19, i18);
        }
        int i24 = i15 + 1;
        int i25 = i17 + 1;
        int i26 = iC2 - 13;
        long j8 = (((long) (i24 & (~(i24 >> 31)))) << 33) | ((long) ((i26 >> 1) + (i26 & 1))) | (((long) i14) << 2) | (((long) i16) << (iC2 + 2)) | (((long) (i25 & (~(i25 >> 31)))) << (iC2 + 33));
        a.C1525a c1525a = a.f75987b;
        return j8;
    }

    public static final long i(int i14, int i15, long j8) {
        int iL = a.l(j8) + i14;
        if (iL < 0) {
            iL = 0;
        }
        int iJ = a.j(j8);
        if (iJ != Integer.MAX_VALUE && (iJ = iJ + i14) < 0) {
            iJ = 0;
        }
        int iK = a.k(j8) + i15;
        if (iK < 0) {
            iK = 0;
        }
        int i16 = a.i(j8);
        return a(iL, iJ, iK, (i16 == Integer.MAX_VALUE || (i16 = i16 + i15) >= 0) ? i16 : 0);
    }

    public static /* synthetic */ long j(int i14, int i15, int i16, long j8) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        return i(i14, i15, j8);
    }

    public static final void k(int i14, int i15) {
        throw new IllegalArgumentException(am.j.g(i14, i15, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void l(int i14) {
        throw new IllegalArgumentException(e0.f(i14, "Can't represent a size of ", " in Constraints"));
    }
}
