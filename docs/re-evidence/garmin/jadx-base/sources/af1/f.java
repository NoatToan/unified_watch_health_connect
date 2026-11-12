package af1;

import o4.d0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3086a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f3072e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f3073f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f3074g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f3075h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f3076i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f3077j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f3078k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.f3079l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.f3080m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3086a = iArr;
        }
    }

    public static final long a(e eVar, p3.m mVar) {
        eVar.getClass();
        x1 x1Var = p3.n.f135158a;
        switch (a.f3086a[eVar.ordinal()]) {
            case 1:
                mVar.C(1242114574);
                gl.c.f77766a.getClass();
                long jL = gl.c.a(mVar).l();
                mVar.f();
                return jL;
            case 2:
                mVar.C(1242117201);
                gl.c.f77766a.getClass();
                long jH = gl.c.a(mVar).h();
                mVar.f();
                return jH;
            case 3:
                mVar.C(1242119763);
                gl.c.f77766a.getClass();
                long jI = gl.c.a(mVar).i();
                mVar.f();
                return jI;
            case 4:
                mVar.C(1242122544);
                gl.c.f77766a.getClass();
                long jD = gl.c.a(mVar).d();
                mVar.f();
                return jD;
            case 5:
                mVar.C(1242125039);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(mVar).b();
                mVar.f();
                return jB;
            case 6:
                mVar.C(1242127569);
                gl.c.f77766a.getClass();
                long j8 = gl.c.a(mVar).j();
                mVar.f();
                return j8;
            case 7:
                mVar.C(1242130065);
                gl.c.f77766a.getClass();
                long jP = gl.c.a(mVar).p();
                mVar.f();
                return jP;
            case 8:
                mVar.C(1242132239);
                mVar.f();
                d0.f128823b.getClass();
                return d0.f128831j;
            case 9:
                mVar.C(1242134351);
                mVar.f();
                d0.f128823b.getClass();
                return d0.f128831j;
            default:
                throw n23.j.m(mVar, 1242112564);
        }
    }
}
