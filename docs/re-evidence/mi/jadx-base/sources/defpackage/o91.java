package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o91 implements q.e, com.google.android.exoplayer2.audio.a, vrq, l, gy1.a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f14 f28874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.b f28875b;
    public final v.c c;
    public final a d;
    public final SparseArray<p91.a> e;
    public whe<p91> f;
    public q g;
    public boolean h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v.b f28876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList<k.a> f28877b = ImmutableList.of();
        public ImmutableMap<k.a, v> c = ImmutableMap.of();
        public k.a d;
        public k.a e;
        public k.a f;

        public a(v.b bVar) {
            this.f28876a = bVar;
        }

        public static k.a c(q qVar, ImmutableList<k.a> immutableList, k.a aVar, v.b bVar) {
            v vVarC = qVar.C();
            int iR = qVar.r();
            Object objM = vVarC.q() ? null : vVarC.m(iR);
            int iD = (qVar.a() || vVarC.q()) ? -1 : vVarC.f(iR, bVar).d(g83.c(qVar.getCurrentPosition()) - bVar.l());
            for (int i = 0; i < immutableList.size(); i++) {
                k.a aVar2 = immutableList.get(i);
                if (i(aVar2, objM, qVar.a(), qVar.k(), qVar.u(), iD)) {
                    return aVar2;
                }
            }
            if (immutableList.isEmpty() && aVar != null) {
                if (i(aVar, objM, qVar.a(), qVar.k(), qVar.u(), iD)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean i(k.a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (aVar.f27977a.equals(obj)) {
                return (z && aVar.f27978b == i && aVar.c == i2) || (!z && aVar.f27978b == -1 && aVar.e == i3);
            }
            return false;
        }

        public final void b(ImmutableMap.b<k.a, v> bVar, k.a aVar, v vVar) {
            if (aVar == null) {
                return;
            }
            if (vVar.b(aVar.f27977a) != -1) {
                bVar.g(aVar, vVar);
                return;
            }
            v vVar2 = this.c.get(aVar);
            if (vVar2 != null) {
                bVar.g(aVar, vVar2);
            }
        }

        public k.a d() {
            return this.d;
        }

        public k.a e() {
            if (this.f28877b.isEmpty()) {
                return null;
            }
            return (k.a) cpd.f(this.f28877b);
        }

        public v f(k.a aVar) {
            return this.c.get(aVar);
        }

        public k.a g() {
            return this.e;
        }

        public k.a h() {
            return this.f;
        }

        public void j(q qVar) {
            this.d = c(qVar, this.f28877b, this.e, this.f28876a);
        }

        public void k(List<k.a> list, k.a aVar, q qVar) {
            this.f28877b = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.e = list.get(0);
                this.f = (k.a) rk1.e(aVar);
            }
            if (this.d == null) {
                this.d = c(qVar, this.f28877b, this.e, this.f28876a);
            }
            m(qVar.C());
        }

        public void l(q qVar) {
            this.d = c(qVar, this.f28877b, this.e, this.f28876a);
            m(qVar.C());
        }

        public final void m(v vVar) {
            ImmutableMap.b<k.a, v> bVarBuilder = ImmutableMap.builder();
            if (this.f28877b.isEmpty()) {
                b(bVarBuilder, this.e, vVar);
                if (!j4h.a(this.f, this.e)) {
                    b(bVarBuilder, this.f, vVar);
                }
                if (!j4h.a(this.d, this.e) && !j4h.a(this.d, this.f)) {
                    b(bVarBuilder, this.d, vVar);
                }
            } else {
                for (int i = 0; i < this.f28877b.size(); i++) {
                    b(bVarBuilder, this.f28877b.get(i), vVar);
                }
                if (!this.f28877b.contains(this.d)) {
                    b(bVarBuilder, this.d, vVar);
                }
            }
            this.c = bVarBuilder.a();
        }
    }

    public o91(f14 f14Var) {
        this.f28874a = (f14) rk1.e(f14Var);
        this.f = new whe<>(wlq.P(), f14Var, new whe.b() { // from class: j91
            @Override // whe.b
            public final void a(Object obj, nh8 nh8Var) {
                o91.U0((p91) obj, nh8Var);
            }
        });
        v.b bVar = new v.b();
        this.f28875b = bVar;
        this.c = new v.c();
        this.d = new a(bVar);
        this.e = new SparseArray<>();
    }

    public static /* synthetic */ void D1(p91.a aVar, int i, q.f fVar, q.f fVar2, p91 p91Var) {
        p91Var.i(aVar, i);
        p91Var.W(aVar, fVar, fVar2, i);
    }

    public static /* synthetic */ void P1(p91.a aVar, String str, long j, long j2, p91 p91Var) {
        p91Var.V(aVar, str, j);
        p91Var.d0(aVar, str, j2, j);
        p91Var.Q(aVar, 2, str, j);
    }

    public static /* synthetic */ void R1(p91.a aVar, ss5 ss5Var, p91 p91Var) {
        p91Var.T(aVar, ss5Var);
        p91Var.I(aVar, 2, ss5Var);
    }

    public static /* synthetic */ void S1(p91.a aVar, ss5 ss5Var, p91 p91Var) {
        p91Var.v(aVar, ss5Var);
        p91Var.h(aVar, 2, ss5Var);
    }

    public static /* synthetic */ void U0(p91 p91Var, nh8 nh8Var) {
    }

    public static /* synthetic */ void U1(p91.a aVar, Format format, us5 us5Var, p91 p91Var) {
        p91Var.p(aVar, format);
        p91Var.y(aVar, format, us5Var);
        p91Var.z(aVar, 2, format);
    }

    public static /* synthetic */ void V1(p91.a aVar, wrq wrqVar, p91 p91Var) {
        p91Var.f(aVar, wrqVar);
        p91Var.P(aVar, wrqVar.f38295a, wrqVar.f38296b, wrqVar.c, wrqVar.d);
    }

    public static /* synthetic */ void X0(p91.a aVar, String str, long j, long j2, p91 p91Var) {
        p91Var.u(aVar, str, j);
        p91Var.Z(aVar, str, j2, j);
        p91Var.Q(aVar, 1, str, j);
    }

    public static /* synthetic */ void Z0(p91.a aVar, ss5 ss5Var, p91 p91Var) {
        p91Var.B(aVar, ss5Var);
        p91Var.I(aVar, 1, ss5Var);
    }

    public static /* synthetic */ void a1(p91.a aVar, ss5 ss5Var, p91 p91Var) {
        p91Var.r(aVar, ss5Var);
        p91Var.h(aVar, 1, ss5Var);
    }

    public static /* synthetic */ void b1(p91.a aVar, Format format, us5 us5Var, p91 p91Var) {
        p91Var.Y(aVar, format);
        p91Var.R(aVar, format, us5Var);
        p91Var.z(aVar, 1, format);
    }

    public static /* synthetic */ void k1(p91.a aVar, int i, p91 p91Var) {
        p91Var.n(aVar);
        p91Var.w(aVar, i);
    }

    public static /* synthetic */ void o1(p91.a aVar, boolean z, p91 p91Var) {
        p91Var.C(aVar, z);
        p91Var.m0(aVar, z);
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void A(int i, k.a aVar, final mie mieVar, final ljf ljfVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1002, new whe.a() { // from class: s71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).U(aVarR0, mieVar, ljfVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void B(int i, k.a aVar, final mie mieVar, final ljf ljfVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1000, new whe.a() { // from class: z81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).c(aVarR0, mieVar, ljfVar);
            }
        });
    }

    @Override // defpackage.vrq
    public final void C(final Object obj, final long j) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1027, new whe.a() { // from class: y71
            @Override // whe.a
            public final void invoke(Object obj2) {
                ((p91) obj2).S(aVarT0, obj, j);
            }
        });
    }

    @Override // defpackage.vrq
    public final void D(final Format format, final us5 us5Var) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1022, new whe.a() { // from class: o81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.U1(aVarT0, format, us5Var, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void E(int i, k.a aVar, final mie mieVar, final ljf ljfVar, final IOException iOException, final boolean z) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1003, new whe.a() { // from class: g81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).L(aVarR0, mieVar, ljfVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void G(int i, k.a aVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1035, new whe.a() { // from class: m91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).x(aVarR0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void H(final int i, final long j, final long j2) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1012, new whe.a() { // from class: g91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).i0(aVarT0, i, j, j2);
            }
        });
    }

    public final p91.a N0() {
        return P0(this.d.d());
    }

    public final p91.a O0(v vVar, int i, k.a aVar) {
        k.a aVar2 = vVar.q() ? null : aVar;
        long jElapsedRealtime = this.f28874a.elapsedRealtime();
        boolean z = vVar.equals(this.g.C()) && i == this.g.y();
        long jB = 0;
        if (aVar2 == null || !aVar2.b()) {
            if (z) {
                jB = this.g.J();
            } else if (!vVar.q()) {
                jB = vVar.n(i, this.c).b();
            }
        } else if (z && this.g.k() == aVar2.f27978b && this.g.u() == aVar2.c) {
            jB = this.g.getCurrentPosition();
        }
        return new p91.a(jElapsedRealtime, vVar, i, aVar2, jB, this.g.C(), this.g.y(), this.d.d(), this.g.getCurrentPosition(), this.g.b());
    }

    public final p91.a P0(k.a aVar) {
        rk1.e(this.g);
        v vVarF = aVar == null ? null : this.d.f(aVar);
        if (aVar != null && vVarF != null) {
            return O0(vVarF, vVarF.h(aVar.f27977a, this.f28875b).c, aVar);
        }
        int iY = this.g.y();
        v vVarC = this.g.C();
        if (iY >= vVarC.p()) {
            vVarC = v.f8444a;
        }
        return O0(vVarC, iY, null);
    }

    public final p91.a Q0() {
        return P0(this.d.e());
    }

    public final p91.a R0(int i, k.a aVar) {
        rk1.e(this.g);
        if (aVar != null) {
            return this.d.f(aVar) != null ? P0(aVar) : O0(v.f8444a, i, aVar);
        }
        v vVarC = this.g.C();
        if (i >= vVarC.p()) {
            vVarC = v.f8444a;
        }
        return O0(vVarC, i, null);
    }

    public final p91.a S0() {
        return P0(this.d.g());
    }

    public final p91.a T0() {
        return P0(this.d.h());
    }

    public final /* synthetic */ void Y1(q qVar, p91 p91Var, nh8 nh8Var) {
        p91Var.E(qVar, new p91.b(nh8Var, this.e));
    }

    public final void Z1() {
        if (this.h) {
            return;
        }
        final p91.a aVarN0 = N0();
        this.h = true;
        b2(aVarN0, -1, new whe.a() { // from class: u71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).o(aVarN0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void a(int i, k.a aVar, final ljf ljfVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1004, new whe.a() { // from class: k81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).k0(aVarR0, ljfVar);
            }
        });
    }

    public void a2() {
        final p91.a aVarN0 = N0();
        this.e.put(1036, aVarN0);
        this.f.h(1036, new whe.a() { // from class: j71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).d(aVarN0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void b(final Exception exc) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1018, new whe.a() { // from class: d91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).H(aVarT0, exc);
            }
        });
    }

    public final void b2(p91.a aVar, int i, whe.a<p91> aVar2) {
        this.e.put(i, aVar);
        this.f.l(i, aVar2);
    }

    @Override // defpackage.vrq
    public final void c(final String str) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1024, new whe.a() { // from class: k71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).e0(aVarT0, str);
            }
        });
    }

    public void c2(final q qVar, Looper looper) {
        rk1.g(this.g == null || this.d.f28877b.isEmpty());
        this.g = (q) rk1.e(qVar);
        this.f = this.f.d(looper, new whe.b() { // from class: k91
            @Override // whe.b
            public final void a(Object obj, nh8 nh8Var) {
                this.f23613a.Y1(qVar, (p91) obj, nh8Var);
            }
        });
    }

    @Override // gy1.a
    public final void d(final int i, final long j, final long j2) {
        final p91.a aVarQ0 = Q0();
        b2(aVarQ0, 1006, new whe.a() { // from class: c91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).j0(aVarQ0, i, j, j2);
            }
        });
    }

    public final void d2(List<k.a> list, k.a aVar) {
        this.d.k(list, aVar, (q) rk1.e(this.g));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void e(final String str) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1013, new whe.a() { // from class: a81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).X(aVarT0, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void f(final String str, final long j, final long j2) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1009, new whe.a() { // from class: p81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.X0(aVarT0, str, j2, j, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void g(final Format format, final us5 us5Var) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1010, new whe.a() { // from class: z71
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.b1(aVarT0, format, us5Var, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void h(int i, k.a aVar, final mie mieVar, final ljf ljfVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1001, new whe.a() { // from class: v71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).g0(aVarR0, mieVar, ljfVar);
            }
        });
    }

    @Override // defpackage.vrq
    public final void i(final ss5 ss5Var) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1020, new whe.a() { // from class: m71
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.S1(aVarT0, ss5Var, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void j(final ss5 ss5Var) {
        final p91.a aVarS0 = S0();
        b2(aVarS0, 1014, new whe.a() { // from class: x71
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.Z0(aVarS0, ss5Var, (p91) obj);
            }
        });
    }

    @Override // defpackage.vrq
    public final void k(final int i, final long j) {
        final p91.a aVarS0 = S0();
        b2(aVarS0, 1023, new whe.a() { // from class: n71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).l0(aVarS0, i, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void l(int i, k.a aVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ANTI_SPOOF, new whe.a() { // from class: h91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).G(aVarR0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void m(final Exception exc) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1037, new whe.a() { // from class: n91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).b(aVarT0, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void n(int i, k.a aVar, final int i2) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1030, new whe.a() { // from class: l91
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.k1(aVarR0, i2, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void o(final ss5 ss5Var) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1008, new whe.a() { // from class: y81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.a1(aVarT0, ss5Var, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onIsLoadingChanged(final boolean z) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 4, new whe.a() { // from class: w71
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.o1(aVarN0, z, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onIsPlayingChanged(final boolean z) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 8, new whe.a() { // from class: j81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).a(aVarN0, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onMediaItemTransition(final m mVar, final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 1, new whe.a() { // from class: v81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).A(aVarN0, mVar, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onMediaMetadataChanged(final n nVar) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 15, new whe.a() { // from class: t71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).j(aVarN0, nVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.e, defpackage.stf
    public final void onMetadata(final Metadata metadata) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 1007, new whe.a() { // from class: f81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).f0(aVarN0, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 6, new whe.a() { // from class: m81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).n0(aVarN0, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlaybackParametersChanged(final n0i n0iVar) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 13, new whe.a() { // from class: n81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).K(aVarN0, n0iVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlaybackStateChanged(final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 5, new whe.a() { // from class: e81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).m(aVarN0, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 7, new whe.a() { // from class: w81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).D(aVarN0, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlayerError(final ExoPlaybackException exoPlaybackException) {
        njf njfVar = exoPlaybackException.mediaPeriodId;
        final p91.a aVarP0 = njfVar != null ? P0(new k.a(njfVar)) : N0();
        b2(aVarP0, 11, new whe.a() { // from class: s81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).g(aVarP0, exoPlaybackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, -1, new whe.a() { // from class: c81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).s(aVarN0, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onPositionDiscontinuity(final q.f fVar, final q.f fVar2, final int i) {
        if (i == 1) {
            this.h = false;
        }
        this.d.j((q) rk1.e(this.g));
        final p91.a aVarN0 = N0();
        b2(aVarN0, 12, new whe.a() { // from class: h81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.D1(aVarN0, i, fVar, fVar2, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onRepeatModeChanged(final int i) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 9, new whe.a() { // from class: u81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).a0(aVarN0, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onSeekProcessed() {
        final p91.a aVarN0 = N0();
        b2(aVarN0, -1, new whe.a() { // from class: l81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).t(aVarN0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 10, new whe.a() { // from class: i81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).k(aVarN0, z);
            }
        });
    }

    @Override // defpackage.jn1
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1017, new whe.a() { // from class: e91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).J(aVarT0, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onStaticMetadataChanged(final List<Metadata> list) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 3, new whe.a() { // from class: b81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).b0(aVarN0, list);
            }
        });
    }

    @Override // defpackage.erq
    public void onSurfaceSizeChanged(final int i, final int i2) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1029, new whe.a() { // from class: b91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).e(aVarT0, i, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onTimelineChanged(v vVar, final int i) {
        this.d.l((q) rk1.e(this.g));
        final p91.a aVarN0 = N0();
        b2(aVarN0, 0, new whe.a() { // from class: r71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).q(aVarN0, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q.c
    public final void onTracksChanged(final TrackGroupArray trackGroupArray, final aop aopVar) {
        final p91.a aVarN0 = N0();
        b2(aVarN0, 2, new whe.a() { // from class: x81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).F(aVarN0, trackGroupArray, aopVar);
            }
        });
    }

    @Override // defpackage.erq
    public final void onVideoSizeChanged(final wrq wrqVar) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1028, new whe.a() { // from class: p71
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.V1(aVarT0, wrqVar, (p91) obj);
            }
        });
    }

    @Override // defpackage.jn1
    public final void onVolumeChanged(final float f) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1019, new whe.a() { // from class: q81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).h0(aVarT0, f);
            }
        });
    }

    @Override // defpackage.vrq
    public final void p(final long j, final int i) {
        final p91.a aVarS0 = S0();
        b2(aVarS0, 1026, new whe.a() { // from class: a91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).M(aVarS0, j, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void q(int i, k.a aVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, new whe.a() { // from class: i91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).p0(aVarR0);
            }
        });
    }

    @Override // defpackage.vrq
    public final void r(final String str, final long j, final long j2) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1021, new whe.a() { // from class: r81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.P1(aVarT0, str, j2, j, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void s(int i, k.a aVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOGO, new whe.a() { // from class: f91
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).l(aVarR0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void v(final long j) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1011, new whe.a() { // from class: q71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).N(aVarT0, j);
            }
        });
    }

    @Override // defpackage.vrq
    public final void w(final Exception exc) {
        final p91.a aVarT0 = T0();
        b2(aVarT0, 1038, new whe.a() { // from class: o71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).c0(aVarT0, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.l
    public final void x(int i, k.a aVar, final ljf ljfVar) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, 1005, new whe.a() { // from class: t81
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).O(aVarR0, ljfVar);
            }
        });
    }

    @Override // defpackage.vrq
    public final void y(final ss5 ss5Var) {
        final p91.a aVarS0 = S0();
        b2(aVarS0, 1025, new whe.a() { // from class: d81
            @Override // whe.a
            public final void invoke(Object obj) {
                o91.R1(aVarS0, ss5Var, (p91) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void z(int i, k.a aVar, final Exception exc) {
        final p91.a aVarR0 = R0(i, aVar);
        b2(aVarR0, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER, new whe.a() { // from class: l71
            @Override // whe.a
            public final void invoke(Object obj) {
                ((p91) obj).o0(aVarR0, exc);
            }
        });
    }
}
