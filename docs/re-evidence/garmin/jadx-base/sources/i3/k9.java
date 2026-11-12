package i3;

/* JADX INFO: loaded from: classes.dex */
public final class k9 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88681a;

        static {
            int[] iArr = new int[n3.h0.values().length];
            try {
                iArr[n3.h0.DefaultSpatial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.h0.FastSpatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n3.h0.SlowSpatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n3.h0.DefaultEffects.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n3.h0.FastEffects.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n3.h0.SlowEffects.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f88681a = iArr;
        }
    }

    public static final <T> s1.f0<T> a(j9 j9Var, n3.h0 h0Var) {
        switch (a.f88681a[h0Var.ordinal()]) {
            case 1:
                return j9Var.c();
            case 2:
                return j9Var.d();
            case 3:
                return j9Var.a();
            case 4:
                return j9Var.f();
            case 5:
                return j9Var.b();
            case 6:
                return j9Var.e();
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final s1.f0 b(n3.h0 h0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return a((j9) mVar.A(u7.f89886a), h0Var);
    }
}
