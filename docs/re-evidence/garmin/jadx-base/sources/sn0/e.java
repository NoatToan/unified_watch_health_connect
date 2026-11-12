package sn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.p;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ew0.t;
import f72.b2;
import f72.cd;
import f72.d2;
import f72.na;
import f72.ra;
import g02.i;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import in0.h;
import in0.l;
import j92.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import lc.u0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import s70.r0;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    public static final void a(i53.c<h> cVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        String strJ;
        String strK0;
        o0 o0VarE = mVar.E(-1078590531);
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = l.b(cVar);
            ArrayList<h> arrayList = new ArrayList();
            for (h hVar : cVar) {
                h.a aVar = hVar.f94447b;
                if (aVar != null && l.d(aVar)) {
                    arrayList.add(hVar);
                }
            }
            int size = arrayList.size();
            if (zB) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1438372318, R.string.lbl_in_range, o0VarE, false);
            } else if (size > 1) {
                o0VarE.C(-1438369959);
                strJ = y.P(R.string.lbl_x_outliers, new Object[]{Integer.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            } else if (size == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1438366875, R.string.lbl_one_outlier, o0VarE, false);
            } else {
                o0VarE.C(-1639644799);
                o0VarE.g0(false);
                strJ = "";
            }
            if ((!cVar.isEmpty() ? cVar : null) == null) {
                o0VarE.C(-1639556572);
                o0VarE.g0(false);
                strK0 = null;
            } else {
                o0VarE.C(-1639556571);
                ArrayList arrayListM = x.m(strJ);
                o0VarE.C(-1438359808);
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (h hVar2 : arrayList) {
                    rn0.a aVar2 = rn0.a.f153638a;
                    in0.m mVar2 = hVar2.f94446a;
                    aVar2.getClass();
                    arrayList2.add(y.Q(o0VarE, rn0.a.a(mVar2)));
                }
                o0VarE.g0(false);
                arrayListM.addAll(arrayList2);
                strK0 = h0.k0(arrayListM, ". ", null, null, null, 62);
                o0VarE.g0(false);
            }
            String str = strK0 != null ? strK0 : "";
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            boolean zB2 = o0VarE.B(str);
            Object objQ = o0VarE.q();
            if (zB2) {
                objQ = new r0(str, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new r0(str, 8);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarF, false);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(f.f97929f, o0VarE);
            d92.b.f58625c.getClass();
            mh.c(strJ, c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            if (zB) {
                o0Var.C(-638781149);
                c(o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(-638729999);
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((h) it.next()).f94446a);
                }
                e(i53.a.e(arrayList3), o0Var, 0);
                o0Var.g0(false);
            }
            i15 = 1;
            o0Var.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(cVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    public static final void b(r rVar, nn0.c cVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        i53.c<h> cVar2;
        o0 o0VarE = mVar.E(-659493931);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Iterable iterable = cVar != null ? cVar.f126686b : null;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            i53.c cVarE = i53.a.e(iterable);
            String strQ = y.Q(o0VarE, R.string.lbl_health_status);
            String strJ = l.a(cVarE) ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1802970067, R.string.msg_calibration_no_data, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1802900689, R.string.msg_no_data_available, o0VarE, false);
            yz1.d dVar = cVar != null ? cVar.f126685a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = b2.a(t62.c.f162799a);
            z3.e eVarC = z3.f.c(-2099672840, new p(cVarE, 14), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 11);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar = (e23.a) objQ;
            yz1.z zVar = (cVar != null && ge1.b.R(cVar) && ((cVar2 = cVar.f126686b) == null || !l.a(cVar2))) ? yz1.z.VALID_DATA : yz1.z.EMPTY;
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ, null, dVarA, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, aVar, zVar, strJ, null, null, o0Var, i15 & 14, 24576, 802792);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, cVar, i14, 1);
        }
    }

    public static final void c(m mVar, int i14) {
        o0 o0VarE = mVar.E(-937340991);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            gl.c.f77766a.getClass();
            i.a(null, dVarA, jD, gl.c.a(o0VarE).c(), yz1.y.f(o0VarE), 0.0f, null, o0VarE, 0, 225);
            String strQ = y.Q(o0VarE, R.string.msg_all_metrics_in_range);
            d92.b.f58625c.getClass();
            r rVarC2 = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new si1.a(i14, 24);
        }
    }

    public static final void d(in0.m mVar, m mVar2, int i14) {
        u4.d dVarA;
        float f14;
        o0 o0VarE = mVar2.E(1940331195);
        int i15 = (o0VarE.k(mVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            rn0.a.f153638a.getClass();
            int iA = rn0.a.a(mVar);
            switch (rn0.a.C2909a.f153639a[mVar.ordinal()]) {
                case 1:
                    s62.a.f157643a.getClass();
                    dVarA = f72.i2.a(t62.c.f162799a);
                    break;
                case 2:
                    s62.a.f157643a.getClass();
                    dVarA = d2.a(t62.c.f162799a);
                    break;
                case 3:
                case 4:
                    s62.a.f157643a.getClass();
                    dVarA = cd.a(t62.c.f162799a);
                    break;
                case 5:
                    s62.a.f157643a.getClass();
                    dVarA = ra.a(t62.c.f162799a);
                    break;
                case 6:
                    s62.a.f157643a.getClass();
                    dVarA = na.a(t62.c.f162799a);
                    break;
                default:
                    u0.r();
                    return;
            }
            u4.d dVar = dVarA;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97917b, 7);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97917b, 0.0f, 11);
            long jD = am.j.d(o0VarE);
            gl.c.f77766a.getClass();
            long jH = gl.c.a(o0VarE).h();
            bVar.getClass();
            float f15 = eVar.f97917b;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            if (f75992b > 1.0f && f75992b <= 1.5f) {
                bVar.getClass();
                f14 = j92.b.f97901d.f97906e;
            } else if (f75992b > 1.5f) {
                bVar.getClass();
                f14 = j92.b.f97901d.f97907f;
            } else {
                bVar.getClass();
                f14 = j92.b.f97901d.f97905d;
            }
            i.a(rVarC3, dVar, jD, jH, f14, f15, null, o0VarE, 0, 192);
            String strQ = y.Q(o0VarE, iA);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(mVar, i14, 17);
        }
    }

    public static final void e(i53.c<? extends in0.m> cVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-570489584);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = c22.b.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)) ? 2 : 3;
            int size = cVar.size();
            if (size <= i16) {
                i16 = size;
            }
            List listS0 = h0.S0(cVar, i16);
            int size2 = cVar.size() - i16;
            if (size2 < 0) {
                size2 = 0;
            }
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97918c, 1);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(849194187);
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                d((in0.m) it.next(), o0VarE, 0);
            }
            o0VarE.g0(false);
            if (size2 > 0) {
                o0VarE.C(555329917);
                String strP = y.P(R.string.lbl_plus_x_more, new Object[]{Integer.valueOf(size2)}, o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(555513468);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(cVar, i14, 15);
        }
    }
}
