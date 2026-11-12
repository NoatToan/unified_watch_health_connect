package hw1;

import c2.b0;
import c2.l;
import c2.q;
import c2.u;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(r rVar, z3.e eVar, m mVar, int i14) {
        r rVar2;
        o0 o0VarE = mVar.E(-277085018);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            rVar2 = r.S;
            x1 x1Var = n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            r rVarA = l.A(u1.n.e(rVar2, jA, k2.i.a(8)), 0.0f, 0.0f, 3);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVar2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar2.getClass();
            float f15 = eVar3.f97920e;
            bVar2.getClass();
            es1.c.a(l.C(rVar2, f15, f14, eVar3.f97920e, 0.0f, 8), sn.a.g(gl1.y.Q(o0VarE, R.string.grouped_workouts)), 0L, 0L, o0VarE, 0, 12);
            eVar.invoke(b0Var, o0VarE, 54);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, eVar, i14, 0);
        }
    }
}
