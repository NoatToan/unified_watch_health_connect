package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import g02.b2;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, String str, List<? extends vt1.h> list, vt1.h hVar, e23.l<? super vt1.h, Unit> lVar, boolean z14, int i14, int i15, p3.m mVar, int i16, int i17) {
        boolean z15;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z16;
        int i26;
        String str2;
        String strJ;
        p3.o0 o0VarE = mVar.E(-714065542);
        p3.c<?> cVar = o0VarE.f135177b;
        int i27 = i16 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.k(hVar == null ? -1 : hVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        int i28 = i17 & 32;
        if (i28 != 0) {
            i18 = i27 | 196608;
            z15 = z14;
        } else {
            z15 = z14;
            i18 = i27 | (o0VarE.h(z15) ? 131072 : 65536);
        }
        int i29 = i17 & 64;
        if (i29 != 0) {
            i24 = i18 | 1572864;
            i19 = i14;
        } else {
            i19 = i14;
            i24 = i18 | (o0VarE.k(i19) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i30 = i17 & 128;
        int i34 = i30 != 0 ? i24 | 12582912 : i24 | (o0VarE.k(i15) ? 8388608 : 4194304);
        if (o0VarE.n(i34 & 1, (4793491 & i34) != 4793490)) {
            boolean z17 = i28 != 0 ? false : z15;
            int i35 = i29 != 0 ? 0 : i19;
            int i36 = i30 != 0 ? 0 : i15;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(hVar);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            int i37 = i34;
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            boolean z18 = z17;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            int i38 = 1;
            h4.r rVarB = a2.b(b0Var.a(rVarF, 1.0f, true), a2.a(o0VarE), true);
            c2.z zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
            int i39 = i35;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z18, i39, i36, gl1.y.Q(o0VarE, R.string.select_strength_training_type_for_workouts), gl1.y.P(R.string.receive_personalized_workout_recommendations, new Object[]{str}, o0VarE), null, null, null, o0VarE, (i37 >> 12) & 8176, 448);
            int i44 = i36;
            o0VarE.C(-651600830);
            for (vt1.h hVar2 : list) {
                boolean z19 = ((vt1.h) p1Var.getF182175a()) == hVar2 ? i38 : 0;
                String strQ = gl1.y.Q(o0VarE, hVar2.f180121b);
                x1 x1Var2 = p3.n.f135158a;
                Integer num = hVar2.f180122c;
                if (num != null) {
                    o0VarE.C(495123591);
                    String strQ2 = gl1.y.Q(o0VarE, num.intValue());
                    o0VarE.g0(false);
                    str2 = strQ2;
                } else {
                    o0VarE.C(-1830992881);
                    o0VarE.g0(false);
                    str2 = null;
                }
                if (z19 != 0) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2038369480, R.string.selected, o0VarE, false);
                } else {
                    o0VarE.C(1235143259);
                    o0VarE.g0(false);
                    strJ = "";
                }
                b92.a.C0235a c0235a = new b92.a.C0235a(null, i38, null);
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                if (str2 != null) {
                    linkedHashMap.put("merge", j20.x.d(strQ, ". ", str2, ". ", strJ));
                } else {
                    linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strQ + ". " + strJ);
                }
                b92.a aVarB = c0235a.b();
                if (str2 != null) {
                    o0VarE.C(1235660837);
                    boolean zK = o0VarE.k(hVar2.ordinal());
                    Object objQ2 = o0VarE.q();
                    if (zK || objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cn1.d(13, hVar2, p1Var);
                        o0VarE.K(objQ2);
                    }
                    int i45 = b92.a.f16960b;
                    r.b(null, strQ, str2, aVarB, z19, false, (e23.l) objQ2, o0VarE, 0, 33);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1235995327);
                    boolean zK2 = o0VarE.k(hVar2.ordinal());
                    Object objQ3 = o0VarE.q();
                    if (zK2 || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ca0.j1(19, hVar2, p1Var);
                        o0VarE.K(objQ3);
                    }
                    int i46 = b92.a.f16960b;
                    r.a(null, strQ, aVarB, z19, false, (e23.a) objQ3, o0VarE, 0, 17);
                    o0VarE.g0(false);
                }
                i38 = 1;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            b82.c.b(null, null, z3.f.c(635436549, new bt1.k(lVar, p1Var, 4), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            i26 = i39;
            i25 = i44;
            z16 = z18;
        } else {
            o0VarE.e();
            i25 = i15;
            z16 = z15;
            i26 = i19;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.j(rVar, str, list, hVar, lVar, z16, i26, i25, i16, i17);
        }
    }
}
