package k41;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import et1.v;
import gl1.y;
import h4.r;
import i41.h;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.i;
import yz1.k;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    public static final void a(r rVar, h41.g gVar, m mVar, int i14) {
        int i15;
        r rVar2;
        i iVar;
        o0 o0VarE = mVar.E(1829827234);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_heart_rate_variability_no_data_info);
            yz1.d dVar = gVar != null ? gVar.f81618a : null;
            if (gVar == null) {
                iVar = i.EMPTY;
            } else {
                if (gVar.f81621d != null) {
                    h hVar = gVar.f81619b;
                    if ((hVar == h.f90945h || hVar == h.f90951n || hVar == h.f90943f) ? false : true) {
                        iVar = i.VALID_DATA;
                    } else {
                        iVar = i.EMPTY;
                    }
                } else {
                    iVar = i.EMPTY;
                }
            }
            i iVar2 = iVar;
            u4.d dVarB = o70.i.b(o70.i.f130004l);
            z3.e eVarC = z3.f.c(-1812172812, new v(gVar, 29), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ho0.a(context, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 12);
                    o0VarE.K(objQ);
                }
            }
            yz1.d dVar2 = dVar;
            rVar2 = rVar;
            k.b(rVar2, dVar2, dVarB, eVarC, (e23.a) objQ, strQ, iVar2, o0VarE, (i15 & 14) | 3072);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, gVar, i14, 0);
        }
    }
}
