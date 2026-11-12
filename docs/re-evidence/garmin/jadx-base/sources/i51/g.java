package i51;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.l0;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import cn1.j;
import e23.l;
import f5.z0;
import g11.i;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.q;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x020e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0245  */
    public static final void a(int i14, e23.a aVar, r rVar, String str, String str2, String str3, m mVar) {
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j92.f fVar2;
        x0 x0Var;
        int i15;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0VarE = mVar.E(980684533);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i17 = i16 | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            int i18 = i17 & 14;
            boolean z14 = (i18 == 4) | ((((i17 & 7168) ^ 3072) > 2048 && o0VarE.B(str3)) || (i17 & 3072) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j(str, str3, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(str, str3, 5);
                    o0VarE.K(objQ);
                }
            }
            r rVarB = v.b(rVar, (l) objQ);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                d6.h.f57752b.getClass();
                i15 = d6.h.f57755e;
                mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i18, 0, 130046);
                r rVarD = w.d(x2.f(r.S, 1.0f), false, null, null, aVar, 15);
                long jB = p6.b.b(o0VarE);
                m1.a aVar4 = m1.f128891a;
                r rVarE = u1.n.e(rVarD, jB, aVar4);
                g6.f.a aVar5 = g6.f.f75994b;
                r rVarB2 = q.b(1, d92.b.a(o0VarE).j().c(), rVarE, aVar4);
                bVar.getClass();
                r rVarY = c2.l.y(rVarB2, eVar.f97920e);
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                fVar2.getClass();
                g02.c.a(str2, null, 0L, d6.h.a(i15), 0, false, 1, d92.c.b(x0Var, o0VarE), 0.0d, o0VarE, ((i17 >> 3) & 14) | 1572864, 310);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97931h;
            x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            i15 = d6.h.f57755e;
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, i18, 0, 130046);
            r rVarD2 = w.d(x2.f(r.S, 1.0f), false, null, null, aVar, 15);
            long jB2 = p6.b.b(o0VarE);
            m1.a aVar6 = m1.f128891a;
            r rVarE2 = u1.n.e(rVarD2, jB2, aVar6);
            g6.f.a aVar7 = g6.f.f75994b;
            r rVarB3 = q.b(1, d92.b.a(o0VarE).j().c(), rVarE2, aVar6);
            bVar.getClass();
            r rVarY2 = c2.l.y(rVarB3, eVar.f97920e);
            z0VarD = c2.q.d(h4.d.a.f81528f, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            fVar2.getClass();
            g02.c.a(str2, null, 0L, d6.h.a(i15), 0, false, 1, d92.c.b(x0Var, o0VarE), 0.0d, o0VarE, ((i17 >> 3) & 14) | 1572864, 310);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(str, str2, rVar, str3, aVar, i14);
        }
    }

    public static final void b(o51.j jVar, l<? super Integer, Unit> lVar, l<? super Integer, Unit> lVar2, e23.a<Unit> aVar, m mVar, int i14) {
        jVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-508446391);
        int i15 = i14 | (o0VarE.B(jVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i31.e(7);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i31.e(8);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            c.f91789a.getClass();
            z02.d.a(false, c.f91790b, null, null, null, z3.f.c(-702022048, new l0(jVar, p1Var, lVar, p1Var2, lVar2, aVar, context, 12), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(jVar, lVar, lVar2, aVar, i14, 22);
        }
    }
}
