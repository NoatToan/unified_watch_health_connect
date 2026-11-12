package b82;

import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 {
    public static final void a(c2.t tVar, boolean z14, m3.r rVar, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        m3.r rVar2;
        tVar.getClass();
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(1448579386);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            m3.i iVar = m3.i.f116250a;
            gl.c.f77766a.getClass();
            gl.e eVar = gl.c.f77767b;
            long j8 = eVar.f77773c;
            long j14 = eVar.f77797o;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            iVar.a(rVar2, z15, h4.p.b(tVar.c(aVar, h4.d.a.f81525c), Float.MAX_VALUE), j8, j14, 0.0f, o0VarE, ((i15 >> 6) & 14) | (i15 & 112), 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(tVar, z14, rVar, i14, 2);
        }
    }
}
