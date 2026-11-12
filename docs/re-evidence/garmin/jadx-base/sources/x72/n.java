package x72;

import android.os.Build;
import c2.b0;
import c2.k3;
import c2.l1;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h4.r;
import h5.e0;
import i3.mh;
import i3.s7;
import i3.va;
import i3.wa;
import i3.xa;
import l72.c3;
import li0.y;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f189484a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f189484a = 16;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    public static final void a(r rVar, b bVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-764977172);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(bVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            s2 s2VarF = hb.a.f(c2.j.f22691a, f189484a, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z15 = bVar != b.Dynamic || Build.VERSION.SDK_INT >= 31;
            wa waVar = wa.f90116a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).k().a();
            s7.f89624a.getClass();
            long j8 = s7.a(o0VarE).f88502q;
            waVar.getClass();
            va vaVarA = wa.a(jA, j8, o0VarE, 12);
            boolean z16 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new wz1.c(9, lVar, bVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wz1.c(9, lVar, bVar);
                    o0VarE.K(objQ);
                }
            }
            xa.a(z14, (e23.a) objQ, null, z15, vaVarA, o0VarE, (i15 >> 6) & 14, 36);
            String str = bVar.f189438a;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar, bVar, z14, lVar, i14, 29);
        }
    }

    public static final void b(final r rVar, final boolean z14, final float f14, float f15, float f16, final e23.l lVar, final e23.a aVar, p3.m mVar, final int i14) {
        final float f17;
        final float f18;
        o0 o0VarE = mVar.E(-1971997159);
        int i15 = i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | 27648 | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            c3.f110949a.a(f14, lVar, null, z14, new j23.e(0.4f, 2.0f), 0, null, aVar, o0VarE, ((i15 >> 6) & 14) | 48 | ((i15 << 6) & 7168) | ((i15 << 3) & 29360128), 100);
            String strP = gl1.y.P(R.string.scale, new Object[]{Float.valueOf(f14)}, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            f17 = 0.4f;
            f18 = 2.0f;
        } else {
            o0VarE.e();
            f17 = f15;
            f18 = f16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(z14, f14, f17, f18, lVar, aVar, i14) { // from class: x72.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f189460b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f189461c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f189462d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f189463e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f189464f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f189465g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(196615);
                    n.b(this.f189459a, this.f189460b, this.f189461c, this.f189462d, this.f189463e, this.f189464f, this.f189465g, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    public static final void c(r rVar, d dVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        d dVar2;
        o0 o0VarE = mVar.E(1076549996);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(dVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            s2 s2VarF = hb.a.f(c2.j.f22691a, f189484a, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z15 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z15) {
                dVar2 = dVar;
                objQ = new wz1.c(10, lVar, dVar2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    dVar2 = dVar;
                    objQ = new wz1.c(10, lVar, dVar2);
                    o0VarE.K(objQ);
                } else {
                    dVar2 = dVar;
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            wa waVar = wa.f90116a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).k().a();
            s7.f89624a.getClass();
            long j8 = s7.a(o0VarE).f88502q;
            waVar.getClass();
            xa.a(z14, aVar2, null, false, wa.a(jA, j8, o0VarE, 12), o0VarE, (i15 >> 6) & 14, 44);
            String string = dVar2.toString();
            d92.b.f58624b.getClass();
            mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, dVar, z14, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    public static final void d(r rVar, f fVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        f fVar2;
        o0 o0VarE = mVar.E(1085353260);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(fVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            s2 s2VarF = hb.a.f(c2.j.f22691a, f189484a, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z15 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z15) {
                fVar2 = fVar;
                objQ = new wz1.c(8, lVar, fVar2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    fVar2 = fVar;
                    objQ = new wz1.c(8, lVar, fVar2);
                    o0VarE.K(objQ);
                } else {
                    fVar2 = fVar;
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            wa waVar = wa.f90116a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).k().a();
            s7.f89624a.getClass();
            long j8 = s7.a(o0VarE).f88502q;
            waVar.getClass();
            xa.a(z14, aVar2, null, false, wa.a(jA, j8, o0VarE, 12), o0VarE, (i15 >> 6) & 14, 44);
            String string = fVar2.toString();
            d92.b.f58624b.getClass();
            mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar, fVar, z14, lVar, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    public static final void e(e eVar, e23.l<? super e, Unit> lVar, p3.m mVar, int i14) {
        eVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(721131564);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = k3.f22728a;
            c2.c3 c3VarB = q3.b(o0VarE);
            p3.f22815b.getClass();
            c2.x1 x1VarD = n3.d(c3VarB, p3.f22823j);
            float f14 = f189484a;
            l1 l1VarC = n3.c(new c2.a(x1VarD, n3.b(0.0f, f14, 0.0f, f14, 5)), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            r rVarE = u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new l(eVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l(eVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, l1VarC, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 24576, 490);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(eVar, lVar, i14, 20);
        }
    }
}
