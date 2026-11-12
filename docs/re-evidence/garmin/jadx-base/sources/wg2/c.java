package wg2;

import androidx.lifecycle.n0;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.d0;
import i3.i7;
import i3.mh;
import mg2.w;
import o4.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import t21.t;
import u1.a2;
import v62.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final void a(r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(420426123);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            long jD = f0.d(4289793293L);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarE = u1.n.e(rVar, jD, k2.i.a(j92.b.f97900c.f97911c));
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            g6.f.f75994b.getClass();
            float f14 = g6.f.f75996d;
            w.f118432a.getClass();
            r rVarF = x2.f(x2.v(rVarY, f14, w.f118437f), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            u4.d dVarA = g0.a(t62.b.f162798a);
            r.a aVar2 = r.S;
            bVar.getClass();
            i7.b(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97904c), d92.b.a(o0VarE).f().f63508c, o0VarE, 48, 0);
            bVar.getClass();
            r rVarC2 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            String strQ = y.Q(o0VarE, R.string.bluetooth_is_off);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, d92.b.a(o0VarE).k().f63527d, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131064);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01eb  */
    public static final void b(float f14, boolean z14, z3.e eVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -322672735);
        p3.c<?> cVar2 = o0VarP.f135177b;
        int i15 = i14 | (o0VarP.i(f14) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(eVar) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024) | (o0VarP.r(aVar2) ? 16384 : 8192);
        if (o0VarP.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            n0 n0Var = (n0) o0VarP.A(s9.j.f158018a);
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 7168) == 2048) | o0VarP.r(n0Var);
            Object objQ = o0VarP.q();
            if (zR) {
                objQ = new b(n0Var, aVar, null);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b(n0Var, aVar, null);
                    o0VarP.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarP);
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarP.U);
            i2 i2VarA1 = o0VarP.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarP);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar4);
            } else {
                o0VarP.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarP);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarP.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarP);
                eVar.invoke(u.f22885a.c(aVar3, h4.d.a.f81528f), o0VarP, Integer.valueOf((i15 >> 3) & 112));
                r rVarC3 = c2.l.C(a2.b(x2.d(aVar3, 1.0f), a2.a(o0VarP), true), 0.0f, f14, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81537o, o0VarP, 54);
                iHashCode = Long.hashCode(o0VarP.U);
                i2VarA0 = o0VarP.a0();
                rVarC = h4.k.c(rVarC3, o0VarP);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarP.z();
                if (o0VarP.T) {
                    o0VarP.M(aVar4);
                } else {
                    o0VarP.c();
                }
                b4.c(eVar2, zVarA, o0VarP);
                b4.c(c1623g, i2VarA0, o0VarP);
                if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarP, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarP);
                b0 b0Var = b0.f22601a;
                if (z14) {
                    o0VarP.C(152537117);
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(152303594);
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarC4 = c2.l.C(aVar3, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    bVar2.getClass();
                    a(c2.l.A(rVarC4, eVar3.f97920e, 0.0f, 2), o0VarP, 0);
                    o0VarP.g0(false);
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), o0VarP);
                c((i15 & 112) | ((i15 >> 6) & 896), aVar2, null, o0VarP, z14);
                o0VarP.g0(true);
                o0VarP.g0(true);
            }
            v.h.A(iHashCode2, o0VarP, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarP);
            eVar.invoke(u.f22885a.c(aVar3, h4.d.a.f81528f), o0VarP, Integer.valueOf((i15 >> 3) & 112));
            r rVarC5 = c2.l.C(a2.b(x2.d(aVar3, 1.0f), a2.a(o0VarP), true), 0.0f, f14, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81537o, o0VarP, 54);
            iHashCode = Long.hashCode(o0VarP.U);
            i2VarA0 = o0VarP.a0();
            rVarC = h4.k.c(rVarC5, o0VarP);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar4);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA, o0VarP);
            b4.c(c1623g, i2VarA0, o0VarP);
            if (o0VarP.T) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarP);
            b0 b0Var2 = b0.f22601a;
            if (z14) {
                o0VarP.C(152303594);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar4 = j92.b.f97899b;
                r rVarC6 = c2.l.C(aVar3, 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13);
                bVar3.getClass();
                a(c2.l.A(rVarC6, eVar4.f97920e, 0.0f, 2), o0VarP, 0);
                o0VarP.g0(false);
            } else {
                o0VarP.C(152537117);
                o0VarP.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), o0VarP);
            c((i15 & 112) | ((i15 >> 6) & 896), aVar2, null, o0VarP, z14);
            o0VarP.g0(true);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(f14, z14, eVar, aVar, aVar2, i14);
        }
    }

    public static final void c(int i14, e23.a aVar, r rVar, p3.m mVar, boolean z14) {
        r rVar2;
        o0 o0VarE = mVar.E(363012369);
        int i15 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar2 = r.S;
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(aVar2, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d0.f87812a.getClass();
            r rVarG = c2.l.G(rVarE, d0.a(o0VarE));
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarC = c2.l.C(rVarG, 0.0f, f14, 0.0f, eVar.f97921f, 5);
            bVar.getClass();
            r rVarF = x2.f(c2.l.A(rVarC, eVar.f97920e, 0.0f, 2), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, z14 ? R.string.connection_lost_to_device : R.string.device_disconnected);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            int i17 = i15;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130046);
            String strQ2 = y.Q(o0VarE, z14 ? R.string.we_are_trying_to_reconnect : R.string.turn_on_your_phone_bluetooth_to_continue_live_activity);
            fVar.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            bVar.getClass();
            rVar2 = aVar2;
            mh.c(strQ2, c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            l72.f0 f0Var = l72.f0.f110999a;
            String strQ3 = y.Q(o0VarE, R.string.close_live_activity);
            g6.f.f75994b.getClass();
            float f15 = g6.f.f75996d;
            w.f118432a.getClass();
            r rVarF2 = x2.f(x2.v(rVar2, f15, w.f118437f), 1.0f);
            bVar.getClass();
            f0Var.i(strQ3, c2.l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), false, aVar, o0VarE, (i17 << 3) & 7168, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.h(rVar2, z14, aVar, i14, 3, (byte) 0);
        }
    }
}
