package xn0;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(z3.e eVar, z3.e eVar2, p pVar, z3.e eVar3, p pVar2, m mVar, int i14, int i15) {
        p pVar3;
        int i16;
        p pVar4;
        p pVar5;
        pVar.getClass();
        o0 o0VarE = mVar.E(1032821636);
        int i17 = i15 & 16;
        if (i17 != 0) {
            i16 = i14 | 24576;
            pVar3 = pVar2;
        } else if ((i14 & 24576) == 0) {
            pVar3 = pVar2;
            i16 = (o0VarE.r(pVar3) ? 16384 : 8192) | i14;
        } else {
            pVar3 = pVar2;
            i16 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            if (i17 != 0) {
                a.f191644a.getClass();
                pVar5 = a.f191645b;
            } else {
                pVar5 = pVar3;
            }
            x1 x1Var = n.f135158a;
            r rVarB = a2.b(x2.d(r.S, 1.0f), a2.a(o0VarE), true);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar4 = j92.b.f97899b;
            r rVarA = l.A(rVarB, 0.0f, eVar4.f97920e, 1);
            j jVar = j.f22691a;
            bVar.getClass();
            float f14 = eVar4.f97920e;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            eVar.invoke(o0VarE, 6);
            eVar2.invoke(o0VarE, 6);
            pVar.invoke(o0VarE, 6);
            eVar3.invoke(o0VarE, 6);
            e5.q((i16 >> 12) & 14, pVar5, o0VarE, true);
            pVar4 = pVar5;
        } else {
            o0VarE.e();
            pVar4 = pVar3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wx1.i(eVar, eVar2, pVar, eVar3, pVar4, i14, i15);
        }
    }
}
