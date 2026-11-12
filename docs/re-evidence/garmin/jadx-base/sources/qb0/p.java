package qb0;

import bd0.b0;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import o4.d0;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import p40.k0;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, o90.a aVar, b0 b0Var, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0Var2;
        String str2;
        p1 p1Var;
        boolean z14;
        p3.m.a.C2565a c2565a;
        String strJ;
        str.getClass();
        aVar.getClass();
        b0Var.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(501578503);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.k(b0Var.ordinal()) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 980613662, R.string.pregnancy_something_went_wrong, o0VarE, false);
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 980617813, R.string.software_update_error, o0VarE, false);
            s62.a.f157643a.getClass();
            u4.d dVarA = fa.a(t62.b.f162798a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(334619151);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.software_update_confirm);
                String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
                boolean z15 = (i15 & 57344) == 16384;
                Object objQ2 = o0VarE.q();
                if (z15 || objQ2 == c2565a2) {
                    objQ2 = new j0(aVar3, p1Var2, 2);
                    o0VarE.K(objQ2);
                }
                str2 = strJ3;
                p1Var = p1Var2;
                c2565a = c2565a2;
                z14 = false;
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, (e23.a) objQ2, null, null, o0VarE, 0, 0, 1755);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                o0Var2 = o0VarE;
                str2 = strJ3;
                p1Var = p1Var2;
                z14 = false;
                c2565a = c2565a2;
                o0Var2.C(334907451);
                o0Var2.g0(false);
            }
            Object objQ3 = o0Var2.q();
            if (objQ3 == c2565a) {
                objQ3 = new k0(p1Var, 27);
                o0Var2.K(objQ3);
            }
            w.a(48, 1, (e23.a) objQ3, o0Var2, z14);
            d92.b.f58623a.getClass();
            long jF = d92.b.a(o0Var2).f().f();
            String strQ3 = y.Q(o0Var2, R.string.lbl_retry);
            e23.a aVar4 = null;
            if (aVar3 == null) {
                o0Var2.C(335360918);
                o0Var2.g0(z14);
                strJ = null;
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var2, 980649775, R.string.lbl_skip_button, o0Var2, z14);
            }
            if (aVar3 == null) {
                o0Var2.C(335460863);
            } else {
                o0Var2.C(335495304);
                Object objQ4 = o0Var2.q();
                if (objQ4 == c2565a) {
                    objQ4 = new k0(p1Var, 28);
                    o0Var2.K(objQ4);
                }
                aVar4 = (e23.a) objQ4;
            }
            o0Var2.g0(z14);
            e23.a aVar5 = aVar4;
            d0 d0VarA = d0.a(jF);
            z3.e eVarC = z3.f.c(-595952696, new j21.p(str2, 17), o0Var2);
            int i16 = i15 << 3;
            o0Var = o0Var2;
            da0.p.c("firmware_update_failed_screen", str, aVar, strJ2, false, dVarA, null, d0VarA, strQ3, aVar2, false, strJ, aVar5, false, null, null, false, false, null, lVar, null, null, eVarC, o0Var, (i16 & 896) | (i16 & 112) | 6 | ((i15 << 18) & 1879048192), (i15 << 12) & 1879048192, 3072, 7857232);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(str, aVar, b0Var, aVar2, aVar3, lVar, i14, 7);
        }
    }
}
