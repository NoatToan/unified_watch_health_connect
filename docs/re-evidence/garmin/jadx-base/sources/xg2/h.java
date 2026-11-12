package xg2;

import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.google.android.gms.wallet.WalletConstants;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.s7;
import i3.v5;
import j23.t;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.t3;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import s5.x0;
import xd2.m0;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static final void a(final double d14, final String str, final boolean z14, final l lVar, final r rVar, long j8, m mVar, final int i14) {
        final long j14;
        int i15;
        long j15;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2013358312);
        int i16 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | 65536;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                s7.f89624a.getClass();
                i15 = i16 & (-458753);
                j15 = s7.a(o0VarE).f88502q;
            } else {
                o0VarE.e();
                i15 = i16 & (-458753);
                j15 = j8;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            j23.l lVar2 = new j23.l(0, z14 ? 453 : 999);
            j23.l lVar3 = new j23.l(0, 9);
            int iF = t.f((int) d14, lVar2);
            int iE = t.e((int) ((d14 % ((double) 1)) * ((double) 100)), 0, 99);
            int iF2 = t.f(iE / 10, lVar3);
            int iF3 = t.f(iE % 10, lVar3);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(iF, o0VarE);
            }
            final n1 n1Var4 = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(iF2, o0VarE);
            }
            final n1 n1Var5 = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(iF3, o0VarE);
            }
            final n1 n1Var6 = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = String.valueOf(DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator());
                o0VarE.K(objQ4);
            }
            String str2 = (String) objQ4;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            r rVarY = c2.l.y(rVar, f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22696f, bVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            int i17 = i15 & 7168;
            boolean z15 = i17 == 2048;
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                final int i18 = 0;
                objQ5 = new l() { // from class: xg2.e
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i19) {
                            case 0:
                                n1Var4.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var6.getIntValue() + (n1Var5.getIntValue() * 10))) / 100.0d) + ((double) iIntValue)));
                                break;
                            case 1:
                                n1Var4.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var6.getIntValue() + (iIntValue * 10))) / 100.0d) + ((double) n1Var5.getIntValue())));
                                break;
                            default:
                                n1Var4.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) ((n1Var6.getIntValue() * 10) + iIntValue)) / 100.0d) + ((double) n1Var5.getIntValue())));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                n1Var = n1Var4;
                n1Var2 = n1Var5;
                n1Var3 = n1Var6;
                o0VarE.K(objQ5);
            } else {
                n1Var3 = n1Var6;
                n1Var = n1Var4;
                n1Var2 = n1Var5;
            }
            int i19 = i15 >> 3;
            long j16 = j15;
            b(lVar2, iF, (l) objQ5, null, j16, null, o0VarE, 0);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            r.a aVar2 = r.S;
            bVar.getClass();
            mh.c(str2, c2.l.A(aVar2, eVar.f97918c, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 6, 0, 131068);
            boolean z16 = i17 == 2048;
            Object objQ6 = o0VarE.q();
            if (z16 || objQ6 == c2565a) {
                final int i24 = 1;
                final n1 n1Var7 = n1Var;
                final n1 n1Var8 = n1Var2;
                final n1 n1Var9 = n1Var3;
                objQ6 = new l() { // from class: xg2.e
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i24;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i110) {
                            case 0:
                                n1Var8.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var9.getIntValue() + (n1Var7.getIntValue() * 10))) / 100.0d) + ((double) iIntValue)));
                                break;
                            case 1:
                                n1Var8.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var9.getIntValue() + (iIntValue * 10))) / 100.0d) + ((double) n1Var7.getIntValue())));
                                break;
                            default:
                                n1Var8.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) ((n1Var9.getIntValue() * 10) + iIntValue)) / 100.0d) + ((double) n1Var7.getIntValue())));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ6);
            }
            b(lVar3, iF2, (l) objQ6, null, j16, null, o0VarE, 0);
            bVar.getClass();
            c2.l.f(x2.u(aVar2, f15), o0VarE);
            boolean z17 = i17 == 2048;
            Object objQ7 = o0VarE.q();
            if (z17 || objQ7 == c2565a) {
                final int i25 = 2;
                final n1 n1Var10 = n1Var;
                final n1 n1Var11 = n1Var2;
                final n1 n1Var12 = n1Var3;
                l lVar4 = new l() { // from class: xg2.e
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i25;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i110) {
                            case 0:
                                n1Var12.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var11.getIntValue() + (n1Var10.getIntValue() * 10))) / 100.0d) + ((double) iIntValue)));
                                break;
                            case 1:
                                n1Var12.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) (n1Var11.getIntValue() + (iIntValue * 10))) / 100.0d) + ((double) n1Var10.getIntValue())));
                                break;
                            default:
                                n1Var12.t(iIntValue);
                                lVar.invoke(Double.valueOf((((double) ((n1Var11.getIntValue() * 10) + iIntValue)) / 100.0d) + ((double) n1Var10.getIntValue())));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar4);
                objQ7 = lVar4;
            }
            b(lVar3, iF3, (l) objQ7, null, j16, null, o0VarE, 0);
            bVar.getClass();
            c2.l.f(x2.u(aVar2, f15), o0VarE);
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, i19 & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            j14 = j16;
        } else {
            o0VarE.e();
            j14 = j8;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(d14, str, z14, lVar, rVar, j14, i14) { // from class: xg2.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f190946a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f190947b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f190948c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l f190949d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ r f190950e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f190951f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(24577);
                    h.a(this.f190946a, this.f190947b, this.f190948c, this.f190949d, this.f190950e, this.f190951f, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(j23.l lVar, int i14, l lVar2, r rVar, long j8, l lVar3, m mVar, int i15) {
        int i16;
        l lVar4;
        o0 o0Var;
        r rVar2;
        l lVar5;
        Object gVar;
        x3 x3Var;
        i0 i0Var;
        l lVar6;
        o0 o0VarE = mVar.E(-841217133);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            lVar4 = lVar2;
            i16 |= o0VarE.r(lVar4) ? 256 : 128;
        } else {
            lVar4 = lVar2;
        }
        int i17 = i16 | 3072;
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.l(j8) ? 16384 : 8192;
        }
        int i18 = 196608 | i17;
        if (o0VarE.n(i18 & 1, (74899 & i18) != 74898)) {
            r.a aVar = r.S;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new m0(4);
                o0VarE.K(objQ);
            }
            l lVar7 = (l) objQ;
            x1 x1Var = n.f135158a;
            float f14 = 44;
            g6.f.a aVar3 = g6.f.f75994b;
            int i19 = lVar.f96797b;
            int i24 = lVar.f96796a;
            int i25 = (i19 - i24) + 1;
            i0 i0VarA = k0.a(i14 - i24, 0, 2, o0VarE);
            t3 t3VarC = z1.g.c(i0VarA, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new ct1.c(i0VarA, 15));
                o0VarE.K(objQ2);
            }
            x3 x3Var2 = (x3) objQ2;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(lVar) | ((i18 & 896) == 256);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                x3Var = x3Var2;
                i0Var = i0VarA;
                gVar = new g(x3Var, 1, lVar, lVar4, null);
                o0VarE.K(gVar);
            } else {
                i0Var = i0VarA;
                gVar = objQ3;
                x3Var = x3Var2;
            }
            l0.e((p) gVar, unit, o0VarE);
            float f15 = 3 * f14;
            r rVarH = x2.h(aVar, f15);
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81528f;
            z0 z0VarD = q.d(gVar2, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarH, o0VarE);
            h5.g.V.getClass();
            x3 x3Var3 = x3Var;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            r rVarC2 = uVar.c(aVar, gVar2);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f16 = 64;
            float f17 = 1;
            v5.a(f17, 48, 0, d0.c(0.3f, j8, 14), x2.u(c2.l.C(rVarC2, 0.0f, 0.0f, 0.0f, eVar.f97923h, 7), f16), o0VarE);
            r rVarC3 = uVar.c(aVar, gVar2);
            bVar2.getClass();
            v5.a(f17, 48, 0, d0.c(0.3f, j8, 14), x2.u(c2.l.C(rVarC3, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13), f16), o0VarE);
            o0Var = o0VarE;
            r rVarH2 = x2.h(aVar, f15);
            h4.g.a aVar5 = h4.d.a.f81537o;
            boolean zK = o0Var.k(i25) | o0Var.r(lVar) | ((i18 & 458752) == 131072);
            Object objQ4 = o0Var.q();
            if (zK || objQ4 == c2565a) {
                lVar6 = lVar7;
                ct1.e eVar2 = new ct1.e(i25, f14, lVar, x3Var3, lVar6);
                o0Var.K(eVar2);
                objQ4 = eVar2;
            } else {
                lVar6 = lVar7;
            }
            e2.c.b(rVarH2, i0Var, null, null, aVar5, t3VarC, false, null, (l) objQ4, o0Var, 196614, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
            o0Var.g0(true);
            lVar5 = lVar6;
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            lVar5 = lVar3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(lVar, i14, lVar2, rVar2, j8, lVar5, i15);
        }
    }
}
