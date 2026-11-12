package r22;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import p3.b4;
import p3.p2;
import v62.z4;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c8  */
    public static final void a(com.garmin.android.apps.connectmobile.badges.service.model.q qVar, p3.m mVar, int i14) {
        long jE;
        String strP;
        String strP2;
        float f14;
        h4.r.a aVar;
        boolean z14;
        j92.e eVar;
        u4.d dVarA;
        boolean z15 = qVar.f30663i;
        p3.o0 o0VarE = mVar.E(-1478492330);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
            if (z15) {
                o0VarE.C(803055550);
                jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(803056734);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
            }
            h4.r rVarE = u1.n.e(rVarX, jE, o4.m1.f128891a);
            boolean z16 = (qVar.getHasPrivate() || z15) ? false : true;
            boolean zR = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(qVar))) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new qn0.f(context, qVar);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qn0.f(context, qVar);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, z16, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            float f16 = eVar2.f97920e;
            h4.r rVarC2 = c2.l.C(aVar2, f15, 0.0f, 0.0f, 0.0f, 14);
            String strValueOf = String.valueOf(qVar.f30662h);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            g6.f.a aVar5 = g6.f.f75994b;
            org.apache.commons.lang3.e.j(bVar3);
            h4.r rVarB = c2.l.B(aVar2, 10, f16, f16, f16);
            bVar3.getClass();
            j92.c cVar = j92.b.f97901d;
            b12.k.b(rVarB, null, cVar.f97906e, qVar.f30661g, o0VarE, b12.b.f14385f << 9, 18);
            h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
            String fullName = qVar.getFullName();
            if (fullName == null) {
                fullName = qVar.getDisplayName();
            }
            String strValueOf2 = String.valueOf(fullName);
            fVar.getClass();
            mh.c(strValueOf2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            if (!qVar.getHasPrivate() || z15) {
                o0VarE.C(-541712118);
                if (qVar.getUserPoint() == 1) {
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -541673337, R.string.lbl_user_level_points_abbr_singular, o0VarE, false);
                } else {
                    o0VarE.C(-541570479);
                    strP = gl1.y.P(R.string.social_points, new Object[]{String.valueOf(qVar.getUserPoint())}, o0VarE);
                    o0VarE.g0(false);
                }
                if (qVar.getUserPoint() == 1) {
                    strP2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -541380294, R.string.social_one_point, o0VarE, false);
                } else {
                    o0VarE.C(-541295571);
                    strP2 = gl1.y.P(R.string.lbl_number_points, new Object[]{String.valueOf(qVar.getUserPoint())}, o0VarE);
                    o0VarE.g0(false);
                }
                bVar3.getClass();
                float f17 = eVar2.f97917b;
                if (z15) {
                    bVar3.getClass();
                    float f18 = eVar2.f97917b;
                    bVar3.getClass();
                    f14 = f18 + f16;
                } else {
                    f14 = 0;
                }
                h4.r rVarC3 = c2.l.C(aVar2, f17, 0.0f, f14, 0.0f, 10);
                aVar = aVar2;
                boolean zB = o0VarE.B(strP2);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new o60.b(strP2, 15);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o60.b(strP2, 15);
                        o0VarE.K(objQ2);
                    }
                }
                h4.r rVarB2 = p5.v.b(rVarC3, (e23.l) objQ2);
                fVar.getClass();
                z14 = false;
                eVar = eVar2;
                mh.c(strP, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-540760728);
                o0VarE.g0(false);
                aVar = aVar2;
                z14 = false;
                eVar = eVar2;
            }
            if (z15) {
                o0VarE.C(-540309368);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-540683507);
                if (qVar.getHasPrivate()) {
                    s62.a.f157643a.getClass();
                    dVarA = z4.a(t62.b.f162798a);
                } else {
                    s62.a.f157643a.getClass();
                    dVarA = v62.j1.a(t62.b.f162798a);
                }
                long jD = d92.b.a(o0VarE).f().d();
                bVar3.getClass();
                h4.r rVarC4 = c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar3.getClass();
                p3.o0 o0Var = o0VarE;
                i7.b(dVarA, null, x2.q(rVarC4, cVar.f97903b), jD, o0Var, 48, 0);
                o0VarE = o0Var;
                o0VarE.g0(z14);
            }
            bVar3.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l72.y0(qVar, i14, 16);
        }
    }
}
