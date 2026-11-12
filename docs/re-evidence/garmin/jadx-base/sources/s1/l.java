package s1;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static m0 a(a0 a0Var, y0 y0Var, int i14) {
        if ((i14 & 2) != 0) {
            y0Var = y0.Restart;
        }
        return new m0(a0Var, y0Var, m1.a(0), (p005kotlin.jvm.internal.j) null);
    }

    public static h1 b() {
        return new h1(0);
    }

    public static j1 c(int i14, float f14, float f15, Object obj) {
        if ((i14 & 1) != 0) {
            f14 = 1.0f;
        }
        if ((i14 & 2) != 0) {
            f15 = 1500.0f;
        }
        if ((i14 & 4) != 0) {
            obj = null;
        }
        return new j1(f14, f15, obj);
    }

    public static b2 d(int i14, int i15, b0 b0Var, int i16) {
        if ((i16 & 1) != 0) {
            i14 = 300;
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        if ((i16 & 4) != 0) {
            b0Var = e0.f155560a;
        }
        return new b2(i14, i15, b0Var);
    }
}
