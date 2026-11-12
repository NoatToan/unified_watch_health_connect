package c02;

import a11.g0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, String str, i53.c<Float> cVar, Float f14, d0 d0Var, Integer num, p3.m mVar, int i14, int i15) {
        d0 d0Var2;
        int i16;
        o0 o0Var;
        long j8;
        long j14;
        long j15;
        int i17;
        long j16;
        rVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(-1620723673);
        int i18 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.B(f14) ? 2048 : 1024);
        int i19 = i15 & 16;
        if (i19 != 0) {
            i16 = i18 | 24576;
            d0Var2 = d0Var;
        } else {
            d0Var2 = d0Var;
            i16 = i18 | (o0VarE.B(d0Var2) ? 16384 : 8192);
        }
        int i24 = i16 | (o0VarE.B(num) ? 131072 : 65536);
        if (o0VarE.n(i24 & 1, (74899 & i24) != 74898)) {
            if (i19 != 0) {
                d0Var2 = null;
            }
            x1 x1Var = p3.n.f135158a;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            Float f15 = (Float) h0.e0(0, cVar);
            float fFloatValue = f15 != null ? f15.floatValue() : 20.0f;
            if (str != null) {
                o0VarE.C(1557693393);
                gl.c.f77766a.getClass();
                long jL = gl.c.a(o0VarE).l();
                o0VarE.g0(false);
                j8 = jL;
            } else {
                o0VarE.C(1557693913);
                o0VarE.g0(false);
                j8 = jC;
            }
            z72.l lVar = new z72.l(fFloatValue, j8, null);
            Float f16 = (Float) h0.e0(1, cVar);
            float fFloatValue2 = f16 != null ? f16.floatValue() : 20.0f;
            if (str != null) {
                o0VarE.C(1557699636);
                gl.c.f77766a.getClass();
                long jH = gl.c.a(o0VarE).h();
                o0VarE.g0(false);
                j14 = jH;
            } else {
                o0VarE.C(1557700249);
                o0VarE.g0(false);
                j14 = jC;
            }
            z72.l lVar2 = new z72.l(fFloatValue2, j14, null);
            Float f17 = (Float) h0.e0(2, cVar);
            float fFloatValue3 = f17 != null ? f17.floatValue() : 20.0f;
            if (str != null) {
                o0VarE.C(1557705971);
                gl.c.f77766a.getClass();
                long jD = gl.c.a(o0VarE).d();
                o0VarE.g0(false);
                j15 = jD;
            } else {
                o0VarE.C(1557706553);
                o0VarE.g0(false);
                j15 = jC;
            }
            z72.l lVar3 = new z72.l(fFloatValue3, j15, null);
            Float f18 = (Float) h0.e0(3, cVar);
            float fFloatValue4 = f18 != null ? f18.floatValue() : 20.0f;
            if (str != null) {
                o0VarE.C(1557712274);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(o0VarE).b();
                o0VarE.g0(false);
                jC = jB;
            } else {
                o0VarE.C(1557712825);
                o0VarE.g0(false);
            }
            z72.l lVar4 = new z72.l(fFloatValue4, jC, null);
            Float f19 = (Float) h0.e0(4, cVar);
            float fFloatValue5 = f19 != null ? f19.floatValue() : 20.0f;
            if (str != null) {
                o0VarE.C(1557718548);
                gl.c.f77766a.getClass();
                j16 = gl.c.a(o0VarE).j();
                i17 = 0;
                o0VarE.g0(false);
            } else {
                i17 = 0;
                o0VarE.C(1557719161);
                o0VarE.g0(false);
                j16 = jC;
            }
            i53.f fVarA = i53.a.a(lVar, lVar2, lVar3, lVar4, new z72.l(fFloatValue5, j16, null));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, i17);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar2 = r.S;
            int i25 = i24 >> 3;
            int i26 = (i25 & 896) | 806879232 | (i25 & 7168);
            d0 d0Var3 = d0Var2;
            boolean z14 = i17;
            z72.k.a(x2.h(aVar2, yz1.y.k(o0VarE)), fVarA, f14, d0Var3, null, yz1.y.g(o0VarE), 3.0f, false, false, z3.f.c(-1672304579, new as.s(str, 3), o0VarE), o0VarE, i26, 400);
            o0 o0Var2 = o0VarE;
            if (num == null) {
                o0Var2.C(1074512182);
                o0Var2.g0(z14);
            } else {
                o0Var2.C(1074512183);
                String strQ = gl1.y.Q(o0Var2, num.intValue());
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarB = b0Var.b(c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
                d92.b.f58624b.getClass();
                g02.c.a(strQ, rVarB, 0L, null, 0, false, 0, d92.c.b(j92.f.f97932i, o0Var2), 0.0d, o0Var2, 0, 380);
                o0Var2.g0(z14);
            }
            o0Var2.g0(true);
            d0Var2 = d0Var3;
            o0Var = o0Var2;
        } else {
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar, str, (i53.c) cVar, f14, d0Var2, num, i14, i15);
        }
    }
}
