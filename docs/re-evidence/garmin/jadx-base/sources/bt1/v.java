package bt1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p13.h0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    public static final void a(String str, i53.c cVar, j jVar, String str2, String str3, b92.a aVar, e23.l lVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String str4;
        String str5;
        String strQ;
        String strQ2;
        int i16;
        str.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(861021666);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(jVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                strQ = y.Q(o0VarE, R.string.common_button_done);
                strQ2 = y.Q(o0VarE, R.string.common_cancel);
                i16 = i15 & (-64513);
            } else {
                o0VarE.e();
                i16 = i15 & (-64513);
                strQ = str2;
                strQ2 = str3;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(jVar == null ? (j) h0.d0(cVar) : jVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            c1 c1Var = c1.f110940a;
            z3.e eVarC = z3.f.c(1715039750, new a3.e(cVar, 23, jVar, p1Var), o0VarE);
            boolean z14 = (3670016 & i16) == 1048576;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a51.k(lVar, p1Var, 3);
                o0VarE.K(objQ2);
            }
            int i17 = b92.a.f16960b;
            o0Var = o0VarE;
            c1Var.a(true, str, null, eVarC, aVar, strQ, false, false, (e23.a) objQ2, strQ2, aVar2, o0Var, ((i16 << 3) & 112) | 3078 | ((i16 >> 3) & 57344), (i16 >> 21) & 14, 196);
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
            p2VarI0.f135219d = new o(str, cVar, jVar, str4, str5, aVar, lVar, aVar2, i14);
        }
    }
}
