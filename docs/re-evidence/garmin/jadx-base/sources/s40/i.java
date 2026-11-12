package s40;

import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import g02.q1;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.c1;
import l72.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import rk0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:65:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(t40.a aVar, m mVar, int i14) {
        String strW;
        boolean z14;
        o0 o0VarE = mVar.E(1397863208);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean z15 = aVar.f162262a;
            m.a aVar2 = m.f135153a;
            if (z15) {
                Object objH = q2.h(o0VarE, -259913456, aVar2);
                m.a.C2565a c2565a = m.a.f135155b;
                if (objH == c2565a) {
                    objH = p0.n(Boolean.FALSE);
                    o0VarE.K(objH);
                }
                p1 p1Var = (p1) objH;
                r.a aVar3 = r.S;
                r rVarF = x2.f(aVar3, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = l.y(rVarF, j92.b.f97899b.f97920e);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                x0.f23314a.getClass();
                String strW2 = gl1.d.W(x0.f23612rc);
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                s5.x0 x0Var = j92.f.f97933j;
                mh.c(strW2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.f(x0Var, o0VarE), 1.3f, o0VarE), o0VarE, 0, 0, 131070);
                Object objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new w(p1Var, 8);
                    o0VarE.K(objQ);
                }
                r rVarD = u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                String strQ = gl1.y.Q(o0VarE, aVar.f162263b ? R.string.lbl_exit_course_editor : R.string.lbl_exit_course_creator);
                fVar.getClass();
                mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(s5.x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 1.3f, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-259090065);
                    c1 c1Var = c1.f110940a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.title_exit_without_saving);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_exit);
                    boolean z16 = (i15 & 14) == 4;
                    Object objQ2 = o0VarE.q();
                    if (z16 || objQ2 == c2565a) {
                        objQ2 = new rk0.f(18, aVar, p1Var);
                        o0VarE.K(objQ2);
                    }
                    e23.a<Unit> aVar5 = (e23.a) objQ2;
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_close);
                    Object objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new w(p1Var, 9);
                        o0VarE.K(objQ3);
                    }
                    c1Var.a(false, strQ2, null, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ3, o0VarE, 6, 6, 220);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(-258556710);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-258533863);
                f0 f0Var = f0.f110999a;
                if (aVar.f162266e) {
                    strW = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -978169166, R.string.start_course_here, o0VarE, false);
                } else {
                    o0VarE.C(-978167624);
                    x0.f23314a.getClass();
                    strW = gl1.d.W(x0.f23327ac);
                    o0VarE.g0(false);
                }
                r rVarF2 = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY2 = l.y(rVarF2, j92.b.f97899b.f97920e);
                boolean z17 = (i15 & 14) == 4;
                Object objQ4 = o0VarE.q();
                if (z17) {
                    objQ4 = new ro0.g(aVar, 10);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new ro0.g(aVar, 10);
                        o0VarE.K(objQ4);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ4, rVarY2, strW, o0VarE, null, false);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(aVar, i14);
        }
    }
}
