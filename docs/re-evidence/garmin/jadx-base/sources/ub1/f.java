package ub1;

import android.annotation.SuppressLint;
import c2.b0;
import c2.t0;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.ve;
import l72.q1;
import l72.v2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import sk0.k1;
import ta0.g0;
import u1.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SuppressLint({"ModifierParameter"})
    public static final void a(int i14, p pVar, r rVar, String str, String str2, String str3, p3.m mVar) {
        int i15;
        o0 o0Var;
        ?? r14;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str3, mVar, 412691896);
        p3.c<?> cVar = o0VarK.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarK.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarK.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarK.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarK.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarK.B(rVar) ? 16384 : 8192;
        }
        int i16 = i15 | 115015680;
        if (o0VarK.n(i16 & 1, (i16 & 38347923) != 38347922)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            r.a aVar2 = r.S;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarThen = c2.l.y(aVar2, f14).then(rVar);
            z zVarA = y.a(cVar2, aVar, o0VarK, 54);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = h4.k.c(rVarThen, o0VarK);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            b0 b0Var = b0.f22601a;
            Object objQ = o0VarK.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new y1(10);
                o0VarK.K(objQ);
            }
            r rVarC2 = v.c((e23.l) objQ, aVar2, true);
            z zVarA2 = y.a(c2.j.f22694d, aVar, o0VarK, 48);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, zVarA2, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarK);
            if (pVar == null) {
                o0VarK.C(170839949);
                r14 = 0;
                o0VarK.g0(false);
            } else {
                r14 = 0;
                o0VarK.C(2083720948);
                e5.q(i16 & 14, pVar, o0VarK, false);
                Unit unit = Unit.INSTANCE;
            }
            if (pVar == null) {
                f14 = (float) r14;
            }
            r rVarC4 = c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(rVarC4, c2.j.j(j92.b.f97899b.f97918c, aVar), cVar2, null, 0, 0, z3.f.c(-232175545, new c40.i(str, str2, 12), o0VarK), o0VarK, 1573248, 56);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarK);
            d6.h.f57752b.getClass();
            mh.c(str3, c2.l.C(aVar2, 0.0f, 8, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarK, ((i16 >> 9) & 14) | 48, 0, 130044);
            o0 o0Var2 = o0VarK;
            o0Var2.g0(true);
            o0Var2.C(609012000);
            o0Var2.g0(r14);
            o0Var2.g0(true);
            o0Var = o0Var2;
        } else {
            o0VarK.e();
            o0Var = o0VarK;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i11.d(pVar, str, str2, str3, rVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    public static final void b(String str, String str2, b92.a aVar, p pVar, p3.m mVar, int i14) {
        str.getClass();
        o0 o0VarE = mVar.E(-25281850);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            float f14 = 16;
            r rVarB = c2.l.B(r.S, f14, 20, f14, 4);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new q1(aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q1(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarB, false);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(rVarC, c2.j.i(j92.b.f97899b.f97918c), cVar, null, 0, 0, z3.f.c(-443296597, new c40.i(str, str2, 13), o0VarE), o0VarE, 1573248, 56);
            if (pVar == null) {
                o0VarE.C(-1551343149);
            } else {
                o0VarE.C(1473977326);
                pVar.invoke(o0VarE, 6);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(str, str2, aVar, pVar, i14, 18);
        }
    }

    public static final void c(String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1720455653);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(true) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, v2.a(v2.a(r.S, false, new e(1), o0VarE, 6), str2 != null, new j21.p(str2, 23), o0VarE, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rv1.s(str, str2, i14, 2);
        }
    }

    public static final void d(String str, String str2, String str3, r rVar, boolean z14, p pVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z15;
        o0 o0VarE = mVar.E(-142492324);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | 3072 | (o0VarE.B(rVar) ? 16384 : 8192) | 819658752;
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && ((6 | (o0VarE.r(aVar) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            r rVarA = v2.a(v2.a(x2.f(rVar, 1.0f), false, new e(0), o0VarE, 0), aVar != null, new ak0.p(aVar, 23), o0VarE, 0);
            o0VarE.C(503870724);
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).c().e();
            o0VarE.g0(false);
            o0Var = o0VarE;
            ve.a(rVarA, null, jE, 0L, 0.0f, 0.0f, null, z3.f.c(-60133385, new g0(pVar, str2, (Object) null, (Object) null, str, str3, 4), o0VarE), o0Var, 12582912, 122);
            z15 = true;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(str, str2, str3, rVar, z15, pVar, aVar, i14);
        }
    }
}
