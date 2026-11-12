package a11;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import l72.c1;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    public static final void a(String str, i53.c cVar, int i14, String str2, String str3, e23.l lVar, e23.a aVar, p3.m mVar, int i15) {
        o0 o0Var;
        String str4;
        String str5;
        int i16;
        String strQ;
        String strQ2;
        str.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-575502529);
        int i17 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | 9216 | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                i16 = i17 & (-64513);
                strQ = gl1.y.Q(o0VarE, R.string.common_button_ok);
                strQ2 = gl1.y.Q(o0VarE, R.string.common_cancel);
            } else {
                o0VarE.e();
                i16 = i17 & (-64513);
                strQ = str2;
                strQ2 = str3;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(i14, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            c1 c1Var = c1.f110940a;
            z3.e eVarC = z3.f.c(-1205579677, new e0(cVar, n1Var, 0), o0VarE);
            boolean z14 = (458752 & i16) == 131072;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new f0(lVar, n1Var, 0);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            c1Var.a(true, str, null, eVarC, null, strQ, false, false, (e23.a) objQ2, strQ2, aVar, o0Var, ((i16 << 3) & 112) | 3078, 6, 212);
            str4 = strQ;
            str5 = strQ2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str4 = str2;
            str5 = str3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(str, cVar, i14, str4, str5, lVar, aVar, i15);
        }
    }
}
