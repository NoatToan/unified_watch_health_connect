package w91;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.a5;
import i3.fe;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public static final void a(ba1.d dVar, q91.g gVar, q91.d dVar2, m0 m0Var, p3.m mVar, int i14) {
        ba1.d dVar3;
        m0 m0Var2;
        m0 m0VarI;
        int i15;
        fe feVar;
        m0 m0Var3;
        dVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(926123264);
        int i16 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.k(gVar.ordinal()) ? 32 : 16) | (o0VarE.k(dVar2 == null ? -1 : dVar2.ordinal()) ? 256 : 128) | 1024;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                m0VarI = gl1.y.I(new v0[0], o0VarE);
                i15 = i16 & (-7169);
            } else {
                o0VarE.e();
                i15 = i16 & (-7169);
                m0VarI = m0Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(dVar.f16995w, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar2 = (fe) objQ;
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ba1.a(dVar, 2);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            Object obj = dVar2 == null ? y.f.INSTANCE : y.g.INSTANCE;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(dVar) | ((i15 & 112) == 32) | o0VarE.r(m0VarI) | o0VarE.r(activity) | o0VarE.r(context) | o0VarE.r(qVarC);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                m0 m0Var4 = m0VarI;
                feVar = feVar2;
                a5 a5Var = new a5(dVar, gVar, feVar, m0Var4, activity, context, p1VarC, qVarC);
                m0Var3 = m0Var4;
                o0VarE.K(a5Var);
                objQ3 = a5Var;
            } else {
                m0Var3 = m0VarI;
                feVar = feVar2;
            }
            fe feVar3 = feVar;
            nc.y.a(m0Var3, obj, null, null, null, null, null, null, null, (e23.l) objQ3, o0VarE, 0, 2044);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(dVar3);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new w(dVar, feVar3, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, unit, o0VarE);
            m0Var2 = m0Var3;
        } else {
            dVar3 = dVar;
            o0VarE.e();
            m0Var2 = m0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(dVar3, gVar, dVar2, m0Var2, i14, 4);
        }
    }
}
