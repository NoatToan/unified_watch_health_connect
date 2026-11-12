package rv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import c2.b0;
import c2.t0;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List<? extends yw1.m> list, p3.m mVar, int i14) {
        p1 p1Var;
        boolean z14;
        g1 g1Var;
        List<? extends yw1.m> list2 = list;
        list2.getClass();
        o0 o0VarE = mVar.E(-1094457241);
        int i15 = i14 | (o0VarE.r(list2) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(0);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(h0.b0(list2));
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            o0VarE.C(493586796);
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            for (yw1.m mVar2 : list2) {
                if (mVar2 instanceof yw1.n) {
                    o0VarE.C(-1413533602);
                    g1Var = new g1(gl1.y.Q(o0VarE, R.string.lbl_average), null, null, null, 14, null);
                    o0VarE.g0(false);
                } else {
                    if (!(mVar2 instanceof yw1.o)) {
                        throw kg.f.h(o0VarE, -1413535422, false);
                    }
                    o0VarE.C(-1413530596);
                    g1Var = new g1(gl1.y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null);
                    o0VarE.g0(false);
                }
                arrayList.add(g1Var);
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, uv1.d.f172951o.f172956a);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarB = b0Var.b(aVar, aVar2);
            bVar.getClass();
            mh.c(strQ, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            int iIntValue = ((Number) p1Var2.getF182175a()).intValue();
            list2 = list;
            boolean zR = o0VarE.r(list2);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == p3.m.a.f135155b) {
                p1Var = p1Var3;
                z14 = true;
                objQ3 = new a(list2, p1Var2, p1Var, 1);
                o0VarE.K(objQ3);
            } else {
                p1Var = p1Var3;
                z14 = true;
            }
            k1.a(fVarJ, iIntValue, rVarC2, null, 0.0f, (e23.l) objQ3, o0VarE, 0, 24);
            yw1.m mVar3 = (yw1.m) p1Var.getF182175a();
            if (mVar3 instanceof yw1.n) {
                o0VarE.C(-561824572);
                yw1.m mVar4 = (yw1.m) p1Var.getF182175a();
                mVar4.getClass();
                b((yw1.n) mVar4, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (!(mVar3 instanceof yw1.o)) {
                    throw kg.f.h(o0VarE, -561826759, false);
                }
                o0VarE.C(-561820352);
                yw1.m mVar5 = (yw1.m) p1Var.getF182175a();
                mVar5.getClass();
                c((yw1.o) mVar5, o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list2, i14, 18);
        }
    }

    public static final void b(yw1.n nVar, p3.m mVar, int i14) {
        String str;
        o0 o0VarE = mVar.E(-314188938);
        int i15 = (o0VarE.B(nVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Double d14 = nVar.f199956a;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                l3.f23124b.getClass();
                str = l3.f23131i.format(dDoubleValue);
            } else {
                str = null;
            }
            String strQ = gl1.y.Q(o0VarE, R.string.average_weekly_calories_abbreviated);
            String str2 = nVar.f199957b;
            String strQ2 = gl1.y.Q(o0VarE, R.string.average_weekly_time_abbreviated);
            Long l14 = nVar.f199958c;
            String strValueOf = l14 != null ? String.valueOf(l14.longValue()) : null;
            String strQ3 = gl1.y.Q(o0VarE, R.string.common_min_abbreviated_without_period);
            String strQ4 = gl1.y.Q(o0VarE, R.string.average_intensity_minutes_abbreviated);
            boolean z14 = (str == null || str2 == null || strValueOf == null) ? false : true;
            if (str == null && str2 == null && strValueOf == null) {
                o0VarE.C(-1266346676);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1268008245);
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
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
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.j.i iVarI = c2.j.i(eVar.f97920e);
                bVar2.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar.f97920e);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                t0.a(c2.l.A(rVarF2, 0.0f, eVar.f97917b, 1), iVarI, iVarI2, null, 2, 0, z3.f.c(1053313344, new g82.d(z14, str, strQ, str2, strQ2, strValueOf, strQ4, strQ3), o0VarE), o0VarE, 1597440, 40);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(nVar, i14, 21);
        }
    }

    public static final void c(yw1.o oVar, p3.m mVar, int i14) {
        String str;
        String strP0;
        o0 o0VarE = mVar.E(1594795204);
        int i15 = (o0VarE.B(oVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Double d14 = oVar.f199959a;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                l3.f23124b.getClass();
                str = l3.f23131i.format(dDoubleValue);
            } else {
                str = null;
            }
            String strQ = gl1.y.Q(o0VarE, R.string.calories_total_label);
            String str2 = oVar.f199960b;
            String strQ2 = gl1.y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
            Long l14 = oVar.f199961c;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                l3.f23124b.getClass();
                strP0 = l3.a.P0(context, jLongValue * 60000, true);
            } else {
                strP0 = null;
            }
            String strQ3 = gl1.y.Q(o0VarE, R.string.total_intensity_minutes);
            boolean z14 = (str == null || str2 == null || strP0 == null) ? false : true;
            if (str == null && str2 == null && strP0 == null) {
                o0VarE.C(-381720834);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-383394896);
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
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
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.j.i iVarI = c2.j.i(eVar.f97920e);
                bVar2.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar.f97920e);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                t0.a(c2.l.A(rVarF2, 0.0f, eVar.f97917b, 1), iVarI, iVarI2, null, 2, 0, z3.f.c(-1498183794, new cv0.h(z14, str, strQ, str2, strQ2, strP0, strQ3), o0VarE), o0VarE, 1597440, 40);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(oVar, i14, 20);
        }
    }
}
