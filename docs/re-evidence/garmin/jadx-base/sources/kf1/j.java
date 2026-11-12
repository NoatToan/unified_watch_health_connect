package kf1;

import am.i1;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import f5.z0;
import g6.o;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.s0;
import s5.x0;
import w02.b0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f104644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f104645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f104646c;

    static {
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        f104644a = eVar.f97918c;
        bVar.getClass();
        f104645b = eVar.f97917b;
        g6.f.a aVar = g6.f.f75994b;
        f104646c = 350;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    public static final void a(e eVar, o82.g gVar, boolean z14, m mVar, int i14) {
        eVar.getClass();
        int i15 = eVar.f104633a;
        gVar.getClass();
        o0 o0VarE = mVar.E(-799072385);
        int i16 = i14 | (o0VarE.k(eVar.ordinal()) ? 4 : 2) | (o0VarE.k(gVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (z14 && eVar == e.ABOVE_TOLERANCE_IMPACT_LOAD) {
                o0VarE.C(1838511398);
                o0VarE.g0(false);
            } else if (z14 || eVar != e.REAL_DISTANCE) {
                o0VarE.C(1838693151);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarA = l.A(aVar, eVar2.f97918c, 0.0f, 2);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarA, o0VarE);
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
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                h.a(eVar, gVar, z14, false, o0VarE, (i16 & 14) | 3072 | (i16 & 112) | (i16 & 896));
                e eVar3 = e.ABOVE_TOLERANCE_IMPACT_LOAD;
                String strJ = eVar != eVar3 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1930147242, i15, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1930072842, i15, o0VarE, false);
                String strV = eVar == eVar3 ? u.v(strJ, "/", StringUtils.SPACE, false) : strJ;
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                boolean zB = o0VarE.B(strV);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new jl0.e(strV, 10);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new jl0.e(strV, 10);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC2 = v.c((e23.l) objQ, aVar, false);
                bVar.getClass();
                mh.c(strJ, l.C(rVarC2, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1838618534);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(eVar, gVar, z14, i14, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(if1.b bVar, List<if1.c> list, o82.g gVar, boolean z14, m mVar, int i14) {
        int i15;
        o0 o0Var;
        float fB;
        boolean z15;
        float fG;
        boolean z16;
        String strJ;
        ArrayList arrayList = bVar.f93195k;
        gVar.getClass();
        o0 o0VarE = mVar.E(-1254688627);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            y3 y3Var = t1.f91493k;
            q.b bVar2 = (q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar2, dVar, (o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            n92.d dVar2 = new n92.d(arrayList, s0Var, d92.c.f(x0Var, o0VarE), null, null, 24, null);
            ArrayList arrayList2 = bVar.f93196l;
            s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar.getClass();
            n92.m mVar2 = new n92.m(arrayList2, s0Var2, d92.c.f(x0Var, o0VarE));
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81525c;
            r.a aVar = r.S;
            z0 z0VarD = c2.q.d(gVar2, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            n92.g gVar3 = null;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            o82.g gVar4 = o82.g.f130854g;
            n92.n nVar = gVar == gVar4 ? dVar2 : mVar2;
            int i17 = (int) (bVar.f93200p.isEmpty() ? 3000.0f : bVar.f93206v);
            if (i17 < 100) {
                float f14 = i17;
                fB = f14 + (c02.a.b(i17, 4) == f14 ? 4 : 4 - (i17 % 4));
            } else {
                fB = c02.a.b(i17, 100);
            }
            String strQ = y.Q(o0VarE, R.string.lbl_weekly_totals);
            if (gVar == gVar4) {
                o0VarE.C(1051914523);
                fG = b0.g(f104644a, o0VarE);
                z15 = false;
            } else {
                z15 = false;
                o0VarE.C(1051915643);
                fG = b0.g(f104645b, o0VarE);
            }
            o0VarE.g0(z15);
            float f15 = fG;
            n92.n nVar2 = nVar;
            long j8 = bVar.f93188d.f93181a;
            float size = arrayList.size();
            gl.c.f77766a.getClass();
            long jF = gl.c.a(o0VarE).f();
            n92.h hVar = new n92.h(new d02.c(), Float.valueOf(fB), 5);
            r rVarF = x2.f(x2.h(aVar, f104646c), 1.0f);
            d92.b.f58625c.getClass();
            r rVarA = l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            if (list == null || !(!list.isEmpty())) {
                z16 = false;
                o0VarE.C(-1747897365);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1748313292);
                s0 s0Var3 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar.getClass();
                n92.g gVar5 = new n92.g(sn.a.c(o0VarE), s0Var3, d92.c.f(x0Var, o0VarE), null, 8, null);
                z16 = false;
                o0VarE.g0(false);
                gVar3 = gVar5;
            }
            if (((Boolean) bVar.f93199o.getF182175a()).booleanValue()) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1052011647, R.string.common_no_data, o0VarE, z16);
            } else {
                o0VarE.C(-1747329013);
                o0VarE.g0(z16);
                strJ = "";
            }
            d.a(rVarA, strQ, f15, j8, jF, gVar, bVar, z14, Float.valueOf(size), strJ, hVar, gVar3, nVar2, z3.f.c(-1614094791, new ad0.g(list, gVar, bVar, z14), o0VarE), z3.f.c(-950958222, new i(gVar, z14, bVar), o0VarE), o0VarE, ((i16 << 9) & 458752) | ((i16 << 18) & 3670016) | ((i16 << 12) & 29360128));
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(bVar, list, gVar, z14, i14, 8);
        }
    }
}
