package cw1;

import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import i3.e5;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final boolean z14, final double d14, final e23.l lVar, final e23.l lVar2, final e23.a aVar, p3.m mVar, final int i14) {
        int i15;
        String strJ;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1798186119);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.m(d14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object[] objArr = new Object[0];
            boolean z15 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new y0(d14, 0);
                o0VarE.K(objQ2);
            }
            p3.n1 n1Var = (p3.n1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 0);
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int i16 = i15;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            String strQ = gl1.y.Q(o0VarE, R.string.this_is_a_time_based_event);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1125852718, R.string.selected, o0VarE, false);
            } else {
                o0VarE.C(-541608191);
                o0VarE.g0(false);
                strJ = "";
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ, ". ", strJ));
            b92.a aVarB = c0235a.b();
            int i17 = b92.a.f16960b;
            r.a(null, strQ, aVarB, z14, false, aVar, o0VarE, ((i16 << 6) & 7168) | (458752 & i16), 17);
            if (z14) {
                o0VarE.C(-541195920);
                l3.f23124b.getClass();
                String strE1 = l3.a.e1((long) d14);
                String str = strE1 == null ? "" : strE1;
                p2 p2Var = p2.f111205a;
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                String strQ2 = gl1.y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new k(p1Var, 6);
                    o0VarE.K(objQ3);
                }
                p2Var.h(strQ2, str, null, rVarC2, null, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 6, 1012);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-540709003);
                    int intValue = n1Var.getIntValue();
                    boolean z16 = ((57344 & i16) == 16384) | ((i16 & 7168) == 2048);
                    Object objQ4 = o0VarE.q();
                    if (z16 || objQ4 == c2565a) {
                        objQ4 = new z0(lVar, lVar2, p1Var, 0);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar3 = (e23.l) objQ4;
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new k(p1Var, 7);
                        o0VarE.K(objQ5);
                    }
                    g1.a(null, intValue, null, lVar3, null, (e23.a) objQ5, o0VarE, 12583344);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-540109339);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-540099419);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.a1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b1.a(rVar, z14, d14, lVar, lVar2, aVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
