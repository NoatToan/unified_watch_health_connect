package y52;

import am.j;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import java.util.ArrayList;
import o13.p;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import u1.y0;
import v.h;
import wv0.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ArrayList arrayList, final int i14, final String str, final boolean z14, r rVar, final l lVar, e23.a aVar, final String str2, boolean z15, m mVar, final int i15, final int i16) {
        e23.a aVar2;
        int i17;
        int i18;
        o0 o0Var;
        final r rVar2;
        final boolean z16;
        final e23.a aVar3;
        boolean z17;
        x0 x0VarB;
        r.a aVar4;
        e23.a aVar5;
        boolean z18;
        str.getClass();
        lVar.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(-2057656512);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = (o0VarE.r(arrayList) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if ((i15 & 3072) == 0) {
            i19 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        int i24 = i19 | 24576 | (o0VarE.r(lVar) ? 131072 : 65536);
        int i25 = i16 & 64;
        if (i25 != 0) {
            i17 = i24 | 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i17 = i24 | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if ((i15 & 12582912) == 0) {
            i17 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        int i26 = i16 & 256;
        if (i26 != 0) {
            i18 = i17 | 100663296;
        } else {
            i18 = i17 | (o0VarE.h(z15) ? 67108864 : 33554432);
        }
        if (o0VarE.n(i18 & 1, (i18 & 38347923) != 38347922)) {
            r.a aVar6 = r.S;
            e23.a aVar7 = i25 != 0 ? null : aVar2;
            boolean z19 = i26 != 0 ? false : z15;
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xh0.d(27);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            boolean z24 = (458752 & i18) == 131072;
            Object objQ2 = o0VarE.q();
            if (z24 || objQ2 == c2565a) {
                objQ2 = new wr1.d(lVar, 13);
                o0VarE.K(objQ2);
            }
            l lVar2 = (l) objQ2;
            int i27 = i18;
            boolean zB = ((i18 & 112) == 32) | o0VarE.B(arrayList);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = p0.n((i14 < 0 || i14 >= arrayList.size()) ? new p(str2, -1) : arrayList.get(i14));
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            if (z19) {
                o0VarE.C(-1722929840);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(j92.f.f97931h, o0VarE);
                z17 = false;
            } else {
                z17 = false;
                o0VarE.C(-1722928658);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            }
            o0VarE.g0(z17);
            x0 x0Var = x0VarB;
            r rVarF = x2.f(aVar6, 1.0f);
            long jC = j.c(d92.b.f58623a, o0VarE);
            m1.a aVar8 = m1.f128891a;
            r rVarE = u1.n.e(rVarF, jC, aVar8);
            boolean z25 = !z19;
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new x91.d(p1Var, 22);
                o0VarE.K(objQ4);
            }
            r rVarD = w.d(rVarE, z25, null, null, (e23.a) objQ4, 14);
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar9 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            g.a.e eVar = g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar10 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar10, o0VarE, 0);
            e23.a aVar11 = aVar7;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar6, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            g02.e0.a(str, (String) ((p) p1Var2.getF182175a()).f128594a, null, null, false, false, false, null, null, null, null, x0Var, o0VarE, ((i27 >> 6) & 14) | 1572864, 0, 1980);
            o0Var = o0VarE;
            o0Var.g0(true);
            z zVarA2 = y.a(kVar, aVar10, o0Var, 0);
            int iHashCode3 = Long.hashCode(o0Var.U);
            i2 i2VarA2 = o0Var.a0();
            r rVarC3 = k.c(aVar6, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar9);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA2, o0Var);
            b4.c(c1623g, i2VarA2, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0Var, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0Var);
            if (z14) {
                o0Var.C(-1868519586);
                boolean z26 = (i27 & 3670016) == 1048576;
                Object objQ5 = o0Var.q();
                if (z26 || objQ5 == c2565a) {
                    aVar5 = aVar11;
                    objQ5 = new v(aVar5, 29);
                    o0Var.K(objQ5);
                } else {
                    aVar5 = aVar11;
                }
                r rVarD2 = w.d(aVar6, false, null, null, (e23.a) objQ5, 15);
                aVar4 = aVar6;
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode4 = Long.hashCode(o0Var.U);
                i2 i2VarA3 = o0Var.a0();
                r rVarC4 = k.c(rVarD2, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar9);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD, o0Var);
                b4.c(c1623g, i2VarA3, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode4))) {
                    h.A(iHashCode4, o0Var, iHashCode4, bVar);
                }
                b4.c(fVar, rVarC4, o0Var);
                u uVar = u.f22885a;
                y0.a(n5.c.a(R.drawable.help, o0Var, 0), null, null, null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0Var).f().d()), o0Var, 48, 60);
                o0Var.g0(true);
                z18 = false;
                o0Var.g0(false);
            } else {
                aVar4 = aVar6;
                aVar5 = aVar11;
                o0Var.C(-1868241144);
                b3.b.a aVar12 = b3.b.a.f15503a;
                u4.d dVarA = d3.c.a();
                d0.f128823b.getClass();
                i7.b(dVarA, null, null, d0.f128825d, o0Var, 3120, 4);
                z18 = false;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
            r rVarF2 = x2.f(aVar4, 1.0f);
            h4.g gVar2 = h4.d.a.f81532j;
            r rVarY2 = x2.y(rVarF2, gVar2, 2);
            z0 z0VarD2 = q.d(h4.d.a.f81524b, z18);
            int iHashCode5 = Long.hashCode(o0Var.U);
            i2 i2VarA4 = o0Var.a0();
            r rVarC5 = k.c(rVarY2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar9);
            } else {
                o0Var.c();
            }
            b4.c(eVar, z0VarD2, o0Var);
            b4.c(c1623g, i2VarA4, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode5))) {
                h.A(iHashCode5, o0Var, iHashCode5, bVar);
            }
            b4.c(fVar, rVarC5, o0Var);
            u uVar2 = u.f22885a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            r rVarE2 = u1.n.e(x2.y(aVar4, gVar2, 2), d92.b.a(o0Var).c().e(), aVar8);
            boolean zB3 = o0Var.B(p1Var);
            Object objQ6 = o0Var.q();
            if (zB3 || objQ6 == c2565a) {
                objQ6 = new x91.d(p1Var, 23);
                o0Var.K(objQ6);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ6, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1589450485, new qw0.p(arrayList, p1Var, p1Var2, lVar2, i14, aVar4, 1), o0Var), o0Var, 0, 48, 2040);
            o0Var.g0(true);
            rVar2 = aVar4;
            z16 = z19;
            aVar3 = aVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            z16 = z15;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: y52.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.a(arrayList, i14, str, z14, rVar2, lVar, aVar3, str2, z16, (m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
