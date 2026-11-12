package i51;

import as.s;
import da0.c0;
import e23.l;
import h4.r;
import i3.bf;
import i3.fc;
import i3.l1;
import i3.o1;
import l4.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(int i14, e23.a aVar, String str, m mVar) {
        o0 o0VarE = mVar.E(-2063546604);
        int i15 = (o0VarE.k(2131232591) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            l1.f88793a.getClass();
            n3.r.f123232a.getClass();
            r rVarD = w.d(k.b(aVar2, fc.c(n3.r.f123235d, o0VarE)), false, null, null, aVar, 15);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new bf(13);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((l) objQ, rVarD, true);
            d92.b.f58623a.getClass();
            o1.b(rVarC, null, l1.b(d92.b.a(o0VarE).d().a().b(), o0VarE), null, z3.f.c(-638697415, new s(str, 26), o0VarE), o0VarE, 24576);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 12);
        }
    }

    public static final void b(int i14, e23.a aVar, String str, m mVar, u4.d dVar) {
        o0 o0VarE = mVar.E(-60670301);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            l1.f88793a.getClass();
            n3.r.f123232a.getClass();
            r rVarD = w.d(k.b(aVar2, fc.c(n3.r.f123235d, o0VarE)), false, null, null, aVar, 15);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new bf(14);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((l) objQ, rVarD, true);
            d92.b.f58623a.getClass();
            o1.b(rVarC, null, l1.b(d92.b.a(o0VarE).d().a().b(), o0VarE), null, z3.f.c(-626343224, new hv0.d(3, dVar, str), o0VarE), o0VarE, 24576);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(dVar, str, aVar, i14);
        }
    }

    public static final void c(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 1765154829);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.r(aVar2) ? 32 : 16;
        }
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            d.f91791a.getClass();
            z02.d.a(false, d.f91792b, null, null, null, z3.f.c(-139645802, new at1.f(aVar, aVar2, 21), o0VarP), o0VarP, 196656, 29);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 1, (byte) 0);
        }
    }
}
