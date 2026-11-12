package yz1;

import c2.q2;
import c2.s2;
import c2.u2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.e5;
import i3.mh;
import kotlin.t1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    public static final void a(final h4.r rVar, d dVar, final String str, final u4.d dVar2, long j8, final long j14, final String str2, final String str3, String str4, final String str5, final String str6, String str7, final e23.a aVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        d dVar3;
        String str8;
        String str9;
        int i17;
        final long j15;
        final String str10;
        o0 o0Var;
        final String str11;
        long jA;
        String str12;
        long j16;
        ?? r14;
        x0 x0VarB;
        h5.g.a.b bVar;
        str.getClass();
        dVar2.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(49817727);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            dVar3 = dVar;
            i16 |= o0VarE.B(dVar3) ? 32 : 16;
        } else {
            dVar3 = dVar;
        }
        if ((i14 & 384) == 0) {
            str8 = str;
            i16 |= o0VarE.B(str8) ? 256 : 128;
        } else {
            str8 = str;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(dVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= ((i15 & 16) == 0 && o0VarE.l(j8)) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.l(j14) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(str2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.B(str3) ? 8388608 : 4194304;
        }
        int i18 = i15 & 256;
        if (i18 != 0) {
            i16 |= 100663296;
            str9 = str4;
        } else {
            str9 = str4;
            if ((i14 & 100663296) == 0) {
                i16 |= o0VarE.B(str9) ? 67108864 : 33554432;
            }
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(str5) ? 536870912 : 268435456;
        }
        int i19 = o0VarE.B(str6) ? 4 : 2;
        int i24 = i15 & 2048;
        if (i24 != 0) {
            i17 = i19 | 48;
        } else {
            i17 = i19 | (o0VarE.B(str7) ? 32 : 16);
        }
        int i25 = i17 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i25 & 147) == 146) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 16) != 0) {
                    f02.h.f67736a.getClass();
                    jA = f02.h.a(o0VarE);
                    i16 &= -57345;
                } else {
                    jA = j8;
                }
                if (i18 != 0) {
                    str9 = null;
                }
                str12 = i24 != 0 ? null : str7;
                j16 = jA;
            } else {
                o0VarE.e();
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                }
                j16 = j8;
                str12 = str7;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            long jA2 = am.j.A(d92.b.f58623a, o0VarE);
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarD = u1.w.d(u1.n.e(rVar, jA2, k2.i.a(f14)), false, null, null, aVar, 15);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            String str13 = str12;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (e.b(dVar3)) {
                o0VarE.C(-776369655);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(j92.f.f97932i, o0VarE);
                r14 = 0;
            } else {
                r14 = 0;
                o0VarE.C(-776368473);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            }
            o0VarE.g0(r14);
            x0 x0Var = x0VarB;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarY = c2.l.y(aVar4, 16);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, r14);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar2;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar2;
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarA = c2.l.A(aVar4, 0.0f, 2, 1);
            d6.p.f57793b.getClass();
            int i26 = i16 >> 6;
            mh.c(str8, rVarA, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0Var, o0VarE, (i26 & 14) | 48, 24960, 110588);
            h4.g.b bVar3 = ((double) ((g6.c) o0VarE.A(t1.f91490h)).getF75992b()) > 1.5d ? h4.d.a.f81533k : h4.d.a.f81534l;
            h4.r rVarC3 = c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13);
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            long j17 = j16;
            g02.i.a(c2.l.C(aVar4, 0.0f, 0.0f, 12, 0.0f, 11), dVar2, j17, j14, 40, 0.0f, null, o0VarE, (i26 & 112) | 24582 | (i26 & 896) | (i26 & 7168), 224);
            int i27 = i25 << 24;
            String str14 = str9;
            g02.e0.a(str2, str3 == null ? "" : str3, str14, null, false, false, false, str5, str6, str13, null, null, o0VarE, ((i16 >> 18) & 910) | (29360128 & i26) | (234881024 & i27) | (i27 & 1879048192), 0, 3192);
            e5.u(o0VarE, true, true, true);
            j15 = j17;
            o0Var = o0VarE;
            str11 = str14;
            str10 = str13;
        } else {
            o0VarE.e();
            j15 = j8;
            str10 = str7;
            o0Var = o0VarE;
            str11 = str9;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final d dVar4 = dVar3;
            p2VarI0.f135219d = new e23.p() { // from class: yz1.l
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    m.a(rVar, dVar4, str, dVar2, j15, j14, str2, str3, str11, str5, str6, str10, aVar, (p3.m) obj, iT, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
