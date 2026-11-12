package a3;

import c2.x2;
import kotlin.k2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4.r f753a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f753a = x2.q(h4.r.S, 24);
    }

    public static final void a(int i14, long j8, h4.r rVar, p3.m mVar, u4.d dVar) {
        if ((i14 & 4) != 0) {
            rVar = h4.r.S;
        }
        x1 x1Var = p3.n.f135158a;
        b(u4.p.b(dVar, mVar), rVar, j8, mVar, 56);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    public static final void b(t4.d dVar, h4.r rVar, long j8, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-1142959010);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024);
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if ((((i15 & 7168) ^ 3072) <= 2048 || !o0VarE.l(j8)) && (i15 & 3072) != 2048) {
                z14 = false;
            }
            Object objQ = o0VarE.q();
            if (z14) {
                o4.d0.f128823b.getClass();
                if (o4.d0.d(j8, o4.d0.f128832k)) {
                    objQ = null;
                } else {
                    objQ = o4.e0.a.a(o4.e0.f128843b, j8);
                }
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    o4.d0.f128823b.getClass();
                    if (o4.d0.d(j8, o4.d0.f128832k)) {
                        objQ = null;
                    } else {
                        objQ = o4.e0.a.a(o4.e0.f128843b, j8);
                    }
                    o0VarE.K(objQ);
                }
            }
            o4.e0 e0Var = (o4.e0) objQ;
            o0VarE.C(609378564);
            o0VarE.g0(false);
            h4.r.a aVar = h4.r.S;
            k2.a aVar2 = k2.f91249a;
            long f162260d = dVar.getF162260d();
            n4.g.f123559b.getClass();
            if (n4.g.c(f162260d, n4.g.f123560c)) {
                rVar2 = f753a;
            } else {
                long f162260d2 = dVar.getF162260d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (f162260d2 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (f162260d2 & 4294967295L)))) {
                    rVar2 = f753a;
                } else {
                    rVar2 = aVar;
                }
            }
            h4.r rVarThen = rVar.then(rVar2);
            f5.k.f68985a.getClass();
            c2.q.a(l4.r.a(rVarThen, dVar, null, f5.k.a.f68988c, 0.0f, e0Var, 22).then(aVar), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(dVar, rVar, j8, i14, 0);
        }
    }
}
