package zs1;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import gt1.v;
import h5.e0;
import i3.a1;
import i3.i7;
import i3.pc;
import java.util.ArrayList;
import l72.v2;
import o4.m1;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final void a(h4.r rVar, pt1.a aVar, a1 a1Var, i0 i0Var, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar2, p3.m mVar, int i14) {
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(38148046);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(a1Var) ? 256 : 128) | (o0VarE.B(i0Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            i53.c<pt1.t> cVar = aVar.f140801d;
            int i16 = i15 << 3;
            c(rVar, cVar, i0Var, !cVar.isEmpty() && ((pc) a1Var.f87409a.f88996e.f109326h.getF182175a()) == pc.Expanded, aVar.f140802e, lVar, lVar3, lVar2, aVar2, o0VarE, ((i15 << 6) & 29360128) | (i15 & 14) | ((i15 >> 3) & 896) | (458752 & i16) | (3670016 & i15) | (234881024 & i16));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vz1.j(rVar, aVar, a1Var, i0Var, lVar, lVar2, lVar3, aVar2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x02c9  */
    public static final void b(h4.r rVar, i53.c cVar, boolean z14, us1.k kVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        e23.a aVar2;
        e23.l lVar2;
        o0 o0Var;
        h4.r rVar2;
        String strP;
        o0 o0VarE = mVar.E(-1956729596);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(kVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            h4.r.a aVar3 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            m1.a aVar4 = m1.f128891a;
            h4.r rVarD = w.d(u1.n.e(aVar3, jC, aVar4), false, null, null, aVar2, 15);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            g6.f.a aVar7 = g6.f.f75994b;
            h4.r rVarU = x2.u(aVar3, 50);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarU, eVar2.f97918c);
            bVar2.getClass();
            h4.r rVarH = x2.h(rVarY, eVar2.f97917b);
            bVar2.getClass();
            int i16 = i15;
            c2.q.a(u1.n.e(l4.k.b(rVarH, k2.i.a(j92.b.f97900c.f97909a)), d92.b.a(o0VarE).f().d(), aVar4), o0VarE, 0);
            h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), d92.b.a(o0VarE).c().e(), aVar4);
            bVar2.getClass();
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, eVar2.f97918c);
            c2.j.g gVar = c2.j.f22698h;
            h4.g.b bVar3 = h4.d.a.f81534l;
            s2 s2VarA = q2.a(gVar, bVar3, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
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
            h4.r rVarA = v2.a(x2.f(aVar3, 0.5f), !z14, new yp0.b(26), o0VarE, 6);
            s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            i7.a(n5.c.a(2131233511, o0VarE, 0), null, null, am.j.d(o0VarE), o0VarE, 48, 4);
            h4.r rVarA2 = u2Var.a(aVar3, 1.0f, true);
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(rVarA2, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
            if (cVar.size() == 1) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1059814290, R.string.trail_count_single_trail, o0VarE, false);
            } else {
                o0VarE.C(1059929579);
                strP = gl1.y.P(R.string.trail_count_trails, new Object[]{Integer.valueOf(cVar.size())}, o0VarE);
                o0VarE.g0(false);
            }
            String str = strP;
            d92.b.f58624b.getClass();
            g02.c.a(str, rVarC4, 0L, null, 0, false, 1, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), 0.0d, o0VarE, 1572864, 316);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (z14) {
                o0Var.C(-1618350838);
                h4.r rVarF = x2.f(aVar3, 1.0f);
                ArrayList arrayListY0 = h0.y0(us1.k.f172429f, us1.k.NEAR_ME);
                boolean z15 = (i16 & 57344) == 16384;
                Object objQ = o0Var.q();
                if (z15) {
                    lVar2 = lVar;
                    objQ = new z50.j(lVar2, 3);
                    o0Var.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar2 = lVar;
                        objQ = new z50.j(lVar2, 3);
                        o0Var.K(objQ);
                    } else {
                        lVar2 = lVar;
                    }
                }
                v.a(rVarF, kVar, arrayListY0, (e23.l) objQ, o0Var, ((i16 >> 6) & 112) | 6, 0);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                lVar2 = lVar;
                o0Var.C(-1617956828);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
            rVar2 = aVar3;
        } else {
            lVar2 = lVar;
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux1.e(rVar2, cVar, z14, kVar, lVar2, aVar, i14);
        }
    }

    public static final void c(h4.r rVar, i53.c cVar, i0 i0Var, boolean z14, us1.k kVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        e23.l lVar4;
        e23.a aVar2;
        us1.k kVar2;
        i0 i0Var2;
        t13.d dVar;
        i53.c cVar2 = cVar;
        cVar2.getClass();
        kVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1065231199);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(i0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(kVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            lVar4 = lVar3;
            i15 |= o0VarE.r(lVar4) ? 8388608 : 4194304;
        } else {
            lVar4 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(kVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r rVarE = u1.n.e(x2.d(rVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i16 = i15 & 112;
            int i17 = i15 >> 3;
            int i18 = i15 >> 9;
            int i19 = i15;
            b(null, cVar, z15, kVar, lVar4, aVar2, o0VarE, (i17 & 896) | i16 | (i17 & 7168) | (i18 & 57344) | (i18 & 458752));
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58625c.getClass();
            c2.j.i iVarI = c2.j.i(j92.b.f97899b.f97918c);
            boolean z16 = (i16 == 32) | ((i19 & 458752) == 131072) | ((3670016 & i19) == 1048576);
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new zr.j(cVar, lVar, lVar2);
                o0VarE.K(objQ2);
            }
            i0Var2 = i0Var;
            e2.c.b(rVarF, i0Var2, null, iVarI, null, null, false, null, (e23.l) objQ2, o0VarE, i17 & 112, 492);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            int i24 = (i19 & 896) ^ 384;
            boolean z17 = ((i24 > 256 && o0VarE.B(i0Var2)) || (i19 & 384) == 256) | ((i19 & 57344) == 16384);
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                kVar2 = kVar;
                dVar = null;
                objQ3 = new m(p1Var, kVar2, i0Var2, null);
                o0VarE.K(objQ3);
            } else {
                kVar2 = kVar;
                dVar = null;
            }
            l0.e((e23.p) objQ3, kVar2, o0VarE);
            boolean z18 = (i24 > 256 && o0VarE.B(i0Var2)) || (i19 & 384) == 256;
            Object objQ4 = o0VarE.q();
            if (z18 || objQ4 == c2565a) {
                objQ4 = new n(i0Var2, dVar);
                o0VarE.K(objQ4);
            }
            cVar2 = cVar;
            l0.e((e23.p) objQ4, cVar2, o0VarE);
        } else {
            kVar2 = kVar;
            i0Var2 = i0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(rVar, cVar2, i0Var2, z14, kVar2, lVar, lVar2, lVar3, aVar, i14);
        }
    }
}
