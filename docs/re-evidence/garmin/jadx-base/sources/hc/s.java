package hc;

import com.google.common.math.IntMath;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f83148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83149c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f83153d;

        private c(int i14, int i15, int i16, byte[] bArr) {
            this.f83150a = i14;
            this.f83151b = i15;
            this.f83152c = i16;
            this.f83153d = bArr;
        }
    }

    private s() {
    }

    public static int a(fa.q qVar, int i14, int i15, int i16) {
        fa.a.a(Math.max(Math.max(i14, i15), i16) <= 31);
        int i17 = (1 << i14) - 1;
        int i18 = (1 << i15) - 1;
        IntMath.checkedAdd(IntMath.checkedAdd(i17, i18), 1 << i16);
        if (qVar.b() < i14) {
            return -1;
        }
        int iG = qVar.g(i14);
        if (iG == i17) {
            if (qVar.b() < i15) {
                return -1;
            }
            int iG2 = qVar.g(i15);
            iG += iG2;
            if (iG2 == i18) {
                if (qVar.b() < i16) {
                    return -1;
                }
                return qVar.g(i16) + iG;
            }
        }
        return iG;
    }

    public static void b(fa.q qVar) {
        qVar.o(3);
        qVar.o(8);
        boolean zF = qVar.f();
        boolean zF2 = qVar.f();
        if (zF) {
            qVar.o(5);
        }
        if (zF2) {
            qVar.o(6);
        }
    }

    public static void c(fa.q qVar) {
        int iG;
        int iG2 = qVar.g(2);
        if (iG2 == 0) {
            qVar.o(6);
            return;
        }
        int iA = a(qVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            qVar.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = qVar.f();
            int i14 = zF ? 1 : 5;
            int i15 = zF ? 7 : 5;
            int i16 = zF ? 8 : 6;
            int i17 = 0;
            while (i17 < iA) {
                if (qVar.f()) {
                    qVar.o(7);
                    iG = 0;
                } else {
                    if (qVar.g(2) == 3 && qVar.g(i15) * i14 != 0) {
                        qVar.n();
                    }
                    iG = qVar.g(i16) * i14;
                    if (iG != 0 && iG != 180) {
                        qVar.n();
                    }
                    qVar.n();
                }
                if (iG != 0 && iG != 180 && qVar.f()) {
                    i17++;
                }
                i17++;
            }
        }
    }
}
