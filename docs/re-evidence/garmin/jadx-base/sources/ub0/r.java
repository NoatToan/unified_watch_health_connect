package ub0;

import c2.u;
import c2.x2;
import e2.f0;
import e2.i0;
import e2.k0;
import f5.z0;
import h5.e0;
import j23.t;
import o4.d0;
import o4.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f169784a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f169784a = 4;
    }

    public static final void a(float f14, float f15, long j8, r1 r1Var, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1570765189);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14 | (o0VarE.i(f15) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(r1Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarQ = x2.q(aVar, f14);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarQ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            c2.q.a(u1.n.e(x2.q(aVar, f15), j8, r1Var), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p82.d(f14, f15, j8, r1Var, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final int i14, h4.r rVar, final int i15, long j8, long j14, float f14, float f15, float f16, r1 r1Var, p3.m mVar, final int i16) {
        h4.r rVar2;
        final long j15;
        final long j16;
        final float f17;
        final float f18;
        final r1 r1Var2;
        o0 o0Var;
        final float f19;
        long jA;
        long j17;
        float f22;
        float f24;
        float f25;
        int i17;
        r1 r1Var3;
        int i18;
        i0 i0Var;
        float f26;
        float f27;
        float f28;
        long j18;
        long j19;
        r1 r1Var4;
        o0 o0VarE = mVar.E(836528542);
        int i19 = i16 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 256 : 128) | 47916032;
        if (o0VarE.n(i19 & 1, (38347923 & i19) != 38347922)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                jA = d92.b.a(o0VarE).b().a().a();
                bVar.getClass();
                j17 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                f22 = 8;
                g6.f.a aVar = g6.f.f75994b;
                f24 = 6;
                f25 = 4;
                i17 = i19 & (-234945537);
                r1Var3 = k2.i.f102406a;
            } else {
                o0VarE.e();
                jA = j8;
                j17 = j14;
                f22 = f14;
                f24 = f15;
                f25 = f16;
                i17 = i19 & (-234945537);
                r1Var3 = r1Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = g6.f.a(((g6.f) r13.b.d(g6.f.a(f22), r13.b.d(g6.f.a(f24), g6.f.a(f25)))).f75997a);
                o0VarE.K(objQ);
            }
            final float f29 = ((g6.f) objQ).f75997a;
            int i24 = i17 & 896;
            final float f34 = f22;
            boolean zI = (i24 == 256) | o0VarE.i(f29);
            Object objQ2 = o0VarE.q();
            float f35 = f169784a;
            if (zI) {
                int iE = t.e(i15, 0, 5);
                float f36 = iE * f29;
                i18 = iE - 1;
                if (i18 < 0) {
                    i18 = 0;
                }
                objQ2 = g6.f.a((i18 * f35) + f36);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == c2565a) {
                    int iE2 = t.e(i15, 0, 5);
                    float f37 = iE2 * f29;
                    i18 = iE2 - 1;
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    objQ2 = g6.f.a((i18 * f35) + f37);
                    o0VarE.K(objQ2);
                }
            }
            float f38 = ((g6.f) objQ2).f75997a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Integer numValueOf = Integer.valueOf(i14);
            int i25 = i17 & 14;
            final float f39 = f24;
            boolean zB = o0VarE.B(i0VarA) | (i25 == 4);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new q(i0VarA, i14, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new q(i0VarA, i14, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, numValueOf, o0VarE);
            Object objQ4 = o0VarE.q();
            aVar2.getClass();
            if (objQ4 == c2565a) {
                objQ4 = p0.f(new ct1.c(i0VarA, 13));
                o0VarE.K(objQ4);
            }
            final x3 x3Var = (x3) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.f(new by1.h(x3Var, 13));
                o0VarE.K(objQ5);
            }
            final x3 x3Var2 = (x3) objQ5;
            rVar2 = rVar;
            h4.r rVarU = x2.u(rVar2, f38);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.i iVarI = c2.j.i(f35);
            boolean zI2 = (i24 == 256) | (i25 == 4) | o0VarE.i(f29) | o0VarE.l(jA) | o0VarE.l(j17) | o0VarE.B(r1Var3);
            Object objQ6 = o0VarE.q();
            if (zI2 || objQ6 == c2565a) {
                final long j24 = jA;
                final long j25 = j17;
                final r1 r1Var5 = r1Var3;
                i0Var = i0VarA;
                final float f44 = f25;
                e23.l lVar = new e23.l() { // from class: ub0.n
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        final int i26 = 0;
                        while (true) {
                            final int i27 = i15;
                            if (i26 >= i27) {
                                return Unit.INSTANCE;
                            }
                            Integer numValueOf2 = Integer.valueOf(i26);
                            final float f45 = f44;
                            final int i28 = i14;
                            final float f46 = f34;
                            final float f47 = f39;
                            final float f48 = f29;
                            final long j26 = j24;
                            final long j27 = j25;
                            final r1 r1Var6 = r1Var5;
                            final x3 x3Var3 = x3Var;
                            final x3 x3Var4 = x3Var2;
                            f0.b(f0Var, numValueOf2, new z3.e(1208821965, true, new e23.q() { // from class: ub0.p
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    float f49;
                                    p3.m mVar2 = (p3.m) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((e2.d) obj2).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                        int i29 = i26;
                                        int i30 = i28;
                                        if ((i29 != iIntValue2 || i29 <= 0) && (i29 != ((Number) x3Var4.getF182175a()).intValue() || i29 >= i27 - 1)) {
                                            f49 = i29 == i30 ? f46 : f47;
                                        } else {
                                            f49 = f45;
                                        }
                                        r.a(f48, ((g6.f) s1.f.a(f49, null, "", mVar2, 384, 10).getF182175a()).f75997a, i30 == i29 ? j26 : j27, r1Var6, mVar2, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2);
                            i26++;
                        }
                    }
                };
                f26 = f44;
                f27 = f34;
                f28 = f39;
                j18 = j24;
                j19 = j25;
                r1Var4 = r1Var5;
                o0VarE.K(lVar);
                objQ6 = lVar;
            } else {
                f27 = f34;
                f28 = f39;
                f26 = f25;
                r1Var4 = r1Var3;
                i0Var = i0VarA;
                j18 = jA;
                j19 = j17;
            }
            e2.c.c(rVarU, i0Var, null, iVarI, bVar2, null, false, null, (e23.l) objQ6, o0VarE, 12804096, 332);
            o0Var = o0VarE;
            f17 = f27;
            f18 = f28;
            f19 = f26;
            j15 = j18;
            j16 = j19;
            r1Var2 = r1Var4;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            j15 = j8;
            j16 = j14;
            f17 = f14;
            f18 = f15;
            r1Var2 = r1Var;
            o0Var = o0VarE;
            f19 = f16;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final h4.r rVar3 = rVar2;
            p2VarI0.f135219d = new e23.p(i14, rVar3, i15, j15, j16, f17, f18, f19, r1Var2, i16) { // from class: ub0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f169760a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f169761b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f169762c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f169763d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f169764e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f169765f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f169766g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f169767h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ r1 f169768i;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(49);
                    r.b(this.f169760a, this.f169761b, this.f169762c, this.f169763d, this.f169764e, this.f169765f, this.f169766g, this.f169767h, this.f169768i, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
