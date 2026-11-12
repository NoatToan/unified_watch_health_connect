package dt;

import am.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import gl1.y;
import lc.m0;
import lc.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    public static final void a(zs.c cVar, e23.a<Unit> aVar, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        m0 m0Var;
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(682511127);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            m0 m0VarI = y.I(new v0[0], o0VarE);
            Object obj = ((ts.b) KoinJavaComponent.get$default(ts.b.class, null, null, 6, null)).d() ? a.INSTANCE : h.INSTANCE;
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(cVar) | o0VarE.r(m0VarI) | ((i15 & 896) == 256) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                e1 e1Var = new e1(cVar, m0VarI, aVar, lVar, context, 12);
                m0Var = m0VarI;
                o0VarE.K(e1Var);
                objQ = e1Var;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    e1 e1Var2 = new e1(cVar, m0VarI, aVar, lVar, context, 12);
                    m0Var = m0VarI;
                    o0VarE.K(e1Var2);
                    objQ = e1Var2;
                } else {
                    m0Var = m0VarI;
                }
            }
            nc.y.a(m0Var, obj, null, null, null, null, null, null, null, (l) objQ, o0VarE, 0, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f((Object) cVar, (e23.a) aVar, (l) lVar, i14, 27);
        }
    }
}
