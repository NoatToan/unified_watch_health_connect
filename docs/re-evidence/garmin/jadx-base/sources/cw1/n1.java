package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class n1 {
    /* JADX WARN: Code duplicated, block: B:54:0x01d0  */
    public static final void a(h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        h4.r rVar2;
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4;
        p3.o0 o0VarE = mVar.E(-733033450);
        int i17 = i14 | 6;
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i14 | 390;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 256 : 128);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r.a aVar5 = h4.r.S;
            p3.m.a aVar6 = p3.m.f135153a;
            if (i18 != 0) {
                Object objQ = o0VarE.q();
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new com.google.accompanist.drawablepainter.a(20);
                    o0VarE.K(objQ);
                }
                aVar3 = (e23.a) objQ;
            } else {
                aVar3 = aVar2;
            }
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar5, f16, f14, eVar.f97920e, 0.0f, 8);
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar7, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar5, 1.0f);
            String strQ = gl1.y.Q(o0VarE, z14 ? R.string.train_to_finish_with_plan : R.string.looking_for_more_options_question);
            d6.h.f57752b.getClass();
            int i19 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            e23.a<Unit> aVar9 = aVar3;
            mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 48, 0, 130044);
            h4.r rVarZ = x2.z(x2.f(aVar5, 1.0f), null, 3);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarZ, 0.0f, f15, 1);
            String strQ2 = gl1.y.Q(o0VarE, z14 ? R.string.selecting_plan_updates_goal : R.string.more_plans_available_without_goal_time);
            fVar.getClass();
            mh.c(strQ2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            if (z14) {
                aVar4 = aVar9;
                o0VarE.C(-1110123601);
                bVar.getClass();
                c2.l.f(x2.h(aVar5, f15), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1110345468);
                a82.c cVar = a82.c.f1991a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.view_more_plans);
                boolean z15 = (i16 & 896) == 256;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    aVar4 = aVar9;
                    objQ2 = new p0(aVar4, 3);
                    o0VarE.K(objQ2);
                } else {
                    aVar6.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        aVar4 = aVar9;
                        objQ2 = new p0(aVar4, 3);
                        o0VarE.K(objQ2);
                    } else {
                        aVar4 = aVar9;
                    }
                }
                cVar.b(strQ3, null, false, (e23.a) objQ2, o0VarE, 0, 6);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar2 = aVar5;
            aVar2 = aVar4;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.h(rVar2, z14, aVar2, i14, i15);
        }
    }
}
