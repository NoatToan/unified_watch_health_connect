package da0;

import c2.x2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.o3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(h4.r rVar, String str, e23.a<Unit> aVar, boolean z14, String str2, e23.a<Unit> aVar2, boolean z15, String str3, e23.a<Unit> aVar3, boolean z16, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        String str4;
        int i18;
        e23.a<Unit> aVar4;
        int i19;
        boolean z17;
        int i24;
        int i25;
        int i26;
        int i27;
        h4.r rVar2;
        boolean z18;
        String str5;
        boolean z19;
        String str6;
        e23.a<Unit> aVar5;
        boolean z24;
        e23.a<Unit> aVar6;
        boolean z25;
        boolean z26;
        boolean z27;
        o0 o0VarE = mVar.E(183613117);
        int i28 = i15 & 1;
        if (i28 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i29 = i16 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        int i30 = i15 & 8;
        if (i30 != 0) {
            i17 = i29 | 3072;
        } else {
            i17 = i29 | (o0VarE.h(z14) ? 2048 : 1024);
        }
        int i34 = i15 & 16;
        if (i34 != 0) {
            i18 = i17 | 24576;
            str4 = str2;
        } else {
            str4 = str2;
            i18 = i17 | (o0VarE.B(str4) ? 16384 : 8192);
        }
        int i35 = i15 & 32;
        if (i35 != 0) {
            i19 = i18 | 196608;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            i19 = i18 | (o0VarE.r(aVar4) ? 131072 : 65536);
        }
        int i36 = i15 & 64;
        if (i36 != 0) {
            i24 = i19 | 1572864;
            z17 = z15;
        } else {
            z17 = z15;
            i24 = i19 | (o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i37 = i15 & 128;
        if (i37 != 0) {
            i25 = i24 | 12582912;
        } else {
            i25 = i24 | (o0VarE.B(str3) ? 8388608 : 4194304);
        }
        int i38 = i15 & 256;
        if (i38 != 0) {
            i26 = i25 | 100663296;
        } else {
            i26 = i25 | (o0VarE.r(aVar3) ? 67108864 : 33554432);
        }
        int i39 = i15 & 512;
        if (i39 != 0) {
            i27 = i26 | C.ENCODING_PCM_32BIT;
        } else {
            i27 = i26 | (o0VarE.h(z16) ? 536870912 : 268435456);
        }
        if (o0VarE.n(i27 & 1, (i27 & 306783379) != 306783378)) {
            h4.r rVar3 = i28 != 0 ? h4.r.S : rVar;
            boolean z28 = i30 != 0 ? true : z14;
            if (i34 != 0) {
                str4 = null;
            }
            if (i35 != 0) {
                aVar4 = null;
            }
            if (i36 != 0) {
                z17 = true;
            }
            String str7 = i37 != 0 ? null : str3;
            e23.a<Unit> aVar7 = i38 != 0 ? null : aVar3;
            boolean z29 = i39 != 0 ? true : z16;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            boolean z34 = z28;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            String str8 = str7;
            h4.r rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            h4.r rVar4 = rVar3;
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
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
            c2.b0 b0Var = c2.b0.f22601a;
            if (str8 == null || aVar7 == null) {
                z24 = z29;
                aVar6 = aVar7;
                o0VarE.C(1870971599);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1870608031);
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarF = x2.f(o3.c(h4.r.S, "btn_tertiary"), 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e23.a<Unit> aVar9 = aVar7;
                boolean z35 = z29;
                f0Var.k(str8, c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z35, aVar9, o0VarE, ((i27 >> 21) & 910) | ((i27 >> 15) & 7168), 0);
                z24 = z35;
                aVar6 = aVar9;
                o0VarE.g0(false);
            }
            if (str4 == null || aVar4 == null) {
                z25 = false;
                o0VarE.C(1871439823);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1871071450);
                l72.f0 f0Var2 = l72.f0.f110999a;
                h4.r rVarF2 = x2.f(o3.c(h4.r.S, "btn_secondary"), 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f0Var2.i(str4, c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z17, aVar4, o0VarE, ((i27 >> 12) & 910) | ((i27 >> 6) & 7168), 0);
                z25 = false;
                o0VarE.g0(false);
            }
            if (str == null || aVar == null) {
                z26 = z34;
                z27 = true;
                o0VarE.C(1871894159);
                o0VarE.g0(z25);
            } else {
                o0VarE.C(1871535396);
                l72.f0 f0Var3 = l72.f0.f110999a;
                h4.r rVarF3 = x2.f(o3.c(h4.r.S, "btn_primary"), 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                z26 = z34;
                z27 = true;
                f0Var3.d((i27 & 7280) | ((i27 << 6) & 57344), 1, aVar, c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), str, o0VarE, null, z26);
                o0VarE.g0(z25);
            }
            o0VarE.g0(z27);
            str6 = str4;
            z18 = z26;
            str5 = str8;
            aVar5 = aVar6;
            rVar2 = rVar4;
            z19 = z24;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z18 = z14;
            str5 = str3;
            z19 = z16;
            str6 = str4;
            aVar5 = aVar3;
        }
        e23.a<Unit> aVar10 = aVar4;
        boolean z36 = z17;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar2, str, aVar, z18, str6, aVar10, z36, str5, aVar5, z19, i14, i15);
        }
    }
}
