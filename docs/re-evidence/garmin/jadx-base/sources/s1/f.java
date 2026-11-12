package s1;

import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1<Float> f155577a = l.c(7, 0.0f, 0.0f, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1<g6.f> f155578b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        n4.d dVar = u2.f155812a;
        f155578b = l.c(3, 0.0f, 0.0f, g6.f.a(0.4f));
        n4.g.a aVar2 = n4.g.f123559b;
        l.c(3, 0.0f, 0.0f, n4.g.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)));
        n4.c.a aVar3 = n4.c.f123541b;
        l.c(3, 0.0f, 0.0f, n4.c.a(u2.b()));
        n4.d.a aVar4 = n4.d.f123545e;
        l.c(3, 0.0f, 0.0f, u2.f155812a);
        p005kotlin.jvm.internal.r rVar = p005kotlin.jvm.internal.r.f105809a;
        l.c(3, 0.0f, 0.0f, 1);
        g6.k.a aVar5 = g6.k.f76003b;
        l.c(3, 0.0f, 0.0f, g6.k.a(u2.a()));
        g6.m.a aVar6 = g6.m.f76012b;
        l.c(3, 0.0f, 0.0f, g6.m.a(u2.c()));
    }

    public static final x3 a(float f14, f0 f0Var, String str, p3.m mVar, int i14, int i15) {
        if ((i15 & 2) != 0) {
            f0Var = f155578b;
        }
        f0 f0Var2 = f0Var;
        if ((i15 & 4) != 0) {
            str = "DpAnimation";
        }
        p3.x1 x1Var = p3.n.f135158a;
        return c(g6.f.a(f14), e2.f155570c, f0Var2, null, str, mVar, (i14 << 6) & 57344, 8);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public static final x3 b(float f14, k kVar, String str, p3.m mVar, int i14, int i15) {
        int i16 = i15 & 2;
        j1<Float> j1Var = f155577a;
        if (i16 != 0) {
            kVar = j1Var;
        }
        if ((i15 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        p3.x1 x1Var = p3.n.f135158a;
        if (kVar == j1Var) {
            mVar.C(1144089983);
            boolean z14 = (((i14 & 896) ^ 384) > 256 && mVar.i(0.01f)) || (i14 & 384) == 256;
            Object objQ = mVar.q();
            if (z14) {
                objQ = l.c(3, 0.0f, 0.0f, Float.valueOf(0.01f));
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = l.c(3, 0.0f, 0.0f, Float.valueOf(0.01f));
                    mVar.K(objQ);
                }
            }
            kVar = (j1) objQ;
            mVar.f();
        } else {
            mVar.C(1144199909);
            mVar.f();
        }
        k kVar2 = kVar;
        Float fValueOf = Float.valueOf(f14);
        p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
        int i17 = i14 << 3;
        return c(fValueOf, e2.f155568a, kVar2, Float.valueOf(0.01f), str2, mVar, (i14 & 14) | (i17 & 7168) | (57344 & i17) | (i17 & 458752), 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    public static final x3 c(Object obj, c2 c2Var, k kVar, Float f14, String str, p3.m mVar, int i14, int i15) {
        k j1Var;
        Float f15 = (i15 & 8) != 0 ? null : f14;
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj2 = p3.m.a.f135155b;
        if (objQ == obj2) {
            objQ = p3.p0.n(null);
            mVar.K(objQ);
        }
        p3.p1 p1Var = (p3.p1) objQ;
        Object objQ2 = mVar.q();
        if (objQ2 == obj2) {
            objQ2 = new b(obj, c2Var, f15, str);
            mVar.K(objQ2);
        }
        b bVar = (b) objQ2;
        p3.p1 p1VarQ = p3.p0.q(null, mVar);
        if (f15 == null || !(kVar instanceof j1)) {
            j1Var = kVar;
        } else {
            j1 j1Var2 = (j1) kVar;
            if (p005kotlin.jvm.internal.s.g(j1Var2.f155616c, f15)) {
                j1Var = kVar;
            } else {
                j1Var = new j1(j1Var2.f155614a, j1Var2.f155615b, f15);
            }
        }
        p3.p1 p1VarQ2 = p3.p0.q(j1Var, mVar);
        Object objQ3 = mVar.q();
        if (objQ3 == obj2) {
            objQ3 = q53.l.a(-1, 6, null);
            mVar.K(objQ3);
        }
        q53.i iVar = (q53.i) objQ3;
        boolean zR = mVar.r(iVar) | ((((i14 & 14) ^ 6) > 4 && mVar.r(obj)) || (i14 & 6) == 4);
        Object objQ4 = mVar.q();
        if (zR || objQ4 == obj2) {
            objQ4 = new rk0.f(15, iVar, obj);
            mVar.K(objQ4);
        }
        p3.l0.i((e23.a) objQ4, mVar);
        boolean zR2 = mVar.r(iVar) | mVar.r(bVar) | mVar.B(p1VarQ2) | mVar.B(p1VarQ);
        Object objQ5 = mVar.q();
        if (zR2 || objQ5 == obj2) {
            Object eVar = new e(iVar, bVar, p1VarQ2, p1VarQ, null);
            mVar.K(eVar);
            objQ5 = eVar;
        }
        p3.l0.e((e23.p) objQ5, iVar, mVar);
        x3 x3Var = (x3) p1Var.getF182175a();
        return x3Var == null ? bVar.f155489c : x3Var;
    }
}
