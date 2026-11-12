package mt1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import e23.l;
import e23.p;
import gl1.y;
import ho.d0;
import i3.fe;
import lc.m0;
import lc.v;
import lc.v0;
import mh1.q;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MissingPermission"})
    public static final void a(com.garmin.android.apps.connectmobile.c cVar, m0 m0Var, l lVar, m mVar, int i14) {
        m0 m0Var2;
        m0 m0VarI;
        int i15;
        qt1.a aVar;
        m.a.C2565a c2565a;
        com.garmin.android.apps.connectmobile.c cVar2 = cVar;
        l lVar2 = lVar;
        lVar2.getClass();
        o0 o0VarE = mVar.E(1228999310);
        int i16 = i14 | (o0VarE.r(cVar2) ? 4 : 2) | 16 | (o0VarE.r(lVar2) ? 256 : 128);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                m0VarI = y.I(new v0[0], o0VarE);
                i15 = i16 & (-113);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                m0VarI = m0Var;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            Object objF = objQ;
            if (objQ == c2565a2) {
                objF = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objF;
            qt1.a aVarG0 = gl1.d.g0(o0VarE);
            p1 p1VarC = s9.c.c(aVarG0.f147510y, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarL = y.l(m0VarI, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            Object obj = objQ2;
            if (objQ2 == c2565a2) {
                q qVar = new q(15);
                o0VarE.K(qVar);
                obj = qVar;
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) obj, o0VarE, 48);
            String strD = ot1.e.f133785a.d();
            boolean zR = o0VarE.r(m0VarI);
            Object objQ3 = o0VarE.q();
            Object obj2 = objQ3;
            if (zR || objQ3 == c2565a2) {
                a aVar2 = new a(m0VarI, feVar, i17);
                o0VarE.K(aVar2);
                obj2 = aVar2;
            }
            m0 m0Var3 = m0VarI;
            int i18 = 0;
            nc.y.b(m0Var3, strD, null, null, null, null, null, null, (l) obj2, o0VarE, 0, 1020);
            g.g gVar = new g.g();
            boolean zR2 = o0VarE.r(aVarG0);
            Object objQ4 = o0VarE.q();
            Object obj3 = objQ4;
            if (zR2 || objQ4 == c2565a2) {
                b bVar = new b(aVarG0, i18);
                o0VarE.K(bVar);
                obj3 = bVar;
            }
            c.q qVarC = w.c(gVar, (l) obj3, o0VarE, 0);
            int i19 = i15 & 896;
            boolean zR3 = o0VarE.r(m0Var3) | (i19 == 256) | o0VarE.B(p1VarC) | o0VarE.r(aVarG0);
            Object objQ5 = o0VarE.q();
            if (zR3 || objQ5 == c2565a2) {
                aVar = aVarG0;
                c2565a = c2565a2;
                d0 d0Var = new d0(m0Var3, lVar, aVar, p1VarC, 22);
                m0Var3 = m0Var3;
                lVar2 = lVar;
                o0VarE.K(d0Var);
                objQ5 = d0Var;
            } else {
                c2565a = c2565a2;
                aVar = aVarG0;
                lVar2 = lVar;
            }
            w.a(0, r16, (e23.a) objQ5, o0VarE, false);
            Unit unit = Unit.INSTANCE;
            boolean zR4 = o0VarE.r(aVar);
            if (i19 == 256) {
                i18 = 1;
            }
            int i24 = (zR4 ? 1 : 0) | i18 | (o0VarE.B(p1VarC) ? 1 : 0);
            Object objQ6 = o0VarE.q();
            Object obj4 = objQ6;
            if (i24 != 0 || objQ6 == c2565a) {
                c cVar3 = new c(aVar, lVar2, p1VarC, null);
                o0VarE.K(cVar3);
                obj4 = cVar3;
            }
            l0.e((p) obj4, unit, o0VarE);
            v vVar = (v) p1VarL.getF182175a();
            boolean zB = o0VarE.B(p1VarL) | o0VarE.B(p1Var) | o0VarE.r(context) | o0VarE.r(aVar) | o0VarE.r(qVarC);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                d dVar = new d(context, aVar, qVarC, p1VarL, p1Var, null);
                o0VarE.K(dVar);
                objQ7 = dVar;
            }
            l0.e((p) objQ7, vVar, o0VarE);
            boolean zR5 = o0VarE.r(aVar);
            Object objQ8 = o0VarE.q();
            Object obj5 = objQ8;
            if (zR5 || objQ8 == c2565a) {
                e eVar = new e(aVar, feVar, null);
                o0VarE.K(eVar);
                obj5 = eVar;
            }
            l0.e((p) obj5, unit, o0VarE);
            cVar2 = cVar;
            boolean zR6 = o0VarE.r(cVar2);
            Object objQ9 = o0VarE.q();
            Object obj6 = objQ9;
            if (zR6 || objQ9 == c2565a) {
                com.garmin.android.apps.connectmobile.b bVar2 = new com.garmin.android.apps.connectmobile.b(cVar2, r16);
                o0VarE.K(bVar2);
                obj6 = bVar2;
            }
            l0.a(unit, (l) obj6, o0VarE);
            m0Var2 = m0Var3;
        } else {
            o0VarE.e();
            m0Var2 = m0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) cVar2, (Object) m0Var2, (Object) lVar2, i14, 26);
        }
    }
}
