package yr;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.ve;
import l72.p2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static final void a(nr.g.f.a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(162540055);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, 1);
            String strQ = gl1.y.Q(o0VarE, R.string.diving_promo_card_app_installed_message);
            e23.a<Unit> aVar3 = aVar.f127062a;
            g.f198861a.getClass();
            p2Var.g(strQ, rVarA, null, g.f198862b, g.f198863c, false, false, aVar3, o0VarE, 27648, 228);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(aVar, i14, 3);
        }
    }

    public static final void b(nr.g.f.b bVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-708447585);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            long jT = v.h.t(o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            ve.a(rVarY, k2.i.a(8), jT, 0L, 0.0f, 0.0f, null, z3.f.c(-62364316, new n(bVar), o0VarE), o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(bVar, i14);
        }
    }

    public static final void c(nr.g.f fVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1068324753);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (fVar instanceof nr.g.f.a) {
                o0VarE.C(162909347);
                a((nr.g.f.a) fVar, o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else {
                if (!(fVar instanceof nr.g.f.b)) {
                    throw kg.f.h(o0VarE, 162906724, false);
                }
                o0VarE.C(162912422);
                b((nr.g.f.b) fVar, o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(fVar, i14, 2);
        }
    }
}
