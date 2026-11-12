package db0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import cw1.k;
import da0.p;
import e23.l;
import f72.f0;
import gl1.y;
import h4.g;
import l72.c1;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, l<? super Integer, Unit> lVar, l<? super Integer, Unit> lVar2, e23.a<Unit> aVar, m mVar, int i15) {
        o0 o0Var;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2018089957);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i18 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            String strQ = y.Q(o0VarE, R.string.gcm3_bic_profile_external_bottom_time);
            s62.a.f157643a.getClass();
            t62.c.f162799a.getClass();
            u4.d dVarA = g72.d.a(f0.f69546a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81537o;
            boolean z14 = ((i16 & 14) == 4) | ((i16 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new au0.m(lVar2, i14, 6);
                o0VarE.K(objQ2);
            }
            p.b("user_profile_non_garmin_bottom_time_screen", strQ, dVarA, null, null, strQ2, (e23.a) objQ2, false, null, null, false, null, null, false, false, aVar, null, null, null, null, aVar2, z3.f.c(-1830876901, new d(p1Var, i17, context, i18), o0VarE), o0VarE, 6, (i16 << 6) & 458752, 432, 2064280);
            o0Var = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(37009482);
                c1 c1Var = c1.f110940a;
                String strQ3 = y.Q(o0Var, R.string.activity_details_bottom_time);
                String strQ4 = y.Q(o0Var, R.string.lbl_done);
                String strQ5 = y.Q(o0Var, R.string.common_cancel);
                z3.e eVarC = z3.f.c(-1832916326, new e(i14, lVar), o0Var);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new k(p1Var, 24);
                    o0Var.K(objQ3);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ3;
                Object objQ4 = o0Var.q();
                if (objQ4 == c2565a) {
                    objQ4 = new k(p1Var, 25);
                    o0Var.K(objQ4);
                }
                c1Var.a(true, strQ3, null, eVarC, null, strQ4, false, false, aVar3, strQ5, (e23.a) objQ4, o0Var, 100666374, 6, 212);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(38027367);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(i14, lVar, lVar2, aVar, i15);
        }
    }
}
