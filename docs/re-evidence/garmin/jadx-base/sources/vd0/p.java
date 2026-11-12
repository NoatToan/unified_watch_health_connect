package vd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import i3.mh;
import i3.ua;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    public static final void a(int i14, ActivityListItemDTO activityListItemDTO, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        p3.o0 o0Var;
        String str;
        String str2;
        pi0.e eVar;
        DateTime dateTimeN;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1557226675);
        int i15 = i14 | (o0VarE.r(activityListItemDTO) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(activityListItemDTO.f29259e);
            Object objQ = o0VarE.q();
            String strC = "";
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                str = activityListItemDTO.f29259e;
                context.getClass();
                if (str != null) {
                    objQ = "";
                } else {
                    objQ = "";
                }
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    str = activityListItemDTO.f29259e;
                    context.getClass();
                    if (str != null || d53.w.J(str)) {
                        objQ = "";
                    } else {
                        pi0.e eVar2 = new pi0.e(context);
                        DateTime dateTimeN2 = c22.j0.N(str, false);
                        if (dateTimeN2 == null) {
                            objQ = "";
                        } else {
                            objQ = eVar2.a(dateTimeN2, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                        }
                    }
                    o0VarE.K(objQ);
                }
            }
            String str3 = (String) objQ;
            boolean zB2 = o0VarE.B(activityListItemDTO.f29259e);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                str2 = activityListItemDTO.f29259e;
                context.getClass();
                if (str2 != null) {
                    eVar = new pi0.e(context);
                    dateTimeN = c22.j0.N(str2, false);
                    if (dateTimeN != null) {
                        strC = eVar.c(dateTimeN, qi0.f.RELATIVE_24H_AM_PM_TIME);
                    }
                }
                o0VarE.K(strC);
                objQ2 = strC;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    str2 = activityListItemDTO.f29259e;
                    context.getClass();
                    if (str2 != null && !d53.w.J(str2)) {
                        eVar = new pi0.e(context);
                        dateTimeN = c22.j0.N(str2, false);
                        if (dateTimeN != null) {
                            strC = eVar.c(dateTimeN, qi0.f.RELATIVE_24H_AM_PM_TIME);
                        }
                    }
                    o0VarE.K(strC);
                    objQ2 = strC;
                }
            }
            String str4 = (String) objQ2;
            boolean zM = o0VarE.m(activityListItemDTO.f29273j);
            Object objQ3 = o0VarE.q();
            if (zM) {
                objQ3 = u00.b.c(new ns.p(new l22.a(context), false, false, null, null, 30, null), Double.valueOf(activityListItemDTO.f29273j), 0, 6);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = u00.b.c(new ns.p(new l22.a(context), false, false, null, null, 30, null), Double.valueOf(activityListItemDTO.f29273j), 0, 6);
                    o0VarE.K(objQ3);
                }
            }
            h4.r rVarF = u1.w.f(255, null, aVar, rVar, null, false);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97918c;
            bVar.getClass();
            float f15 = eVar3.f97918c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, f15, f14, eVar3.f97918c, 0.0f, 8);
            z3.e eVarC = z3.f.c(409495122, new o(activityListItemDTO, z14, (String) objQ3, str3, str4), o0VarE);
            o0Var = o0VarE;
            l72.l.f(eVarC, rVarC, false, null, o0Var, 6, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(activityListItemDTO, z14, aVar, rVar, i14, 17);
        }
    }

    public static final void b(ActivityListItemDTO activityListItemDTO, boolean z14, String str, String str2, String str3, p3.m mVar, int i14) {
        h5.e0.a aVar;
        h5.g.a.b bVar;
        p3.o0 o0VarE = mVar.E(737332396);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(activityListItemDTO) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            s2 s2VarA = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            u4.d dVarS = activityListItemDTO.f29265g.s(z14);
            f02.e.f67730a.getClass();
            long jB = f02.e.b(o0VarE);
            long jA = n5.a.a(o0VarE, activityListItemDTO.f29265g.f4366i);
            bVar2.getClass();
            g02.i.a(null, dVarS, jB, jA, eVar.f97923h, 0.0f, null, o0VarE, 0, 225);
            h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
            bVar2.getClass();
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, f14, 0.0f, eVar.f97920e, 0.0f, 10);
            bVar2.getClass();
            c2.z zVarA = c2.y.a(c2.j.i(eVar.f97917b), h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar3;
                o0VarE.M(aVar);
            } else {
                aVar = aVar3;
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar4;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar4;
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strJ = activityListItemDTO.f29253c;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 383918378, R.string.txt_untitle, o0VarE, false);
            } else {
                o0VarE.C(383917603);
                o0VarE.g0(false);
            }
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            h5.g.a.b bVar5 = bVar;
            h5.e0.a aVar4 = aVar;
            mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.C(-982949870);
            String strP = gl1.y.P(R.string.string_at_string_pattern, new Object[]{str2, str3}, o0VarE);
            fVar2.getClass();
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(false);
            o0VarE.g0(true);
            s2 s2VarA2 = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar5);
            }
            b4.c(fVar, rVarC4, o0VarE);
            if (str != null) {
                o0VarE.C(1749747685);
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1749910094);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(activityListItemDTO, z14, str, str2, str3, i14);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(253152662);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String strQ = gl1.y.Q(o0VarE, R.string.msg_no_activities);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vc0.i(i14, 2);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(356114247);
        int i15 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            ua.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, null, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vc0.i(i14, i15);
        }
    }

    public static final void e(zc.d<ActivityListItemDTO> dVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1033793201);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = (oe0.g) KoinJavaComponent.get$default(oe0.g.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            z02.d.a(false, z3.f.c(-959788810, new s70.a0(aVar, 25), o0VarE), null, null, null, z3.f.c(37324794, new tb0.h(dVar, 24, (oe0.g) objQ, context), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u91.i(dVar, aVar, i14, 22);
        }
    }
}
