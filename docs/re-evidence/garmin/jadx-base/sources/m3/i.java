package m3;

import c2.t;
import c2.u;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.b1;
import f5.g0;
import f5.v1;
import f5.y0;
import f5.z0;
import h5.e0;
import i3.k9;
import i3.s7;
import n3.h0;
import o4.r1;
import o4.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm3/i;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f116250a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2.h f116251b = k2.i.f102406a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f116252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f116253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f116254e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<t, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f116255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f116256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f116257c;

        public a(boolean z14, long j8, r rVar) {
            this.f116255a = z14;
            this.f116256b = j8;
            this.f116257c = rVar;
        }

        @Override // e23.q
        public final Unit invoke(t tVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                x1 x1Var = p3.n.f135158a;
                m0.a(Boolean.valueOf(this.f116255a), null, k9.b(h0.DefaultEffects, mVar2), null, z3.f.c(-2064098104, new h(this.f116256b, this.f116257c), mVar2), mVar2, 24576, 10);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f14 = 80;
        g6.f.a aVar = g6.f.f75994b;
        f116252c = f14;
        f116253d = f14;
        n3.s.f123245a.getClass();
        f116254e = n3.s.f123248d;
    }

    private i() {
    }

    public final void a(final r rVar, final boolean z14, final h4.r rVar2, long j8, long j14, float f14, p3.m mVar, final int i14, final int i15) {
        int i16;
        final long j15;
        final long j16;
        final float f15;
        int i17;
        float f16;
        o0 o0VarE = mVar.E(-1076870256);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            j15 = j8;
            i16 |= ((i15 & 8) == 0 && o0VarE.l(j15)) ? 2048 : 1024;
        } else {
            j15 = j8;
        }
        if ((i14 & 24576) == 0) {
            j16 = j14;
            i16 |= ((i15 & 16) == 0 && o0VarE.l(j16)) ? 16384 : 8192;
        } else {
            j16 = j14;
        }
        if ((196608 & i14) == 0) {
            i16 |= 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.B(this) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 8) != 0) {
                    x1 x1Var = p3.n.f135158a;
                    s7.f89624a.getClass();
                    j15 = s7.a(o0VarE).G;
                    i16 &= -7169;
                }
                if ((i15 & 16) != 0) {
                    x1 x1Var2 = p3.n.f135158a;
                    s7.f89624a.getClass();
                    j16 = s7.a(o0VarE).f88504s;
                    i16 &= -57345;
                }
                i17 = i16 & (-458753);
                f16 = f116253d;
            } else {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                }
                i17 = i16 & (-458753);
                f16 = f14;
            }
            long j17 = j16;
            long j18 = j15;
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            int i18 = (i17 & 14) | 12582912 | (i17 & 112) | (i17 & 896);
            int i19 = i17 << 6;
            b(rVar, z14, rVar2, f16, null, j18, 0.0f, z3.f.c(298232649, new a(z14, j17, rVar), o0VarE), o0VarE, i18 | (458752 & i19) | (i19 & 234881024));
            f15 = f16;
            j15 = j18;
            j16 = j17;
        } else {
            o0VarE.e();
            f15 = f14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m3.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    i iVar = i.f116250a;
                    this.f116212a.a(rVar, z14, rVar2, j15, j16, f15, mVar2, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void b(final r rVar, final boolean z14, final h4.r rVar2, final float f14, r1 r1Var, final long j8, float f15, final z3.e eVar, p3.m mVar, final int i14) {
        final r rVar3;
        int i15;
        i iVar;
        final r1 r1Var2;
        final float f16;
        int i16;
        r1 r1Var3;
        final r1 r1Var4;
        o0 o0VarE = mVar.E(-1341144489);
        if ((i14 & 6) == 0) {
            rVar3 = rVar;
            i15 = (o0VarE.B(rVar3) ? 4 : 2) | i14;
        } else {
            rVar3 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            iVar = this;
            i15 |= o0VarE.B(iVar) ? 67108864 : 33554432;
        } else {
            iVar = this;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i16 = i15 & (-3727361);
                r1Var3 = f116251b;
                f16 = f116254e;
            } else {
                o0VarE.e();
                i16 = i15 & (-3727361);
                r1Var3 = r1Var;
                f16 = f15;
            }
            int i17 = i16;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarQ = x2.q(rVar2, l.f116268d);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new lq1.a(27);
                o0VarE.K(objQ);
            }
            h4.r rVarF = l4.k.f(rVarQ, (e23.l) objQ);
            boolean zI = ((i17 & 112) == 32) | ((i17 & 14) == 4) | ((((i17 & 7168) ^ 3072) > 2048 && o0VarE.i(f14)) || (i17 & 3072) == 2048) | o0VarE.i(f16) | o0VarE.B(r1Var3);
            Object objQ2 = o0VarE.q();
            if (zI || objQ2 == c2565a) {
                r1Var4 = r1Var3;
                e23.q qVar = new e23.q() { // from class: m3.c
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        i iVar2 = i.f116250a;
                        final v1 v1VarQ = ((y0) obj2).Q(((g6.a) obj3).f75988a);
                        int i18 = v1VarQ.f69144a;
                        int i19 = v1VarQ.f69145b;
                        final r rVar4 = rVar3;
                        final boolean z15 = z14;
                        final float f17 = f14;
                        final float f18 = f16;
                        final r1 r1Var5 = r1Var4;
                        return b1.h0((b1) obj, i18, i19, new e23.l() { // from class: m3.e
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                v1.a aVar = (v1.a) obj4;
                                i iVar3 = i.f116250a;
                                final r rVar5 = rVar4;
                                final boolean z16 = z15;
                                final float f19 = f17;
                                final float f22 = f18;
                                final r1 r1Var6 = r1Var5;
                                v1.a.K(aVar, v1VarQ, 0, 0, new e23.l() { // from class: m3.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj5) {
                                        t0 t0Var = (t0) obj5;
                                        i iVar4 = i.f116250a;
                                        r rVar6 = rVar5;
                                        boolean z17 = rVar6.b() > 0.0f || z16;
                                        t0Var.q((rVar6.b() * t0Var.f0(f19)) - Float.intBitsToFloat((int) (t0Var.getF128919r() & 4294967295L)));
                                        t0Var.j(z17 ? t0Var.s0(f22) : 0.0f);
                                        t0Var.e1(r1Var6);
                                        t0Var.g(true);
                                        return Unit.INSTANCE;
                                    }
                                }, 4);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                o0VarE.K(qVar);
                objQ2 = qVar;
            } else {
                r1Var4 = r1Var3;
            }
            h4.r rVarE = u1.n.e(g0.d(rVarF, (e23.q) objQ2), j8, r1Var4);
            h4.d.f81522a.getClass();
            int i18 = ((i17 >> 12) & 7168) | 48;
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iP = o0VarE.P();
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u.f22885a, o0VarE, Integer.valueOf(((i18 >> 6) & 112) | 6));
            o0VarE.g0(true);
            r1Var2 = r1Var4;
        } else {
            o0VarE.e();
            r1Var2 = r1Var;
            f16 = f15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final i iVar2 = iVar;
            p2VarI0.f135219d = new e23.p() { // from class: m3.d
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    i iVar3 = i.f116250a;
                    this.f116226a.b(rVar, z14, rVar2, f14, r1Var2, j8, f16, eVar, mVar2, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
