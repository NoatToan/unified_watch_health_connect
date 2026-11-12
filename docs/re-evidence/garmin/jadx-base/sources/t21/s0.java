package t21;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(s21.c0 c0Var, p3.m mVar, int i14) {
        p3.o0 o0Var;
        ArrayList<o13.p> arrayList;
        o13.p pVar;
        p3.o0 o0VarE = mVar.E(248989361);
        int i15 = i14 | (o0VarE.r(c0Var) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            float f15 = eVar.f97920e;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, 0.0f, 13);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarC, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC2, f15, 0.0f, 2);
            c2.j.i iVarG = q2.g(bVar, c2.j.f22691a, f15);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.label_disconnect_mfp_button);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new u(7);
                o0VarE.K(objQ);
            }
            String strB = oi0.c.B(strQ, (e23.l) objQ, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.setting_up_nutrition_requires_disconnecting_myfitnesspal_v2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new u(8);
                o0VarE.K(objQ2);
            }
            String strB2 = oi0.c.B(strQ2, (e23.l) objQ2, o0VarE);
            i53.c<s92.b> cVar = c0Var != null ? c0Var.f156087d : null;
            if (cVar == null) {
                o0VarE.C(-2111314355);
                o0VarE.g0(false);
                arrayList = null;
            } else {
                o0VarE.C(-2111314354);
                ArrayList arrayList2 = new ArrayList();
                Iterator<s92.b> it = cVar.iterator();
                while (it.hasNext()) {
                    String copy = it.next().getCopy();
                    if (copy == null) {
                        o0VarE.C(-1998632120);
                        o0VarE.g0(false);
                        pVar = null;
                    } else {
                        o0VarE.C(-1998632119);
                        String strV = d53.u.v(copy, "[APP]", gl1.y.Q(o0VarE, R.string.lbl_my_fitness_pal), false);
                        Object objQ3 = o0VarE.q();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new u(9);
                            o0VarE.K(objQ3);
                        }
                        pVar = new o13.p(strV, oi0.c.B(strV, (e23.l) objQ3, o0VarE));
                        o0VarE.g0(false);
                    }
                    if (pVar != null) {
                        arrayList2.add(pVar);
                    }
                }
                o0VarE.g0(false);
                arrayList = arrayList2;
            }
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
            boolean zB = o0VarE.B(strB);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == p3.m.a.f135155b) {
                objQ4 = new s70.r0(strB, 12);
                o0VarE.K(objQ4);
            }
            h4.r rVarC5 = p5.v.c((e23.l) objQ4, rVarC4, false);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57757g;
            d6.h hVarA = d6.h.a(i16);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC5, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130044);
            h4.r rVarF3 = x2.f(aVar2, 1.0f);
            boolean zB2 = o0VarE.B(strB2);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == p3.m.a.f135155b) {
                objQ5 = new s70.r0(strB2, 13);
                o0VarE.K(objQ5);
            }
            h4.r rVarC6 = p5.v.c((e23.l) objQ5, rVarF3, false);
            d6.h hVarA2 = d6.h.a(i16);
            fVar.getClass();
            mh.c(strQ2, rVarC6, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            if (arrayList == null) {
                o0Var.C(-2110210228);
                o0Var.g0(false);
            } else {
                o0Var.C(-2110210227);
                for (o13.p pVar2 : arrayList) {
                    String str = (String) pVar2.f128594a;
                    String str2 = (String) pVar2.f128595b;
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    boolean zB3 = o0Var.B(str2);
                    Object objQ6 = o0Var.q();
                    if (zB3 || objQ6 == p3.m.a.f135155b) {
                        objQ6 = new s70.r0(str2, 14);
                        o0Var.K(objQ6);
                    }
                    h4.r rVarC7 = p5.v.c((e23.l) objQ6, rVarF4, false);
                    d6.h.f57752b.getClass();
                    d6.h hVarA3 = d6.h.a(d6.h.f57757g);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    p3.o0 o0Var2 = o0Var;
                    mh.c(str, rVarC7, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, o0Var), o0Var2, 0, 0, 130044);
                    o0Var = o0Var2;
                }
                o0Var.g0(false);
                Unit unit = Unit.INSTANCE;
            }
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(c0Var, i14, 21);
        }
    }
}
