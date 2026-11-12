package oz1;

import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134572a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.VERY_GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.MODERATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.VERY_POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f134572a = iArr;
        }
    }

    public static final long a(j jVar, p3.m mVar) {
        jVar.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f134572a[jVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            mVar.C(-155436737);
            gl.c.f77766a.getClass();
            long jD = gl.c.a(mVar).d();
            mVar.f();
            return jD;
        }
        if (i14 == 3) {
            mVar.C(-155433824);
            gl.c.f77766a.getClass();
            long jH = gl.c.a(mVar).h();
            mVar.f();
            return jH;
        }
        if (i14 == 4 || i14 == 5) {
            mVar.C(-155428515);
            gl.c.f77766a.getClass();
            long jL = gl.c.a(mVar).l();
            mVar.f();
            return jL;
        }
        mVar.C(-155427389);
        gl.c.f77766a.getClass();
        long jG = gl.c.a(mVar).g();
        mVar.f();
        return jG;
    }
}
