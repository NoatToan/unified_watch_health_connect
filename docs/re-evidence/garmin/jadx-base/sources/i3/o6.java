package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/o6;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o6 f89151a = new o6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f89152b;

    static {
        n3.d0 d0Var = n3.d0.f122764a;
        d0Var.getClass();
        f89152b = n3.d0.f122765b;
        d0Var.getClass();
    }

    private o6() {
    }

    public static u1.u a(boolean z14, boolean z15, long j8, long j14, long j15, long j16, float f14, float f15, p3.m mVar, int i14) {
        if ((i14 & 4) != 0) {
            n3.d0.f122764a.getClass();
            j8 = k2.e(n3.d0.f122780q, mVar);
        }
        if ((i14 & 8) != 0) {
            o4.d0.f128823b.getClass();
            j14 = o4.d0.f128831j;
        }
        if ((i14 & 16) != 0) {
            n3.d0.f122764a.getClass();
            j15 = o4.d0.c(n3.d0.f122774k, k2.e(n3.d0.f122773j, mVar), 14);
        }
        if ((i14 & 32) != 0) {
            o4.d0.f128823b.getClass();
            j16 = o4.d0.f128831j;
        }
        if ((i14 & 64) != 0) {
            n3.d0.f122764a.getClass();
            f14 = n3.d0.f122781r;
        }
        if ((i14 & 128) != 0) {
            n3.d0.f122764a.getClass();
            f15 = n3.d0.f122778o;
        }
        p3.x1 x1Var = p3.n.f135158a;
        if (!z14) {
            j8 = z15 ? j16 : j15;
        } else if (z15) {
            j8 = j14;
        }
        if (z15) {
            f14 = f15;
        }
        return u1.n.a(f14, j8);
    }

    public static xb b(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, p3.m mVar, int i14) {
        long j27;
        long j28;
        long j29;
        long j34;
        long j35;
        long j36;
        long j37;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j27 = o4.d0.f128832k;
        } else {
            j27 = j8;
        }
        if ((i14 & 4) != 0) {
            o4.d0.f128823b.getClass();
            j28 = o4.d0.f128832k;
        } else {
            j28 = j15;
        }
        if ((i14 & 8) != 0) {
            o4.d0.f128823b.getClass();
            j29 = o4.d0.f128832k;
        } else {
            j29 = j16;
        }
        if ((i14 & 16) != 0) {
            o4.d0.f128823b.getClass();
            j34 = o4.d0.f128832k;
        } else {
            j34 = j17;
        }
        if ((i14 & 32) != 0) {
            o4.d0.f128823b.getClass();
            j35 = o4.d0.f128832k;
        } else {
            j35 = j18;
        }
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j38 = o4.d0.f128832k;
        if ((i14 & 256) != 0) {
            aVar.getClass();
            j36 = j38;
        } else {
            j36 = j24;
        }
        if ((i14 & 1024) != 0) {
            aVar.getClass();
            j37 = j38;
        } else {
            j37 = j26;
        }
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        xb xbVarC = c(s7.a(mVar));
        if (j27 == 16) {
            j27 = xbVarC.f90306a;
        }
        long j39 = j27;
        long j44 = j14 != 16 ? j14 : xbVarC.f90307b;
        long j45 = j28 != 16 ? j28 : xbVarC.f90308c;
        if (j28 == 16) {
            j28 = xbVarC.f90309d;
        }
        long j46 = j28;
        if (j29 == 16) {
            j29 = xbVarC.f90310e;
        }
        long j47 = j29;
        if (j34 == 16) {
            j34 = xbVarC.f90311f;
        }
        long j48 = j34;
        if (j35 == 16) {
            j35 = xbVarC.f90312g;
        }
        long j49 = j35;
        long j54 = j38 != 16 ? j38 : xbVarC.f90313h;
        long j55 = j19 != 16 ? j19 : xbVarC.f90314i;
        if (j36 == 16) {
            j36 = xbVarC.f90315j;
        }
        long j56 = j36;
        long j57 = j25 != 16 ? j25 : xbVarC.f90316k;
        long j58 = j37 != 16 ? j37 : xbVarC.f90317l;
        if (j38 == 16) {
            j38 = xbVarC.f90318m;
        }
        return new xb(j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j38, null);
    }

    public static xb c(j2 j2Var) {
        xb xbVar = j2Var.f88474b0;
        if (xbVar != null) {
            return xbVar;
        }
        o4.d0.f128823b.getClass();
        long j8 = o4.d0.f128831j;
        n3.d0.f122764a.getClass();
        xb xbVar2 = new xb(j8, k2.d(j2Var, n3.d0.f122784u), k2.d(j2Var, n3.d0.f122788y), k2.d(j2Var, n3.d0.C), j8, o4.d0.c(n3.d0.f122768e, k2.d(j2Var, n3.d0.f122767d), 14), o4.d0.c(n3.d0.f122786w, k2.d(j2Var, n3.d0.f122785v), 14), o4.d0.c(n3.d0.A, k2.d(j2Var, n3.d0.f122789z), 14), k2.d(j2Var, n3.d0.f122775l), o4.d0.c(n3.d0.f122772i, k2.d(j2Var, n3.d0.f122771h), 14), k2.d(j2Var, n3.d0.f122783t), k2.d(j2Var, n3.d0.f122787x), k2.d(j2Var, n3.d0.B), null);
        j2Var.f88474b0 = xbVar2;
        return xbVar2;
    }
}
