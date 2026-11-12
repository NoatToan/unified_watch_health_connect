package ma0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import e23.l;
import gl1.y;
import gt1.k;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.x7;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    public static final void a(e23.a aVar, l lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1024229668);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarP.r(lVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.r(aVar) ? 32 : 16;
        }
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarP, R.string.lbl_sensors_backup);
            s62.a.f157643a.getClass();
            u4.d dVarA = x7.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarP, R.string.bic_pre_pair_sensors_button);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarP.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new k(lVar, 28);
                o0VarP.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k(lVar, 28);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            String strQ3 = y.Q(o0VarP, R.string.lbl_skip_button);
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new k(lVar, 29);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new k(lVar, 29);
                    o0VarP.K(objQ2);
                }
            }
            d.f117616a.getClass();
            o0Var = o0VarP;
            p.b("sensors_backup_screen", strQ, dVarA, null, null, strQ2, aVar3, false, strQ3, (e23.a) objQ2, false, null, null, false, false, aVar, null, null, null, null, null, d.f117617b, o0Var, 6, (i15 << 12) & 458752, 384, 4160664);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(lVar, aVar, i14, 0);
        }
    }
}
