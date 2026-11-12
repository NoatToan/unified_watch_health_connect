package vr;

import aq.m3;
import b82.d2;
import c2.b0;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d6.p;
import e23.l;
import e23.r;
import f5.z0;
import h4.k;
import h5.e0;
import i3.mh;
import java.util.List;
import nr.q0;
import nr.r0;
import o4.m1;
import p005kotlin.Metadata;
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
import tr2.o;
import u1.y0;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f179481a;

        public a(List list) {
            this.f179481a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f179481a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f179482a;

        public b(List list) {
            this.f179482a = list;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                int i15 = i14 & 126;
                q0 q0Var = (q0) this.f179482a.get(iIntValue);
                mVar2.C(570647565);
                if (q0Var.f127310c == r0.BODY_ROW) {
                    mVar2.C(156956682);
                    g.b(iIntValue, q0Var, mVar2, (i15 >> 3) & 14);
                } else {
                    mVar2.C(570712912);
                }
                mVar2.f();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    public static final void a(List<q0> list, m mVar, int i14) {
        o0 o0VarE = mVar.E(-884533647);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            boolean zR = o0VarE.r(list);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e(list, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e(list, 0);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarF, null, null, cVar, null, null, false, null, (l) objQ, o0VarE, 24582, 494);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 23);
        }
    }

    public static final void b(int i14, q0 q0Var, m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(690894605);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(q0Var) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            d2.f16532a.g(i14 + 1, 384, 0, u1.n.e(h4.r.S, n5.a.a(o0VarE, q0Var.f127309b), m1.f128891a), o0VarE, z3.f.c(1492957770, new d(q0Var, 1), o0VarE));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m3(i14, q0Var, i15);
        }
    }

    public static final void c(q0 q0Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1608986857);
        int i15 = (o0VarE.r(q0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d2.f16532a.d(null, z3.f.c(306680176, new d(q0Var, 0), o0VarE), o0VarE, 48, 1);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(q0Var, i14, 25);
        }
    }

    public static final void d(final t2 t2Var, final String str, final h4.r rVar, final h4.d.b bVar, int i14, int i15, final Integer num, m mVar, final int i16) {
        int i17;
        o0 o0Var;
        final int i18;
        final int i19;
        boolean z14;
        o0 o0VarE = mVar.E(1419285416);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i16 & 48) == 0) {
            i17 = (o0VarE.B(str) ? 32 : 16) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.B(bVar) ? 2048 : 1024;
        }
        int i24 = i17 | 221184;
        if ((1572864 & i16) == 0) {
            i24 |= o0VarE.B(num) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i24 & 1, (599185 & i24) != 599184)) {
            p.f57793b.getClass();
            int i25 = p.f57794c;
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.c cVar2 = j.f22696f;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarThen = c2.l.z(aVar, 16, 12).then(rVar);
            int i26 = i24 >> 3;
            z zVarA = y.a(cVar2, bVar, o0VarE, ((((i26 & 896) | 48) >> 3) & 112) | 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarThen, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (num != null) {
                o0VarE.C(-1514585144);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                h4.r rVarF = x2.f(aVar, 1.0f);
                s2 s2VarA = q2.a(cVar2, bVar3, o0VarE, 54);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = k.c(rVarF, o0VarE);
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
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r rVarA = u2Var.a(aVar, 0.33333334f, true);
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = k.c(rVarA, o0VarE);
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
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u uVar = u.f22885a;
                t4.d dVarA = n5.c.a(num.intValue(), o0VarE, (i24 >> 18) & 14);
                o4.e0.a aVar4 = o4.e0.f128843b;
                d92.b.f58623a.getClass();
                z14 = true;
                int i27 = i24;
                y0.a(dVarA, null, x2.q(aVar, 24), null, null, 0.0f, o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().d()), o0VarE, 432, 56);
                o0VarE.g0(true);
                h4.r rVarA2 = c2.l.A(u2Var.a(aVar, 0.33333334f, true), 0.0f, 2, 1);
                z0 z0VarD2 = q.d(h4.d.a.f81528f, false);
                int iHashCode4 = Long.hashCode(o0VarE.U);
                i2 i2VarA3 = o0VarE.a0();
                h4.r rVarC4 = k.c(rVarA2, o0VarE);
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
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                }
                b4.c(fVar, rVarC4, o0VarE);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, i25, false, Integer.MAX_VALUE, 0, null, x0VarB, o0VarE, i26 & 14, ((i27 >> 9) & 896) | (i27 & 57344), 109566);
                o0Var = o0VarE;
                o0Var.g0(true);
                q.a(u2Var.a(aVar, 0.33333334f, true), o0Var, 0);
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                int i28 = i24;
                z14 = true;
                o0VarE.C(-1513198731);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, c2.l.A(aVar, 0.0f, 4, 1), 0L, null, 0L, null, 0L, null, 0L, i25, false, Integer.MAX_VALUE, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i26 & 14) | 48, ((i28 >> 9) & 896) | (i28 & 57344), 110588);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            o0Var.g0(z14);
            i19 = i25;
            i18 = Integer.MAX_VALUE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i18 = i14;
            i19 = i15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: vr.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.d(t2Var, str, rVar, bVar, i18, i19, num, (m) obj, p0.t(i16 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void e(List<q0> list, m mVar, int i14) {
        list.getClass();
        o0 o0VarE = mVar.E(410828044);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            Object obj = null;
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
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            for (Object obj2 : list) {
                if (((q0) obj2).f127310c == r0.HEADER) {
                    obj = obj2;
                    break;
                }
            }
            c((q0) obj, o0VarE, 0);
            a(list, o0VarE, i15 & 14);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 22);
        }
    }
}
