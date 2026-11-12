package jf;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import o4.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final void a(final kf.b bVar, final String str, final h4.r rVar, final e23.l<? super d.c, ? extends d.c> lVar, final e23.l<? super d.c, Unit> lVar2, final h4.d dVar, final f5.k kVar, final float f14, final e0 e0Var, final int i14, final boolean z14, p3.m mVar, final int i15, final int i16) {
        int i17;
        String str2;
        e23.l<? super d.c, ? extends d.c> lVar3;
        e23.l<? super d.c, Unit> lVar4;
        h4.d dVar2;
        int i18;
        boolean z15;
        int i19;
        o0 o0VarE = mVar.E(1236588022);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(bVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            str2 = str;
            i17 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            lVar3 = lVar;
            i17 |= o0VarE.r(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar;
        }
        if ((i15 & 24576) == 0) {
            lVar4 = lVar2;
            i17 |= o0VarE.r(lVar4) ? 16384 : 8192;
        } else {
            lVar4 = lVar2;
        }
        if ((196608 & i15) == 0) {
            dVar2 = dVar;
            i17 |= o0VarE.B(dVar2) ? 131072 : 65536;
        } else {
            dVar2 = dVar;
        }
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.B(kVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= o0VarE.i(f14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i17 |= o0VarE.B(e0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 536870912 : 268435456;
        } else {
            i18 = i14;
        }
        if ((i16 & 6) == 0) {
            z15 = z14;
            i19 = i16 | (o0VarE.h(z15) ? 4 : 2);
        } else {
            z15 = z14;
            i19 = i16;
        }
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            wf.f fVarD = kf.j.d(bVar.f104561a, kVar, o0VarE, (i17 >> 15) & 112);
            kf.j.g(fVarD);
            h4.r rVarThen = rVar.then(new kf.c(fVarD, bVar.f104563c, bVar.f104562b, lVar3, lVar4, i18, dVar2, kVar, f14, e0Var, z15, kf.j.a(o0VarE), str2, null));
            kf.j.a aVar = kf.j.f104590a;
            int iP = o0VarE.P();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            i2 i2VarA0 = o0VarE.a0();
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, aVar, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar2);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: jf.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.a(bVar, str, rVar, lVar, lVar2, dVar, kVar, f14, e0Var, i14, z14, (p3.m) obj, p0.t(i15 | 1), p0.t(i16));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(Object obj, String str, hf.j jVar, h4.r rVar, t4.d dVar, t4.d dVar2, t4.d dVar3, e23.l lVar, e23.l lVar2, e23.l lVar3, h4.d dVar4, f5.k kVar, e0 e0Var, int i14, p3.m mVar, int i15, int i16, int i17) {
        h4.d dVar5;
        int i18;
        e23.l kVar2;
        h4.r rVar2 = (i17 & 8) != 0 ? h4.r.S : rVar;
        t4.d dVar6 = (i17 & 32) != 0 ? null : dVar2;
        t4.d dVar7 = (i17 & 64) != 0 ? dVar6 : dVar3;
        e23.l lVar4 = (i17 & 128) != 0 ? null : lVar;
        e23.l lVar5 = (i17 & 256) != 0 ? null : lVar2;
        e23.l lVar6 = (i17 & 512) != 0 ? null : lVar3;
        if ((i17 & 1024) != 0) {
            h4.d.f81522a.getClass();
            dVar5 = h4.d.a.f81528f;
        } else {
            dVar5 = dVar4;
        }
        e0 e0Var2 = (i17 & 8192) != 0 ? null : e0Var;
        if ((i17 & 16384) != 0) {
            q4.f.f142555o0.getClass();
            i18 = q4.f.a.f142558c;
        } else {
            i18 = i14;
        }
        x1 x1Var = p3.n.f135158a;
        int i19 = i15 >> 3;
        kf.b bVar = new kf.b(obj, (c) mVar.A(o.f98676a), jVar);
        kf.j.a aVar = kf.j.f104590a;
        if (dVar == null && dVar6 == null && dVar7 == null) {
            d.f98614r.getClass();
            kVar2 = d.f98615t;
        } else {
            kVar2 = new k62.k(dVar, 2, dVar7, dVar6);
        }
        k62.k kVar3 = (lVar4 == null && lVar5 == null && lVar6 == null) ? null : new k62.k(lVar4, 3, lVar5, lVar6);
        int i24 = i16 << 15;
        a(bVar, str, rVar2, kVar2, kVar3, dVar5, kVar, 1.0f, e0Var2, i18, true, mVar, (i19 & 896) | (i15 & 112) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), (i16 >> 15) & 14);
    }
}
