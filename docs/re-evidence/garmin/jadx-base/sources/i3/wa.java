package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/wa;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa f90116a = new wa();

    private wa() {
    }

    public static va a(long j8, long j14, p3.m mVar, int i14) {
        long j15;
        if ((i14 & 2) != 0) {
            o4.d0.f128823b.getClass();
            j15 = o4.d0.f128832k;
        } else {
            j15 = j14;
        }
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j16 = o4.d0.f128832k;
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        va vaVar = j2VarA.f88490j0;
        if (vaVar == null) {
            n3.s0.f123251a.getClass();
            va vaVar2 = new va(k2.d(j2VarA, n3.s0.f123255e), k2.d(j2VarA, n3.s0.f123257g), o4.d0.c(0.38f, k2.d(j2VarA, n3.s0.f123252b), 14), o4.d0.c(0.38f, k2.d(j2VarA, n3.s0.f123253c), 14), null);
            j2VarA.f88490j0 = vaVar2;
            vaVar = vaVar2;
        }
        long j17 = j8 != 16 ? j8 : vaVar.f90004a;
        if (j15 == 16) {
            j15 = vaVar.f90005b;
        }
        long j18 = j15;
        long j19 = j16 != 16 ? j16 : vaVar.f90006c;
        if (j16 == 16) {
            j16 = vaVar.f90007d;
        }
        return new va(j17, j18, j19, j16, null);
    }
}
