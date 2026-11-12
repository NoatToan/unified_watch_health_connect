package ma0;

import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.l;
import da0.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.x7;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 951904433);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarP.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.r(aVar2) ? 32 : 16;
        }
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarP, R.string.lbl_sensors_backup_confirmation);
            String strQ2 = y.Q(o0VarP, R.string.bic_pre_pair_sensors_confirmation_message);
            s62.a.f157643a.getClass();
            u4.d dVarA = x7.a(t62.b.f162798a);
            String strQ3 = y.Q(o0VarP, R.string.lbl_next);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new ll0.a(aVar, 14);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ll0.a(aVar, 14);
                    o0VarP.K(objQ);
                }
            }
            c.f117613a.getClass();
            o0Var = o0VarP;
            p.b("sensors_backup_confirmation_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, c.f117614b, o0Var, 6, (i15 << 12) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(aVar, aVar2, i14, 6, (byte) 0);
        }
    }
}
