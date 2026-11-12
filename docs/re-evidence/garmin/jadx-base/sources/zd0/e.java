package zd0;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.t5;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final void a(final h4.r rVar, long j8, long j14, float f14, p3.m mVar, final int i14) {
        final long j15;
        final long j16;
        final float f15;
        float f16;
        long j17;
        long j18;
        p3.o0 o0VarE = mVar.E(-333146960);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 1168;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                long j19 = d92.b.a(o0VarE).f().f63508c;
                bVar.getClass();
                long jE = d92.b.a(o0VarE).e().e();
                bVar.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97901d.f97907f;
                j17 = jE;
                j18 = j19;
            } else {
                o0VarE.e();
                j18 = j8;
                j17 = j14;
                f16 = f14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarB = u1.q.b(eVar.f97917b, ds.e0.f(o0VarE), rVar, k2.i.f102406a);
            u4.d.b bVar3 = u4.d.f168373k;
            u4.d dVarB = n5.e.b(R.drawable.gcplus_logo, o0VarE, 6);
            bVar2.getClass();
            g02.i.a(rVarB, dVarB, j18, j17, f16, eVar.f97920e, null, o0VarE, 0, 192);
            j15 = j18;
            j16 = j17;
            f15 = f16;
        } else {
            o0VarE.e();
            j15 = j8;
            j16 = j14;
            f15 = f14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(j15, j16, f15, i14) { // from class: zd0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f204000b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f204001c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f204002d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    e.a(this.f203999a, this.f204000b, this.f204001c, this.f204002d, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(long j8, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1861651846);
        int i15 = i14 | 54;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            float f14 = SyslogConstants.LOG_LOCAL4;
            g6.f.a aVar = g6.f.f75994b;
            j8 = dh.b.e(f14, 27);
            x1 x1Var = p3.n.f135158a;
            t4.d dVarA = n5.c.a(R.drawable.gcplus_large_logo, o0VarE, 0);
            h4.r.a aVar2 = h4.r.S;
            c2.k0 k0Var = x2.f22930a;
            h4.r rVarR = x2.r(aVar2, g6.h.c(j8), g6.h.b(j8));
            o4.d0.f128823b.getClass();
            i7.a(dVarA, null, rVarR, o4.d0.f128832k, o0VarE, 3120, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.n(j8, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void c(float f14, int i14, int i15, long j8, h4.r rVar, p3.m mVar) {
        h4.r rVar2;
        int i16;
        float f15;
        int i17;
        boolean z14;
        long j14;
        h4.r rVar3;
        float f16;
        p2 p2VarI0;
        h4.r rVar4;
        long j15;
        int i18;
        h4.r rVar5;
        float f17;
        p3.o0 o0VarE = mVar.E(2005882355);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(null) ? 32 : 16;
        }
        int i24 = i16 | 128;
        if ((i15 & 8) == 0) {
            f15 = f14;
            int i25 = o0VarE.i(f15) ? 2048 : 1024;
            i17 = i24 | i25;
            if ((i17 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    gl.c.f77766a.getClass();
                    j15 = gl.c.f77767b.f77820z0;
                    i18 = i17 & (-897);
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        rVar5 = rVar4;
                        f17 = j92.b.f97901d.f97904c;
                        i18 = i17 & (-8065);
                    } else {
                        rVar5 = rVar4;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.gcplus_logo, o0VarE, 0), null, x2.q(rVar5, f17), j15, o0VarE, i18 & 112, 0);
                    f16 = f17;
                    j14 = j15;
                    rVar3 = rVar5;
                } else {
                    o0VarE.e();
                    int i26 = i17 & (-897);
                    if ((i15 & 8) != 0) {
                        i26 = i17 & (-8065);
                    }
                    j15 = j8;
                    rVar5 = rVar2;
                    i18 = i26;
                }
                f17 = f15;
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                i7.a(n5.c.a(R.drawable.gcplus_logo, o0VarE, 0), null, x2.q(rVar5, f17), j15, o0VarE, i18 & 112, 0);
                f16 = f17;
                j14 = j15;
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                j14 = j8;
                rVar3 = rVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t5(rVar3, j14, f16, i14, i15);
            }
        }
        f15 = f14;
        i17 = i24 | i25;
        if ((i17 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                gl.c.f77766a.getClass();
                j15 = gl.c.f77767b.f77820z0;
                i18 = i17 & (-897);
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVar5 = rVar4;
                    f17 = j92.b.f97901d.f97904c;
                    i18 = i17 & (-8065);
                } else {
                    rVar5 = rVar4;
                    f17 = f15;
                }
            } else {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                gl.c.f77766a.getClass();
                j15 = gl.c.f77767b.f77820z0;
                i18 = i17 & (-897);
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVar5 = rVar4;
                    f17 = j92.b.f97901d.f97904c;
                    i18 = i17 & (-8065);
                } else {
                    rVar5 = rVar4;
                    f17 = f15;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            i7.a(n5.c.a(R.drawable.gcplus_logo, o0VarE, 0), null, x2.q(rVar5, f17), j15, o0VarE, i18 & 112, 0);
            f16 = f17;
            j14 = j15;
            rVar3 = rVar5;
        } else {
            o0VarE.e();
            j14 = j8;
            rVar3 = rVar2;
            f16 = f15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t5(rVar3, j14, f16, i14, i15);
        }
    }

    public static final void d(h4.r rVar, long j8, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-214317216);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | SyslogConstants.LOG_LOCAL6;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                gl.c.f77766a.getClass();
                j8 = gl.c.f77767b.f77820z0;
            } else {
                o0VarE.e();
            }
            int i16 = i15 & (-897);
            long j14 = j8;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            i7.a(n5.c.a(R.drawable.sparkle_logo, o0VarE, 0), null, rVar2, j14, o0VarE, 48 | ((i16 << 6) & 896), 0);
            j8 = j14;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.a(rVar2, j8, i14);
        }
    }
}
