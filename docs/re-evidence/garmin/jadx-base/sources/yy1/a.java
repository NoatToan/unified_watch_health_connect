package yy1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f72.jd;
import h5.e0;
import i3.mh;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:37:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x021c  */
    public static final void a(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4 = aVar;
        o0 o0VarP = fb1.c.p(aVar4, aVar2, mVar, -1252704489);
        int i15 = i14 | (o0VarP.r(aVar4) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarD = x2.d(aVar5, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarD, eVar.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81537o, o0VarP, 54);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarP);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            s62.a.f157643a.getClass();
            u4.d dVarA = jd.a(t62.c.f162799a);
            long jD = am.j.d(o0VarP);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarP).b();
            bVar.getClass();
            g02.i.a(null, dVarA, jD, jB, j92.b.f97901d.f97907f, 0.0f, null, o0VarP, 0, 225);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar5, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarP, R.string.find_a_training_plan);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarP), o0VarP, 0, 0, 131068);
            h4.r rVarF = x2.f(aVar5, 1.0f);
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            String strQ2 = gl1.y.Q(o0VarP, R.string.find_new_training_plan_question);
            fVar.getClass();
            mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarP), o0VarP, 0, 0, 130044);
            o0VarP = o0VarP;
            c2.l.f(b0Var.a(aVar5, 1.0f, true), o0VarP);
            f0 f0Var = f0.f110999a;
            String strQ3 = gl1.y.Q(o0VarP, R.string.common_button_not_now);
            h4.r rVarF2 = x2.f(aVar5, 1.0f);
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar7 = p3.m.f135153a;
            if (z14) {
                aVar3 = aVar2;
                objQ = new ya0.l(aVar3, 28);
                o0VarP.K(objQ);
            } else {
                aVar7.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar3 = aVar2;
                    objQ = new ya0.l(aVar3, 28);
                    o0VarP.K(objQ);
                } else {
                    aVar3 = aVar2;
                }
            }
            f0Var.i(strQ3, rVarC4, false, (e23.a) objQ, o0VarP, 0, 4);
            String strQ4 = gl1.y.Q(o0VarP, R.string.itp_find_a_plan);
            h4.r rVarF3 = x2.f(aVar5, 1.0f);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                aVar4 = aVar;
                objQ2 = new ya0.l(aVar4, 29);
                o0VarP.K(objQ2);
            } else {
                aVar7.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    aVar4 = aVar;
                    objQ2 = new ya0.l(aVar4, 29);
                    o0VarP.K(objQ2);
                } else {
                    aVar4 = aVar;
                }
            }
            f0Var.d(384, 9, (e23.a) objQ2, rVarF3, strQ4, o0VarP, null, false);
            o0VarP.g0(true);
        } else {
            aVar3 = aVar2;
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.t(str, aVar4, aVar3, i14, 9);
        }
    }
}
