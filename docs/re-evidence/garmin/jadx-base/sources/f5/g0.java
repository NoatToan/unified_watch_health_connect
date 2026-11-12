package f5;

import q5.g.a;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final float a(long j8, long j14) {
        return Math.min(Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public static final Object b(y0 y0Var) {
        Object f81969t = y0Var.getF81969t();
        i0 i0Var = f81969t instanceof i0 ? (i0) f81969t : null;
        if (i0Var != null) {
            return i0Var.getF68955a();
        }
        return null;
    }

    public static final h5.m0 c(h5.m0 m0Var) {
        h5.e0 e0Var = m0Var.f81889p.f81711p;
        while (true) {
            h5.e0 e0VarK = e0Var.K();
            h5.e0 e0Var2 = null;
            if ((e0VarK != null ? e0VarK.f81767h : null) == null) {
                h5.m0 m0VarD1 = e0Var.P.f81683d.D1();
                m0VarD1.getClass();
                return m0VarD1;
            }
            h5.e0 e0VarK2 = e0Var.K();
            if (e0VarK2 != null) {
                e0Var2 = e0VarK2.f81767h;
            }
            e0Var2.getClass();
            h5.e0 e0VarK3 = e0Var.K();
            e0VarK3.getClass();
            e0Var = e0VarK3.f81767h;
            e0Var.getClass();
        }
    }

    public static final h4.r d(h4.r rVar, e23.q qVar) {
        return rVar.then(new e0(qVar));
    }

    public static final h4.r e(h4.r rVar, Object obj) {
        return rVar.then(new f0(obj));
    }

    public static final h4.r f(h4.r rVar, e23.l lVar) {
        return rVar.then(new h1(lVar));
    }

    public static final h4.r g(h4.r rVar, e23.l lVar) {
        return rVar.then(new n1(lVar));
    }

    public static h4.r h(h4.r rVar, e23.l lVar) {
        return rVar.then(new p1(300L, 0.05f, null, lVar));
    }

    public static final q5.g.a i(h4.r.c cVar, e23.l lVar) {
        h5.e0 e0VarG = h5.k.g(cVar);
        int i14 = e0VarG.f81761b;
        q5.e rectManager = h5.i0.a(e0VarG).getRectManager();
        q5.g gVar = rectManager.f142833c;
        gVar.getClass();
        p1.i0<q5.g.a> i0Var = gVar.f142850a;
        q5.g.a aVar = gVar.new a(i14, 0L, 0L, cVar, lVar);
        q5.g.a aVarB = i0Var.b(i14);
        if (aVarB == null) {
            i0Var.i(i14, aVar);
            aVarB = aVar;
        }
        q5.g.a aVar2 = aVarB;
        if (aVar2 != aVar) {
            while (true) {
                q5.g.a aVar3 = aVar2.f142862f;
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar3;
            }
            aVar2.f142862f = aVar;
        }
        if (h5.k.g(cVar.getNode()).f81766g) {
            rectManager.f142832b.c(i14, true);
        }
        rectManager.f142835e = true;
        rectManager.h();
        return aVar;
    }
}
