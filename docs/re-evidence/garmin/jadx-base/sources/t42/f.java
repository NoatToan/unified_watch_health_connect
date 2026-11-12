package t42;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.mc;
import l72.w;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    public static final void a(e23.a<Unit> aVar, mc mcVar, p3.m mVar, int i14) {
        aVar.getClass();
        mcVar.getClass();
        o0 o0VarE = mVar.E(280465402);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.B(mcVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.improved_data_accuracy);
            String strQ2 = y.Q(o0VarE, R.string.index_s2_smart_scale_improvements_message);
            s62.a.f157643a.getClass();
            i53.f fVarA = i53.a.a(new b82.s.b(strQ, strQ2, f72.i.a(t62.c.f162799a), null, null, 24, null));
            w wVar = w.f111301a;
            a.f162324a.getClass();
            z3.e eVar = a.f162325b;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new t21.a(aVar, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t21.a(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            wVar.c(eVar, null, (e23.a) objQ, mcVar, null, null, z3.f.c(-1141499912, new ry0.g(16, fVarA, aVar), o0VarE), o0VarE, ((i15 << 6) & 7168) | 1572870, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(aVar, mcVar, i14, 5);
        }
    }
}
