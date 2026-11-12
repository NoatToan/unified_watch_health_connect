package cr;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.m1;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    public static final void a(h4.r rVar, int i14, x0 x0Var, final int i15, final double d14, final i53.f fVar, final e23.a aVar, final p1 p1Var, p3.m mVar, final int i16) {
        o0 o0Var;
        final h4.r rVar2;
        final int i17;
        final x0 x0Var2;
        h4.r rVar3;
        x0 x0VarB;
        int i18;
        int i19;
        int i24;
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1593631259);
        int i25 = i16 | 150 | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.m(d14) ? 16384 : 8192) | (o0VarE.B(fVar) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i25 & 1, (4793491 & i25) != 4793490)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                i18 = i25 & (-1009);
                i19 = R.color.gcm_background_hero;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                x0VarB = x0Var;
                i18 = i25 & (-1009);
                i19 = i14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (Double.isNaN(d14)) {
                o0Var = o0VarE;
                i24 = i19;
                o0Var.C(-698588697);
                o0Var.g0(false);
            } else {
                o0VarE.C(-699230645);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
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
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r.a aVar3 = h4.r.S;
                float f14 = 8;
                g6.f.a aVar4 = g6.f.f75994b;
                int i26 = i19;
                mh.c(gl1.y.Q(o0VarE, i15), c2.l.C(aVar3, f14, 0.0f, f14, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 131068);
                float f15 = 16;
                c2.l.f(x2.h(aVar3, f15), o0VarE);
                m1.b(i26, fVar, (float) d14, aVar, null, 0.0f, 0.0f, 0.0f, 0.0f, null, p1Var, o0VarE, ((i18 >> 12) & 112) | ((i18 >> 9) & 7168), 6, 1008);
                i24 = i26;
                o0Var = o0VarE;
                c2.l.f(x2.h(aVar3, f15), o0Var);
                o0Var.g0(true);
                o0Var.g0(false);
            }
            rVar2 = rVar3;
            i17 = i24;
            x0Var2 = x0VarB;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            i17 = i14;
            x0Var2 = x0Var;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(i17, x0Var2, i15, d14, fVar, aVar, p1Var, i16) { // from class: cr.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f55318b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ x0 f55319c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f55320d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ double f55321e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ i53.f f55322f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f55323g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ p1 f55324h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(12582913);
                    a0.a(this.f55317a, this.f55318b, this.f55319c, this.f55320d, this.f55321e, this.f55322f, this.f55323g, this.f55324h, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
