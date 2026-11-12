package i70;

import a3.a1;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import g6.f;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i3.s4;
import j92.e;
import kotlin.t1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.x0;
import v.h;
import w5.q;
import wz1.i;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:101:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0267  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, String str2, String str3, x0 x0Var, x0 x0Var2, x0 x0Var3, f fVar, f fVar2, f fVar3, r rVar, m mVar, int i14, int i15) {
        char c14;
        f fVar4;
        o0 o0Var;
        int i16;
        float f14;
        Object obj;
        boolean z14;
        boolean z15;
        str.getClass();
        str2.getClass();
        str3.getClass();
        x0Var.getClass();
        x0Var2.getClass();
        x0Var3.getClass();
        o0 o0VarE = mVar.E(1654347737);
        c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(x0Var) ? 2048 : 1024) | (o0VarE.B(x0Var2) ? 16384 : 8192) | (o0VarE.B(x0Var3) ? 131072 : 65536) | (o0VarE.B(fVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(fVar2) ? 8388608 : 4194304) | (o0VarE.B(fVar3) ? 67108864 : 33554432);
        if ((i15 & 1024) != 0) {
            c14 = 6;
        } else {
            c14 = o0VarE.B(null) ? (char) 4 : (char) 2;
        }
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            f.a aVar = f.f75994b;
            r rVarJ = x2.j(rVar, 110, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            g.a aVar2 = d.a.f81536n;
            z zVarA = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarJ, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar5 = h5.g.a.f81807d;
            b4.c(fVar5, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (fVar != null) {
                f14 = fVar.f75997a;
                i16 = 0;
            } else {
                i16 = 0;
                f14 = 0;
            }
            float f15 = f14 + (fVar2 != null ? fVar2.f75997a : i16);
            r.a aVar4 = r.S;
            char c15 = c14;
            r rVarE = i.e(x2.f(aVar4, 1.0f), f.b(f15, (float) i16) > 0 ? 1 : i16, new a1(f15, 3), o0VarE, 6);
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
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
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar5, rVarC2, o0VarE);
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            int i18 = c15 & 14;
            int i19 = i17 & 14;
            boolean z16 = (i19 == 4) | (i18 == 4);
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (z16) {
                obj = null;
                z14 = false;
                objQ = new a(null, str, 0);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    obj = null;
                    z14 = false;
                    objQ = new a(null, str, 0);
                    o0VarE.K(objQ);
                } else {
                    obj = null;
                    z14 = false;
                }
            }
            mh.c(str, v.c((l) objQ, aVar4, z14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i19, 0, 131068);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar2 = j92.b.f97899b;
            c2.l.f(x2.h(aVar4, eVar2.f97918c), o0VarE);
            x0 x0VarB2 = d92.c.b(x0Var2, o0VarE);
            boolean z17 = ((i17 & 112) == 32) | (i18 == 4);
            Object objQ2 = o0VarE.q();
            if (z17) {
                z15 = true;
                objQ2 = new a(null, str2, 1);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == m.a.f135155b) {
                    z15 = true;
                    objQ2 = new a(null, str2, 1);
                    o0VarE.K(objQ2);
                } else {
                    z15 = true;
                }
            }
            mh.c(str2, v.c((l) objQ2, aVar4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i17 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            c2.l.f(b0Var.a(aVar4, 1.0f, true), o0Var);
            long jA = d92.b.a(o0Var).k().a();
            fVar4 = fVar3;
            r rVarE2 = i.e(aVar4, fVar4 != null, new et1.v(fVar4, 21), o0Var, 6);
            bVar2.getClass();
            mh.c(str3, c2.l.C(rVarE2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0Var, (i17 >> 6) & 14, (i17 << 6) & 29360128, 131064);
            o0Var.g0(true);
        } else {
            fVar4 = fVar3;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(str, str2, str3, x0Var, x0Var2, x0Var3, fVar, fVar2, fVar4, rVar, i14, i15);
        }
    }

    public static final float b(String str, x0 x0Var, float f14, m mVar) {
        str.getClass();
        x0Var.getClass();
        x1 x1Var = n.f135158a;
        mVar.C(121698172);
        y3 y3Var = t1.f91490h;
        float fD1 = ((g6.c) mVar.A(y3Var)).d1(s5.v.a(str, x0Var, g6.b.b((int) f14, 0, 13), (g6.c) mVar.A(y3Var), (q.b) mVar.A(t1.f91493k), null, 0, 0, 480).getHeight());
        mVar.f();
        return fD1;
    }
}
