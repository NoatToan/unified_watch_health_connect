package a62;

import am.j;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import g6.f;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import k2.i;
import kotlin.t1;
import l72.g3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import u4.d;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    public static final void a(final r rVar, final boolean z14, final ArrayList arrayList, final d dVar, final long j8, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final e23.a aVar, m mVar, final int i14) {
        int i15;
        g.b bVar;
        boolean z15;
        x0 x0VarB;
        dVar.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(1557711477);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(arrayList) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(dVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.l(j8) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.B(str2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.B(str3) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.B(str4) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.B(str5) ? 536870912 : 268435456;
        }
        int i16 = (o0VarE.B(str6) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        int i17 = i15;
        if (o0VarE.n(i17 & 1, ((i15 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            long jA = j.A(d92.b.f58623a, o0VarE);
            float f14 = 8;
            f.a aVar2 = f.f75994b;
            r rVarE = u1.n.e(rVar, jA, i.a(f14));
            boolean z16 = aVar != null;
            boolean z17 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z17) {
                objQ = new defpackage.c(aVar, 2);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, z16, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            c2.j.f22691a.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            r.a aVar4 = r.S;
            r rVarY = l.y(aVar4, 16);
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA = q2.a(c2.j.i(f14), h4.d.a.f81533k, o0VarE, 6);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(aVar4, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(1546991710);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g3.a(0, 2, null, (String) it.next(), o0VarE);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5d) {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81533k;
            } else {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81534l;
            }
            r.a aVar5 = r.S;
            c2.j.f22691a.getClass();
            s2 s2VarA2 = q2.a(c2.j.f22692b, bVar, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC4 = k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
            u2 u2Var2 = u2.f22900a;
            r rVarC5 = l.C(aVar5, 0.0f, 0.0f, 12, 0.0f, 11);
            d92.b.f58623a.getClass();
            int i18 = i17 >> 6;
            g02.i.a(rVarC5, dVar, j8, d92.b.a(o0VarE).c().g(), 40, 0.0f, null, o0VarE, (i18 & 112) | 24582 | (i18 & 896), 224);
            if (z14) {
                o0VarE.C(788134126);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(d92.c.e(j92.f.f97930g), o0VarE);
                z15 = false;
            } else {
                z15 = false;
                o0VarE.C(788135628);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            }
            o0VarE.g0(z15);
            x0 x0Var = x0VarB;
            int i19 = i17 >> 15;
            int i24 = i17 >> 3;
            g02.e0.a(str, str2, str3, null, false, false, true, str4, str5, str6, null, x0Var, o0VarE, (i19 & 896) | (i19 & 14) | 1572864 | (i19 & 112) | (29360128 & i24) | (i24 & 234881024) | ((i16 << 27) & 1879048192), 0, 1080);
            e5.u(o0VarE, true, true, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: a62.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    c.a(rVar, z14, arrayList, dVar, j8, str, str2, str3, str4, str5, str6, aVar, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
