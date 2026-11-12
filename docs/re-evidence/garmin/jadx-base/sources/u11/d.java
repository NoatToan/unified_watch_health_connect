package u11;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import i3.mh;
import j92.e;
import j92.f;
import l72.b2;
import l72.c2;
import l72.f0;
import o4.m1;
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
import tn.k;
import v.h;
import v62.m6;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0221  */
    public static final void a(r rVar, String str, e23.a aVar, m mVar, int i14) {
        r rVar2;
        String str2;
        int i15;
        r rVar3;
        String strQ;
        Throwable th3;
        g.a.f fVar;
        b0 b0Var;
        r.a aVar2;
        j92.b bVar;
        e eVar;
        float f14;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0VarE = mVar.E(238967395);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 22 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i15 = i16 & (-113);
                rVar3 = r.S;
                strQ = y.Q(o0VarE, R.string.take_a_photo_to_identify_food);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                rVar3 = rVar;
                strQ = str;
            }
            int i17 = i15;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.x(x2.f(rVar3, 1.0f), null, 3), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
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
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
            } else {
                th3 = null;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                aVar2 = r.S;
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f15 = eVar.f97920e;
                f14 = eVar.f97922g;
                l.f(x2.h(aVar2, f15), o0VarE);
                r rVarF = x2.f(aVar2, 1.0f);
                bVar.getClass();
                r rVarA = l.A(rVarF, eVar.f97920e, 0.0f, 2);
                s2VarA = q2.a(j.f22696f, h4.d.a.f81534l, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                t4.d dVarA = n5.c.a(R.drawable.sparkle_logo, o0VarE, 0);
                gl.c.f77766a.getClass();
                i7.a(dVarA, null, null, gl.c.f77767b.f77820z0, o0VarE, 48, 4);
                bVar.getClass();
                r rVarC3 = l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(f.f97933j, o0VarE);
                d6.h.f57752b.getClass();
                String str3 = strQ;
                mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                o0VarE.g0(true);
                bVar.getClass();
                l.f(x2.h(aVar2, f14), o0VarE);
                f0 f0Var = f0.f110999a;
                r rVarB = b0Var.b(aVar2, h4.d.a.f81537o);
                s62.a.f157643a.getClass();
                f0Var.c(rVarB, m6.a(t62.b.f162798a), c2.SECONDARY, b2.LARGE, false, y.Q(o0VarE, R.string.social_photo), null, aVar, o0VarE, ((i17 << 15) & 29360128) | 3456, 80);
                o0VarE = o0VarE;
                bVar.getClass();
                l.f(x2.h(aVar2, f14), o0VarE);
                o0VarE.g0(true);
                str2 = str3;
                rVar2 = rVar3;
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            aVar2 = r.S;
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f16 = eVar.f97920e;
            f14 = eVar.f97922g;
            l.f(x2.h(aVar2, f16), o0VarE);
            r rVarF2 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            r rVarA2 = l.A(rVarF2, eVar.f97920e, 0.0f, 2);
            s2VarA = q2.a(j.f22696f, h4.d.a.f81534l, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            t4.d dVarA2 = n5.c.a(R.drawable.sparkle_logo, o0VarE, 0);
            gl.c.f77766a.getClass();
            i7.a(dVarA2, null, null, gl.c.f77767b.f77820z0, o0VarE, 48, 4);
            bVar.getClass();
            r rVarC4 = l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            String str4 = strQ;
            mh.c(str4, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            o0VarE.g0(true);
            bVar.getClass();
            l.f(x2.h(aVar2, f14), o0VarE);
            f0 f0Var2 = f0.f110999a;
            r rVarB2 = b0Var.b(aVar2, h4.d.a.f81537o);
            s62.a.f157643a.getClass();
            f0Var2.c(rVarB2, m6.a(t62.b.f162798a), c2.SECONDARY, b2.LARGE, false, y.Q(o0VarE, R.string.social_photo), null, aVar, o0VarE, ((i17 << 15) & 29360128) | 3456, 80);
            o0VarE = o0VarE;
            bVar.getClass();
            l.f(x2.h(aVar2, f14), o0VarE);
            o0VarE.g0(true);
            str2 = str4;
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.g(rVar2, str2, aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    public static final void b(r rVar, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(46251508);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a81.d(f14, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a81.d(f14, 9);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarD, (e23.l) objQ, o0VarE, 6);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a02.d(rVar, f14, i14, 3);
        }
    }
}
