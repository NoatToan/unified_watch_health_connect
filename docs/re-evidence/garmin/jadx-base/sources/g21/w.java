package g21;

import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75529a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.BMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.BODY_FAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75529a = iArr;
        }
    }

    public static final long a(v vVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f75529a[vVar.ordinal()];
        if (i14 == 1) {
            mVar.C(-7877699);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jF = gl.c.a(mVar).f();
            mVar.f();
            return jF;
        }
        if (i14 == 2) {
            mVar.C(-7875174);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jR = gl.c.a(mVar).r();
            mVar.f();
            return jR;
        }
        if (i14 != 3) {
            throw n23.j.m(mVar, -7880136);
        }
        mVar.C(-7872578);
        f02.u.f67749a.getClass();
        gl.c.f77766a.getClass();
        long jP = gl.c.a(mVar).p();
        mVar.f();
        return jP;
    }
}
