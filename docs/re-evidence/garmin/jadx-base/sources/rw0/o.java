package rw0;

import bv1.v;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import qw0.x;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static final void a(r rVar, final int i14, com.garmin.android.library.mapsdkadapter.i.d dVar, boolean z14, final boolean z15, final e23.l lVar, final e23.l lVar2, e23.l lVar3, p3.m mVar, final int i15, final int i16) {
        r rVar2;
        int i17;
        final r rVar3;
        boolean z16;
        final com.garmin.android.library.mapsdkadapter.i.d dVar2 = dVar;
        final boolean z17 = z14;
        final e23.l lVar4 = lVar3;
        dVar2.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(879988454);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        }
        int i19 = i17 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(dVar2.ordinal()) ? 256 : 128) | (o0VarE.h(z17) ? 2048 : 1024);
        if ((i15 & 24576) == 0) {
            i19 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        int i24 = i19 | 1769472 | (o0VarE.r(lVar) ? 8388608 : 4194304) | (o0VarE.r(lVar2) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        if (o0VarE.n(i24 & 1, (306783379 & i24) != 306783378)) {
            r rVar4 = i18 != 0 ? r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            i53.c cVarB = x.b(dVar2 == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE || dVar2 == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX);
            ArrayList arrayListC = qw0.r.c();
            r rVar5 = rVar4;
            r rVarE = u1.n.e(x2.f(rVar4, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (arrayListC.size() > 1) {
                o0VarE.C(-1961111110);
                r.a aVar2 = r.S;
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                r rVarC2 = c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar2.f97918c, 5);
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = h4.k.c(rVarC2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                dVar2 = dVar;
                qw0.r.a(arrayListC, dVar2, lVar2, o0VarE, ((i24 >> 3) & 112) | ((i24 >> 18) & 896));
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1960699802);
                o0VarE.g0(false);
            }
            x.a(cVarB, lVar, o0VarE, i14, (i24 & 112) | ((i24 >> 15) & 896));
            if (z15 && dVar2 == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
                o0VarE.C(-1960457754);
                r.a aVar3 = r.S;
                d92.b.f58625c.getClass();
                g6.f.a aVar4 = g6.f.f75994b;
                r rVarJ = x2.j(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), 0.0f, 60, 1);
                s2 s2VarA2 = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC4 = h4.k.c(rVarJ, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                u2 u2Var2 = u2.f22900a;
                z17 = z14;
                lVar4 = lVar3;
                b(z17, lVar4, o0VarE, ((i24 >> 9) & 14) | ((i24 >> 24) & 112));
                z16 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z17 = z14;
                lVar4 = lVar3;
                z16 = true;
                o0VarE.C(-1960119482);
                o0VarE.g0(false);
            }
            o0VarE.g0(z16);
            rVar3 = rVar5;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: rw0.n
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.a(rVar3, i14, dVar2, z17, z15, lVar, lVar2, lVar4, (p3.m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(boolean z14, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1451895195);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2.f111205a.g(gl1.y.Q(o0VarE, R.string.lbl_3d_map), null, null, null, z3.f.c(-1288847494, new c21.a(z14, lVar, 5), o0VarE), false, false, null, o0VarE, 24576, 494);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(z14, lVar, i14, 10);
        }
    }
}
