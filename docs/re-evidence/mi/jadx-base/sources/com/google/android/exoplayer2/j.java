package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import defpackage.aop;
import defpackage.bop;
import defpackage.brl;
import defpackage.cop;
import defpackage.f14;
import defpackage.g83;
import defpackage.gy1;
import defpackage.h55;
import defpackage.j1i;
import defpackage.lie;
import defpackage.m0i;
import defpackage.n0i;
import defpackage.nh8;
import defpackage.o91;
import defpackage.pi8;
import defpackage.rk1;
import defpackage.skb;
import defpackage.skk;
import defpackage.toe;
import defpackage.whe;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.xlf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends d implements i {
    public boolean A;
    public q.b B;
    public n C;
    public m0i D;
    public int E;
    public int F;
    public long G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cop f7926b;
    public final q.b c;
    public final s[] d;
    public final bop e;
    public final skb f;
    public final k.f g;
    public final k h;
    public final whe<q.c> i;
    public final CopyOnWriteArraySet<i.a> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v.b f7927k;
    public final List<a> l;
    public final boolean m;
    public final wlf n;
    public final o91 o;
    public final Looper p;
    public final gy1 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f14 f7928r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public brl y;
    public com.google.android.exoplayer2.source.t z;

    public static final class a implements xlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v f7930b;

        public a(Object obj, v vVar) {
            this.f7929a = obj;
            this.f7930b = vVar;
        }

        @Override // defpackage.xlf
        public v a() {
            return this.f7930b;
        }

        @Override // defpackage.xlf
        public Object getUid() {
            return this.f7929a;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public j(s[] sVarArr, bop bopVar, wlf wlfVar, lie lieVar, gy1 gy1Var, o91 o91Var, boolean z, brl brlVar, l lVar, long j, boolean z2, f14 f14Var, Looper looper, q qVar, q.b bVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = wlq.e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.14.0");
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        toe.f("ExoPlayerImpl", sb.toString());
        rk1.g(sVarArr.length > 0);
        this.d = (s[]) rk1.e(sVarArr);
        this.e = (bop) rk1.e(bopVar);
        this.n = wlfVar;
        this.q = gy1Var;
        this.o = o91Var;
        this.m = z;
        this.y = brlVar;
        this.A = z2;
        this.p = looper;
        this.f7928r = f14Var;
        this.s = 0;
        final q qVar2 = qVar != null ? qVar : this;
        this.i = new whe<>(looper, f14Var, new whe.b() { // from class: bi8
            @Override // whe.b
            public final void a(Object obj, nh8 nh8Var) {
                j.M0(qVar2, (q.c) obj, nh8Var);
            }
        });
        this.j = new CopyOnWriteArraySet<>();
        this.l = new ArrayList();
        this.z = new com.google.android.exoplayer2.source.t.a(0);
        cop copVar = new cop(new skk[sVarArr.length], new com.google.android.exoplayer2.trackselection.b[sVarArr.length], null);
        this.f7926b = copVar;
        this.f7927k = new v.b();
        q.b bVarE = new q.b.a().c(1, 2, 8, 9, 10, 11, 12, 13, 14).b(bVar).e();
        this.c = bVarE;
        this.B = new q.b.a().b(bVarE).a(3).a(7).e();
        this.C = n.i;
        this.E = -1;
        this.f = f14Var.c(looper, null);
        k.f fVar = new k.f() { // from class: fi8
            @Override // com.google.android.exoplayer2.k.f
            public final void a(k.e eVar) {
                this.f17807a.O0(eVar);
            }
        };
        this.g = fVar;
        this.D = m0i.k(copVar);
        if (o91Var != null) {
            o91Var.c2(qVar2, looper);
            K(o91Var);
            gy1Var.h(new Handler(looper), o91Var);
        }
        this.h = new k(sVarArr, bopVar, copVar, lieVar, gy1Var, this.s, this.t, o91Var, brlVar, lVar, j, z2, looper, f14Var, fVar);
    }

    public static long J0(m0i m0iVar) {
        v.c cVar = new v.c();
        v.b bVar = new v.b();
        m0iVar.f25618a.h(m0iVar.f25619b.f27977a, bVar);
        return m0iVar.c == -9223372036854775807L ? m0iVar.f25618a.n(bVar.c, cVar).c() : bVar.l() + m0iVar.c;
    }

    public static boolean L0(m0i m0iVar) {
        return m0iVar.e == 3 && m0iVar.l && m0iVar.m == 0;
    }

    public static /* synthetic */ void M0(q qVar, q.c cVar, nh8 nh8Var) {
        cVar.onEvents(qVar, new q.d(nh8Var));
    }

    public static /* synthetic */ void Q0(q.c cVar) {
        cVar.onPlayerError(ExoPlaybackException.createForRenderer(new ExoTimeoutException(1)));
    }

    public static /* synthetic */ void U0(m0i m0iVar, q.c cVar) {
        cVar.onPlayerError(m0iVar.f);
    }

    public static /* synthetic */ void V0(m0i m0iVar, aop aopVar, q.c cVar) {
        cVar.onTracksChanged(m0iVar.h, aopVar);
    }

    public static /* synthetic */ void W0(m0i m0iVar, q.c cVar) {
        cVar.onStaticMetadataChanged(m0iVar.j);
    }

    public static /* synthetic */ void Y0(m0i m0iVar, q.c cVar) {
        cVar.onLoadingChanged(m0iVar.g);
        cVar.onIsLoadingChanged(m0iVar.g);
    }

    public static /* synthetic */ void Z0(m0i m0iVar, q.c cVar) {
        cVar.onPlayerStateChanged(m0iVar.l, m0iVar.e);
    }

    public static /* synthetic */ void a1(m0i m0iVar, q.c cVar) {
        cVar.onPlaybackStateChanged(m0iVar.e);
    }

    public static /* synthetic */ void b1(m0i m0iVar, int i, q.c cVar) {
        cVar.onPlayWhenReadyChanged(m0iVar.l, i);
    }

    public static /* synthetic */ void c1(m0i m0iVar, q.c cVar) {
        cVar.onPlaybackSuppressionReasonChanged(m0iVar.m);
    }

    public static /* synthetic */ void d1(m0i m0iVar, q.c cVar) {
        cVar.onIsPlayingChanged(L0(m0iVar));
    }

    public static /* synthetic */ void e1(m0i m0iVar, q.c cVar) {
        cVar.onPlaybackParametersChanged(m0iVar.n);
    }

    public static /* synthetic */ void f1(m0i m0iVar, int i, q.c cVar) {
        Object obj;
        if (m0iVar.f25618a.p() == 1) {
            obj = m0iVar.f25618a.n(0, new v.c()).d;
        } else {
            obj = null;
        }
        cVar.onTimelineChanged(m0iVar.f25618a, obj, i);
        cVar.onTimelineChanged(m0iVar.f25618a, i);
    }

    public static /* synthetic */ void g1(int i, q.f fVar, q.f fVar2, q.c cVar) {
        cVar.onPositionDiscontinuity(i);
        cVar.onPositionDiscontinuity(fVar, fVar2, i);
    }

    @Override // com.google.android.exoplayer2.q
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public ImmutableList<h55> A() {
        return ImmutableList.of();
    }

    @Override // com.google.android.exoplayer2.q
    public int B() {
        return this.D.m;
    }

    public final long B0(m0i m0iVar) {
        if (m0iVar.f25618a.q()) {
            return g83.c(this.G);
        }
        return m0iVar.f25619b.b() ? m0iVar.s : k1(m0iVar.f25618a, m0iVar.f25619b, m0iVar.s);
    }

    @Override // com.google.android.exoplayer2.q
    public v C() {
        return this.D.f25618a;
    }

    public final int C0() {
        if (this.D.f25618a.q()) {
            return this.E;
        }
        m0i m0iVar = this.D;
        return m0iVar.f25618a.h(m0iVar.f25619b.f27977a, this.f7927k).c;
    }

    @Override // com.google.android.exoplayer2.q
    public Looper D() {
        return this.p;
    }

    public final Pair<Object, Long> D0(v vVar, v vVar2) {
        long J = J();
        if (vVar.q() || vVar2.q()) {
            boolean z = !vVar.q() && vVar2.q();
            int iC0 = z ? -1 : C0();
            if (z) {
                J = -9223372036854775807L;
            }
            return E0(vVar2, iC0, J);
        }
        Pair<Object, Long> pairJ = vVar.j(this.f7866a, this.f7927k, y(), g83.c(J));
        Object obj = ((Pair) wlq.j(pairJ)).first;
        if (vVar2.b(obj) != -1) {
            return pairJ;
        }
        Object objV0 = k.v0(this.f7866a, this.f7927k, this.s, this.t, obj, vVar, vVar2);
        if (objV0 == null) {
            return E0(vVar2, -1, -9223372036854775807L);
        }
        vVar2.h(objV0, this.f7927k);
        int i = this.f7927k.c;
        return E0(vVar2, i, vVar2.n(i, this.f7866a).b());
    }

    @Override // com.google.android.exoplayer2.q
    public void E(TextureView textureView) {
    }

    public final Pair<Object, Long> E0(v vVar, int i, long j) {
        if (vVar.q()) {
            this.E = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.G = j;
            this.F = 0;
            return null;
        }
        if (i == -1 || i >= vVar.p()) {
            i = vVar.a(this.t);
            j = vVar.n(i, this.f7866a).b();
        }
        return vVar.j(this.f7866a, this.f7927k, i, g83.c(j));
    }

    @Override // com.google.android.exoplayer2.q
    public aop F() {
        return new aop(this.D.i.c);
    }

    public final q.f F0(long j) {
        Object obj;
        int iB;
        Object obj2;
        int iY = y();
        if (this.D.f25618a.q()) {
            obj = null;
            iB = -1;
            obj2 = null;
        } else {
            m0i m0iVar = this.D;
            Object obj3 = m0iVar.f25619b.f27977a;
            m0iVar.f25618a.h(obj3, this.f7927k);
            iB = this.D.f25618a.b(obj3);
            obj = obj3;
            obj2 = this.D.f25618a.n(iY, this.f7866a).f8449a;
        }
        long jD = g83.d(j);
        long jD2 = this.D.f25619b.b() ? g83.d(J0(this.D)) : jD;
        com.google.android.exoplayer2.source.k.a aVar = this.D.f25619b;
        return new q.f(obj2, iY, obj, iB, jD, jD2, aVar.f27978b, aVar.c);
    }

    @Override // com.google.android.exoplayer2.q
    public void G(int i, long j) {
        v vVar = this.D.f25618a;
        if (i < 0 || (!vVar.q() && i >= vVar.p())) {
            throw new IllegalSeekPositionException(vVar, i, j);
        }
        this.u++;
        if (a()) {
            toe.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            k.e eVar = new k.e(this.D);
            eVar.b(1);
            this.g.a(eVar);
            return;
        }
        int i2 = getPlaybackState() != 1 ? 2 : 1;
        int iY = y();
        m0i m0iVarI1 = i1(this.D.h(i2), vVar, E0(vVar, i, j));
        this.h.x0(vVar, i, g83.c(j));
        u1(m0iVarI1, 0, 1, true, true, 1, B0(m0iVarI1), iY);
    }

    public final q.f G0(int i, m0i m0iVar, int i2) {
        int i3;
        Object obj;
        Object obj2;
        int iB;
        long jJ0;
        long jJ1;
        v.b bVar = new v.b();
        if (m0iVar.f25618a.q()) {
            i3 = i2;
            obj = null;
            obj2 = null;
            iB = -1;
        } else {
            Object obj3 = m0iVar.f25619b.f27977a;
            m0iVar.f25618a.h(obj3, bVar);
            int i4 = bVar.c;
            obj2 = obj3;
            iB = m0iVar.f25618a.b(obj3);
            obj = m0iVar.f25618a.n(i4, this.f7866a).f8449a;
            i3 = i4;
        }
        if (i == 0) {
            jJ0 = bVar.e + bVar.d;
            if (m0iVar.f25619b.b()) {
                com.google.android.exoplayer2.source.k.a aVar = m0iVar.f25619b;
                jJ0 = bVar.b(aVar.f27978b, aVar.c);
                jJ1 = J0(m0iVar);
            } else {
                if (m0iVar.f25619b.e != -1 && this.D.f25619b.b()) {
                    jJ0 = J0(this.D);
                }
                jJ1 = jJ0;
            }
        } else if (m0iVar.f25619b.b()) {
            jJ0 = m0iVar.s;
            jJ1 = J0(m0iVar);
        } else {
            jJ0 = bVar.e + m0iVar.s;
            jJ1 = jJ0;
        }
        long jD = g83.d(jJ0);
        long jD2 = g83.d(jJ1);
        com.google.android.exoplayer2.source.k.a aVar2 = m0iVar.f25619b;
        return new q.f(obj, i3, obj2, iB, jD, jD2, aVar2.f27978b, aVar2.c);
    }

    @Override // com.google.android.exoplayer2.q
    public q.b H() {
        return this.B;
    }

    public int H0() {
        return this.d.length;
    }

    public int I0(int i) {
        return this.d[i].e();
    }

    @Override // com.google.android.exoplayer2.q
    public long J() {
        if (!a()) {
            return getCurrentPosition();
        }
        m0i m0iVar = this.D;
        m0iVar.f25618a.h(m0iVar.f25619b.f27977a, this.f7927k);
        m0i m0iVar2 = this.D;
        return m0iVar2.c == -9223372036854775807L ? m0iVar2.f25618a.n(y(), this.f7866a).b() : this.f7927k.k() + g83.d(this.D.c);
    }

    @Override // com.google.android.exoplayer2.q
    public void K(q.e eVar) {
        t(eVar);
    }

    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final void N0(k.e eVar) {
        long j;
        boolean z;
        long jK1;
        int i = this.u - eVar.c;
        this.u = i;
        boolean z2 = true;
        if (eVar.d) {
            this.v = eVar.e;
            this.w = true;
        }
        if (eVar.f) {
            this.x = eVar.g;
        }
        if (i == 0) {
            v vVar = eVar.f7943b.f25618a;
            if (!this.D.f25618a.q() && vVar.q()) {
                this.E = -1;
                this.G = 0L;
                this.F = 0;
            }
            if (!vVar.q()) {
                List<v> listE = ((j1i) vVar).E();
                rk1.g(listE.size() == this.l.size());
                for (int i2 = 0; i2 < listE.size(); i2++) {
                    this.l.get(i2).f7930b = listE.get(i2);
                }
            }
            if (this.w) {
                if (eVar.f7943b.f25619b.equals(this.D.f25619b) && eVar.f7943b.d == this.D.s) {
                    z2 = false;
                }
                if (z2) {
                    if (vVar.q() || eVar.f7943b.f25619b.b()) {
                        jK1 = eVar.f7943b.d;
                    } else {
                        m0i m0iVar = eVar.f7943b;
                        jK1 = k1(vVar, m0iVar.f25619b, m0iVar.d);
                    }
                    j = jK1;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.w = false;
            u1(eVar.f7943b, 1, this.x, false, z, this.v, j, -1);
        }
    }

    @Override // com.google.android.exoplayer2.q
    public long M() {
        if (!a()) {
            return v();
        }
        m0i m0iVar = this.D;
        return m0iVar.f25620k.equals(m0iVar.f25619b) ? g83.d(this.D.q) : getDuration();
    }

    @Override // com.google.android.exoplayer2.q
    public void O(SurfaceView surfaceView) {
    }

    public final /* synthetic */ void O0(final k.e eVar) {
        this.f.post(new Runnable() { // from class: di8
            @Override // java.lang.Runnable
            public final void run() {
                this.f15549a.N0(eVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q
    public boolean P() {
        return this.t;
    }

    public final /* synthetic */ void P0(q.c cVar) {
        cVar.onMediaMetadataChanged(this.C);
    }

    public final /* synthetic */ void T0(q.c cVar) {
        cVar.onAvailableCommandsChanged(this.B);
    }

    @Override // com.google.android.exoplayer2.q
    public boolean a() {
        return this.D.f25619b.b();
    }

    @Override // com.google.android.exoplayer2.q
    public long b() {
        return g83.d(this.D.f25621r);
    }

    @Override // com.google.android.exoplayer2.q
    public n0i c() {
        return this.D.n;
    }

    @Override // com.google.android.exoplayer2.q
    public void d(n0i n0iVar) {
        if (n0iVar == null) {
            n0iVar = n0i.d;
        }
        if (this.D.n.equals(n0iVar)) {
            return;
        }
        m0i m0iVarG = this.D.g(n0iVar);
        this.u++;
        this.h.O0(n0iVar);
        u1(m0iVarG, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.i
    public bop e() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.q
    public void f(q.e eVar) {
        i(eVar);
    }

    @Override // com.google.android.exoplayer2.q
    public void g(List<m> list, boolean z) {
        p1(v0(list), z);
    }

    @Override // com.google.android.exoplayer2.q
    public long getCurrentPosition() {
        return g83.d(B0(this.D));
    }

    @Override // com.google.android.exoplayer2.q
    public long getDuration() {
        if (!a()) {
            return q();
        }
        m0i m0iVar = this.D;
        com.google.android.exoplayer2.source.k.a aVar = m0iVar.f25619b;
        m0iVar.f25618a.h(aVar.f27977a, this.f7927k);
        return g83.d(this.f7927k.b(aVar.f27978b, aVar.c));
    }

    @Override // com.google.android.exoplayer2.q
    public int getPlaybackState() {
        return this.D.e;
    }

    @Override // com.google.android.exoplayer2.q
    public int getRepeatMode() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.q
    public void h(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.q
    public void i(q.c cVar) {
        this.i.k(cVar);
    }

    public final m0i i1(m0i m0iVar, v vVar, Pair<Object, Long> pair) {
        rk1.a(vVar.q() || pair != null);
        v vVar2 = m0iVar.f25618a;
        m0i m0iVarJ = m0iVar.j(vVar);
        if (vVar.q()) {
            com.google.android.exoplayer2.source.k.a aVarL = m0i.l();
            long jC = g83.c(this.G);
            m0i m0iVarB = m0iVarJ.c(aVarL, jC, jC, jC, 0L, TrackGroupArray.EMPTY, this.f7926b, ImmutableList.of()).b(aVarL);
            m0iVarB.q = m0iVarB.s;
            return m0iVarB;
        }
        Object obj = m0iVarJ.f25619b.f27977a;
        boolean z = !obj.equals(((Pair) wlq.j(pair)).first);
        com.google.android.exoplayer2.source.k.a aVar = z ? new com.google.android.exoplayer2.source.k.a(pair.first) : m0iVarJ.f25619b;
        long jLongValue = ((Long) pair.second).longValue();
        long jC2 = g83.c(J());
        if (!vVar2.q()) {
            jC2 -= vVar2.h(obj, this.f7927k).l();
        }
        if (z || jLongValue < jC2) {
            rk1.g(!aVar.b());
            m0i m0iVarB2 = m0iVarJ.c(aVar, jLongValue, jLongValue, jLongValue, 0L, z ? TrackGroupArray.EMPTY : m0iVarJ.h, z ? this.f7926b : m0iVarJ.i, z ? ImmutableList.of() : m0iVarJ.j).b(aVar);
            m0iVarB2.q = jLongValue;
            return m0iVarB2;
        }
        if (jLongValue == jC2) {
            int iB = vVar.b(m0iVarJ.f25620k.f27977a);
            if (iB == -1 || vVar.f(iB, this.f7927k).c != vVar.h(aVar.f27977a, this.f7927k).c) {
                vVar.h(aVar.f27977a, this.f7927k);
                long jB = aVar.b() ? this.f7927k.b(aVar.f27978b, aVar.c) : this.f7927k.d;
                m0iVarJ = m0iVarJ.c(aVar, m0iVarJ.s, m0iVarJ.s, m0iVarJ.d, jB - m0iVarJ.s, m0iVarJ.h, m0iVarJ.i, m0iVarJ.j).b(aVar);
                m0iVarJ.q = jB;
            }
        } else {
            rk1.g(!aVar.b());
            long jMax = Math.max(0L, m0iVarJ.f25621r - (jLongValue - jC2));
            long j = m0iVarJ.q;
            if (m0iVarJ.f25620k.equals(m0iVarJ.f25619b)) {
                j = jLongValue + jMax;
            }
            m0iVarJ = m0iVarJ.c(aVar, jLongValue, jLongValue, jLongValue, jMax, m0iVarJ.h, m0iVarJ.i, m0iVarJ.j);
            m0iVarJ.q = j;
        }
        return m0iVarJ;
    }

    @Override // com.google.android.exoplayer2.q
    public ExoPlaybackException j() {
        return this.D.f;
    }

    public void j1(Metadata metadata) {
        n nVarK = this.C.a().l(metadata).k();
        if (nVarK.equals(this.C)) {
            return;
        }
        this.C = nVarK;
        this.i.l(15, new whe.a() { // from class: ai8
            @Override // whe.a
            public final void invoke(Object obj) {
                this.f1048a.P0((q.c) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q
    public int k() {
        if (a()) {
            return this.D.f25619b.f27978b;
        }
        return -1;
    }

    public final long k1(v vVar, com.google.android.exoplayer2.source.k.a aVar, long j) {
        vVar.h(aVar.f27977a, this.f7927k);
        return j + this.f7927k.l();
    }

    public final m0i l1(int i, int i2) {
        rk1.a(i >= 0 && i2 >= i && i2 <= this.l.size());
        int iY = y();
        v vVarC = C();
        int size = this.l.size();
        this.u++;
        m1(i, i2);
        v vVarU0 = u0();
        m0i m0iVarI1 = i1(this.D, vVarU0, D0(vVarC, vVarU0));
        int i3 = m0iVarI1.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iY >= m0iVarI1.f25618a.p()) {
            m0iVarI1 = m0iVarI1.h(4);
        }
        this.h.k0(i, i2, this.z);
        return m0iVarI1;
    }

    @Override // com.google.android.exoplayer2.q
    public TrackGroupArray m() {
        return this.D.h;
    }

    public final void m1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.l.remove(i3);
        }
        this.z = this.z.f(i, i2);
    }

    @Override // com.google.android.exoplayer2.q
    public boolean n() {
        return this.D.l;
    }

    public void n1(com.google.android.exoplayer2.source.k kVar) {
        o1(Collections.singletonList(kVar));
    }

    @Override // com.google.android.exoplayer2.q
    public void o(final boolean z) {
        if (this.t != z) {
            this.t = z;
            this.h.T0(z);
            this.i.i(10, new whe.a() { // from class: ci8
                @Override // whe.a
                public final void invoke(Object obj) {
                    ((q.c) obj).onShuffleModeEnabledChanged(z);
                }
            });
            t1();
            this.i.e();
        }
    }

    public void o1(List<com.google.android.exoplayer2.source.k> list) {
        p1(list, true);
    }

    @Override // com.google.android.exoplayer2.q
    public void p(boolean z) {
        s1(z, null);
    }

    public void p1(List<com.google.android.exoplayer2.source.k> list, boolean z) {
        q1(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.q
    public void prepare() {
        m0i m0iVar = this.D;
        if (m0iVar.e != 1) {
            return;
        }
        m0i m0iVarF = m0iVar.f(null);
        m0i m0iVarH = m0iVarF.h(m0iVarF.f25618a.q() ? 4 : 2);
        this.u++;
        this.h.f0();
        u1(m0iVarH, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void q1(List<com.google.android.exoplayer2.source.k> list, int i, long j, boolean z) {
        int iA;
        long j2;
        int iC0 = C0();
        long currentPosition = getCurrentPosition();
        this.u++;
        if (!this.l.isEmpty()) {
            m1(0, this.l.size());
        }
        List<p.c> listT0 = t0(0, list);
        v vVarU0 = u0();
        if (!vVarU0.q() && i >= vVarU0.p()) {
            throw new IllegalSeekPositionException(vVarU0, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            iA = vVarU0.a(this.t);
        } else if (i == -1) {
            iA = iC0;
            j2 = currentPosition;
        } else {
            iA = i;
            j2 = j;
        }
        m0i m0iVarI1 = i1(this.D, vVarU0, E0(vVarU0, iA, j2));
        int i2 = m0iVarI1.e;
        if (iA != -1 && i2 != 1) {
            i2 = (vVarU0.q() || iA >= vVarU0.p()) ? 4 : 2;
        }
        m0i m0iVarH = m0iVarI1.h(i2);
        this.h.J0(listT0, iA, g83.c(j2), this.z);
        u1(m0iVarH, 0, 1, false, (this.D.f25619b.f27977a.equals(m0iVarH.f25619b.f27977a) || this.D.f25618a.q()) ? false : true, 4, B0(m0iVarH), -1);
    }

    @Override // com.google.android.exoplayer2.q
    public int r() {
        if (this.D.f25618a.q()) {
            return this.F;
        }
        m0i m0iVar = this.D;
        return m0iVar.f25618a.b(m0iVar.f25619b.f27977a);
    }

    public void r1(boolean z, int i, int i2) {
        m0i m0iVar = this.D;
        if (m0iVar.l == z && m0iVar.m == i) {
            return;
        }
        this.u++;
        m0i m0iVarE = m0iVar.e(z, i);
        this.h.M0(z, i);
        u1(m0iVarE, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.q
    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = wlq.e;
        String strB = pi8.b();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(strB).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.14.0");
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strB);
        sb.append("]");
        toe.f("ExoPlayerImpl", sb.toString());
        if (!this.h.h0()) {
            this.i.l(11, new whe.a() { // from class: qh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.Q0((q.c) obj);
                }
            });
        }
        this.i.j();
        this.f.d(null);
        o91 o91Var = this.o;
        if (o91Var != null) {
            this.q.e(o91Var);
        }
        m0i m0iVarH = this.D.h(1);
        this.D = m0iVarH;
        m0i m0iVarB = m0iVarH.b(m0iVarH.f25619b);
        this.D = m0iVarB;
        m0iVarB.q = m0iVarB.s;
        this.D.f25621r = 0L;
    }

    @Override // com.google.android.exoplayer2.q
    public void s(TextureView textureView) {
    }

    public void s0(i.a aVar) {
        this.j.add(aVar);
    }

    public void s1(boolean z, ExoPlaybackException exoPlaybackException) {
        m0i m0iVarB;
        if (z) {
            m0iVarB = l1(0, this.l.size()).f(null);
        } else {
            m0i m0iVar = this.D;
            m0iVarB = m0iVar.b(m0iVar.f25619b);
            m0iVarB.q = m0iVarB.s;
            m0iVarB.f25621r = 0L;
        }
        m0i m0iVarH = m0iVarB.h(1);
        if (exoPlaybackException != null) {
            m0iVarH = m0iVarH.f(exoPlaybackException);
        }
        m0i m0iVar2 = m0iVarH;
        this.u++;
        this.h.e1();
        u1(m0iVar2, 0, 1, false, m0iVar2.f25618a.q() && !this.D.f25618a.q(), 4, B0(m0iVar2), -1);
    }

    @Override // com.google.android.exoplayer2.q
    public void setRepeatMode(final int i) {
        if (this.s != i) {
            this.s = i;
            this.h.Q0(i);
            this.i.i(9, new whe.a() { // from class: zh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    ((q.c) obj).onRepeatModeChanged(i);
                }
            });
            t1();
            this.i.e();
        }
    }

    @Override // com.google.android.exoplayer2.q
    public void t(q.c cVar) {
        this.i.c(cVar);
    }

    public final List<p.c> t0(int i, List<com.google.android.exoplayer2.source.k> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            p.c cVar = new p.c(list.get(i2), this.m);
            arrayList.add(cVar);
            this.l.add(i2 + i, new a(cVar.f8061b, cVar.f8060a.S()));
        }
        this.z = this.z.g(i, arrayList.size());
        return arrayList;
    }

    public final void t1() {
        q.b bVar = this.B;
        q.b bVarQ = Q(this.c);
        this.B = bVarQ;
        if (bVarQ.equals(bVar)) {
            return;
        }
        this.i.i(14, new whe.a() { // from class: ei8
            @Override // whe.a
            public final void invoke(Object obj) {
                this.f16673a.T0((q.c) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.q
    public int u() {
        if (a()) {
            return this.D.f25619b.c;
        }
        return -1;
    }

    public final v u0() {
        return new j1i(this.l, this.z);
    }

    public final void u1(final m0i m0iVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        m0i m0iVar2 = this.D;
        this.D = m0iVar;
        Pair<Boolean, Integer> pairX0 = x0(m0iVar, m0iVar2, z2, i3, !m0iVar2.f25618a.equals(m0iVar.f25618a));
        boolean zBooleanValue = ((Boolean) pairX0.first).booleanValue();
        final int iIntValue = ((Integer) pairX0.second).intValue();
        n nVarK = this.C;
        final m mVar = null;
        if (zBooleanValue) {
            if (!m0iVar.f25618a.q()) {
                mVar = m0iVar.f25618a.n(m0iVar.f25618a.h(m0iVar.f25619b.f27977a, this.f7927k).c, this.f7866a).c;
            }
            this.C = mVar != null ? mVar.d : n.i;
        }
        if (!m0iVar2.j.equals(m0iVar.j)) {
            nVarK = nVarK.a().m(m0iVar.j).k();
        }
        boolean z3 = !nVarK.equals(this.C);
        this.C = nVarK;
        if (!m0iVar2.f25618a.equals(m0iVar.f25618a)) {
            this.i.i(0, new whe.a() { // from class: gi8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.f1(m0iVar, i, (q.c) obj);
                }
            });
        }
        if (z2) {
            final q.f fVarG0 = G0(i3, m0iVar2, i4);
            final q.f fVarF0 = F0(j);
            this.i.i(12, new whe.a() { // from class: mi8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.g1(i3, fVarG0, fVarF0, (q.c) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.i.i(1, new whe.a() { // from class: rh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    ((q.c) obj).onMediaItemTransition(mVar, iIntValue);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = m0iVar2.f;
        ExoPlaybackException exoPlaybackException2 = m0iVar.f;
        if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
            this.i.i(11, new whe.a() { // from class: sh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.U0(m0iVar, (q.c) obj);
                }
            });
        }
        cop copVar = m0iVar2.i;
        cop copVar2 = m0iVar.i;
        if (copVar != copVar2) {
            this.e.d(copVar2.d);
            final aop aopVar = new aop(m0iVar.i.c);
            this.i.i(2, new whe.a() { // from class: th8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.V0(m0iVar, aopVar, (q.c) obj);
                }
            });
        }
        if (!m0iVar2.j.equals(m0iVar.j)) {
            this.i.i(3, new whe.a() { // from class: uh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.W0(m0iVar, (q.c) obj);
                }
            });
        }
        if (z3) {
            final n nVar = this.C;
            this.i.i(15, new whe.a() { // from class: vh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    ((q.c) obj).onMediaMetadataChanged(nVar);
                }
            });
        }
        if (m0iVar2.g != m0iVar.g) {
            this.i.i(4, new whe.a() { // from class: wh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.Y0(m0iVar, (q.c) obj);
                }
            });
        }
        if (m0iVar2.e != m0iVar.e || m0iVar2.l != m0iVar.l) {
            this.i.i(-1, new whe.a() { // from class: xh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.Z0(m0iVar, (q.c) obj);
                }
            });
        }
        if (m0iVar2.e != m0iVar.e) {
            this.i.i(5, new whe.a() { // from class: yh8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.a1(m0iVar, (q.c) obj);
                }
            });
        }
        if (m0iVar2.l != m0iVar.l) {
            this.i.i(6, new whe.a() { // from class: hi8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.b1(m0iVar, i2, (q.c) obj);
                }
            });
        }
        if (m0iVar2.m != m0iVar.m) {
            this.i.i(7, new whe.a() { // from class: ii8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.c1(m0iVar, (q.c) obj);
                }
            });
        }
        if (L0(m0iVar2) != L0(m0iVar)) {
            this.i.i(8, new whe.a() { // from class: ji8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.d1(m0iVar, (q.c) obj);
                }
            });
        }
        if (!m0iVar2.n.equals(m0iVar.n)) {
            this.i.i(13, new whe.a() { // from class: ki8
                @Override // whe.a
                public final void invoke(Object obj) {
                    j.e1(m0iVar, (q.c) obj);
                }
            });
        }
        if (z) {
            this.i.i(-1, new whe.a() { // from class: li8
                @Override // whe.a
                public final void invoke(Object obj) {
                    ((q.c) obj).onSeekProcessed();
                }
            });
        }
        t1();
        this.i.e();
        if (m0iVar2.o != m0iVar.o) {
            Iterator<i.a> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().x(m0iVar.o);
            }
        }
        if (m0iVar2.p != m0iVar.p) {
            Iterator<i.a> it2 = this.j.iterator();
            while (it2.hasNext()) {
                it2.next().d(m0iVar.p);
            }
        }
    }

    @Override // com.google.android.exoplayer2.q
    public long v() {
        if (this.D.f25618a.q()) {
            return this.G;
        }
        m0i m0iVar = this.D;
        if (m0iVar.f25620k.d != m0iVar.f25619b.d) {
            return m0iVar.f25618a.n(y(), this.f7866a).d();
        }
        long j = m0iVar.q;
        if (this.D.f25620k.b()) {
            m0i m0iVar2 = this.D;
            v.b bVarH = m0iVar2.f25618a.h(m0iVar2.f25620k.f27977a, this.f7927k);
            long jF = bVarH.f(this.D.f25620k.f27978b);
            j = jF == Long.MIN_VALUE ? bVarH.d : jF;
        }
        m0i m0iVar3 = this.D;
        return g83.d(k1(m0iVar3.f25618a, m0iVar3.f25620k, j));
    }

    public final List<com.google.android.exoplayer2.source.k> v0(List<m> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.n.a(list.get(i)));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.q
    public List<Metadata> w() {
        return this.D.j;
    }

    public r w0(r.b bVar) {
        return new r(this.h, bVar, this.D.f25618a, y(), this.f7928r, this.h.B());
    }

    public final Pair<Boolean, Integer> x0(m0i m0iVar, m0i m0iVar2, boolean z, int i, boolean z2) {
        v vVar = m0iVar2.f25618a;
        v vVar2 = m0iVar.f25618a;
        if (vVar2.q() && vVar.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (vVar2.q() != vVar.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (vVar.n(vVar.h(m0iVar2.f25619b.f27977a, this.f7927k).c, this.f7866a).f8449a.equals(vVar2.n(vVar2.h(m0iVar.f25619b.f27977a, this.f7927k).c, this.f7866a).f8449a)) {
            return (z && i == 0 && m0iVar2.f25619b.d < m0iVar.f25619b.d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    @Override // com.google.android.exoplayer2.q
    public int y() {
        int iC0 = C0();
        if (iC0 == -1) {
            return 0;
        }
        return iC0;
    }

    public boolean y0() {
        return this.D.p;
    }

    @Override // com.google.android.exoplayer2.q
    public void z(boolean z) {
        r1(z, 0, 1);
    }

    public void z0(long j) {
        this.h.u(j);
    }
}
