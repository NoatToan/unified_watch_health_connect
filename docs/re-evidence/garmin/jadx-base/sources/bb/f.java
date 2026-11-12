package bb;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static void a(long j8, fa.r rVar, l0[] l0VarArr) {
        int i14;
        int iU;
        while (true) {
            if (rVar.a() <= 1) {
                return;
            }
            int i15 = 0;
            while (true) {
                if (rVar.a() == 0) {
                    i14 = -1;
                    break;
                }
                int iU2 = rVar.u();
                i15 += iU2;
                if (iU2 != 255) {
                    i14 = i15;
                    break;
                }
            }
            int i16 = 0;
            do {
                if (rVar.a() == 0) {
                    i16 = -1;
                    break;
                } else {
                    iU = rVar.u();
                    i16 += iU;
                }
            } while (iU == 255);
            int i17 = rVar.f70055b + i16;
            if (i16 == -1 || i16 > rVar.a()) {
                fa.k.g("Skipping remainder of malformed SEI NAL unit.");
                i17 = rVar.f70056c;
            } else if (i14 == 4 && i16 >= 8) {
                int iU3 = rVar.u();
                int iA = rVar.A();
                int iG = iA == 49 ? rVar.g() : 0;
                int iU4 = rVar.u();
                if (iA == 47) {
                    rVar.H(1);
                }
                boolean z14 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z14 &= iG == 1195456820;
                }
                if (z14) {
                    b(j8, rVar, l0VarArr);
                }
            }
            rVar.G(i17);
        }
    }

    public static void b(long j8, fa.r rVar, l0[] l0VarArr) {
        int iU = rVar.u();
        if ((iU & 64) != 0) {
            rVar.H(1);
            int i14 = (iU & 31) * 3;
            int i15 = rVar.f70055b;
            for (l0 l0Var : l0VarArr) {
                rVar.G(i15);
                l0Var.f(i14, rVar);
                fa.a.d(j8 != C.TIME_UNSET);
                l0Var.c(j8, 1, i14, 0, null);
            }
        }
    }
}
