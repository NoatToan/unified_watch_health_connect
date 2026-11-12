package i51;

import c.w;
import e23.l;
import e23.p;
import o51.j;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(j jVar, l<? super t41.f, Unit> lVar, p<? super Double, ? super n02.g, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        jVar.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-755258180);
        int i15 = i14 | (o0VarE.B(jVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i31.e(6);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            boolean z14 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new e(0, aVar, lVar);
                o0VarE.K(objQ2);
            }
            w.a(0, 1, (e23.a) objQ2, o0VarE, false);
            a.f91784a.getClass();
            z02.d.a(false, a.f91785b, null, null, null, z3.f.c(816562451, new et.p((Object) pVar, (Object) p1Var, (Object) jVar, (e23.a) aVar2, (Object) lVar, 23), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p((Object) jVar, (Object) lVar, (o13.h) pVar, (e23.a) aVar, (e23.a) aVar2, i14, 24);
        }
    }
}
