package hq;

import am.i1;
import b82.d2;
import c2.h2;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes7.dex */
public final class v {
    public static final void a(k kVar, boolean z14, String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-816423363);
        int i15 = (o0VarE.B(kVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d2.f16532a.d(x2.f(h4.r.S, 1.0f), z3.f.c(-645553468, new q(kVar, str, z14, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()), o0VarE), o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(kVar, z14, str, i14, 18);
        }
    }

    public static final void b(t2 t2Var, h4.r rVar, String str, s5.x0 x0Var, h2 h2Var, p3.m mVar, int i14) {
        int i15;
        s5.x0 x0Var2;
        p3.o0 o0Var;
        h2 h2VarA;
        int i16;
        p3.o0 o0VarE = mVar.E(2012877430);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            x0Var2 = x0Var;
            i15 |= o0VarE.B(x0Var2) ? 2048 : 1024;
        } else {
            x0Var2 = x0Var;
        }
        if ((i14 & 24576) == 0) {
            i15 |= 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h2VarA = c2.l.a(j92.b.f97899b.f97918c);
                i16 = i15 & (-57345);
            } else {
                o0VarE.e();
                i16 = i15 & (-57345);
                h2VarA = h2Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarX = c2.l.x(h4.r.S, h2VarA);
            h4.d.f81522a.getClass();
            h4.r rVarThen = t2Var.c(rVarX, h4.d.a.f81534l).then(rVar);
            d6.p.f57793b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarThen, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57796e, false, 0, 0, null, x0Var2, o0Var, (i16 >> 6) & 14, ((i16 << 12) & 29360128) | 384, 126972);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            h2VarA = h2Var;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(t2Var, rVar, str, x0Var, h2VarA, i14, 25);
        }
    }

    public static final void c(h4.r rVar, final int i14, final String str, final String str2, final String str3, final String str4, final String str5, final k kVar, final boolean z14, final boolean z15, final boolean z16, final boolean z17, p3.m mVar, final int i15, final int i16, final int i17) {
        h4.r rVar2;
        int i18;
        int i19;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        k kVar2;
        boolean z18;
        int i24;
        final h4.r rVar3;
        p3.o0 o0VarE = mVar.E(-1680614970);
        int i25 = i17 & 1;
        if (i25 != 0) {
            i18 = i15 | 6;
            rVar2 = rVar;
        } else if ((i15 & 6) == 0) {
            rVar2 = rVar;
            i18 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        } else {
            rVar2 = rVar;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i19 = i14;
            i18 |= o0VarE.k(i19) ? 32 : 16;
        } else {
            i19 = i14;
        }
        if ((i15 & 384) == 0) {
            str6 = str;
            i18 |= o0VarE.B(str6) ? 256 : 128;
        } else {
            str6 = str;
        }
        if ((i15 & 3072) == 0) {
            str7 = str2;
            i18 |= o0VarE.B(str7) ? 2048 : 1024;
        } else {
            str7 = str2;
        }
        if ((i15 & 24576) == 0) {
            str8 = str3;
            i18 |= o0VarE.B(str8) ? 16384 : 8192;
        } else {
            str8 = str3;
        }
        if ((196608 & i15) == 0) {
            str9 = str4;
            i18 |= o0VarE.B(str9) ? 131072 : 65536;
        } else {
            str9 = str4;
        }
        if ((1572864 & i15) == 0) {
            str10 = str5;
            i18 |= o0VarE.B(str10) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            str10 = str5;
        }
        if ((12582912 & i15) == 0) {
            kVar2 = kVar;
            i18 |= o0VarE.B(kVar2) ? 8388608 : 4194304;
        } else {
            kVar2 = kVar;
        }
        if ((100663296 & i15) == 0) {
            i18 |= o0VarE.h(z14) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            z18 = z15;
            i18 |= o0VarE.h(z18) ? 536870912 : 268435456;
        } else {
            z18 = z15;
        }
        if ((i16 & 6) == 0) {
            i24 = i16 | (o0VarE.h(z16) ? 4 : 2);
        } else {
            i24 = i16;
        }
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i24 & 19) == 18) ? false : true)) {
            h4.r rVar4 = i25 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            final String str11 = str6;
            final String str12 = str7;
            final String str13 = str8;
            final String str14 = str9;
            final String str15 = str10;
            final k kVar3 = kVar2;
            final boolean z19 = z18;
            d2.f16532a.g(i19, ((i18 >> 3) & 14) | 384, 0, x2.j(h4.r.S, d.f84987c, 0.0f, 2).then(rVar4), o0VarE, z3.f.c(895300611, new e23.q() { // from class: hq.o
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s5.x0 x0VarF;
                    long jD;
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    int i26 = iIntValue;
                    if (mVar2.n(i26 & 1, (i26 & 19) != 18)) {
                        x1 x1Var2 = p3.n.f135158a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97918c;
                        float f15 = eVar.f97917b;
                        j92.c cVar = j92.b.f97901d;
                        float f16 = cVar.f97903b;
                        boolean z24 = z17;
                        boolean z25 = z16;
                        if (z24) {
                            mVar2.C(153807206);
                            int i27 = z19 ? R.drawable.chevron_down : R.drawable.chevron_up;
                            if (z25) {
                                mVar2.C(1390438890);
                                jD = d92.b.a(mVar2).f().b();
                            } else {
                                mVar2.C(1390439820);
                                jD = d92.b.a(mVar2).f().d();
                            }
                            mVar2.f();
                            h4.r.a aVar = h4.r.S;
                            h4.r rVarX = c2.l.x(aVar, c2.l.d(f14, f14, f15, f14));
                            h4.d.f81522a.getClass();
                            h4.r rVarC = t2Var.c(rVarX, h4.d.a.f81534l);
                            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar2 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar2);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                            i7.a(n5.c.a(i27, mVar2, 0), "", c2.u.f22885a.c(x2.q(aVar, cVar.f97903b), h4.d.a.f81528f), jD, mVar2, 48, 0);
                            mVar2 = mVar2;
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2.C(154793750);
                            h4.r.a aVar3 = h4.r.S;
                            g6.f.a aVar4 = g6.f.f75994b;
                            c2.l.f(x2.q(aVar3, f14 + f16 + f15), mVar2);
                            mVar2.f();
                        }
                        if (z25) {
                            mVar2.C(1390471729);
                            d92.b.f58624b.getClass();
                            x0VarF = d92.c.b(j92.f.f97932i, mVar2);
                        } else {
                            mVar2.C(1390472851);
                            d92.b.f58624b.getClass();
                            x0VarF = d92.c.f(j92.f.f97932i, mVar2);
                        }
                        mVar2.f();
                        s5.x0 x0Var = x0VarF;
                        k kVar4 = kVar3;
                        int i28 = i26 & 14;
                        v.b(t2Var, kVar4.f85056f ? x2.u(h4.r.S, kVar4.f85051a) : t2Var.a(h4.r.S, 1.0f, true), str11, x0Var, null, mVar2, i28);
                        h4.r.a aVar5 = h4.r.S;
                        v.b(t2Var, x2.u(aVar5, kVar4.f85052b), str12, x0Var, null, mVar2, i28);
                        v.b(t2Var, x2.u(aVar5, kVar4.f85053c), str13, x0Var, null, mVar2, i28);
                        if (z14) {
                            mVar2.C(155668632);
                            v.b(t2Var, x2.u(aVar5, kVar4.f85054d), str14, x0Var, null, mVar2, i28);
                            mVar2.f();
                        } else {
                            mVar2.C(155859871);
                            mVar2.f();
                        }
                        v.b(t2Var, x2.u(aVar5, kVar4.f85055e), str15, x0Var, null, mVar2, i28);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE));
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: hq.p
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    int iT2 = p3.p0.t(i16);
                    v.c(rVar3, i14, str, str2, str3, str4, str5, kVar, z14, z15, z16, z17, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    public static final void d(l lVar, e2.i0 i0Var, int i14, e23.l lVar2, p3.m mVar, int i15) {
        h4.r rVarB;
        k kVar = lVar.f85061c;
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(199532908);
        int i16 = i15 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.B(i0Var) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (kVar.f85056f) {
                o0VarE.C(50466310);
                rVarB = a2.b(h4.r.S, a2.a(o0VarE), false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(50550382);
                o0VarE.g0(false);
                rVarB = h4.r.S;
            }
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            a(kVar, lVar.f85062d, lVar.f85059a, o0VarE, 0);
            boolean zR = o0VarE.r(lVar) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new cw1.k0(lVar, i14, lVar2, b0Var);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cw1.k0(lVar, i14, lVar2, b0Var);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, i0Var, null, null, null, null, false, null, (e23.l) objQ, o0VarE, i16 & 112, 509);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(lVar, i0Var, i14, lVar2, i15);
        }
    }
}
