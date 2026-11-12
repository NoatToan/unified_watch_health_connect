package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.aop;
import defpackage.arq;
import defpackage.bop;
import defpackage.brl;
import defpackage.d96;
import defpackage.erq;
import defpackage.f14;
import defpackage.g83;
import defpackage.gy1;
import defpackage.h55;
import defpackage.j8p;
import defpackage.jn1;
import defpackage.kb4;
import defpackage.lie;
import defpackage.lqq;
import defpackage.mh3;
import defpackage.n0i;
import defpackage.nl8;
import defpackage.nm1;
import defpackage.o91;
import defpackage.pkr;
import defpackage.pt5;
import defpackage.pw5;
import defpackage.rk1;
import defpackage.ss5;
import defpackage.stf;
import defpackage.t3r;
import defpackage.tkk;
import defpackage.toe;
import defpackage.u56;
import defpackage.us5;
import defpackage.vrq;
import defpackage.vv5;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.wrq;
import defpackage.yu5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class t extends com.google.android.exoplayer2.d implements i {
    public boolean A;
    public TextureView B;
    public int C;
    public int D;
    public int E;
    public ss5 F;
    public ss5 G;
    public int H;
    public nm1 I;
    public float J;
    public boolean K;
    public List<h55> L;
    public boolean M;
    public boolean N;
    public PriorityTaskManager O;
    public boolean P;
    public boolean Q;
    public u56 R;
    public wrq S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s[] f8287b;
    public final kb4 c;
    public final Context d;
    public final j e;
    public final c f;
    public final d g;
    public final CopyOnWriteArraySet<erq> h;
    public final CopyOnWriteArraySet<jn1> i;
    public final CopyOnWriteArraySet<j8p> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet<stf> f8288k;
    public final CopyOnWriteArraySet<d96> l;
    public final o91 m;
    public final com.google.android.exoplayer2.b n;
    public final com.google.android.exoplayer2.c o;
    public final u p;
    public final t3r q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pkr f8289r;
    public final long s;
    public Format t;
    public Format u;
    public AudioTrack v;
    public Object w;
    public Surface x;
    public SurfaceHolder y;
    public SphericalGLSurfaceView z;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tkk f8291b;
        public f14 c;
        public long d;
        public bop e;
        public wlf f;
        public lie g;
        public gy1 h;
        public o91 i;
        public Looper j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PriorityTaskManager f8292k;
        public nm1 l;
        public boolean m;
        public int n;
        public boolean o;
        public boolean p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f8293r;
        public brl s;
        public l t;
        public long u;
        public long v;
        public boolean w;
        public boolean x;

        public b(Context context) {
            this(context, new pw5(context), new yu5());
        }

        public b A(bop bopVar) {
            rk1.g(!this.x);
            this.e = bopVar;
            return this;
        }

        public t x() {
            rk1.g(!this.x);
            this.x = true;
            return new t(this);
        }

        public b y(lie lieVar) {
            rk1.g(!this.x);
            this.g = lieVar;
            return this;
        }

        public b z(wlf wlfVar) {
            rk1.g(!this.x);
            this.f = wlfVar;
            return this;
        }

        public b(Context context, tkk tkkVar, nl8 nl8Var) {
            this(context, tkkVar, new DefaultTrackSelector(context), new com.google.android.exoplayer2.source.e(context, nl8Var), new vv5(), pt5.m(context), new o91(f14.f17281a));
        }

        public b(Context context, tkk tkkVar, bop bopVar, wlf wlfVar, lie lieVar, gy1 gy1Var, o91 o91Var) {
            this.f8290a = context;
            this.f8291b = tkkVar;
            this.e = bopVar;
            this.f = wlfVar;
            this.g = lieVar;
            this.h = gy1Var;
            this.i = o91Var;
            this.j = wlq.P();
            this.l = nm1.f;
            this.n = 0;
            this.q = 1;
            this.f8293r = true;
            this.s = brl.g;
            this.t = new g.b().a();
            this.c = f14.f17281a;
            this.u = 500L;
            this.v = VibrateModeProgressBar.sLongToLong;
        }
    }

    public final class c implements vrq, com.google.android.exoplayer2.audio.a, j8p, stf, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, com.google.android.exoplayer2.c.b, com.google.android.exoplayer2.b.InterfaceC0183b, u.b, q.c, i.a {
        public c() {
        }

        @Override // defpackage.vrq
        public void C(Object obj, long j) {
            t.this.m.C(obj, j);
            if (t.this.w == obj) {
                Iterator it = t.this.h.iterator();
                while (it.hasNext()) {
                    ((erq) it.next()).onRenderedFirstFrame();
                }
            }
        }

        @Override // defpackage.vrq
        public void D(Format format, us5 us5Var) {
            t.this.t = format;
            t.this.m.D(format, us5Var);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void H(int i, long j, long j2) {
            t.this.m.H(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0183b
        public void a() {
            t.this.j1(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void b(Exception exc) {
            t.this.m.b(exc);
        }

        @Override // defpackage.vrq
        public void c(String str) {
            t.this.m.c(str);
        }

        @Override // com.google.android.exoplayer2.i.a
        public void d(boolean z) {
            t.this.k1();
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void e(String str) {
            t.this.m.e(str);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void f(String str, long j, long j2) {
            t.this.m.f(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void g(Format format, us5 us5Var) {
            t.this.u = format;
            t.this.m.g(format, us5Var);
        }

        @Override // com.google.android.exoplayer2.u.b
        public void h(int i) {
            u56 u56VarI0 = t.I0(t.this.p);
            if (u56VarI0.equals(t.this.R)) {
                return;
            }
            t.this.R = u56VarI0;
            Iterator it = t.this.l.iterator();
            while (it.hasNext()) {
                ((d96) it.next()).onDeviceInfoChanged(u56VarI0);
            }
        }

        @Override // defpackage.vrq
        public void i(ss5 ss5Var) {
            t.this.F = ss5Var;
            t.this.m.i(ss5Var);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void j(ss5 ss5Var) {
            t.this.m.j(ss5Var);
            t.this.u = null;
            t.this.G = null;
        }

        @Override // defpackage.vrq
        public void k(int i, long j) {
            t.this.m.k(i, j);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void l(Surface surface) {
            t.this.f1(null);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void m(Exception exc) {
            t.this.m.m(exc);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void n(Surface surface) {
            t.this.f1(surface);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void o(ss5 ss5Var) {
            t.this.G = ss5Var;
            t.this.m.o(ss5Var);
        }

        @Override // defpackage.j8p, com.google.android.exoplayer2.q.e
        public void onCues(List<h55> list) {
            t.this.L = list;
            Iterator it = t.this.j.iterator();
            while (it.hasNext()) {
                ((j8p) it.next()).onCues(list);
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onIsLoadingChanged(boolean z) {
            if (t.this.O != null) {
                if (z && !t.this.P) {
                    t.this.O.a(0);
                    t.this.P = true;
                } else {
                    if (z || !t.this.P) {
                        return;
                    }
                    t.this.O.c(0);
                    t.this.P = false;
                }
            }
        }

        @Override // defpackage.stf
        public void onMetadata(Metadata metadata) {
            t.this.m.onMetadata(metadata);
            t.this.e.j1(metadata);
            Iterator it = t.this.f8288k.iterator();
            while (it.hasNext()) {
                ((stf) it.next()).onMetadata(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayWhenReadyChanged(boolean z, int i) {
            t.this.k1();
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackStateChanged(int i) {
            t.this.k1();
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void onSkipSilenceEnabledChanged(boolean z) {
            if (t.this.K == z) {
                return;
            }
            t.this.K = z;
            t.this.Q0();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            t.this.e1(surfaceTexture);
            t.this.P0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            t.this.f1(null);
            t.this.P0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            t.this.P0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // defpackage.vrq
        public void onVideoSizeChanged(wrq wrqVar) {
            t.this.S = wrqVar;
            t.this.m.onVideoSizeChanged(wrqVar);
            for (erq erqVar : t.this.h) {
                erqVar.onVideoSizeChanged(wrqVar);
                erqVar.onVideoSizeChanged(wrqVar.f38295a, wrqVar.f38296b, wrqVar.c, wrqVar.d);
            }
        }

        @Override // defpackage.vrq
        public void p(long j, int i) {
            t.this.m.p(j, i);
        }

        @Override // com.google.android.exoplayer2.u.b
        public void q(int i, boolean z) {
            Iterator it = t.this.l.iterator();
            while (it.hasNext()) {
                ((d96) it.next()).onDeviceVolumeChanged(i, z);
            }
        }

        @Override // defpackage.vrq
        public void r(String str, long j, long j2) {
            t.this.m.r(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.c.b
        public void s(float f) {
            t.this.a1();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            t.this.P0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (t.this.A) {
                t.this.f1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (t.this.A) {
                t.this.f1(null);
            }
            t.this.P0(0, 0);
        }

        @Override // com.google.android.exoplayer2.c.b
        public void t(int i) {
            boolean zN = t.this.n();
            t.this.j1(zN, i, t.K0(zN, i));
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void v(long j) {
            t.this.m.v(j);
        }

        @Override // defpackage.vrq
        public void w(Exception exc) {
            t.this.m.w(exc);
        }

        @Override // defpackage.vrq
        public void y(ss5 ss5Var) {
            t.this.m.y(ss5Var);
            t.this.t = null;
            t.this.F = null;
        }
    }

    public static final class d implements arq, mh3, r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public arq f8295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mh3 f8296b;
        public arq c;
        public mh3 d;

        public d() {
        }

        @Override // defpackage.arq
        public void a(long j, long j2, Format format, MediaFormat mediaFormat) {
            arq arqVar = this.c;
            if (arqVar != null) {
                arqVar.a(j, j2, format, mediaFormat);
            }
            arq arqVar2 = this.f8295a;
            if (arqVar2 != null) {
                arqVar2.a(j, j2, format, mediaFormat);
            }
        }

        @Override // defpackage.mh3
        public void c(long j, float[] fArr) {
            mh3 mh3Var = this.d;
            if (mh3Var != null) {
                mh3Var.c(j, fArr);
            }
            mh3 mh3Var2 = this.f8296b;
            if (mh3Var2 != null) {
                mh3Var2.c(j, fArr);
            }
        }

        @Override // defpackage.mh3
        public void d() {
            mh3 mh3Var = this.d;
            if (mh3Var != null) {
                mh3Var.d();
            }
            mh3 mh3Var2 = this.f8296b;
            if (mh3Var2 != null) {
                mh3Var2.d();
            }
        }

        @Override // com.google.android.exoplayer2.r.b
        public void h(int i, Object obj) {
            if (i == 6) {
                this.f8295a = (arq) obj;
                return;
            }
            if (i == 7) {
                this.f8296b = (mh3) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public t(b bVar) throws Throwable {
        t tVar;
        kb4 kb4Var = new kb4();
        this.c = kb4Var;
        try {
            Context applicationContext = bVar.f8290a.getApplicationContext();
            this.d = applicationContext;
            o91 o91Var = bVar.i;
            this.m = o91Var;
            this.O = bVar.f8292k;
            this.I = bVar.l;
            this.C = bVar.q;
            this.K = bVar.p;
            this.s = bVar.v;
            c cVar = new c();
            this.f = cVar;
            d dVar = new d();
            this.g = dVar;
            this.h = new CopyOnWriteArraySet<>();
            this.i = new CopyOnWriteArraySet<>();
            this.j = new CopyOnWriteArraySet<>();
            this.f8288k = new CopyOnWriteArraySet<>();
            this.l = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(bVar.j);
            s[] sVarArrA = bVar.f8291b.a(handler, cVar, cVar, cVar, cVar);
            this.f8287b = sVarArrA;
            this.J = 1.0f;
            if (wlq.f38110a < 21) {
                this.H = O0(0);
            } else {
                this.H = g83.a(applicationContext);
            }
            this.L = Collections.emptyList();
            this.M = true;
            try {
                j jVar = new j(sVarArrA, bVar.e, bVar.f, bVar.g, bVar.h, o91Var, bVar.f8293r, bVar.s, bVar.t, bVar.u, bVar.w, bVar.c, bVar.j, this, new q.b.a().c(15, 16, 17, 18, 19, 20, 21, 22).e());
                tVar = this;
                try {
                    tVar.e = jVar;
                    jVar.t(cVar);
                    jVar.s0(cVar);
                    if (bVar.d > 0) {
                        jVar.z0(bVar.d);
                    }
                    com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(bVar.f8290a, handler, cVar);
                    tVar.n = bVar2;
                    bVar2.b(bVar.o);
                    com.google.android.exoplayer2.c cVar2 = new com.google.android.exoplayer2.c(bVar.f8290a, handler, cVar);
                    tVar.o = cVar2;
                    cVar2.m(bVar.m ? tVar.I : null);
                    u uVar = new u(bVar.f8290a, handler, cVar);
                    tVar.p = uVar;
                    uVar.h(wlq.b0(tVar.I.c));
                    t3r t3rVar = new t3r(bVar.f8290a);
                    tVar.q = t3rVar;
                    t3rVar.a(bVar.n != 0);
                    pkr pkrVar = new pkr(bVar.f8290a);
                    tVar.f8289r = pkrVar;
                    pkrVar.a(bVar.n == 2);
                    tVar.R = I0(uVar);
                    tVar.S = wrq.e;
                    tVar.Z0(1, 102, Integer.valueOf(tVar.H));
                    tVar.Z0(2, 102, Integer.valueOf(tVar.H));
                    tVar.Z0(1, 3, tVar.I);
                    tVar.Z0(2, 4, Integer.valueOf(tVar.C));
                    tVar.Z0(1, 101, Boolean.valueOf(tVar.K));
                    tVar.Z0(2, 6, dVar);
                    tVar.Z0(6, 7, dVar);
                    kb4Var.e();
                } catch (Throwable th) {
                    th = th;
                    tVar.c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                tVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
    }

    public static u56 I0(u uVar) {
        return new u56(0, uVar.d(), uVar.c());
    }

    public static int K0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    @Override // com.google.android.exoplayer2.q
    public List<h55> A() {
        l1();
        return this.L;
    }

    @Override // com.google.android.exoplayer2.q
    public int B() {
        l1();
        return this.e.B();
    }

    public void B0(jn1 jn1Var) {
        rk1.e(jn1Var);
        this.i.add(jn1Var);
    }

    @Override // com.google.android.exoplayer2.q
    public v C() {
        l1();
        return this.e.C();
    }

    public void C0(d96 d96Var) {
        rk1.e(d96Var);
        this.l.add(d96Var);
    }

    @Override // com.google.android.exoplayer2.q
    public Looper D() {
        return this.e.D();
    }

    public void D0(stf stfVar) {
        rk1.e(stfVar);
        this.f8288k.add(stfVar);
    }

    @Override // com.google.android.exoplayer2.q
    public void E(TextureView textureView) {
        l1();
        if (textureView == null) {
            G0();
            return;
        }
        W0();
        this.B = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            toe.h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            f1(null);
            P0(0, 0);
        } else {
            e1(surfaceTexture);
            P0(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void E0(j8p j8pVar) {
        rk1.e(j8pVar);
        this.j.add(j8pVar);
    }

    @Override // com.google.android.exoplayer2.q
    public aop F() {
        l1();
        return this.e.F();
    }

    public void F0(erq erqVar) {
        rk1.e(erqVar);
        this.h.add(erqVar);
    }

    @Override // com.google.android.exoplayer2.q
    public void G(int i, long j) {
        l1();
        this.m.Z1();
        this.e.G(i, j);
    }

    public void G0() {
        l1();
        W0();
        f1(null);
        P0(0, 0);
    }

    @Override // com.google.android.exoplayer2.q
    public q.b H() {
        l1();
        return this.e.H();
    }

    public void H0(SurfaceHolder surfaceHolder) {
        l1();
        if (surfaceHolder == null || surfaceHolder != this.y) {
            return;
        }
        G0();
    }

    @Override // com.google.android.exoplayer2.q
    public long J() {
        l1();
        return this.e.J();
    }

    public boolean J0() {
        l1();
        return this.e.y0();
    }

    @Override // com.google.android.exoplayer2.q
    public void K(q.e eVar) {
        rk1.e(eVar);
        B0(eVar);
        F0(eVar);
        E0(eVar);
        D0(eVar);
        C0(eVar);
        t(eVar);
    }

    public int L0() {
        l1();
        return this.e.H0();
    }

    @Override // com.google.android.exoplayer2.q
    public long M() {
        l1();
        return this.e.M();
    }

    public int M0(int i) {
        l1();
        return this.e.I0(i);
    }

    public Format N0() {
        return this.t;
    }

    @Override // com.google.android.exoplayer2.q
    public void O(SurfaceView surfaceView) {
        l1();
        H0(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final int O0(int i) {
        AudioTrack audioTrack = this.v;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.v.release();
            this.v = null;
        }
        if (this.v == null) {
            this.v = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.v.getAudioSessionId();
    }

    @Override // com.google.android.exoplayer2.q
    public boolean P() {
        l1();
        return this.e.P();
    }

    public final void P0(int i, int i2) {
        if (i == this.D && i2 == this.E) {
            return;
        }
        this.D = i;
        this.E = i2;
        this.m.onSurfaceSizeChanged(i, i2);
        Iterator<erq> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceSizeChanged(i, i2);
        }
    }

    public final void Q0() {
        this.m.onSkipSilenceEnabledChanged(this.K);
        Iterator<jn1> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().onSkipSilenceEnabledChanged(this.K);
        }
    }

    @Deprecated
    public void R0(com.google.android.exoplayer2.source.k kVar) {
        S0(kVar, true, true);
    }

    @Deprecated
    public void S0(com.google.android.exoplayer2.source.k kVar, boolean z, boolean z2) {
        l1();
        c1(Collections.singletonList(kVar), z);
        prepare();
    }

    public void T0(jn1 jn1Var) {
        this.i.remove(jn1Var);
    }

    public void U0(d96 d96Var) {
        this.l.remove(d96Var);
    }

    public void V0(stf stfVar) {
        this.f8288k.remove(stfVar);
    }

    public final void W0() {
        if (this.z != null) {
            this.e.w0(this.g).n(10000).m(null).l();
            this.z.i(this.f);
            this.z = null;
        }
        TextureView textureView = this.B;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f) {
                toe.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.B.setSurfaceTextureListener(null);
            }
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f);
            this.y = null;
        }
    }

    public void X0(j8p j8pVar) {
        this.j.remove(j8pVar);
    }

    public void Y0(erq erqVar) {
        this.h.remove(erqVar);
    }

    public final void Z0(int i, int i2, Object obj) {
        for (s sVar : this.f8287b) {
            if (sVar.e() == i) {
                this.e.w0(sVar).n(i2).m(obj).l();
            }
        }
    }

    @Override // com.google.android.exoplayer2.q
    public boolean a() {
        l1();
        return this.e.a();
    }

    public final void a1() {
        Z0(1, 2, Float.valueOf(this.J * this.o.g()));
    }

    @Override // com.google.android.exoplayer2.q
    public long b() {
        l1();
        return this.e.b();
    }

    public void b1(com.google.android.exoplayer2.source.k kVar) {
        l1();
        this.e.n1(kVar);
    }

    @Override // com.google.android.exoplayer2.q
    public n0i c() {
        l1();
        return this.e.c();
    }

    public void c1(List<com.google.android.exoplayer2.source.k> list, boolean z) {
        l1();
        this.e.p1(list, z);
    }

    @Override // com.google.android.exoplayer2.q
    public void d(n0i n0iVar) {
        l1();
        this.e.d(n0iVar);
    }

    public final void d1(SurfaceHolder surfaceHolder) {
        this.A = false;
        this.y = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = this.y.getSurface();
        if (surface == null || !surface.isValid()) {
            P0(0, 0);
        } else {
            Rect surfaceFrame = this.y.getSurfaceFrame();
            P0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.i
    public bop e() {
        l1();
        return this.e.e();
    }

    public final void e1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        f1(surface);
        this.x = surface;
    }

    @Override // com.google.android.exoplayer2.q
    public void f(q.e eVar) {
        rk1.e(eVar);
        T0(eVar);
        Y0(eVar);
        X0(eVar);
        V0(eVar);
        U0(eVar);
        i(eVar);
    }

    public final void f1(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : this.f8287b) {
            if (sVar.e() == 2) {
                arrayList.add(this.e.w0(sVar).n(1).m(obj).l());
            }
        }
        Object obj2 = this.w;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(this.s);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.e.s1(false, ExoPlaybackException.createForRenderer(new ExoTimeoutException(3)));
            }
            Object obj3 = this.w;
            Surface surface = this.x;
            if (obj3 == surface) {
                surface.release();
                this.x = null;
            }
        }
        this.w = obj;
    }

    @Override // com.google.android.exoplayer2.q
    public void g(List<m> list, boolean z) {
        l1();
        this.e.g(list, z);
    }

    public void g1(Surface surface) {
        l1();
        W0();
        f1(surface);
        int i = surface == null ? 0 : -1;
        P0(i, i);
    }

    @Override // com.google.android.exoplayer2.q
    public long getCurrentPosition() {
        l1();
        return this.e.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.q
    public long getDuration() {
        l1();
        return this.e.getDuration();
    }

    @Override // com.google.android.exoplayer2.q
    public int getPlaybackState() {
        l1();
        return this.e.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.q
    public int getRepeatMode() {
        l1();
        return this.e.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.q
    public void h(SurfaceView surfaceView) {
        l1();
        if (surfaceView instanceof lqq) {
            W0();
            f1(surfaceView);
            d1(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                h1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            W0();
            this.z = (SphericalGLSurfaceView) surfaceView;
            this.e.w0(this.g).n(10000).m(this.z).l();
            this.z.d(this.f);
            f1(this.z.getVideoSurface());
            d1(surfaceView.getHolder());
        }
    }

    public void h1(SurfaceHolder surfaceHolder) {
        l1();
        if (surfaceHolder == null) {
            G0();
            return;
        }
        W0();
        this.A = true;
        this.y = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            f1(null);
            P0(0, 0);
        } else {
            f1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            P0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.q
    public void i(q.c cVar) {
        this.e.i(cVar);
    }

    public void i1(float f) {
        l1();
        float fQ = wlq.q(f, 0.0f, 1.0f);
        if (this.J == fQ) {
            return;
        }
        this.J = fQ;
        a1();
        this.m.onVolumeChanged(fQ);
        Iterator<jn1> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().onVolumeChanged(fQ);
        }
    }

    @Override // com.google.android.exoplayer2.q
    public ExoPlaybackException j() {
        l1();
        return this.e.j();
    }

    public final void j1(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.e.r1(z2, i3, i2);
    }

    @Override // com.google.android.exoplayer2.q
    public int k() {
        l1();
        return this.e.k();
    }

    public final void k1() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.q.b(n() && !J0());
                this.f8289r.b(n());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.q.b(false);
        this.f8289r.b(false);
    }

    public final void l1() {
        this.c.b();
        if (Thread.currentThread() != D().getThread()) {
            String strD = wlq.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), D().getThread().getName());
            if (this.M) {
                throw new IllegalStateException(strD);
            }
            toe.i("SimpleExoPlayer", strD, this.N ? null : new IllegalStateException());
            this.N = true;
        }
    }

    @Override // com.google.android.exoplayer2.q
    public TrackGroupArray m() {
        l1();
        return this.e.m();
    }

    @Override // com.google.android.exoplayer2.q
    public boolean n() {
        l1();
        return this.e.n();
    }

    @Override // com.google.android.exoplayer2.q
    public void o(boolean z) {
        l1();
        this.e.o(z);
    }

    @Override // com.google.android.exoplayer2.q
    public void p(boolean z) {
        l1();
        this.o.p(n(), 1);
        this.e.p(z);
        this.L = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.q
    public void prepare() {
        l1();
        boolean zN = n();
        int iP = this.o.p(zN, 2);
        j1(zN, iP, K0(zN, iP));
        this.e.prepare();
    }

    @Override // com.google.android.exoplayer2.q
    public int r() {
        l1();
        return this.e.r();
    }

    @Override // com.google.android.exoplayer2.q
    public void release() {
        AudioTrack audioTrack;
        l1();
        if (wlq.f38110a < 21 && (audioTrack = this.v) != null) {
            audioTrack.release();
            this.v = null;
        }
        this.n.b(false);
        this.p.g();
        this.q.b(false);
        this.f8289r.b(false);
        this.o.i();
        this.e.release();
        this.m.a2();
        W0();
        Surface surface = this.x;
        if (surface != null) {
            surface.release();
            this.x = null;
        }
        if (this.P) {
            ((PriorityTaskManager) rk1.e(this.O)).c(0);
            this.P = false;
        }
        this.L = Collections.emptyList();
        this.Q = true;
    }

    @Override // com.google.android.exoplayer2.q
    public void s(TextureView textureView) {
        l1();
        if (textureView == null || textureView != this.B) {
            return;
        }
        G0();
    }

    @Override // com.google.android.exoplayer2.q
    public void setRepeatMode(int i) {
        l1();
        this.e.setRepeatMode(i);
    }

    @Override // com.google.android.exoplayer2.q
    public void t(q.c cVar) {
        rk1.e(cVar);
        this.e.t(cVar);
    }

    @Override // com.google.android.exoplayer2.q
    public int u() {
        l1();
        return this.e.u();
    }

    @Override // com.google.android.exoplayer2.q
    public long v() {
        l1();
        return this.e.v();
    }

    @Override // com.google.android.exoplayer2.q
    public List<Metadata> w() {
        l1();
        return this.e.w();
    }

    @Override // com.google.android.exoplayer2.q
    public int y() {
        l1();
        return this.e.y();
    }

    @Override // com.google.android.exoplayer2.q
    public void z(boolean z) {
        l1();
        int iP = this.o.p(z, getPlaybackState());
        j1(z, iP, K0(z, iP));
    }
}
