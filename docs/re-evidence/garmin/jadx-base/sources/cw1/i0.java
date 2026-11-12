package cw1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import g02.b2;
import java.util.Arrays;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {
    public static final void a(h4.r rVar, jv1.x xVar, boolean z14, int i14, int i15, e23.l<? super jv1.x, Unit> lVar, p3.m mVar, int i16) {
        String strJ;
        rVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1483419046);
        int i17 = i16 | (o0VarE.k(xVar == null ? -1 : xVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(xVar != null, o0VarE);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(xVar);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarE, R.string.how_to_end_your_plan), null, null, null, null, o0VarE, (i17 >> 3) & 8176, 480);
            o0VarE = o0VarE;
            o0VarE.C(-577633591);
            w13.c cVar = jv1.x.f101173e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                jv1.x xVar2 = (jv1.x) bVarN.next();
                boolean z15 = p1Var2.getF182175a() == xVar2;
                if (z15) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 356582900, R.string.selected, o0VarE, false);
                } else {
                    o0VarE.C(-1830789456);
                    o0VarE.g0(false);
                    strJ = "";
                }
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String str = String.format("%s. %s", Arrays.copyOf(new Object[]{gl1.y.Q(o0VarE, xVar2.f101174a), strJ}, 2));
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str);
                b92.a aVarB = c0235a.b();
                String strQ = gl1.y.Q(o0VarE, xVar2.f101174a);
                boolean zK = o0VarE.k(xVar2.ordinal());
                Object objQ3 = o0VarE.q();
                if (zK || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new g0(p1Var2, xVar2, p1Var);
                    o0VarE.K(objQ3);
                }
                int i18 = b92.a.f16960b;
                r.a(null, strQ, aVarB, z15, false, (e23.a) objQ3, o0VarE, 0, 17);
            }
            o0VarE.g0(false);
            c2.l.f(b0Var.a(h4.r.S, 1.0f, true), o0VarE);
            b82.c.b(null, null, z3.f.c(-1796952069, new h0(lVar, p1Var, p1Var2, 0), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(rVar, xVar, z14, i14, i15, lVar, i16);
        }
    }
}
