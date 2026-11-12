package g02;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import i3.ua;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 {
    public static final void a(Object obj, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(568425773);
        int i15 = (o0VarE.r(obj) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            wf.f.a aVar2 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar2.f184930c = obj;
            wf.g.a(aVar2);
            b(aVar2, aVar, o0VarE, i15 & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(obj, aVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(wf.f.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.a<Unit> aVar3;
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1861481310);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1227752675);
                c2.j.f22691a.getClass();
                c2.j.c cVar2 = c2.j.f22696f;
                h4.d.f81522a.getClass();
                h4.g.a aVar4 = h4.d.a.f81537o;
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarD = x2.d(aVar5, 1.0f);
                long jB = am.j.B(d92.b.f58623a, o0VarE);
                d92.b.f58625c.getClass();
                g6.f.a aVar6 = g6.f.f75994b;
                h4.r rVarY = c2.l.y(u1.n.e(rVarD, jB, k2.i.a(j92.b.f97899b.f97918c)), 16);
                c2.z zVarA = c2.y.a(cVar2, aVar4, o0VarE, 54);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar7 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
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
                c2.b0 b0Var = c2.b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, R.string.loading_error_sentence_case);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                d6.h.f57752b.getClass();
                mh.c(strQ, b0Var.b(x2.f(aVar5, 1.0f), aVar4), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                c2.l.f(x2.h(aVar5, 24), o0VarE);
                l72.f0.a aVar8 = l72.f0.a.f111000a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_retry);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new et1.a2(p1Var2, 26);
                    o0VarE.K(objQ3);
                }
                aVar8.f(strQ2, null, false, (e23.a) objQ3, o0VarE, 3072, 6);
                o0VarE.g0(true);
                o0VarE.g0(false);
                aVar3 = aVar2;
            } else {
                o0VarE.C(-1226754072);
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                h4.r.a aVar9 = h4.r.S;
                f5.z0 z0VarD = c2.q.d(gVar, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar9, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar10 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar10);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                wf.f fVarA = aVar.a();
                f5.k.f68985a.getClass();
                f5.k.a.d dVar = f5.k.a.f68990e;
                String strQ3 = gl1.y.Q(o0VarE, R.string.social_photo);
                h4.r rVarF = x2.f(aVar9, 1.0f);
                boolean z14 = (i15 & 112) == 32;
                Object objQ4 = o0VarE.q();
                if (z14 || objQ4 == c2565a) {
                    objQ4 = new h0(aVar2, 2);
                    o0VarE.K(objQ4);
                }
                h4.r rVarD2 = u1.w.d(rVarF, false, null, null, (e23.a) objQ4, 15);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new et1.b2(p1Var, 19);
                    o0VarE.K(objQ5);
                }
                e23.l lVar = (e23.l) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new et1.b2(p1Var, 20);
                    o0VarE.K(objQ6);
                }
                e23.l lVar2 = (e23.l) objQ6;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new am.c1(p1Var2, p1Var, 8);
                    o0VarE.K(objQ7);
                }
                aVar3 = aVar2;
                jf.r.b(fVarA, strQ3, rVarD2, null, null, null, lVar, lVar2, (e23.l) objQ7, null, dVar, null, o0VarE, 114819072, 6, 31288);
                o0VarE = o0VarE;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(720077972);
                    ua.a(0.0f, 0.0f, 0, 0, 61, hb.a.d(d92.b.f58623a, o0VarE), 0L, null, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(720164462);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            aVar3 = aVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew1.r1(aVar, aVar3, i14, 23);
        }
    }
}
