package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/r1;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f89474a = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f89475b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f89475b = 2;
    }

    private r1() {
    }

    public static q1 a(long j8, long j14, p3.m mVar, int i14) {
        long j15;
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j16 = o4.d0.f128832k;
        if ((i14 & 4) != 0) {
            aVar.getClass();
            j15 = j16;
        } else {
            j15 = j14;
        }
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        q1 q1Var = j2VarA.f88478d0;
        if (q1Var == null) {
            n3.i.f122954a.getClass();
            long jD = k2.d(j2VarA, n3.i.f122957d);
            o4.d0.f128823b.getClass();
            long j17 = o4.d0.f128831j;
            n3.m mVar2 = n3.i.f122955b;
            long jD2 = k2.d(j2VarA, mVar2);
            n3.m mVar3 = n3.i.f122956c;
            q1 q1Var2 = new q1(jD, j17, jD2, j17, o4.d0.c(0.38f, k2.d(j2VarA, mVar3), 14), j17, o4.d0.c(0.38f, k2.d(j2VarA, mVar3), 14), k2.d(j2VarA, mVar2), k2.d(j2VarA, n3.i.f122960g), o4.d0.c(0.38f, k2.d(j2VarA, mVar3), 14), o4.d0.c(0.38f, k2.d(j2VarA, n3.i.f122959f), 14), o4.d0.c(0.38f, k2.d(j2VarA, mVar3), 14), null);
            j2VarA.f88478d0 = q1Var2;
            q1Var = q1Var2;
        }
        aVar.getClass();
        long j18 = o4.d0.f128831j;
        if (j15 == 16) {
            j15 = q1Var.f89371a;
        }
        long j19 = j15;
        long j24 = j18 != 16 ? j18 : q1Var.f89372b;
        long j25 = j8 != 16 ? j8 : q1Var.f89373c;
        long j26 = j18 != 16 ? j18 : q1Var.f89374d;
        long j27 = j16 != 16 ? j16 : q1Var.f89375e;
        if (j18 == 16) {
            j18 = q1Var.f89376f;
        }
        return new q1(j19, j24, j25, j26, j27, j18, j16 != 16 ? j16 : q1Var.f89377g, j8 != 16 ? j8 : q1Var.f89378h, j16 != 16 ? j16 : q1Var.f89379i, j16 != 16 ? j16 : q1Var.f89380j, j16 != 16 ? j16 : q1Var.f89381k, j16 != 16 ? j16 : q1Var.f89382l, null);
    }
}
