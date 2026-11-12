package kn1;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import da0.x;
import e23.p;
import f5.z0;
import g02.f1;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.y0;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static final void a(d0 d0Var, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(654683209);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarY = c2.l.y(aVar, 8);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            if (d0Var != null) {
                o0VarE.C(880968469);
                q.a(u1.n.e(l4.k.b(x2.q(aVar, 16), k2.i.f102406a), d0Var.f128833a, m1.f128891a), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(881197063);
                r rVarQ = x2.q(aVar, 16);
                d0.f128823b.getClass();
                r rVarE = u1.n.e(rVarQ, d0.f128831j, m1.f128891a);
                gl.c.f77766a.getClass();
                q.a(u1.q.b(1, gl.c.a(o0VarE).f(), rVarE, k2.i.f102406a), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.l(d0Var, i14, 9);
        }
    }

    public static final void b(final int i14, final double d14, final int i15, final int i16, final long j8, final int i17, final String str, final int i18, p3.m mVar, final int i19) {
        o0 o0Var;
        int iCeil;
        o0 o0VarE = mVar.E(-2035096828);
        p3.c<?> cVar = o0VarE.f135177b;
        int i24 = i19 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.m(d14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.k(i16) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192) | (o0VarE.k(i17) ? 131072 : 65536) | (o0VarE.B(str) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.k(i18) ? 8388608 : 4194304);
        if (o0VarE.n(i24 & 1, (4793491 & i24) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            mn1.d dVar = new mn1.d(a0.s(o0VarE));
            oi0.h hVar = new oi0.h((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strP = y.P(i18, new Object[]{hVar.c(i14, false), dVar.d(str), hVar.c((int) (((double) i15) * 60.0d), false), hVar.c((int) (((double) i16) * 60.0d), false)}, o0VarE);
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(rVarF, f14, f14, f14, 0.0f, 8);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new kb0.d(29);
                o0VarE.K(objQ);
            }
            r rVarC2 = v.c((e23.l) objQ, rVarC, true);
            boolean zB = o0VarE.B(strP);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new jl0.e(strP, 14);
                o0VarE.K(objQ2);
            }
            r rVarB = v.b(rVarC2, (e23.l) objQ2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarB, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.lbl_your_total);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            String strP2 = y.P(R.string.string_string_bracket_pattern, new Object[]{dVar.b(i14), dVar.a(Double.valueOf(d14))}, o0VarE);
            r rVarC4 = c2.l.C(aVar, 0.0f, 4, 0.0f, 24, 5);
            fVar2.getClass();
            mh.c(strP2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
            int i25 = i14 / 60;
            if (i25 <= 0) {
                iCeil = 0;
            } else if (i25 < i15) {
                iCeil = (i25 * 25) / i15;
            } else if (i25 > i16) {
                iCeil = (int) Math.ceil((i25 * 75) / i16);
            } else {
                iCeil = ((int) (50 * ((i25 - i15) / (i16 - i15)))) + 25;
            }
            float f15 = iCeil;
            e(f15, f15 / 100, j8, dVar.c(i15 * 60), dVar.c(i16 * 60), o0VarE, (i24 >> 6) & 896);
            o0Var = o0VarE;
            float f16 = 8;
            r rVarC5 = c2.l.C(b0Var.b(aVar, h4.d.a.f81537o), 0.0f, f16, 0.0f, f16, 5);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var, 0);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            r rVarC6 = h4.k.c(rVarC5, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, s2VarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC6, o0Var);
            u2 u2Var = u2.f22900a;
            c(i17, d0.a(j8), o0Var, ((i24 >> 15) & 14) | ((i24 >> 9) & 112), 0);
            c(R.string.lbl_optimal_range, null, o0Var, 0, 2);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, d14, i15, i16, j8, i17, str, i18, i19) { // from class: kn1.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f105662a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ double f105663b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f105664c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f105665d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f105666e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f105667f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f105668g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f105669h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    j.b(this.f105662a, this.f105663b, this.f105664c, this.f105665d, this.f105666e, this.f105667f, this.f105668g, this.f105669h, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void c(int i14, d0 d0Var, p3.m mVar, int i15, int i16) {
        int i17;
        d0 d0Var2;
        boolean z14;
        o0 o0Var;
        p2 p2VarI0;
        d0 d0Var3;
        r.a aVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        o0 o0VarE = mVar.E(1833097096);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i17 |= o0VarE.B(d0Var2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i18 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                x1 x1Var = p3.n.f135158a;
                aVar = r.S;
                g6.f.a aVar3 = g6.f.f75994b;
                r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 8, 0.0f, 11);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                a(d0Var3, o0VarE, (i17 >> 3) & 14);
                r rVarC3 = u2Var.c(aVar, h4.d.a.f81534l);
                String strQ = y.Q(o0VarE, i14);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(true);
                d0Var2 = d0Var3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ct1.g(i14, d0Var2, i15, i16);
            }
        }
        i17 |= 48;
        d0Var2 = d0Var;
        if ((i17 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i18 != 0) {
                d0Var3 = null;
            } else {
                d0Var3 = d0Var2;
            }
            x1 x1Var2 = p3.n.f135158a;
            aVar = r.S;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarC4 = c2.l.C(aVar, 0.0f, 0.0f, 8, 0.0f, 11);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j2 = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2VarA = q2.a(c0343j2, h4.d.a.f81533k, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            a(d0Var3, o0VarE, (i17 >> 3) & 14);
            r rVarC5 = u2Var2.c(aVar, h4.d.a.f81534l);
            String strQ2 = y.Q(o0VarE, i14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            d0Var2 = d0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.g(i14, d0Var2, i15, i16);
        }
    }

    public static final void d(String str, int i14, float f14, p3.m mVar, int i15) {
        int i16;
        o0 o0Var;
        o0 o0VarE = mVar.E(342997686);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.i(f14) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r rVarU = x2.u(r.S, f14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarU, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, i16 & 14, (i16 >> 3) & 14, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(str, i14, i15, f14);
        }
    }

    public static final void e(final float f14, final float f15, final long j8, String str, String str2, p3.m mVar, final int i14) {
        int i15;
        h5.g.a.b bVar;
        String str3 = str;
        String str4 = str2;
        o0 o0VarE = mVar.E(-100671616);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            int i16 = i15;
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            z0 z0VarD2 = q.d(gVar, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            r rVarF2 = x2.f(aVar, 1.0f);
            h4.g gVar2 = h4.d.a.f81528f;
            f1.j(uVar.c(rVarF2, gVar2), 0, false, j8, f14, 0.0f, 0.0f, o0VarE, ((i16 << 3) & 7168) | 384 | ((i16 << 12) & 57344), 98);
            r rVarF3 = x2.f(aVar, f15);
            z0 z0VarD3 = q.d(gVar, false);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC4 = h4.k.c(rVarF3, o0VarE);
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
            b4.c(eVar, z0VarD3, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                bVar = bVar2;
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            } else {
                bVar = bVar2;
            }
            b4.c(fVar, rVarC4, o0VarE);
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarH = x2.h(x2.u(aVar, 1), 24);
            gl.c.f77766a.getClass();
            long jF = gl.c.a(o0VarE).f();
            m1.a aVar5 = m1.f128891a;
            c2.l.f(uVar.c(u1.n.e(rVarH, jF, aVar5), h4.d.a.f81529g), o0VarE);
            o0VarE.g0(true);
            o0VarE.g0(true);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("0", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 6, 0, 131070);
            o0VarE.g0(true);
            float f16 = 2;
            float f17 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp / f16;
            r rVarC5 = uVar.c(aVar, gVar2);
            z zVarA2 = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode5 = Long.hashCode(o0VarE.U);
            i2 i2VarA4 = o0VarE.a0();
            r rVarC6 = h4.k.c(rVarC5, o0VarE);
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
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA4, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
            }
            b4.c(fVar, rVarC6, o0VarE);
            float f18 = 6;
            c2.l.f(x2.h(aVar, f18), o0VarE);
            r rVarU = x2.u(x2.h(aVar, 12), f17);
            d0.f128823b.getClass();
            q.a(u1.q.b(f16, gl.c.a(o0VarE).f(), u1.n.e(rVarU, d0.f128831j, aVar5), k2.i.a(8)), o0VarE, 0);
            c2.l.f(x2.h(aVar, f18), o0VarE);
            float f19 = f17 / f16;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode6 = Long.hashCode(o0VarE.U);
            i2 i2VarA5 = o0VarE.a0();
            r rVarC7 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA5, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode6))) {
                v.h.A(iHashCode6, o0VarE, iHashCode6, bVar);
            }
            b4.c(fVar, rVarC7, o0VarE);
            u2 u2Var = u2.f22900a;
            d6.h.f57752b.getClass();
            str3 = str;
            d(str3, d6.h.f57757g, f19, o0VarE, (i16 >> 9) & 14);
            str4 = str2;
            d(str4, d6.h.f57758h, f19, o0VarE, (i16 >> 12) & 14);
            o0VarE.g0(true);
            o0VarE.g0(true);
            int i17 = (int) f14;
            if (25 > i17 || i17 >= 76) {
                o0VarE.C(-1896914968);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1897305444);
                y0.a(n5.c.a(R.drawable.check, o0VarE, 0), "", c2.l.C(uVar.c(x2.q(aVar, 20), h4.d.a.f81526d), 0.0f, f16, 0.0f, 0.0f, 13), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).f().e()), o0VarE, 48, 56);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final String str5 = str3;
            final String str6 = str4;
            p2VarI0.f135219d = new p() { // from class: kn1.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.e(f14, f15, j8, str5, str6, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
