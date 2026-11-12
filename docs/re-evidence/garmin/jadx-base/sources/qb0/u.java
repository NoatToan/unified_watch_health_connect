package qb0;

import ca0.c2;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    public static final void a(String str, o90.a aVar, d90.f fVar, u1 u1Var, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        aVar.getClass();
        fVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1745928545);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(fVar) ? 256 : 128) | (o0VarE.r(u1Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            String strP = y.P(R.string.software_update_sent_title, new Object[]{str}, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_finished);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new c2(u1Var, 6);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c2(u1Var, 6);
                    o0VarE.K(objQ);
                }
            }
            h4.d.f81522a.getClass();
            int i16 = i15 << 3;
            o0Var = o0VarE;
            da0.p.c("firmware_update_success_screen", str, aVar, strP, false, null, null, null, strQ, (e23.a) objQ, false, null, null, false, null, null, false, false, null, lVar, null, h4.d.a.f81537o, z3.f.c(-1513254816, new l(fVar, 1), o0VarE), o0Var, 6 | (i16 & 112) | (i16 & 896), (i15 << 15) & 1879048192, 3456, 3669232);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(str, aVar, fVar, u1Var, lVar, i14, 1);
        }
    }
}
