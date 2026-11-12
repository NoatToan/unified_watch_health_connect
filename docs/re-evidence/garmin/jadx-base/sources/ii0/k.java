package ii0;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gv0.s0;
import java.util.List;
import l72.c1;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d2;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List<li0.d0> list, li0.f fVar, e2.i0 i0Var, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        list.getClass();
        fVar.getClass();
        i0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(859665647);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(i0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            g.g gVar = new g.g();
            int i17 = i15 & 57344;
            boolean zR = (i17 == 16384) | o0VarE.r(activity) | o0VarE.r(view2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new gw1.d(aVar, 18, activity, view2);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(gVar, (e23.l) objQ2, o0VarE, 0);
            j22.b bVar = j22.b.f96736a;
            j22.a[] aVarArr = {j22.a.f96717f};
            bVar.getClass();
            if (j22.b.k(aVarArr)) {
                o0VarE.C(-589518610);
                boolean z17 = i17 == 16384;
                Object objQ3 = o0VarE.q();
                if (z17 || objQ3 == c2565a) {
                    objQ3 = new h(aVar, 3);
                    o0VarE.K(objQ3);
                }
                m3.l.b(z15, (e23.a) objQ3, null, null, null, null, z3.f.c(241980250, new gw1.e(i0Var, 12, list, fVar), o0VarE), o0VarE, ((i15 >> 9) & 14) | 1572864, 60);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-588024999);
                s62.a.f157643a.getClass();
                u4.d dVarA = d2.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.social_discover_contacts_access_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.social_discover_contacts_access_message);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_connect);
                boolean zR2 = o0VarE.r(activity);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    i16 = 1;
                    objQ4 = new s0(activity, p1Var, 1);
                    o0VarE.K(objQ4);
                } else {
                    i16 = 1;
                }
                int i18 = i16;
                b82.n.d(dVarA, strQ, strQ2, rVarC, strQ3, (e23.a) objQ4, null, null, o0VarE, 0, 192);
                o0VarE = o0VarE;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-587455312);
                    c1 c1Var = c1.f110940a;
                    String strQ4 = gl1.y.Q(o0VarE, R.string.read_permission_title);
                    String strQ5 = gl1.y.Q(o0VarE, R.string.read_phone_contacts_permission_message);
                    String strQ6 = gl1.y.Q(o0VarE, R.string.label_allow_contacts_access);
                    boolean zR3 = o0VarE.r(qVarC);
                    Object objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new c42.g(qVarC, p1Var, i18);
                        o0VarE.K(objQ5);
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ5;
                    String strQ7 = gl1.y.Q(o0VarE, R.string.not_now_lbl);
                    Object objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new i11.i(p1Var, 15);
                        o0VarE.K(objQ6);
                    }
                    c1Var.a(false, strQ4, strQ5, null, null, strQ6, false, false, aVar3, strQ7, (e23.a) objQ6, o0VarE, 0, 6, 217);
                    o0VarE = o0VarE;
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(-586868141);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(list, fVar, i0Var, z14, aVar, i14);
        }
    }
}
