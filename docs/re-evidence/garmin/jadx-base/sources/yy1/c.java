package yy1;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import l72.c1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, long j8, e23.a aVar, p3.m mVar, boolean z14) {
        int i15;
        p3.m.a.C2565a c2565a;
        boolean z15;
        boolean z16;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1241303908);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(50567576);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_strategies_header);
                d92.b.f58624b.getClass();
                c2565a = c2565a2;
                z15 = false;
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                c2565a = c2565a2;
                z15 = false;
                o0VarE.C(50793318);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.y(aVar2, j92.b.f97899b.f97920e), o0VarE);
                o0VarE.g0(false);
            }
            String strValueOf = String.valueOf(j8);
            boolean z17 = (i15 & 14) == 4 ? true : z15;
            int i16 = i15 & 896;
            boolean z18 = (i16 == 256 ? true : z15) | z17;
            Object objQ2 = o0VarE.q();
            if (z18 || objQ2 == c2565a) {
                z16 = true;
                objQ2 = new lm0.m(1, aVar, p1Var, z14);
                o0VarE.K(objQ2);
            } else {
                z16 = true;
            }
            bb1.f.a(0, 2, (e23.l) objQ2, strValueOf, o0VarE, false);
            z21.f.b(z15, o0VarE, 6);
            o0VarE.g0(z16);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-15299367);
                c1 c1Var = c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.power_guide_create_lbl);
                String strQ3 = gl1.y.Q(o0VarE, R.string.power_guide_assign_shared_event_message);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                if (i16 != 256) {
                    z16 = z15;
                }
                Object objQ3 = o0VarE.q();
                if (z16 || objQ3 == c2565a) {
                    objQ3 = new w52.p1(aVar, p1Var, 6);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ3;
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new l0(p1Var, 8);
                    o0VarE.K(objQ4);
                }
                o0 o0Var = o0VarE;
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar4, strQ5, (e23.a) objQ4, o0Var, 0, 6, 217);
                o0VarE = o0Var;
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-14764090);
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.s(i14, j8, aVar, z14);
        }
    }
}
