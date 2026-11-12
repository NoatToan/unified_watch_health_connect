package jf;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class v {
    public static final void a(kf.b bVar, String str, h4.r rVar, e23.l lVar, h4.d dVar, f5.k kVar, int i14, e23.q qVar, p3.m mVar, int i15, int i16) {
        int i17;
        e23.l lVar2;
        int i18;
        int i19;
        o0 o0VarE = mVar.E(-205779950);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(bVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            lVar2 = lVar;
            i17 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.B(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.B(kVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= o0VarE.i(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i17 |= o0VarE.B(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 536870912 : 268435456;
        } else {
            i18 = i14;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (o0VarE.h(true) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= o0VarE.r(qVar) ? 32 : 16;
        }
        int i24 = i19;
        if (o0VarE.n(i17 & 1, ((306783379 & i17) == 306783378 && (i24 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            wf.f fVarD = kf.j.d(bVar.f104561a, kVar, o0VarE, (i17 >> 15) & 112);
            int i25 = i17 >> 6;
            int i26 = i17 >> 12;
            d dVarA = f.a(fVarD, bVar.f104563c, lVar2, kVar, i18, o0VarE);
            xf.h hVar = fVarD.f184922u;
            if (hVar instanceof j) {
                o0VarE.C(-1470550590);
                o0VarE = o0VarE;
                c2.v.a(rVar, dVar, true, z3.f.c(-374957172, new ak0.h((j) hVar, qVar, dVarA, str, dVar, kVar, 11), o0VarE), o0VarE, (i25 & 14) | 3456 | (i26 & 112), 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1471239317);
                z0 z0VarD = c2.q.d(dVar, true);
                int iP = o0VarE.P();
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVar, o0VarE);
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
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                    v.h.A(iP, o0VarE, iP, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                qVar.invoke(new q(c2.u.f22885a, dVarA, str, dVar, kVar, 1.0f, null, true), o0VarE, Integer.valueOf(i24 & 112));
                o0VarE.g0(true);
                o0VarE.g0(false);
                o0VarE = o0VarE;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f10.j(bVar, str, rVar, lVar, dVar, kVar, i14, qVar, i15, i16);
        }
    }

    public static final void b(final w wVar, h4.r rVar, t4.d dVar, String str, h4.d dVar2, f5.k kVar, float f14, o4.e0 e0Var, boolean z14, p3.m mVar, final int i14) {
        w wVar2;
        int i15;
        final h4.r rVar2;
        final t4.d dVarB;
        final String contentDescription;
        final h4.d dVar3;
        final f5.k kVar2;
        final float f15;
        final o4.e0 e0Var2;
        final boolean z15;
        h4.d dVarL;
        f5.k kVarK;
        float fA;
        o4.e0 e0VarE;
        boolean zM;
        o0 o0VarE = mVar.E(-1375825518);
        if ((i14 & 6) == 0) {
            wVar2 = wVar;
            i15 = (o0VarE.B(wVar2) ? 4 : 2) | i14;
        } else {
            wVar2 = wVar;
            i15 = i14;
        }
        int i16 = i15 | 48;
        if ((i14 & 384) == 0) {
            i16 = i15 | SyslogConstants.LOG_LOCAL6;
        }
        if ((i14 & 3072) == 0) {
            i16 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= 33554432;
        }
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                dVarB = wVar2.getF98679b();
                contentDescription = wVar2.getF98680c();
                dVarL = wVar2.getF98681d();
                kVarK = wVar2.getF98682e();
                fA = wVar2.getF98683f();
                e0VarE = wVar2.getF98684g();
                zM = wVar2.getF98685h();
            } else {
                o0VarE.e();
                rVar2 = rVar;
                dVarB = dVar;
                contentDescription = str;
                dVarL = dVar2;
                kVarK = kVar;
                fA = f14;
                e0VarE = e0Var;
                zM = z14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarThen = rVar2.then(new kf.h(dVarB, dVarL, kVarK, fA, e0VarE, zM, contentDescription));
            kf.j.a aVar = kf.j.f104590a;
            int iP = o0VarE.P();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            i2 i2VarA0 = o0VarE.a0();
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            o0VarE.g0(true);
            dVar3 = dVarL;
            kVar2 = kVarK;
            f15 = fA;
            e0Var2 = e0VarE;
            z15 = zM;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            dVarB = dVar;
            contentDescription = str;
            dVar3 = dVar2;
            kVar2 = kVar;
            f15 = f14;
            e0Var2 = e0Var;
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: jf.u
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.b(wVar, rVar2, dVarB, contentDescription, dVar3, kVar2, f15, e0Var2, z15, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
