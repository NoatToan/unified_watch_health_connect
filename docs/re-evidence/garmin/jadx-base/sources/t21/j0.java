package t21;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import i3.mh;
import l72.v2;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 {
    public static final void a(u21.o oVar, int i14, v21.e eVar, fe feVar, e23.a aVar, e23.a aVar2, e23.p pVar, e23.a aVar3, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0Var;
        oVar.getClass();
        eVar.getClass();
        feVar.getClass();
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(1309391465);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(feVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            z02.d.a(oVar.f168049c, z3.f.c(-895516860, new s70.n(aVar3, i14, oVar, aVar), o0VarE), z3.f.c(984009763, new p21.b(feVar, 14), o0VarE), null, null, z3.f.c(-1967344960, new sk0.k1(oVar, aVar2, eVar, pVar), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w0(oVar, i14, eVar, feVar, aVar, aVar2, pVar, aVar3, i15);
        }
    }

    public static final void b(h4.r rVar, String str, String str2, float f14, e23.l lVar, String str3, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(631628441);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.B(str3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(rVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97917b;
            h4.r rVarY = c2.l.y(rVarE, f15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            fVar2.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            bVar.getClass();
            int i16 = i15 >> 6;
            mh.c(str2, v2.a(c2.l.A(aVar2, 0.0f, f16, 1), str3 != null, new j21.p(str3, 20), o0VarE, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i16 & 14, 0, 131068);
            o0VarE = o0VarE;
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar2, 0.0f, f16, 1);
            h4.g.b bVar3 = h4.d.a.f81534l;
            bVar.getClass();
            s2 s2VarA = q2.a(c2.j.i(eVar.f97921f), bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            n21.e.b(u2.f22900a.a(aVar2, 1.0f, true), f14, lVar, new j23.e(0.0f, 100.0f), o0VarE, i16 & 1008, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p21.c(rVar, str, str2, f14, lVar, str3, i14, 1);
        }
    }
}
