package rv1;

import b82.g1;
import b82.k1;
import c2.b0;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.mh;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yw1.c cVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1790464896);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            DecimalFormat decimalFormat = l3.f23129g;
            Double d14 = cVar.f199899a;
            String str = decimalFormat.format(d14 != null ? d14.doubleValue() : 0.0d);
            fy1.i.f73924a.getClass();
            o13.p pVarH = fy1.i.a.h(false, o0VarE);
            String str2 = (String) pVarH.f128594a;
            String str3 = (String) pVarH.f128595b;
            String strQ = y.Q(o0VarE, R.string.average_weekly_distance_abbreviated);
            String strValueOf = cVar.f199900b;
            if (strValueOf == null) {
                strValueOf = String.valueOf(fy1.b.c(0.0d));
            }
            String str4 = strValueOf;
            String strQ2 = y.Q(o0VarE, R.string.average_weekly_time_abbreviated);
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
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z3.f.c(-694084593, new f21.b(str, 4, strQ, str3, str2, str4, strQ2), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(cVar, i14, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(yw1.d dVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-149195506);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            fy1.i.f73924a.getClass();
            o13.p pVarH = fy1.i.a.h(false, o0VarE);
            String str = (String) pVarH.f128594a;
            String str2 = (String) pVarH.f128595b;
            DecimalFormat decimalFormat = l3.f23129g;
            Double d14 = dVar.f199901a;
            String str3 = decimalFormat.format(d14 != null ? d14.doubleValue() : 0.0d);
            String strQ = y.Q(o0VarE, R.string.lbl_total_distance);
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
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z3.f.c(-754908131, new ku1.l(str3, strQ, (Object) str2, (Object) str, (Object) dVar, 15), o0VarE), o0Var, (x0.f111348c << 6) | 48, 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(dVar, i14, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    public static final void c(String str, List<? extends yw1.b> list, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        p1 p1Var;
        ?? r14;
        g1 g1Var;
        List<? extends yw1.b> list2 = list;
        str.getClass();
        list2.getClass();
        o0 o0VarE = mVar.E(1441241330);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p0.n(0);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p0.n(h0.b0(list2));
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            o0VarE.C(2053457501);
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            for (yw1.b bVar : list2) {
                if (bVar instanceof yw1.c) {
                    o0VarE.C(-2145434794);
                    g1Var = new g1(y.Q(o0VarE, R.string.lbl_average), null, null, null, 14, null);
                    o0VarE.g0(false);
                } else {
                    if (!(bVar instanceof yw1.d)) {
                        throw kg.f.h(o0VarE, -2145436704, false);
                    }
                    o0VarE.C(-2145431692);
                    g1Var = new g1(y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null);
                    o0VarE.g0(false);
                }
                arrayList.add(g1Var);
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            if (list2.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((yw1.b) it.next()).a()) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            if (fVarJ.isEmpty() || !z14) {
                x1 x1Var2 = p3.n.f135158a;
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new bv1.c(i14, 3, str, list2);
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            x1 x1Var3 = p3.n.f135158a;
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarB = b0Var.b(aVar, aVar2);
            bVar2.getClass();
            mh.c(str, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 131068);
            o0 o0Var2 = o0VarE;
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            int iIntValue = ((Number) p1Var2.getF182175a()).intValue();
            list2 = list;
            boolean zR = o0Var2.r(list2);
            Object objQ3 = o0Var2.q();
            if (zR || objQ3 == p3.m.a.f135155b) {
                p1Var = p1Var3;
                r14 = 0;
                objQ3 = new a(list2, p1Var2, p1Var, 0);
                o0Var2.K(objQ3);
            } else {
                p1Var = p1Var3;
                r14 = 0;
            }
            k1.a(fVarJ, iIntValue, rVarC2, null, 0.0f, (e23.l) objQ3, o0Var2, 0, 24);
            yw1.b bVar4 = (yw1.b) p1Var.getF182175a();
            if (bVar4 instanceof yw1.c) {
                o0Var2.C(1387342559);
                yw1.b bVar5 = (yw1.b) p1Var.getF182175a();
                bVar5.getClass();
                a((yw1.c) bVar5, o0Var2, r14);
                o0Var2.g0(r14);
            } else {
                if (!(bVar4 instanceof yw1.d)) {
                    throw kg.f.h(o0Var2, 1387340286, r14);
                }
                o0Var2.C(1387347003);
                yw1.b bVar6 = (yw1.b) p1Var.getF182175a();
                bVar6.getClass();
                b((yw1.d) bVar6, o0Var2, r14);
                o0Var2.g0(r14);
            }
            o0Var2.g0(true);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new bv1.c(i14, 4, str, list2);
        }
    }
}
