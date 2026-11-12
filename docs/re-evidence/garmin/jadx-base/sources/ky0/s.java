package ky0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:53:0x0192  */
    public static final void a(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String strJ;
        e23.a<Unit> aVar3 = aVar;
        e23.a<Unit> aVar4 = aVar2;
        p3.o0 o0VarP = fb1.c.p(aVar3, aVar4, mVar, 1548804043);
        int i15 = i14 | (o0VarP.B(str) ? 4 : 2) | (o0VarP.r(aVar3) ? 32 : 16) | (o0VarP.r(aVar4) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(aVar5, o0VarP);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            u2 u2Var = u2.f22900a;
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23460ia);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarE = d92.c.e(j92.f.f97930g);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strW, c2.l.A(aVar5, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0VarP, 0, 0, 131068);
            o0VarP.g0(true);
            bVar2.getClass();
            c2.l.f(x2.h(aVar5, eVar.f97918c), o0VarP);
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarP, R.string.title_course);
            if (str == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -1952948163, R.string.pacepro_lbl_select_course, o0VarP, false);
            } else {
                o0VarP.C(-1952948597);
                o0VarP.g0(false);
                strJ = str;
            }
            a.f107168a.getClass();
            z3.e eVar2 = a.f107169b;
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4) | ((i15 & 896) == 256);
            Object objQ = o0VarP.q();
            if (z14) {
                aVar4 = aVar2;
                aVar3 = aVar;
                objQ = new kk1.a(str, 2, aVar3, aVar4);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar4 = aVar2;
                    aVar3 = aVar;
                    objQ = new kk1.a(str, 2, aVar3, aVar4);
                    o0VarP.K(objQ);
                } else {
                    aVar4 = aVar2;
                    aVar3 = aVar;
                }
            }
            o0Var = o0VarP;
            p2Var.h(strQ, strJ, null, null, null, false, false, null, eVar2, null, (e23.a) objQ, o0Var, 100663296, 0, 764);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.t(str, aVar3, aVar4, i14, 4);
        }
    }
}
