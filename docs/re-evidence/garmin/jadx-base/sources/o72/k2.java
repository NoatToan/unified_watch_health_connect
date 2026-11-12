package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Set;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class k2 {
    /* JADX WARN: Code duplicated, block: B:12:0x006c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099  */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(332423855);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            c2.l.f(c2.l.A(h4.r.S, 0.0f, 8, 1), o0VarE);
            int i15 = 6;
            m72.f.c("Headers for list items and stat bits", o0VarE, 6);
            v0.f130623a.getClass();
            l72.r1.b("Badges", v0.f130624b, o0VarE, 54, 0);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l72.r1.b("Timing", z3.f.c(60977665, new br2.a(context, 14), o0VarE), o0VarE, 54, 0);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new f(context, i15);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(context, i15);
                    o0VarE.K(objQ);
                }
            }
            l72.r1.c("Nutrition & Hydration", "Help", (e23.a) objQ, false, null, v0.f130625c, o0VarE, 196662, 24);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            int i16 = 7;
            if (zR2) {
                objQ2 = new f(context, i16);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(context, i16);
                    o0VarE.K(objQ2);
                }
            }
            l72.r1.c("Header with very very very very very very very very very long title", "Help", (e23.a) objQ2, false, null, v0.f130626d, o0VarE, 196662, 24);
            m72.f.c("One Line Row", o0VarE, 6);
            l72.p2 p2Var = l72.p2.f111205a;
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new i0(29);
                o0VarE.K(objQ3);
            }
            p2Var.g("Label", null, null, null, null, false, false, (e23.a) objQ3, o0VarE, 100663302, 254);
            p2Var.g("Label - No click action", null, null, null, null, false, false, null, o0VarE, 6, 510);
            p2Var.g("Label - Disabled", null, null, null, null, false, false, null, o0VarE, 196614, 478);
            z3.e eVar = v0.f130627e;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new i2(0);
                o0VarE.K(objQ4);
            }
            p2Var.g("Label with leading content", null, null, eVar, null, false, false, (e23.a) objQ4, o0VarE, 100666374, 246);
            z3.e eVar2 = v0.f130628f;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new i2(1);
                o0VarE.K(objQ5);
            }
            p2Var.g("Label with trailing content", null, null, null, eVar2, false, false, (e23.a) objQ5, o0VarE, 100687878, 238);
            z3.e eVar3 = v0.f130629g;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new i2(2);
                o0VarE.K(objQ6);
            }
            p2Var.g("Label with trailing", null, null, null, eVar3, false, false, (e23.a) objQ6, o0VarE, 100687878, 238);
            z3.e eVar4 = v0.f130630h;
            z3.e eVar5 = v0.f130631i;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new i2(3);
                o0VarE.K(objQ7);
            }
            p2Var.g("Label with leading and trailing content", null, null, eVar4, eVar5, false, false, (e23.a) objQ7, o0VarE, 100690950, 230);
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ8);
            }
            p3.p1 p1Var = (p3.p1) objQ8;
            z3.e eVarC = z3.f.c(-985011657, new li0.w(p1Var, 14), o0VarE);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new j2(p1Var, 0);
                o0VarE.K(objQ9);
            }
            p2Var.g("Label with checkbox", null, null, null, eVarC, false, false, (e23.a) objQ9, o0VarE, 100687878, 238);
            m72.f.c("Two Line List Row", o0VarE, 6);
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new i0(28);
                o0VarE.K(objQ10);
            }
            p2Var.h("Label", "Meta", null, null, null, false, false, null, null, null, (e23.a) objQ10, o0VarE, 54, 6, 1020);
            s62.a.f157643a.getClass();
            t62.b bVar = t62.b.f162798a;
            u4.d dVarA = z4.a(bVar);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = new i2(4);
                o0VarE.K(objQ11);
            }
            p2Var.h("Label", "Meta", dVarA, null, null, false, false, null, null, null, (e23.a) objQ11, o0VarE, 54, 6, 1016);
            p2Var.h("Label", "Meta", null, null, null, false, false, null, null, null, null, o0VarE, 196662, 0, 2012);
            m72.f.c("Two Line List Row - with drawable param (default image size)", o0VarE, 6);
            z3.e eVar6 = v0.f130632j;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = new i2(5);
                o0VarE.K(objQ12);
            }
            p2Var.h("Label", "Meta", null, null, null, false, false, eVar6, null, null, (e23.a) objQ12, o0VarE, 12582966, 6, 892);
            p2Var.h("Label", "Meta", null, null, null, false, false, v0.f130633k, null, null, null, o0VarE, 12779574, 0, 1884);
            m72.f.c("Two Line List Row - leading content with image as url image content", o0VarE, 6);
            p2Var.h("Label", "Meta", z4.a(bVar), null, null, false, false, z3.f.c(1260478136, new z1(14), o0VarE), null, null, null, o0VarE, 12582966, 0, 1912);
            m72.f.c("Two Line List Row - leading and trailing content", o0VarE, 6);
            p2Var.h("Label", "Meta", null, null, null, false, false, v0.f130634l, v0.f130635m, null, null, o0VarE, 113246262, 0, 1660);
            Object objQ13 = o0VarE.q();
            if (objQ13 == c2565a) {
                objQ13 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ13);
            }
            p3.p1 p1Var2 = (p3.p1) objQ13;
            z3.e eVarC2 = z3.f.c(1934497817, new li0.w(p1Var2, 15), o0VarE);
            Object objQ14 = o0VarE.q();
            if (objQ14 == c2565a) {
                objQ14 = new j2(p1Var2, 1);
                o0VarE.K(objQ14);
            }
            p2Var.h("Label", "Meta", null, null, null, false, false, null, eVarC2, null, (e23.a) objQ14, o0VarE, 100663350, 6, 764);
            m72.f.c("Multi Line List Row", o0VarE, 6);
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                objQ15 = new i2(6);
                o0VarE.K(objQ15);
            }
            p2Var.d(805306806, 504, (e23.a) objQ15, null, null, o0VarE, false);
            Object objQ16 = o0VarE.q();
            if (objQ16 == c2565a) {
                objQ16 = new i2(7);
                o0VarE.K(objQ16);
            }
            p2Var.d(805503414, 472, (e23.a) objQ16, null, null, o0VarE, false);
            m72.f.c("Multi Line List Row - with drawable param (default image size)", o0VarE, 6);
            z3.e eVar7 = v0.f130636n;
            Object objQ17 = o0VarE.q();
            if (objQ17 == c2565a) {
                objQ17 = new i2(8);
                o0VarE.K(objQ17);
            }
            p2Var.d(817889718, 376, (e23.a) objQ17, eVar7, null, o0VarE, false);
            p2Var.e(null, false, null, v0.f130637o, null, o0VarE, 100663734, 0, 1784);
            p2Var.e(null, false, v0.f130638p, v0.f130639q, null, o0VarE, 113246646, 0, 1656);
            p2Var.d(12779958, 856, null, v0.f130640r, null, o0VarE, false);
            m72.f.c("Multi Line List Row - leading content with image as url image content", o0VarE, 6);
            p2Var.d(12583350, 888, null, z3.f.c(-1772375642, new z1(12), o0VarE), null, o0VarE, false);
            m72.f.c("Swipe to delete - EndToStart - with Two Line List Row", o0VarE, 6);
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                objQ18 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ18);
            }
            o53.b0 b0Var = (o53.b0) objQ18;
            c92.a aVar3 = c92.a.DELETE;
            Set setB = p13.a1.b(new c92.b.a(aVar3, "Delete"));
            Object objQ19 = o0VarE.q();
            if (objQ19 == c2565a) {
                objQ19 = new i0(25);
                o0VarE.K(objQ19);
            }
            l72.l2.a(setB, b0Var, false, null, (e23.a) objQ19, v0.f130641s, z3.f.c(-877680537, new ho0.f(context, 2), o0VarE), o0VarE, 1794048, 12);
            m72.f.c("Swipe to delete - StartToEnd - with Two Line List Row", o0VarE, 6);
            Object objQ20 = o0VarE.q();
            if (objQ20 == c2565a) {
                objQ20 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ20);
            }
            o53.b0 b0Var2 = (o53.b0) objQ20;
            Set setB2 = p13.a1.b(new c92.b.C0397b(aVar3, "Delete"));
            Object objQ21 = o0VarE.q();
            if (objQ21 == c2565a) {
                objQ21 = new i0(26);
                o0VarE.K(objQ21);
            }
            l72.l2.a(setB2, b0Var2, false, null, (e23.a) objQ21, v0.f130642t, z3.f.c(-637439394, new ho0.f(context, 3), o0VarE), o0VarE, 1794048, 12);
            m72.f.c("Swipe to delete - StartToEnd & EndToStart - with Two Line List Row", o0VarE, 6);
            Object objQ22 = o0VarE.q();
            if (objQ22 == c2565a) {
                objQ22 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ22);
            }
            o53.b0 b0Var3 = (o53.b0) objQ22;
            Set setM0 = p13.u.m0(new c92.b[]{new c92.b.C0397b(aVar3, "Delete"), new c92.b.a(aVar3, "Delete")});
            Object objQ23 = o0VarE.q();
            if (objQ23 == c2565a) {
                objQ23 = new i0(27);
                o0VarE.K(objQ23);
            }
            l72.l2.a(setM0, b0Var3, false, null, (e23.a) objQ23, v0.f130643u, z3.f.c(856473055, new ho0.f(context, 4), o0VarE), o0VarE, 1794048, 12);
            o0VarE = o0VarE;
            m72.f.c("Loading list footer", o0VarE, 6);
            p2Var.a("Loading...", o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 13);
        }
    }
}
