package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/l1;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f88793a = new l1();

    private l1() {
    }

    public static k1 a(int i14, int i15, long j8, long j14, p3.m mVar) {
        if ((i15 & 2) != 0) {
            j14 = k2.b(j8, mVar);
        }
        long j15 = j14;
        o4.d0.f128823b.getClass();
        long j16 = o4.d0.f128832k;
        long jC = o4.d0.c(0.38f, j15, 14);
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return c(s7.a(mVar)).a(j8, j15, j16, jC);
    }

    public static k1 b(long j8, p3.m mVar) {
        k1 k1Var;
        long jB = k2.b(j8, mVar);
        o4.d0.f128823b.getClass();
        long j14 = o4.d0.f128832k;
        long jC = o4.d0.c(0.38f, jB, 14);
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        k1 k1Var2 = j2VarA.f88472a0;
        if (k1Var2 == null) {
            n3.r.f123232a.getClass();
            n3.m mVar2 = n3.r.f123233b;
            long jD = k2.d(j2VarA, mVar2);
            long jA = k2.a(j2VarA, k2.d(j2VarA, mVar2));
            n3.m mVar3 = n3.r.f123236e;
            k1 k1Var3 = new k1(jD, jA, o4.f0.g(o4.d0.c(n3.r.f123238g, k2.d(j2VarA, mVar3), 14), k2.d(j2VarA, mVar3)), o4.d0.c(0.38f, k2.a(j2VarA, k2.d(j2VarA, mVar2)), 14), null);
            j2VarA.f88472a0 = k1Var3;
            k1Var = k1Var3;
            jB = jB;
            j14 = j14;
        } else {
            k1Var = k1Var2;
        }
        return k1Var.a(j8, jB, j14, jC);
    }

    public static k1 c(j2 j2Var) {
        k1 k1Var = j2Var.Z;
        if (k1Var != null) {
            return k1Var;
        }
        n3.b0.f122691a.getClass();
        n3.m mVar = n3.b0.f122692b;
        k1 k1Var2 = new k1(k2.d(j2Var, mVar), k2.a(j2Var, k2.d(j2Var, mVar)), o4.f0.g(o4.d0.c(n3.b0.f122696f, k2.d(j2Var, n3.b0.f122694d), 14), k2.d(j2Var, mVar)), o4.d0.c(0.38f, k2.a(j2Var, k2.d(j2Var, mVar)), 14), null);
        j2Var.Z = k1Var2;
        return k1Var2;
    }
}
