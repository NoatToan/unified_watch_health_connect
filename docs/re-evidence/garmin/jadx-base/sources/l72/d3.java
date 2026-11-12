package l72;

import i3.ce;
import i3.fe;
import i3.se;
import i3.ve;
import i3.wd;
import i3.yd;

/* JADX INFO: loaded from: classes9.dex */
public final class d3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wd wdVar, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        wdVar.getClass();
        p3.o0 o0VarE = mVar.E(567733508);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(wdVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar;
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVar3, eVar.f97920e);
            bVar.getClass();
            k2.h hVarA = k2.i.a(eVar.f97917b);
            long j8 = ((o4.d0) d92.b.a(o0VarE).h().f63516c.getF182175a()).f128833a;
            long jA = d92.b.a(o0VarE).h().a();
            e3.f110994a.getClass();
            ve.a(rVarY, hVarA, j8, jA, 0.0f, e3.f110995b, null, z3.f.c(-1359724321, new kk1.h(wdVar, 19), o0VarE), o0VarE, 12779520, 80);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(wdVar, rVar2, i14, i15, 9);
        }
    }

    public static final void b(fe feVar, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        feVar.getClass();
        p3.o0 o0VarE = mVar.E(-504112073);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(feVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar;
            p3.x1 x1Var = p3.n.f135158a;
            t0.f111258a.getClass();
            ce.b(feVar, rVar3, t0.f111259b, o0VarE, (i16 & 14) | 384 | (i16 & 112), 0);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(feVar, rVar2, i14, i15, 8);
        }
    }

    public static final Object c(fe feVar, String str, String str2, t13.d<? super se> dVar) {
        return fe.b(feVar, str, str2, str2 != null ? yd.Long : yd.Short, dVar, 4);
    }
}
