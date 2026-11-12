package dv0;

import a11.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.p2;
import o4.m1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class u {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p1 p1Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1023121790);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            p2 p2Var = p2.f111205a;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            String strQ = y.Q(o0VarE, R.string.lbl_setup_livetrack_profile);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new f(p1Var2, 1);
                o0VarE.K(objQ2);
            }
            p2Var.g(strQ, rVarE, null, null, null, z14, false, (e23.a) objQ2, o0VarE, ((i15 << 15) & 458752) | 100663296, 220);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1562171276);
                boolean z15 = (i15 & 112) == 32;
                Object objQ3 = o0VarE.q();
                if (z15 || objQ3 == c2565a) {
                    p1Var = p1Var2;
                    objQ3 = new a0(aVar, p1Var, 9);
                    o0VarE.K(objQ3);
                } else {
                    p1Var = p1Var2;
                }
                e23.a aVar2 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new f(p1Var, 2);
                    o0VarE.K(objQ4);
                }
                r.a(aVar2, (e23.a) objQ4, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1562405760);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(z14, aVar, i14, 0, (byte) 0);
        }
    }
}
