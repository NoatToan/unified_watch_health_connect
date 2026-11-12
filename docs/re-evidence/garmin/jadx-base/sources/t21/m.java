package t21;

import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final void a(u21.l0 l0Var, v21.e eVar, e23.l<? super Integer, Unit> lVar, e23.l<? super Integer, Unit> lVar2, e23.l<? super Integer, Unit> lVar3, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.l<? super Integer, Unit> lVar4;
        e23.l<? super Integer, Unit> lVar5;
        e23.l<? super Integer, Unit> lVar6;
        p3.o0 o0Var;
        l0Var.getClass();
        eVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 640680956);
        int i15 = (o0VarP.B(l0Var) ? 4 : 2) | i14 | (o0VarP.r(eVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            lVar4 = lVar;
            i15 |= o0VarP.r(lVar4) ? 256 : 128;
        } else {
            lVar4 = lVar;
        }
        if ((i14 & 3072) == 0) {
            lVar5 = lVar2;
            i15 |= o0VarP.r(lVar5) ? 2048 : 1024;
        } else {
            lVar5 = lVar2;
        }
        if ((i14 & 24576) == 0) {
            lVar6 = lVar3;
            i15 |= o0VarP.r(lVar6) ? 16384 : 8192;
        } else {
            lVar6 = lVar3;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarP.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarP;
            z02.d.a(false, z3.f.c(-1384655913, new rx1.u(aVar2, 19, l0Var, aVar), o0VarP), null, null, null, z3.f.c(642663251, new sg2.g(l0Var, eVar, lVar4, lVar5, lVar6, 7), o0VarP), o0Var, 196656, 29);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(l0Var, eVar, lVar, lVar2, lVar3, aVar, aVar2, i14, 21);
        }
    }

    public static final void b(h4.r rVar, String str, String str2, float f14, e23.l lVar, p3.m mVar, int i14) {
        str.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1091119253);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(rVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            fVar.getClass();
            int i16 = i15 >> 6;
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, i16 & 14, 0, 131070);
            o0VarE = o0VarE;
            n21.e.b(null, f14, lVar, new j23.e(0.0f, 100.0f), o0VarE, i16 & 1008, 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qb0.i(rVar, str, str2, f14, lVar, i14);
        }
    }
}
