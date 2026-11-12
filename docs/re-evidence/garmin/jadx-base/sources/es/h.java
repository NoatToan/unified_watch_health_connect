package es;

import c2.q;
import c2.u;
import c2.x2;
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
import nr.p0;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, p0 p0Var, n nVar, boolean z14, float f14, e23.a aVar, m mVar, int i14) {
        r rVar2;
        r rVar3;
        boolean z15;
        r rVar4;
        is.n nVar2;
        boolean z16;
        p0Var.getClass();
        p0.a aVar2 = p0Var.f127286e;
        aVar.getClass();
        o0 o0VarE = mVar.E(1248075868);
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
            jr.h hVar = ((p0.a.c) aVar2).f127293e;
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
            ArrayList arrayList = new ArrayList(y.r(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((fs.e) it.next()).a((n4.d) p1Var.getF182175a(), false));
            }
            is.n nVar3 = new is.n(((g6.c) o0VarE.A(t1.f91490h)).getF75991a() * f14, 1.0f);
            r rVarD = x2.d(rVar3, 1.0f);
            Object objQ2 = o0VarE.q();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new a11.m(p1Var, 22);
                o0VarE.K(objQ2);
            }
            r rVarF = g0.f(rVarD, (l) objQ2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ3;
            boolean z17 = (458752 & i15) == 131072;
            Object objQ4 = o0VarE.q();
            if (z17 || objQ4 == c2565a) {
                objQ4 = new e52.c(aVar, 10);
                o0VarE.K(objQ4);
            }
            r rVarB = w.b(rVarF, jVar, null, false, null, null, (e23.a) objQ4, 28);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            boolean z18 = f100059a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            if (arrayList.isEmpty() || z14) {
                z15 = z18;
                rVar4 = rVar3;
                nVar2 = nVar3;
                z16 = true;
                o0VarE.C(-1443144244);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1443462335);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    fs.f fVar = (fs.f) it3.next();
                    o0VarE.N(-1811190677, fVar.f73386a);
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new e51.c(19);
                        o0VarE.K(objQ5);
                    }
                    fs.d.a(fVar, false, (e23.a) objQ5, null, null, null, o0VarE, 432, 56);
                    o0VarE.g0(false);
                    it3 = it3;
                    z18 = z18;
                    nVar3 = nVar3;
                    rVar3 = rVar3;
                }
                z15 = z18;
                rVar4 = rVar3;
                nVar2 = nVar3;
                z16 = true;
                o0VarE.g0(false);
            }
            v.a(t1.f91490h.c(nVar2), z3.f.c(1926807766, new b(z15, uVar, nVar, 3), o0VarE), o0VarE, 56);
            o0VarE.g0(z16);
            x1 x1Var3 = p3.n.f135158a;
            rVar2 = rVar4;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, p0Var, nVar, z14, f14, aVar, i14, 3);
        }
    }
}
