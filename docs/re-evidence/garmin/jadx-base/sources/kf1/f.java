package kf1;

import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104634a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TOLERANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.NORMAL_IMPACT_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.ABOVE_TOLERANCE_IMPACT_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.REAL_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104634a = iArr;
        }
    }

    public static final long a(e eVar, m mVar) {
        eVar.getClass();
        x1 x1Var = n.f135158a;
        int i14 = a.f104634a[eVar.ordinal()];
        if (i14 == 1) {
            mVar.C(1031360261);
            gl.c.f77766a.getClass();
            long jF = gl.c.a(mVar).f();
            mVar.f();
            return jF;
        }
        if (i14 == 2) {
            mVar.C(1031363010);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(mVar).b();
            mVar.f();
            return jB;
        }
        if (i14 == 3) {
            mVar.C(1031365956);
            gl.c.f77766a.getClass();
            long jH = gl.c.a(mVar).h();
            mVar.f();
            return jH;
        }
        if (i14 != 4) {
            throw n23.j.m(mVar, 1031358166);
        }
        mVar.C(1031368514);
        gl.c.f77766a.getClass();
        long jN = gl.c.a(mVar).n();
        mVar.f();
        return jN;
    }

    public static final long b(e eVar, m mVar) {
        eVar.getClass();
        x1 x1Var = n.f135158a;
        int i14 = a.f104634a[eVar.ordinal()];
        if (i14 == 1) {
            mVar.C(1268143482);
            gl.c.f77766a.getClass();
            long jF = gl.c.a(mVar).f();
            mVar.f();
            return jF;
        }
        if (i14 == 2) {
            mVar.C(1268146388);
            d92.b.f58623a.getClass();
            long jG = d92.b.a(mVar).c().g();
            mVar.f();
            return jG;
        }
        if (i14 == 3) {
            mVar.C(1268149396);
            d92.b.f58623a.getClass();
            long jG2 = d92.b.a(mVar).c().g();
            mVar.f();
            return jG2;
        }
        if (i14 != 4) {
            throw n23.j.m(mVar, 1268141389);
        }
        mVar.C(1268151799);
        gl.c.f77766a.getClass();
        long jN = gl.c.a(mVar).n();
        mVar.f();
        return jN;
    }
}
