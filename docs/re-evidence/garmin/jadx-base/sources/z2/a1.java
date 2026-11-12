package z2;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201518a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201518a = iArr;
        }
    }

    public static final v1 a(s5.q0 q0Var, int i14, int i15, int i16, long j8, boolean z14, boolean z15) {
        b0 b0Var;
        if (z14) {
            b0Var = null;
        } else {
            s5.w0.a aVar = s5.w0.f157315b;
            int i17 = (int) (j8 >> 32);
            int i18 = (int) (4294967295L & j8);
            b0Var = new b0(new b0.a(w3.x.n(q0Var, i17), i17, 1L), new b0.a(w3.x.n(q0Var, i18), i18, 1L), s5.w0.i(j8));
        }
        return new v1(z15, 1, 1, b0Var, new z(1L, 1, i14, i15, i16, q0Var));
    }

    public static final h b(h hVar, h hVar2) {
        int[] iArr = a.f201518a;
        int i14 = iArr[hVar2.ordinal()];
        if (i14 == 1) {
            return h.BEFORE;
        }
        if (i14 != 2) {
            if (i14 == 3) {
                return h.AFTER;
            }
            lc.u0.r();
            return null;
        }
        int i15 = iArr[hVar.ordinal()];
        if (i15 == 1) {
            return h.BEFORE;
        }
        if (i15 == 2) {
            return h.ON;
        }
        if (i15 == 3) {
            return h.AFTER;
        }
        lc.u0.r();
        return null;
    }
}
