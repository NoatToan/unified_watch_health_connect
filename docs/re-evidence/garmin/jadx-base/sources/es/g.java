package es;

import c2.b0;
import c2.q;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import ds.n;
import e23.l;
import f5.g0;
import f5.z0;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import lc.u0;
import nr.l0;
import nr.p0;
import o4.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n2;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import r22.p;
import u1.w;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65165a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f61012i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.f61013j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.f61014k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65165a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, final p0 p0Var, n nVar, boolean z14, float f14, e23.a aVar, m mVar, int i14) {
        final n nVar2;
        o0 o0Var;
        final r rVar2;
        r rVar3;
        float f15;
        p0Var.getClass();
        List<l0> list = p0Var.f127285d;
        p0.a aVar2 = p0Var.f127286e;
        aVar.getClass();
        o0 o0VarE = mVar.E(-2021890692);
        int i15 = i14 | 6 | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.i(f14) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = r.S;
            } else {
                o0VarE.e();
                rVar3 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p0.a.c cVar = (p0.a.c) aVar2;
            jr.h hVar = cVar.f127293e;
            boolean f100059a = hVar.getF100059a();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                n4.d.f123545e.getClass();
                objQ = p3.p0.n(n4.d.f123546f);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            List<fs.e> listA = hVar.a();
            ArrayList<fs.f> arrayList = new ArrayList(y.r(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((fs.e) it.next()).a((n4.d) p1Var.getF182175a(), false));
            }
            final long jB = (f100059a ? j92.a.a() : j92.a.b()).k().b();
            l0 l0Var = (l0) h0.e0(0, list);
            p pVar = l0Var != null ? l0Var.f127250a : null;
            l0 l0Var2 = (l0) h0.e0(1, list);
            p pVar2 = l0Var2 != null ? l0Var2.f127250a : null;
            l0 l0Var3 = (l0) h0.e0(2, list);
            p pVar3 = l0Var3 != null ? l0Var3.f127250a : null;
            final String str = cVar.f127289a;
            final List<List<LatLng>> list2 = cVar.f127291c;
            final p pVar4 = pVar3;
            int i16 = a.f65165a[nVar.ordinal()];
            if (i16 == 1) {
                f15 = 224;
                g6.f.a aVar3 = g6.f.f75994b;
            } else if (i16 == 2) {
                f15 = 124;
                g6.f.a aVar4 = g6.f.f75994b;
            } else if (i16 != 3) {
                u0.r();
                return;
            } else {
                f15 = 64;
                g6.f.a aVar5 = g6.f.f75994b;
            }
            y3 y3Var = t1.f91490h;
            final float f16 = f15;
            is.n nVar3 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
            r rVarD = x2.d(rVar3, 1.0f);
            Object objQ2 = o0VarE.q();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new a11.m(p1Var, 21);
                o0VarE.K(objQ2);
            }
            r rVarF = g0.f(rVarD, (l) objQ2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ3;
            boolean z15 = (i15 & 458752) == 131072;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new e52.c(aVar, 9);
                o0VarE.K(objQ4);
            }
            r rVarB = w.b(rVarF, jVar, null, false, null, null, (e23.a) objQ4, 28);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            n2 n2VarC = y3Var.c(nVar3);
            final p pVar5 = pVar;
            final p pVar6 = pVar2;
            rVar2 = rVar3;
            nVar2 = nVar;
            v.a(n2VarC, z3.f.c(-1343158794, new e23.p() { // from class: es.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    float f17;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        r rVarD2 = x2.d(rVar2, 1.0f);
                        n nVar4 = n.f61012i;
                        n nVar5 = nVar2;
                        float f18 = nVar5 == nVar4 ? 88 : 0;
                        g6.f.a aVar7 = g6.f.f75994b;
                        r rVarC2 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, f18, 7);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar8 = h4.d.a.f81536n;
                        z zVarA = c2.y.a(gVar, aVar8, mVar2, 6);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC3 = h4.k.c(rVarC2, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar9 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        b0 b0Var = b0.f22601a;
                        p0 p0Var2 = p0Var;
                        String str2 = p0Var2.f127282a;
                        String str3 = p0Var2.f127283b;
                        String str4 = str;
                        String strConcat = str3.concat(str4 != null ? " @ ".concat(str4) : "");
                        Integer num = p0Var2.f127284c;
                        r.a aVar10 = r.S;
                        r rVarA = b0Var.a(aVar10, 1.0f, true);
                        if (nVar5 == nVar4) {
                            f17 = 64;
                        } else {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f17 = j92.b.f97899b.f97920e;
                        }
                        float f19 = f17;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f22 = eVar2.f97920e;
                        r rVarC4 = c2.l.C(rVarA, f22, f19, f22, 0.0f, 8);
                        long j8 = jB;
                        ds.s.a(rVarC4, str2, strConcat, num, j8, null, 0.0f, mVar2, 0, 96);
                        r rVarO = c2.l.o(aVar10, q1.Min);
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar2, 48);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC5 = h4.k.c(rVarO, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC5, mVar2);
                        u2 u2Var = u2.f22900a;
                        y0.a(n5.c.a(R.drawable.photosharing_line, mVar2, 0), null, x2.h(aVar10, 182), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, j8), mVar2, 432, 56);
                        r rVarC6 = c2.l.C(aVar10, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar8, mVar2, 0);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        r rVarC7 = h4.k.c(rVarC6, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                        }
                        b4.c(fVar, rVarC7, mVar2);
                        p pVar7 = pVar5;
                        String strH = pVar7 != null ? pVar7.f149774a : null;
                        if (strH == null) {
                            strH = sn.a.h(mVar2, 1986591628, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1986591008);
                            mVar2.f();
                        }
                        ds.b0.a(null, strH, j8, pVar7 != null ? pVar7.f149776c : null, pVar7 != null ? pVar7.f149775b : null, 22, true, false, mVar2, 1769472, 129);
                        p pVar8 = pVar6;
                        String strH2 = pVar8 != null ? pVar8.f149774a : null;
                        if (strH2 == null) {
                            strH2 = sn.a.h(mVar2, 1986604972, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1986604321);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar10, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), strH2, j8, pVar8 != null ? pVar8.f149776c : null, pVar8 != null ? pVar8.f149775b : null, 22, true, false, mVar2, 1769472, 128);
                        p pVar9 = pVar4;
                        String strH3 = pVar9 != null ? pVar9.f149774a : null;
                        if (strH3 == null) {
                            strH3 = sn.a.h(mVar2, 1986621164, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1986620544);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar10, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), strH3, j8, pVar9 != null ? pVar9.f149776c : null, pVar9 != null ? pVar9.f149775b : null, 22, true, false, mVar2, 1769472, 128);
                        mVar2.y();
                        mVar2.y();
                        mVar2.y();
                        r rVarD3 = x2.d(aVar10, 1.0f);
                        z zVarA3 = c2.y.a(gVar, h4.d.a.f81538p, mVar2, 54);
                        int iHashCode5 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        r rVarC8 = h4.k.c(rVarD3, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA3, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                        }
                        b4.c(fVar, rVarC8, mVar2);
                        c2.l.f(x2.h(aVar10, eVar2.f97920e), mVar2);
                        gs.l.b(x2.h(c2.l.C(aVar10, 0.0f, 0.0f, eVar2.f97921f, f16, 3), 196), list2, f0.j(j8), mVar2, 0, 0);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            if (arrayList.isEmpty() || z14) {
                o0Var = o0VarE;
                o0Var.C(1434949036);
                o0Var.g0(false);
            } else {
                o0VarE.C(1434630945);
                for (fs.f fVar : arrayList) {
                    o0VarE.N(-332994165, fVar.f73386a);
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new e51.c(18);
                        o0VarE.K(objQ5);
                    }
                    o0 o0Var2 = o0VarE;
                    fs.d.a(fVar, false, (e23.a) objQ5, null, null, null, o0Var2, 432, 56);
                    o0Var2.g0(false);
                    o0VarE = o0Var2;
                }
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            v.a(t1.f91490h.c(nVar3), z3.f.c(-1132669409, new b(f100059a, uVar, nVar2, 2), o0Var), o0Var, 56);
            o0Var.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            nVar2 = nVar;
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, p0Var, nVar2, z14, f14, aVar, i14, 2);
        }
    }
}
