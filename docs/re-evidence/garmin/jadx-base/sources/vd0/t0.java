package vd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.gms.maps.model.LatLng;
import i3.i7;
import i3.mh;
import i3.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.k2;
import org.koin.java.KoinJavaComponent;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f177384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f177385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f177386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f177387d;

    static {
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        f177384a = eVar.f97920e;
        bVar.getClass();
        f177385b = eVar.f97918c;
        g6.f.a aVar = g6.f.f75994b;
        f177386c = 3;
        f177387d = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pe0.e.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Throwable th3;
        ActivityListItemDTO activityListItemDTO;
        List listC;
        boolean z14;
        p3.o0 o0VarE = mVar.E(-158252518);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Throwable th4 = null;
            if (objQ == c2565a) {
                objQ = (oe0.g) KoinJavaComponent.get$default(oe0.g.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            oe0.g gVar = (oe0.g) objQ;
            ActivityListItemDTO activityListItemDTO2 = aVar.f137418a;
            boolean zB = o0VarE.B(activityListItemDTO2);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = gVar.b(context, activityListItemDTO2);
                o0VarE.K(objQ2);
            }
            oe0.h hVar = (oe0.h) objQ2;
            am.x0 x0Var = activityListItemDTO2.f29265g;
            List<o13.p<Double, Double>> list = hVar.f131280e;
            if (list != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    o13.p pVar = (o13.p) it.next();
                    arrayList.add(new LatLng(((Number) pVar.f128594a).doubleValue(), ((Number) pVar.f128595b).doubleValue()));
                    th4 = th4;
                    activityListItemDTO2 = activityListItemDTO2;
                }
                th3 = th4;
                activityListItemDTO = activityListItemDTO2;
                listC = p13.w.c(arrayList);
            } else {
                th3 = null;
                activityListItemDTO = activityListItemDTO2;
                listC = null;
            }
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarC = c2.l.C(c2.l.o(x2.f(aVar2, 1.0f), c2.q1.Min), f177385b, 0.0f, 0.0f, 0.0f, 14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            c2.q.a(h4.k.a(x2.c(x2.u(aVar2, f177384a), 1.0f), k2.f91249a, new ub1.e(9)), o0VarE, 0);
            h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            bVar2.getClass();
            float f16 = eVar.f97920e;
            bVar2.getClass();
            bVar2.getClass();
            h4.r rVarB = c2.l.B(rVarA, f14, f15, f16, f15);
            u4.d dVar = x0Var.f4362e;
            f02.h.f67736a.getClass();
            long jA = f02.h.a(o0VarE);
            long jA2 = n5.a.a(o0VarE, x0Var.f4366i);
            p13.j0 j0Var = p13.j0.f134944a;
            String str = hVar.f131276a;
            String str2 = hVar.f131277b;
            String str3 = hVar.f131278c;
            String str4 = hVar.f131279d;
            ActivityListItemDTO activityListItemDTO3 = activityListItemDTO;
            boolean zR = o0VarE.r(gVar) | o0VarE.r(context) | o0VarE.r(activityListItemDTO3);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == p3.m.a.f135155b) {
                z14 = true;
                objQ3 = new n(gVar, context, activityListItemDTO3, 1);
                o0VarE.K(objQ3);
            } else {
                z14 = true;
            }
            an.c.a(rVarB, false, dVar, jA, jA2, j0Var, 0.0f, 0.0f, str, str2, str3, str4, null, null, null, null, listC, false, false, false, false, (e23.a) objQ3, o0VarE, 196608, 12582912, 6, 848066);
            o0Var = o0VarE;
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tr2.o(aVar, i14, 23);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1836421180);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = c2.l.C(c2.l.o(x2.f(aVar, 1.0f), c2.q1.Min), f177385b, 0.0f, 0.0f, 0.0f, 14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            c2.q.a(h4.k.a(x2.c(x2.u(aVar, f177384a), 1.0f), k2.f91249a, new ub1.e(10)), o0VarE, 0);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97918c;
            bVar2.getClass();
            mh.c(str, c2.l.C(aVar, 0.0f, f15, f14, eVar.f97918c, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(str, i14, 3);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(2075429194);
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
            p2VarI0.f135219d = new vc0.i(i14, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i14, e23.l lVar, i53.c cVar, String str, p3.m mVar) {
        e23.l lVar2;
        String strT;
        p3.o0 o0VarE = mVar.E(-1440611170);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_all_activities);
            if (str == null) {
                o0VarE.C(-1933802062);
                o0VarE.g0(false);
                strT = null;
            } else {
                o0VarE.C(-1933802061);
                am.x0 x0VarM = am.z0.m(str);
                c3 c3Var = x0VarM != null ? x0VarM.f4360c : null;
                if (c3Var == null) {
                    o0VarE.C(381853431);
                    o0VarE.g0(false);
                    strT = null;
                } else {
                    o0VarE.C(381853432);
                    strT = gl1.d.T(c3Var, o0VarE, 0);
                    o0VarE.g0(false);
                }
                if (strT == null) {
                    strT = str;
                }
                o0VarE.g0(false);
            }
            if (strT == null) {
                strT = strQ;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(p1Var, 7);
                o0VarE.K(objQ2);
            }
            h4.r rVarD = u1.w.d(rVarF, false, null, null, (e23.a) objQ2, 15);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
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
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar2.f97919d);
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, 0, 0, 131070);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.h1.a(t62.b.f162798a);
            bVar2.getClass();
            i7.b(dVarA, null, c2.l.C(aVar, eVar2.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, o0VarE, 48, 8);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new c(p1Var, 8);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            lVar2 = lVar;
            i3.u.a(zBooleanValue, aVar3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-2083830839, new ku1.l(str, (Object) lVar, (Object) cVar, strQ, (Object) p1Var, 24), o0VarE), o0VarE, 48, 48, 2044);
            o0VarE.g0(true);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.v(cVar, str, lVar2, i14);
        }
    }

    public static final void e(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1434962949);
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
            p2VarI0.f135219d = new vc0.i(i14, 13);
        }
    }
}
