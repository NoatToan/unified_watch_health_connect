package d81;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import g81.m0;
import g81.o0;
import i3.mh;
import i3.v5;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    public static final void a(h4.r rVar, o0 o0Var, p3.m mVar, int i14) {
        p3.o0 o0Var2;
        long jB;
        boolean z14;
        rVar.getClass();
        o0Var.getClass();
        c3 c3Var = o0Var.f76387e;
        c3 c3Var2 = o0Var.f76385c;
        c3 c3Var3 = o0Var.f76384b;
        c3 c3Var4 = o0Var.f76383a;
        c3 c3Var5 = o0Var.f76386d;
        p3.o0 o0VarE = mVar.E(500622562);
        int i15 = (o0VarE.r(o0Var) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            b(c2.l.A(rVarE, eVar.f97919d, 0.0f, 2), c3Var4, c3Var3, c3Var2, c3Var5, c3Var, o0VarE, 0);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            float f14 = eVar.f97916a;
            long jG = d92.b.a(o0VarE).c().g();
            p3.o0 o0Var3 = o0VarE;
            ?? r14 = 0;
            v5.a(f14, 6, 0, jG, rVarF, o0Var3);
            o0Var3.C(-152234961);
            int i16 = 0;
            for (m0 m0Var : o0Var.f76388f) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                m0 m0Var2 = m0Var;
                if (i16 % 2 == 0) {
                    o0Var3.C(772026157);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0Var3).c().b();
                    o0Var3.g0(r14);
                } else {
                    o0Var3.C(772093644);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0Var3, r14);
                }
                o0Var3.C(-152227204);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(gl1.d.T(c3Var4, o0Var3, r14));
                sb3.append(StringUtils.SPACE);
                sb3.append(m0Var2.f76374b);
                sb3.append(StringUtils.SPACE);
                c3 c3Var6 = c3Var4;
                sb3.append(gl1.d.T(c3Var3, o0Var3, 0));
                sb3.append(m0Var2.f76375c);
                String strT = gl1.d.T(c3Var2, o0Var3, 0);
                Object objQ = o0Var3.q();
                p3.m.f135153a.getClass();
                c3 c3Var7 = c3Var3;
                Object obj = p3.m.a.f135155b;
                if (objQ == obj) {
                    objQ = new t(2);
                    o0Var3.K(objQ);
                }
                sb3.append(oi0.c.B(strT, (e23.l) objQ, o0Var3));
                sb3.append(StringUtils.SPACE);
                sb3.append(gl1.d.T(c3Var5, o0Var3, 0));
                sb3.append(m0Var2.f76376d);
                if (c3Var5.equals(c22.i.b(R.string.lbl_time))) {
                    o0Var3.C(-896544479);
                    sb3.append(gl1.y.Q(o0Var3, R.string.lbl_time_unit_seconds));
                    z14 = false;
                    o0Var3.g0(false);
                } else {
                    z14 = false;
                    o0Var3.C(-2022987775);
                    String strT2 = gl1.d.T(c3Var, o0Var3, 0);
                    Object objQ2 = o0Var3.q();
                    if (objQ2 == obj) {
                        objQ2 = new t(3);
                        o0Var3.K(objQ2);
                    }
                    oi0.c.B(strT2, (e23.l) objQ2, o0Var3);
                    o0Var3.g0(false);
                }
                String string = sb3.toString();
                o0Var3.g0(z14);
                h4.r rVarE2 = u1.n.e(x2.f(h4.r.S, 1.0f), jB, m1.f128891a);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(rVarE2, j92.b.f97899b.f97919d, 0.0f, 2);
                boolean zB = o0Var3.B(string);
                Object objQ3 = o0Var3.q();
                if (zB || objQ3 == obj) {
                    objQ3 = new cq.t(string, 12);
                    o0Var3.K(objQ3);
                }
                h4.r rVarB = p5.v.b(rVarA, (e23.l) objQ3);
                r14 = 0;
                c(rVarB, m0Var2, o0Var3, 0);
                c3Var4 = c3Var6;
                c3Var3 = c3Var7;
                c3Var2 = c3Var2;
                i16 = i17;
            }
            o0Var3.g0(r14);
            o0Var3.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            o0Var2 = o0Var3;
        } else {
            o0VarE.e();
            o0Var2 = o0VarE;
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, o0Var, i14, 4);
        }
    }

    public static final void b(h4.r rVar, c3 c3Var, c3 c3Var2, c3 c3Var3, c3 c3Var4, c3 c3Var5, p3.m mVar, int i14) {
        p3.o0 o0Var;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        c3 c3Var6 = c3Var4;
        c3 c3Var7 = c3Var5;
        rVar.getClass();
        c3Var.getClass();
        c3Var2.getClass();
        c3Var3.getClass();
        c3Var6.getClass();
        c3Var7.getClass();
        p3.o0 o0VarE = mVar.E(-1789805068);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(c3Var) ? 32 : 16) | (o0VarE.r(c3Var2) ? 256 : 128) | (o0VarE.r(c3Var3) ? 2048 : 1024) | (o0VarE.r(c3Var6) ? 16384 : 8192) | (o0VarE.r(c3Var7) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarA = u2Var.a(aVar3, 0.4f, true);
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            float f15 = eVar2.f97919d;
            bVar4.getClass();
            h4.r rVarC2 = u2Var.c(c2.l.z(rVarA, f14, f15), bVar2);
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strT = gl1.d.T(c3Var, o0VarE, (i15 >> 3) & 14);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            w5.f0.f182097b.getClass();
            w5.f0 f0Var = w5.f0.f182105j;
            mh.c(strT, null, 0L, null, 0L, f0Var, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 1572864, 0, 131006);
            o0VarE.g0(true);
            h4.r rVarA2 = u2Var.a(x2.f(aVar3, 1.0f), 0.35f, true);
            bVar4.getClass();
            h4.r rVarC4 = u2Var.c(c2.l.A(rVarA2, 0.0f, f15, 1), bVar2);
            c2.z zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC5 = h4.k.c(rVarC4, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar2;
                o0VarE.M(aVar);
            } else {
                aVar = aVar2;
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                bVar = bVar3;
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                bVar = bVar3;
            }
            b4.c(fVar, rVarC5, o0VarE);
            h4.r rVarB = b0Var.b(x2.z(aVar3, null, 3), h4.d.a.f81537o);
            c2.z zVarA3 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC6, o0VarE);
            String strT2 = gl1.d.T(c3Var2, o0VarE, (i15 >> 6) & 14);
            h4.r rVarZ = x2.z(aVar3, null, 3);
            h4.g.a aVar5 = h4.d.a.f81538p;
            h4.r rVarB2 = b0Var.b(rVarZ, aVar5);
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57758h;
            h5.e0.a aVar6 = aVar;
            h5.g.a.b bVar5 = bVar;
            mh.c(strT2, rVarB2, 0L, null, 0L, f0Var, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 1572864, 0, 129980);
            String strT3 = gl1.d.T(c3Var3, o0VarE, (i15 >> 9) & 14);
            h4.r rVarB3 = b0Var.b(x2.z(aVar3, null, 3), aVar5);
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97933j;
            mh.c(strT3, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE.g0(true);
            o0VarE.g0(true);
            h4.r rVarA3 = u2Var.a(aVar3, 0.25f, true);
            bVar4.getClass();
            float f16 = eVar2.f97918c;
            bVar4.getClass();
            h4.r rVarC7 = u2Var.c(c2.l.z(rVarA3, f16, f15), bVar2);
            c2.z zVarA4 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode5 = Long.hashCode(o0VarE.U);
            i2 i2VarA4 = o0VarE.a0();
            h4.r rVarC8 = h4.k.c(rVarC7, o0VarE);
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
            b4.c(eVar, zVarA4, o0VarE);
            b4.c(c1623g, i2VarA4, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
            }
            b4.c(fVar, rVarC8, o0VarE);
            c3Var6 = c3Var4;
            String strT4 = gl1.d.T(c3Var6, o0VarE, (i15 >> 12) & 14);
            h4.r rVarF = x2.f(aVar3, 1.0f);
            fVar2.getClass();
            mh.c(strT4, rVarF, 0L, null, 0L, f0Var, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 1572912, 0, 129980);
            c3Var7 = c3Var5;
            String strT5 = gl1.d.T(c3Var7, o0VarE, (i15 >> 15) & 14);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            fVar2.getClass();
            mh.c(strT5, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 48, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c(rVar, c3Var, c3Var2, c3Var3, c3Var6, c3Var7, i14, 14);
        }
    }

    public static final void c(h4.r rVar, m0 m0Var, p3.m mVar, int i14) {
        p3.o0 o0Var;
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(1135980076);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(m0Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarA = u2Var.a(aVar2, 0.4f, true);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            float f15 = eVar2.f97918c;
            bVar3.getClass();
            h4.r rVarZ = c2.l.z(rVarA, f14, eVar2.f97920e);
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar3.getClass();
            h4.r rVarE = u1.n.e(l4.k.b(x2.q(aVar2, j92.b.f97901d.f97902a), k2.i.f102406a), n5.a.a(o0VarE, m0Var.f76373a), m1.f128891a);
            h4.g.b bVar4 = h4.d.a.f81534l;
            c2.q.a(u2Var.c(rVarE, bVar4), o0VarE, 0);
            String str = m0Var.f76374b;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            h4.r rVarC3 = u2Var.c(aVar2, bVar4);
            bVar3.getClass();
            mh.c(str, c2.l.A(rVarC3, f15, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            String str2 = m0Var.f76375c;
            h4.r rVarC4 = u2Var.c(u2Var.a(x2.f(aVar2, 1.0f), 0.35f, true), bVar4);
            bVar3.getClass();
            h4.r rVarY = c2.l.y(rVarC4, f15);
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(str2, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            String str3 = m0Var.f76376d;
            h4.r rVarC5 = u2Var.c(u2Var.a(aVar2, 0.25f, true), bVar4);
            bVar3.getClass();
            h4.r rVarY2 = c2.l.y(rVarC5, f15);
            fVar2.getClass();
            mh.c(str3, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, m0Var, i14, 5);
        }
    }
}
