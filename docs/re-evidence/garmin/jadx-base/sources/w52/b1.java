package w52;

import c2.x2;
import java.util.List;
import p006l2.l3;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 {
    public static final void a(v0 v0Var, List<String> list, List<String> list2, p3.m mVar, int i14) {
        int i15;
        v0Var.getClass();
        p3.o0 o0VarE = mVar.E(-767741240);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.r(list) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(list, list2, o0VarE, (i15 >> 3) & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(v0Var, list, list2, i14, 2);
        }
    }

    public static final void b(List<String> list, List<String> list2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(332174665);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list2) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new w40.d(7);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = o0VarE.r(list) | o0VarE.r(list2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new l3(list, list2, i16);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar, rVarF, (e23.l) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(list, list2, i14, 6);
        }
    }
}
