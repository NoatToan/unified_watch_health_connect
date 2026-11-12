package yz1;

import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import kotlin.t1;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:101:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286 A[LOOP:0: B:105:0x0280->B:107:0x0286, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0323  */
    /* JADX WARN: Code duplicated, block: B:116:0x0378  */
    /* JADX WARN: Code duplicated, block: B:118:0x0395  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bf  */
    public static final void a(final h4.r rVar, final int i14, final o4.d0 d0Var, final String str, final List<String> list, String str2, e23.a<Unit> aVar, String str3, e23.a<Unit> aVar2, p3.m mVar, final int i15, final int i16) {
        String str4;
        int i17;
        e23.a<Unit> aVar3;
        int i18;
        String str5;
        int i19;
        final String str6;
        final e23.a<Unit> aVar4;
        final String str7;
        final e23.a<Unit> aVar5;
        String str8;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e23.a<Unit> aVar6;
        long j8;
        o0 o0Var;
        e23.a<Unit> aVar7;
        String str9;
        e23.a<Unit> aVar8;
        rVar.getClass();
        str.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(268904377);
        p3.c<?> cVar = o0VarE.f135177b;
        int i24 = ((i15 & 6) == 0 ? i15 | (o0VarE.B(rVar) ? 4 : 2) : i15) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(d0Var) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192);
        int i25 = i16 & 32;
        if (i25 != 0) {
            i17 = i24 | 196608;
            str4 = str2;
        } else {
            str4 = str2;
            i17 = i24 | (o0VarE.B(str4) ? 131072 : 65536);
        }
        int i26 = i16 & 64;
        if (i26 != 0) {
            i18 = i17 | 1572864;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i18 = i17 | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i27 = i16 & 128;
        if (i27 != 0) {
            i19 = i18 | 12582912;
            str5 = str3;
        } else {
            str5 = str3;
            i19 = i18 | (o0VarE.B(str5) ? 8388608 : 4194304);
        }
        int i28 = i16 & 256;
        int i29 = i28 != 0 ? i19 | 100663296 : i19 | (o0VarE.r(aVar2) ? 67108864 : 33554432);
        int i30 = i29;
        if (o0VarE.n(i30 & 1, (i29 & 38347923) != 38347922)) {
            if (i25 != 0) {
                str4 = null;
            }
            e23.a<Unit> aVar9 = i26 != 0 ? null : aVar3;
            String str10 = i27 != 0 ? null : str5;
            e23.a<Unit> aVar10 = i28 != 0 ? null : aVar2;
            x1 x1Var = p3.n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(f14));
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            e23.a<Unit> aVar11 = aVar9;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar12 = h5.g.a.f81805b;
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            String str11 = str10;
            if (o0VarE.T) {
                str8 = str4;
            } else {
                str8 = str4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                bVar.getClass();
                h4.r rVarY = c2.l.y(rVar, f15);
                h4.g.a aVar13 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, aVar13, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                aVar6 = aVar10;
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                t4.d dVarA = n5.c.a(i14, o0VarE, (i30 >> 3) & 14);
                if (d0Var != null) {
                    j8 = d0Var.f128833a;
                } else {
                    o4.d0.f128823b.getClass();
                    j8 = o4.d0.f128832k;
                }
                long j14 = j8;
                h4.r.a aVar14 = h4.r.S;
                bVar.getClass();
                float f16 = j92.b.f97901d.f97907f * f75992b;
                g6.f.a aVar15 = g6.f.f75994b;
                h4.r rVarE2 = u1.n.e(x2.q(aVar14, f16), d92.b.a(o0VarE).e().g(), k2.i.f102406a);
                bVar.getClass();
                i7.a(dVarA, null, c2.l.y(rVarE2, f15 * f75992b), j14, o0VarE, 48, 0);
                bVar.getClass();
                float f17 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar14, 0.0f, f17, 0.0f, eVar.f97920e, 5);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                d6.h.f57752b.getClass();
                mh.c(str, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i30 >> 9) & 14, 0, 130044);
                o0Var = o0VarE;
                o0Var.C(468716563);
                for (String str12 : list) {
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                    d6.h.f57752b.getClass();
                    o0 o0Var2 = o0Var;
                    mh.c(str12, aVar16, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var2, 48, 0, 130044);
                    o0Var = o0Var2;
                }
                o0Var.g0(false);
                if (str8 != null || aVar11 == null) {
                    aVar7 = aVar11;
                    o0Var.C(1645956677);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1645630898);
                    o0 o0Var3 = o0Var;
                    f0 f0Var = f0.f110999a;
                    h4.r rVarY2 = x2.y(h4.r.S, null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f0Var.d(((i30 >> 12) & 112) | (57344 & (i30 >> 6)), 9, aVar11, c2.l.C(rVarY2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), str8, o0Var3, null, false);
                    aVar7 = aVar11;
                    o0Var = o0Var3;
                    o0Var.g0(false);
                }
                if (str11 != null || aVar6 == null) {
                    str9 = str11;
                    aVar8 = aVar6;
                    o0VarE = o0Var;
                    o0VarE.C(1646376293);
                    o0VarE.g0(false);
                } else {
                    o0Var.C(1646043787);
                    o0 o0Var4 = o0Var;
                    f0 f0Var2 = f0.f110999a;
                    h4.r rVarY3 = x2.y(h4.r.S, null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    str9 = str11;
                    aVar8 = aVar6;
                    f0Var2.i(str9, c2.l.C(rVarY3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), false, aVar8, o0Var4, ((i30 >> 21) & 14) | ((i30 >> 15) & 7168), 4);
                    o0VarE = o0Var4;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
                aVar4 = aVar7;
                str7 = str9;
                aVar5 = aVar8;
                str6 = str8;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            bVar.getClass();
            h4.r rVarY4 = c2.l.y(rVar, f15);
            h4.g.a aVar17 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, aVar17, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            aVar6 = aVar10;
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            float f75992b2 = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            t4.d dVarA2 = n5.c.a(i14, o0VarE, (i30 >> 3) & 14);
            if (d0Var != null) {
                j8 = d0Var.f128833a;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128832k;
            }
            long j15 = j8;
            h4.r.a aVar18 = h4.r.S;
            bVar.getClass();
            float f18 = j92.b.f97901d.f97907f * f75992b2;
            g6.f.a aVar19 = g6.f.f75994b;
            h4.r rVarE3 = u1.n.e(x2.q(aVar18, f18), d92.b.a(o0VarE).e().g(), k2.i.f102406a);
            bVar.getClass();
            i7.a(dVarA2, null, c2.l.y(rVarE3, f15 * f75992b2), j15, o0VarE, 48, 0);
            bVar.getClass();
            float f19 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(aVar18, 0.0f, f19, 0.0f, eVar.f97920e, 5);
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            d6.h.f57752b.getClass();
            mh.c(str, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i30 >> 9) & 14, 0, 130044);
            o0Var = o0VarE;
            o0Var.C(468716563);
            while (r0.hasNext()) {
                h4.r.a aVar110 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0Var);
                d6.h.f57752b.getClass();
                o0 o0Var5 = o0Var;
                mh.c(str12, aVar110, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var5, 48, 0, 130044);
                o0Var = o0Var5;
            }
            o0Var.g0(false);
            if (str8 != null) {
                aVar7 = aVar11;
                o0Var.C(1645956677);
                o0Var.g0(false);
            } else {
                aVar7 = aVar11;
                o0Var.C(1645956677);
                o0Var.g0(false);
            }
            if (str11 != null) {
                str9 = str11;
                aVar8 = aVar6;
                o0VarE = o0Var;
                o0VarE.C(1646376293);
                o0VarE.g0(false);
            } else {
                str9 = str11;
                aVar8 = aVar6;
                o0VarE = o0Var;
                o0VarE.C(1646376293);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            aVar4 = aVar7;
            str7 = str9;
            aVar5 = aVar8;
            str6 = str8;
        } else {
            o0VarE.e();
            str6 = str4;
            aVar4 = aVar3;
            str7 = str5;
            aVar5 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: yz1.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.a(rVar, i14, d0Var, str, list, str6, aVar4, str7, aVar5, (p3.m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
