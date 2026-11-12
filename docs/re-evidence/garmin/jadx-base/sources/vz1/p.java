package vz1;

import com.garmin.android.apps.connectmobile.R;
import f72.yc;
import gl1.y;
import i3.mc;
import o53.b0;
import org.joda.time.DateTime;
import p3.o0;
import p3.p2;
import p3.x1;
import sz1.t;
import vv0.u;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    public static final void a(DateTime dateTime, DateTime dateTime2, t tVar, mc mcVar, b0 b0Var, oz1.a aVar, p3.m mVar, int i14) {
        int i15;
        b0 b0Var2;
        b0Var.getClass();
        aVar.getClass();
        int i16 = aVar.f134492c;
        o0 o0VarE = mVar.E(1118157461);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(tVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            b0Var2 = b0Var;
            i15 |= o0VarE.r(b0Var2) ? 16384 : 8192;
        } else {
            b0Var2 = b0Var;
        }
        if ((i14 & 196608) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            oz1.p.f134597c.getClass();
            String strQ = y.Q(o0VarE, oz1.p.a.a(i16).f134606a);
            String strQ2 = y.Q(o0VarE, oz1.p.a.a(i16).f134607b);
            if (oz1.p.a.a(i16) != oz1.p.NONE) {
                o0VarE.C(-736743077);
                int i17 = i15 >> 6;
                i.a(R.string.tr_factor_recent_stress, mcVar, b0Var2, strQ, strQ2, z3.f.c(-706406739, new vx1.b(dateTime, 4, dateTime2, tVar), o0VarE), o0VarE, (i17 & 112) | 196608 | (i17 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-735409612);
                s62.a.f157643a.getClass();
                u4.d dVarA = yc.a(t62.c.f162799a);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u(22);
                    o0VarE.K(objQ);
                }
                int i18 = i15 >> 9;
                l.a(mcVar, b0Var, R.string.tr_factor_recent_stress, dVarA, R.string.msg_not_enough_data, null, R.string.tr_feedback_stress_history_no_data, (e23.a) objQ, o0VarE, (i18 & 14) | 12779520 | (i18 & 112));
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, i14, 2);
        }
    }
}
