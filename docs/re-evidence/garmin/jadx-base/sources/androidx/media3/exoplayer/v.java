package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.media3.common.g implements ExoPlayer {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f9731j0 = 0;
    public final androidx.media3.exoplayer.b A;
    public final e B;
    public final z0 C;
    public final a1 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public final x0 K;
    public androidx.media3.exoplayer.source.t L;
    public final ExoPlayer.c M;
    public androidx.media3.common.z.b N;
    public androidx.media3.common.v O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public ab.k S;
    public boolean T;
    public TextureView U;
    public final int V;
    public fa.s W;
    public final androidx.media3.common.d X;
    public final float Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ea.b f9732a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.m f9733b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f9734b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.z.b f9735c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f9736c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.f f9737d = new fa.f();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f9738d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f9739e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public androidx.media3.common.k0 f9740e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.z f9741f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public androidx.media3.common.v f9742f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0[] f9743g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public p0 f9744g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wa.l f9745h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f9746h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fa.i f9747i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f9748i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f9749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f9750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fa.j<androidx.media3.common.z.d> f9751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<ExoPlayer.a> f9752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.d0.b f9753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f9754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.j.a f9756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ja.a f9757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Looper f9758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xa.c f9759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f9760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f9761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fa.t f9763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f9764y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f9765z;

    public final class b implements androidx.media3.exoplayer.video.f, androidx.media3.exoplayer.audio.b, va.f, qa.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ab.k.b, e.b, androidx.media3.exoplayer.b.InterfaceC0122b, ExoPlayer.a {
        private b() {
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void A(g gVar) {
            v.this.f9757r.A(gVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void C(g gVar) {
            int i14 = v.f9731j0;
            v vVar = v.this;
            vVar.getClass();
            vVar.f9757r.C(gVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void G(androidx.media3.common.q qVar, h hVar) {
            int i14 = v.f9731j0;
            v vVar = v.this;
            vVar.getClass();
            vVar.f9757r.G(qVar, hVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void I(g gVar) {
            v.this.f9757r.I(gVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void P(AudioSink.a aVar) {
            v.this.f9757r.P(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void S(AudioSink.a aVar) {
            v.this.f9757r.S(aVar);
        }

        @Override // qa.b
        public final void Y(androidx.media3.common.w wVar) {
            v vVar = v.this;
            androidx.media3.common.v vVar2 = vVar.f9742f0;
            fa.j<androidx.media3.common.z.d> jVar = vVar.f9751l;
            vVar2.getClass();
            androidx.media3.common.v.b bVar = new androidx.media3.common.v.b();
            int i14 = 0;
            while (true) {
                androidx.media3.common.w.b[] bVarArr = wVar.f8574a;
                if (i14 >= bVarArr.length) {
                    break;
                }
                bVarArr[i14].R3(bVar);
                i14++;
            }
            vVar.f9742f0 = new androidx.media3.common.v(bVar);
            androidx.media3.common.v vVarL = vVar.l();
            if (!vVarL.equals(vVar.O)) {
                vVar.O = vVarL;
                jVar.d(14, new a73.j(this, 12));
            }
            jVar.d(28, new a73.j(wVar, 13));
            jVar.c();
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void a() {
            int i14 = v.f9731j0;
            v.this.D();
        }

        @Override // ab.k.b
        public final void b() {
            int i14 = v.f9731j0;
            v.this.z(null);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void k(androidx.media3.common.k0 k0Var) {
            v vVar = v.this;
            vVar.f9740e0 = k0Var;
            vVar.f9751l.f(25, new a73.j(k0Var, 14));
        }

        @Override // va.f
        public final void n(ea.b bVar) {
            v vVar = v.this;
            vVar.f9732a0 = bVar;
            vVar.f9751l.f(27, new a73.j(bVar, 11));
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioCodecError(Exception exc) {
            v.this.f9757r.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioDecoderInitialized(String str, long j8, long j14) {
            v.this.f9757r.onAudioDecoderInitialized(str, j8, j14);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioDecoderReleased(String str) {
            v.this.f9757r.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioPositionAdvancing(long j8) {
            v.this.f9757r.onAudioPositionAdvancing(j8);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioSinkError(Exception exc) {
            v.this.f9757r.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioUnderrun(int i14, long j8, long j14) {
            v.this.f9757r.onAudioUnderrun(i14, j8, j14);
        }

        @Override // va.f
        public final void onCues(List<ea.a> list) {
            v.this.f9751l.f(27, new w(list, 0));
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onDroppedFrames(int i14, long j8) {
            v.this.f9757r.onDroppedFrames(i14, j8);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onRenderedFirstFrame(Object obj, long j8) {
            v vVar = v.this;
            vVar.f9757r.onRenderedFirstFrame(obj, j8);
            if (vVar.P == obj) {
                vVar.f9751l.f(26, new androidx.core.view.j(19));
            }
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onSkipSilenceEnabledChanged(boolean z14) {
            v vVar = v.this;
            if (vVar.Z == z14) {
                return;
            }
            vVar.Z = z14;
            vVar.f9751l.f(23, new s(z14, 1));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i14, int i15) {
            int i16 = v.f9731j0;
            v vVar = v.this;
            vVar.getClass();
            Surface surface = new Surface(surfaceTexture);
            vVar.z(surface);
            vVar.Q = surface;
            vVar.u(i14, i15);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i14 = v.f9731j0;
            v vVar = v.this;
            vVar.z(null);
            vVar.u(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i14, int i15) {
            int i16 = v.f9731j0;
            v.this.u(i14, i15);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onVideoCodecError(Exception exc) {
            v.this.f9757r.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onVideoDecoderInitialized(String str, long j8, long j14) {
            v.this.f9757r.onVideoDecoderInitialized(str, j8, j14);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onVideoDecoderReleased(String str) {
            v.this.f9757r.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void onVideoFrameProcessingOffset(long j8, int i14) {
            v.this.f9757r.onVideoFrameProcessingOffset(j8, i14);
        }

        @Override // ab.k.b
        public final void onVideoSurfaceCreated(Surface surface) {
            int i14 = v.f9731j0;
            v.this.z(surface);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void p(g gVar) {
            int i14 = v.f9731j0;
            v vVar = v.this;
            vVar.getClass();
            vVar.f9757r.p(gVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i14, int i15, int i16) {
            int i17 = v.f9731j0;
            v.this.u(i15, i16);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            v vVar = v.this;
            if (vVar.T) {
                vVar.z(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            v vVar = v.this;
            if (vVar.T) {
                vVar.z(null);
            }
            vVar.u(0, 0);
        }

        @Override // androidx.media3.exoplayer.video.f
        public final void z(androidx.media3.common.q qVar, h hVar) {
            int i14 = v.f9731j0;
            v vVar = v.this;
            vVar.getClass();
            vVar.f9757r.z(qVar, hVar);
        }
    }

    public static final class c implements za.f, ab.a, r0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public za.f f9767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ab.a f9768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public za.f f9769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ab.a f9770d;

        private c() {
        }

        @Override // za.f
        public final void a(long j8, long j14, androidx.media3.common.q qVar, MediaFormat mediaFormat) {
            long j15;
            long j16;
            androidx.media3.common.q qVar2;
            MediaFormat mediaFormat2;
            za.f fVar = this.f9769c;
            if (fVar != null) {
                fVar.a(j8, j14, qVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                qVar2 = qVar;
                j16 = j14;
                j15 = j8;
            } else {
                j15 = j8;
                j16 = j14;
                qVar2 = qVar;
                mediaFormat2 = mediaFormat;
            }
            za.f fVar2 = this.f9767a;
            if (fVar2 != null) {
                fVar2.a(j15, j16, qVar2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.r0.b
        public final void handleMessage(int i14, Object obj) {
            if (i14 == 7) {
                this.f9767a = (za.f) obj;
                return;
            }
            if (i14 == 8) {
                this.f9768b = (ab.a) obj;
                return;
            }
            if (i14 != 10000) {
                return;
            }
            ab.k kVar = (ab.k) obj;
            if (kVar == null) {
                this.f9769c = null;
                this.f9770d = null;
            } else {
                this.f9769c = kVar.getVideoFrameMetadataListener();
                this.f9770d = kVar.getCameraMotionListener();
            }
        }

        @Override // ab.a
        public final void onCameraMotion(long j8, float[] fArr) {
            ab.a aVar = this.f9770d;
            if (aVar != null) {
                aVar.onCameraMotion(j8, fArr);
            }
            ab.a aVar2 = this.f9768b;
            if (aVar2 != null) {
                aVar2.onCameraMotion(j8, fArr);
            }
        }

        @Override // ab.a
        public final void onCameraMotionReset() {
            ab.a aVar = this.f9770d;
            if (aVar != null) {
                aVar.onCameraMotionReset();
            }
            ab.a aVar2 = this.f9768b;
            if (aVar2 != null) {
                aVar2.onCameraMotionReset();
            }
        }
    }

    public static final class d implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.media3.common.d0 f9772b;

        public d(Object obj, androidx.media3.exoplayer.source.h hVar) {
            this.f9771a = obj;
            this.f9772b = hVar.f9510o;
        }

        @Override // androidx.media3.exoplayer.i0
        public final androidx.media3.common.d0 getTimeline() {
            return this.f9772b;
        }

        @Override // androidx.media3.exoplayer.i0
        public final Object getUid() {
            return this.f9771a;
        }
    }

    static {
        androidx.media3.common.u.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public v(ExoPlayer.b bVar, androidx.media3.common.z zVar) {
        ja.q qVar;
        try {
            fa.k.f("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + fa.z.f70075e + "]");
            Context context = bVar.f8637a;
            String str = bVar.f8659w;
            Looper looper = bVar.f8645i;
            fa.t tVar = bVar.f8638b;
            this.f9739e = context.getApplicationContext();
            this.f9757r = bVar.f8644h.apply(tVar);
            this.f9738d0 = bVar.f8646j;
            this.X = bVar.f8647k;
            this.V = bVar.f8648l;
            this.Z = false;
            this.E = bVar.f8656t;
            b bVar2 = new b();
            this.f9764y = bVar2;
            this.f9765z = new c();
            Handler handler = new Handler(looper);
            t0[] t0VarArrA = bVar.f8639c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f9743g = t0VarArrA;
            fa.a.d(t0VarArrA.length > 0);
            this.f9745h = bVar.f8641e.get();
            this.f9756q = bVar.f8640d.get();
            this.f9759t = bVar.f8643g.get();
            this.f9755p = bVar.f8649m;
            this.K = bVar.f8650n;
            this.f9760u = bVar.f8651o;
            this.f9761v = bVar.f8652p;
            this.f9762w = bVar.f8653q;
            this.f9758s = looper;
            this.f9763x = tVar;
            this.f9741f = zVar == null ? this : zVar;
            this.f9751l = new fa.j<>(looper, tVar, new androidx.core.view.j(this));
            this.f9752m = new CopyOnWriteArraySet<>();
            this.f9754o = new ArrayList();
            this.L = new androidx.media3.exoplayer.source.t.a(0);
            this.M = ExoPlayer.c.f8660b;
            this.f9733b = new wa.m(new v0[t0VarArrA.length], new wa.g[t0VarArrA.length], androidx.media3.common.h0.f8301b, null);
            this.f9753n = new androidx.media3.common.d0.b();
            androidx.media3.common.z.b.a aVar = new androidx.media3.common.z.b.a();
            androidx.media3.common.o.b bVar3 = aVar.f8588a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            bVar3.getClass();
            for (int i14 = 0; i14 < 20; i14++) {
                bVar3.a(iArr[i14]);
            }
            wa.l lVar = this.f9745h;
            lVar.getClass();
            aVar.a(29, lVar instanceof wa.e);
            aVar.a(23, false);
            aVar.a(25, false);
            aVar.a(33, false);
            aVar.a(26, false);
            aVar.a(34, false);
            androidx.media3.common.z.b bVar4 = new androidx.media3.common.z.b(bVar3.b());
            this.f9735c = bVar4;
            androidx.media3.common.o.b bVar5 = new androidx.media3.common.z.b.a().f8588a;
            androidx.media3.common.o oVar = bVar4.f8587a;
            bVar5.getClass();
            for (int i15 = 0; i15 < oVar.f8347a.size(); i15++) {
                bVar5.a(oVar.a(i15));
            }
            bVar5.a(4);
            bVar5.a(10);
            this.N = new androidx.media3.common.z.b(bVar5.b());
            this.f9747i = this.f9763x.createHandler(this.f9758s, null);
            t tVar2 = new t(this);
            this.f9749j = tVar2;
            this.f9744g0 = p0.i(this.f9733b);
            this.f9757r.s2(this.f9741f, this.f9758s);
            if (fa.z.f70071a < 31) {
                qVar = new ja.q(str);
            } else {
                Context context2 = this.f9739e;
                boolean z14 = bVar.f8657u;
                ja.p pVarN = ja.p.n(context2);
                if (pVarN == null) {
                    fa.k.g("MediaMetricsService unavailable.");
                    qVar = new ja.q(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z14) {
                        this.f9757r.V4(pVarN);
                    }
                    qVar = new ja.q(pVarN.f98018c.getSessionId(), str);
                }
            }
            this.f9750k = new z(this.f9743g, this.f9745h, this.f9733b, bVar.f8642f.get(), this.f9759t, this.F, this.G, this.f9757r, this.K, bVar.f8654r, bVar.f8655s, false, false, this.f9758s, this.f9763x, tVar2, qVar, null, this.M);
            this.Y = 1.0f;
            this.F = 0;
            androidx.media3.common.v vVar = androidx.media3.common.v.B;
            this.O = vVar;
            this.f9742f0 = vVar;
            this.f9746h0 = -1;
            AudioManager audioManager = (AudioManager) this.f9739e.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.f9732a0 = ea.b.f63585b;
            this.f9734b0 = true;
            e(this.f9757r);
            this.f9759t.d(new Handler(this.f9758s), this.f9757r);
            this.f9752m.add(this.f9764y);
            androidx.media3.exoplayer.b bVar6 = new androidx.media3.exoplayer.b(context, handler, this.f9764y);
            this.A = bVar6;
            bVar6.a();
            this.B = new e(context, handler, this.f9764y);
            this.C = new z0(context);
            this.D = new a1(context);
            androidx.media3.common.k.b bVar7 = new androidx.media3.common.k.b(0);
            bVar7.f8332b = 0;
            bVar7.f8333c = 0;
            new androidx.media3.common.k(bVar7);
            this.f9740e0 = androidx.media3.common.k0.f8334d;
            this.W = fa.s.f70057c;
            this.f9745h.f(this.X);
            w(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            w(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            w(1, 3, this.X);
            w(2, 4, Integer.valueOf(this.V));
            w(2, 5, 0);
            w(1, 9, Boolean.valueOf(this.Z));
            w(2, 7, this.f9765z);
            w(6, 8, this.f9765z);
            w(-1, 16, Integer.valueOf(this.f9738d0));
        } finally {
            this.f9737d.a();
        }
    }

    public static long r(p0 p0Var) {
        androidx.media3.common.d0.c cVar = new androidx.media3.common.d0.c();
        androidx.media3.common.d0.b bVar = new androidx.media3.common.d0.b();
        p0Var.f9318a.g(p0Var.f9319b.f9519a, bVar);
        long j8 = p0Var.f9320c;
        return j8 == C.TIME_UNSET ? p0Var.f9318a.m(bVar.f8189c, cVar, 0L).f8207l : bVar.f8191e + j8;
    }

    public final void A() {
        androidx.media3.common.z.b bVar = this.N;
        int i14 = fa.z.f70071a;
        androidx.media3.common.z zVar = this.f9741f;
        boolean zIsPlayingAd = zVar.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = zVar.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = zVar.hasPreviousMediaItem();
        boolean zHasNextMediaItem = zVar.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = zVar.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = zVar.isCurrentMediaItemDynamic();
        boolean zP = zVar.getCurrentTimeline().p();
        androidx.media3.common.z.b.a aVar = new androidx.media3.common.z.b.a();
        androidx.media3.common.o oVar = this.f9735c.f8587a;
        androidx.media3.common.o.b bVar2 = aVar.f8588a;
        bVar2.getClass();
        boolean z14 = false;
        for (int i15 = 0; i15 < oVar.f8347a.size(); i15++) {
            bVar2.a(oVar.a(i15));
        }
        boolean z15 = !zIsPlayingAd;
        aVar.a(4, z15);
        aVar.a(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        aVar.a(6, zHasPreviousMediaItem && !zIsPlayingAd);
        aVar.a(7, !zP && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        aVar.a(8, zHasNextMediaItem && !zIsPlayingAd);
        aVar.a(9, !zP && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        aVar.a(10, z15);
        aVar.a(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z14 = true;
        }
        aVar.a(12, z14);
        androidx.media3.common.z.b bVar3 = new androidx.media3.common.z.b(bVar2.b());
        this.N = bVar3;
        if (bVar3.equals(bVar)) {
            return;
        }
        this.f9751l.d(13, new t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void B(boolean z14, int i14, int i15) {
        ?? r14 = (!z14 || i14 == -1) ? 0 : 1;
        int i16 = i14 == 0 ? 1 : 0;
        p0 p0Var = this.f9744g0;
        if (p0Var.f9329l == r14 && p0Var.f9331n == i16 && p0Var.f9330m == i15) {
            return;
        }
        this.H++;
        p0 p0Var2 = this.f9744g0;
        boolean z15 = p0Var2.f9333p;
        p0 p0VarA = p0Var2;
        if (z15) {
            p0VarA = p0Var2.a();
        }
        p0 p0VarD = p0VarA.d(i15, i16, r14);
        this.f9750k.f9893i.obtainMessage(1, r14, (i16 << 4) | i15).b();
        C(p0VarD, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void C(final p0 p0Var, int i14, boolean z14, int i15, long j8, int i16, boolean z15) {
        Pair pair;
        int i17;
        androidx.media3.common.t tVar;
        int i18;
        Object obj;
        androidx.media3.common.t tVar2;
        Object obj2;
        int i19;
        long j14;
        long j15;
        long jR;
        long jR2;
        Object obj3;
        androidx.media3.common.t tVar3;
        Object obj4;
        int i24;
        p0 p0Var2 = this.f9744g0;
        this.f9744g0 = p0Var;
        boolean zEquals = p0Var2.f9318a.equals(p0Var.f9318a);
        androidx.media3.common.d0.c cVar = this.f8225a;
        androidx.media3.common.d0.b bVar = this.f9753n;
        androidx.media3.common.d0 d0Var = p0Var2.f9318a;
        androidx.media3.exoplayer.source.j.b bVar2 = p0Var2.f9319b;
        androidx.media3.common.d0 d0Var2 = p0Var.f9318a;
        androidx.media3.exoplayer.source.j.b bVar3 = p0Var.f9319b;
        if (d0Var2.p() && d0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (d0Var2.p() != d0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!d0Var.m(d0Var.g(bVar2.f9519a, bVar).f8189c, cVar, 0L).f8196a.equals(d0Var2.m(d0Var2.g(bVar3.f9519a, bVar).f8189c, cVar, 0L).f8196a)) {
            if (z14 && i15 == 0) {
                i17 = 1;
            } else if (z14 && i15 == 1) {
                i17 = 2;
            } else {
                if (zEquals) {
                    j20.x.h();
                    return;
                }
                i17 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i17));
        } else if (z14 && i15 == 0 && bVar2.f9522d < bVar3.f9522d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z14 && i15 == 1 && z15) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            tVar = p0Var.f9318a.p() ? null : p0Var.f9318a.m(p0Var.f9318a.g(p0Var.f9319b.f9519a, this.f9753n).f8189c, this.f8225a, 0L).f8198c;
            this.f9742f0 = androidx.media3.common.v.B;
        } else {
            tVar = null;
        }
        if (zBooleanValue || !p0Var2.f9327j.equals(p0Var.f9327j)) {
            androidx.media3.common.v vVar = this.f9742f0;
            vVar.getClass();
            androidx.media3.common.v.b bVar4 = new androidx.media3.common.v.b();
            List<androidx.media3.common.w> list = p0Var.f9327j;
            for (int i25 = 0; i25 < list.size(); i25++) {
                androidx.media3.common.w wVar = list.get(i25);
                int i26 = 0;
                while (true) {
                    androidx.media3.common.w.b[] bVarArr = wVar.f8574a;
                    if (i26 < bVarArr.length) {
                        bVarArr[i26].R3(bVar4);
                        i26++;
                    }
                }
            }
            this.f9742f0 = new androidx.media3.common.v(bVar4);
        }
        androidx.media3.common.v vVarL = l();
        boolean zEquals2 = vVarL.equals(this.O);
        this.O = vVarL;
        boolean z16 = p0Var2.f9329l != p0Var.f9329l;
        boolean z17 = p0Var2.f9322e != p0Var.f9322e;
        if (z17 || z16) {
            D();
        }
        boolean z18 = p0Var2.f9324g != p0Var.f9324g;
        if (!zEquals) {
            this.f9751l.d(0, new a73.m(p0Var, i14, 1));
        }
        if (z14) {
            androidx.media3.common.d0.b bVar5 = new androidx.media3.common.d0.b();
            if (p0Var2.f9318a.p()) {
                i18 = i16;
                obj = null;
                tVar2 = null;
                obj2 = null;
                i19 = -1;
            } else {
                Object obj5 = p0Var2.f9319b.f9519a;
                p0Var2.f9318a.g(obj5, bVar5);
                int i27 = bVar5.f8189c;
                int iB = p0Var2.f9318a.b(obj5);
                obj = p0Var2.f9318a.m(i27, this.f8225a, 0L).f8196a;
                tVar2 = this.f8225a.f8198c;
                obj2 = obj5;
                i18 = i27;
                i19 = iB;
            }
            androidx.media3.exoplayer.source.j.b bVar6 = p0Var2.f9319b;
            if (i15 == 0) {
                boolean zB = bVar6.b();
                androidx.media3.exoplayer.source.j.b bVar7 = p0Var2.f9319b;
                if (zB) {
                    jR = bVar5.a(bVar7.f9520b, bVar7.f9521c);
                    jR2 = r(p0Var2);
                } else {
                    if (bVar7.f9523e != -1) {
                        jR = r(this.f9744g0);
                    } else {
                        j14 = bVar5.f8191e;
                        j15 = bVar5.f8190d;
                        jR = j14 + j15;
                    }
                    jR2 = jR;
                }
            } else if (bVar6.b()) {
                jR = p0Var2.f9336s;
                jR2 = r(p0Var2);
            } else {
                j14 = bVar5.f8191e;
                j15 = p0Var2.f9336s;
                jR = j14 + j15;
                jR2 = jR;
            }
            long jY = fa.z.Y(jR);
            long jY2 = fa.z.Y(jR2);
            androidx.media3.exoplayer.source.j.b bVar8 = p0Var2.f9319b;
            androidx.media3.common.z.e eVar = new androidx.media3.common.z.e(obj, i18, tVar2, obj2, i19, jY, jY2, bVar8.f9520b, bVar8.f9521c);
            androidx.media3.common.d0.c cVar2 = this.f8225a;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f9744g0.f9318a.p()) {
                obj3 = null;
                tVar3 = null;
                obj4 = null;
                i24 = -1;
            } else {
                p0 p0Var3 = this.f9744g0;
                Object obj6 = p0Var3.f9319b.f9519a;
                p0Var3.f9318a.g(obj6, this.f9753n);
                int iB2 = this.f9744g0.f9318a.b(obj6);
                Object obj7 = this.f9744g0.f9318a.m(currentMediaItemIndex, cVar2, 0L).f8196a;
                tVar3 = cVar2.f8198c;
                i24 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jY3 = fa.z.Y(j8);
            long jY4 = this.f9744g0.f9319b.b() ? fa.z.Y(r(this.f9744g0)) : jY3;
            androidx.media3.exoplayer.source.j.b bVar9 = this.f9744g0.f9319b;
            this.f9751l.d(11, new u(i15, eVar, new androidx.media3.common.z.e(obj3, currentMediaItemIndex, tVar3, obj4, i24, jY3, jY4, bVar9.f9520b, bVar9.f9521c)));
        } else {
            zBooleanValue = zBooleanValue;
            z16 = z16;
            zEquals2 = zEquals2;
        }
        if (zBooleanValue) {
            this.f9751l.d(1, new a73.m(tVar, iIntValue, 2));
        }
        if (p0Var2.f9323f != p0Var.f9323f) {
            final int i28 = 7;
            this.f9751l.d(10, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i29 = i28;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i29) {
                        case 0:
                            int i30 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i34 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i35 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i36 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i37 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i38 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i39 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
            if (p0Var.f9323f != null) {
                final int i29 = 8;
                this.f9751l.d(10, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                    @Override // fa.j.a
                    public final void invoke(Object obj8) {
                        int i210 = i29;
                        p0 p0Var4 = p0Var;
                        androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                        switch (i210) {
                            case 0:
                                int i30 = v.f9731j0;
                                boolean z19 = p0Var4.f9324g;
                                dVar.getClass();
                                dVar.onIsLoadingChanged(p0Var4.f9324g);
                                break;
                            case 1:
                                int i34 = v.f9731j0;
                                dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                                break;
                            case 2:
                                int i35 = v.f9731j0;
                                dVar.onPlaybackStateChanged(p0Var4.f9322e);
                                break;
                            case 3:
                                int i36 = v.f9731j0;
                                dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                                break;
                            case 4:
                                int i37 = v.f9731j0;
                                dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                                break;
                            case 5:
                                int i38 = v.f9731j0;
                                dVar.onIsPlayingChanged(p0Var4.k());
                                break;
                            case 6:
                                int i39 = v.f9731j0;
                                dVar.a3(p0Var4.f9332o);
                                break;
                            case 7:
                                int i44 = v.f9731j0;
                                dVar.I4(p0Var4.f9323f);
                                break;
                            case 8:
                                int i45 = v.f9731j0;
                                dVar.g1(p0Var4.f9323f);
                                break;
                            default:
                                int i46 = v.f9731j0;
                                dVar.g2(p0Var4.f9326i.f183758d);
                                break;
                        }
                    }
                });
            }
        }
        wa.m mVar = p0Var2.f9326i;
        wa.m mVar2 = p0Var.f9326i;
        if (mVar != mVar2) {
            this.f9745h.c(mVar2.f183759e);
            final int i30 = 9;
            this.f9751l.d(2, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i30;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i34 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i35 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i36 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i37 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i38 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i39 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i310 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f9751l.d(14, new a73.j(this.O, 9));
        }
        if (z18) {
            final int i34 = 0;
            this.f9751l.d(3, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i34;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i35 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i36 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i37 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i38 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i39 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i310 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i311 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (z17 || z16) {
            final int i35 = 1;
            this.f9751l.d(-1, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i35;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i36 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i37 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i38 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i39 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i310 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i311 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i312 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (z17) {
            final int i36 = 2;
            this.f9751l.d(4, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i36;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i37 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i38 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i39 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i310 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i311 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i312 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i313 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (z16 || p0Var2.f9330m != p0Var.f9330m) {
            final int i37 = 3;
            this.f9751l.d(5, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i37;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i38 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i39 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i310 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i311 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i312 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i313 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i314 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (p0Var2.f9331n != p0Var.f9331n) {
            final int i38 = 4;
            this.f9751l.d(6, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i38;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i39 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i310 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i311 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i312 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i313 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i314 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i315 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (p0Var2.k() != p0Var.k()) {
            final int i39 = 5;
            this.f9751l.d(7, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i39;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i310 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i311 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i312 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i313 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i314 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i315 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i316 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i44 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i45 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i46 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        if (!p0Var2.f9332o.equals(p0Var.f9332o)) {
            final int i44 = 6;
            this.f9751l.d(12, new fa.j.a() { // from class: androidx.media3.exoplayer.p
                @Override // fa.j.a
                public final void invoke(Object obj8) {
                    int i210 = i44;
                    p0 p0Var4 = p0Var;
                    androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj8;
                    switch (i210) {
                        case 0:
                            int i310 = v.f9731j0;
                            boolean z19 = p0Var4.f9324g;
                            dVar.getClass();
                            dVar.onIsLoadingChanged(p0Var4.f9324g);
                            break;
                        case 1:
                            int i311 = v.f9731j0;
                            dVar.onPlayerStateChanged(p0Var4.f9329l, p0Var4.f9322e);
                            break;
                        case 2:
                            int i312 = v.f9731j0;
                            dVar.onPlaybackStateChanged(p0Var4.f9322e);
                            break;
                        case 3:
                            int i313 = v.f9731j0;
                            dVar.onPlayWhenReadyChanged(p0Var4.f9329l, p0Var4.f9330m);
                            break;
                        case 4:
                            int i314 = v.f9731j0;
                            dVar.onPlaybackSuppressionReasonChanged(p0Var4.f9331n);
                            break;
                        case 5:
                            int i315 = v.f9731j0;
                            dVar.onIsPlayingChanged(p0Var4.k());
                            break;
                        case 6:
                            int i316 = v.f9731j0;
                            dVar.a3(p0Var4.f9332o);
                            break;
                        case 7:
                            int i45 = v.f9731j0;
                            dVar.I4(p0Var4.f9323f);
                            break;
                        case 8:
                            int i46 = v.f9731j0;
                            dVar.g1(p0Var4.f9323f);
                            break;
                        default:
                            int i47 = v.f9731j0;
                            dVar.g2(p0Var4.f9326i.f183758d);
                            break;
                    }
                }
            });
        }
        A();
        this.f9751l.c();
        if (p0Var2.f9333p != p0Var.f9333p) {
            Iterator<ExoPlayer.a> it = this.f9752m.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void D() {
        int playbackState = getPlaybackState();
        a1 a1Var = this.D;
        z0 z0Var = this.C;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                E();
                boolean z14 = this.f9744g0.f9333p;
                getPlayWhenReady();
                z0Var.getClass();
                getPlayWhenReady();
                a1Var.getClass();
                return;
            }
            if (playbackState != 4) {
                j20.x.h();
                return;
            }
        }
        z0Var.getClass();
        a1Var.getClass();
    }

    public final void E() {
        fa.f fVar = this.f9737d;
        synchronized (fVar) {
            boolean z14 = false;
            while (!fVar.f70013b) {
                try {
                    fVar.wait();
                } catch (InterruptedException unused) {
                    z14 = true;
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f9758s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f9758s.getThread().getName();
            int i14 = fa.z.f70071a;
            Locale locale = Locale.US;
            String strG = v.e0.g("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f9734b0) {
                vb.h.z(strG);
            } else {
                fa.k.h(strG, this.f9736c0 ? null : new IllegalStateException());
                this.f9736c0 = true;
            }
        }
    }

    @Override // androidx.media3.common.z
    /* JADX INFO: renamed from: a */
    public final ExoPlaybackException getPlayerError() {
        E();
        return this.f9744g0.f9323f;
    }

    @Override // androidx.media3.common.z
    public final void b(androidx.media3.common.y yVar) {
        E();
        if (this.f9744g0.f9332o.equals(yVar)) {
            return;
        }
        p0 p0VarF = this.f9744g0.f(yVar);
        this.H++;
        this.f9750k.f9893i.obtainMessage(4, yVar).b();
        C(p0VarF, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.z
    public final void c(androidx.media3.common.g0 g0Var) {
        E();
        wa.l lVar = this.f9745h;
        lVar.getClass();
        if (!(lVar instanceof wa.e) || g0Var.equals(lVar.a())) {
            return;
        }
        lVar.g(g0Var);
        this.f9751l.f(19, new a73.j(g0Var, 10));
    }

    @Override // androidx.media3.common.z
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        E();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        E();
        if (holder == null || holder != this.R) {
            return;
        }
        m();
    }

    @Override // androidx.media3.common.z
    public final void clearVideoTextureView(TextureView textureView) {
        E();
        if (textureView == null || textureView != this.U) {
            return;
        }
        m();
    }

    @Override // androidx.media3.common.z
    public final void d(androidx.media3.common.z.d dVar) {
        E();
        dVar.getClass();
        fa.j<androidx.media3.common.z.d> jVar = this.f9751l;
        jVar.g();
        CopyOnWriteArraySet<fa.j.c<androidx.media3.common.z.d>> copyOnWriteArraySet = jVar.f70021d;
        for (fa.j.c<androidx.media3.common.z.d> cVar : copyOnWriteArraySet) {
            if (cVar.f70027a.equals(dVar)) {
                fa.j.b<androidx.media3.common.z.d> bVar = jVar.f70020c;
                cVar.f70030d = true;
                if (cVar.f70029c) {
                    cVar.f70029c = false;
                    bVar.c(cVar.f70027a, cVar.f70028b.b());
                }
                copyOnWriteArraySet.remove(cVar);
            }
        }
    }

    @Override // androidx.media3.common.z
    public final void e(androidx.media3.common.z.d dVar) {
        dVar.getClass();
        this.f9751l.a(dVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void f(androidx.media3.exoplayer.source.a aVar) {
        E();
        List listSingletonList = Collections.singletonList(aVar);
        E();
        x(listSingletonList);
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.h0 g() {
        E();
        return this.f9744g0.f9326i.f183758d;
    }

    @Override // androidx.media3.common.z
    public final Looper getApplicationLooper() {
        return this.f9758s;
    }

    @Override // androidx.media3.common.z
    public final long getContentBufferedPosition() {
        E();
        if (this.f9744g0.f9318a.p()) {
            return this.f9748i0;
        }
        p0 p0Var = this.f9744g0;
        if (p0Var.f9328k.f9522d != p0Var.f9319b.f9522d) {
            return fa.z.Y(p0Var.f9318a.m(getCurrentMediaItemIndex(), this.f8225a, 0L).f8208m);
        }
        long j8 = p0Var.f9334q;
        if (this.f9744g0.f9328k.b()) {
            p0 p0Var2 = this.f9744g0;
            androidx.media3.common.d0.b bVarG = p0Var2.f9318a.g(p0Var2.f9328k.f9519a, this.f9753n);
            long jD = bVarG.d(this.f9744g0.f9328k.f9520b);
            j8 = jD == Long.MIN_VALUE ? bVarG.f8190d : jD;
        }
        p0 p0Var3 = this.f9744g0;
        androidx.media3.common.d0 d0Var = p0Var3.f9318a;
        Object obj = p0Var3.f9328k.f9519a;
        androidx.media3.common.d0.b bVar = this.f9753n;
        d0Var.g(obj, bVar);
        return fa.z.Y(j8 + bVar.f8191e);
    }

    @Override // androidx.media3.common.z
    public final long getContentPosition() {
        E();
        return o(this.f9744g0);
    }

    @Override // androidx.media3.common.z
    public final int getCurrentAdGroupIndex() {
        E();
        if (isPlayingAd()) {
            return this.f9744g0.f9319b.f9520b;
        }
        return -1;
    }

    @Override // androidx.media3.common.z
    public final int getCurrentAdIndexInAdGroup() {
        E();
        if (isPlayingAd()) {
            return this.f9744g0.f9319b.f9521c;
        }
        return -1;
    }

    @Override // androidx.media3.common.z
    public final ea.b getCurrentCues() {
        E();
        return this.f9732a0;
    }

    @Override // androidx.media3.common.z
    public final int getCurrentMediaItemIndex() {
        E();
        int iQ = q(this.f9744g0);
        if (iQ == -1) {
            return 0;
        }
        return iQ;
    }

    @Override // androidx.media3.common.z
    public final int getCurrentPeriodIndex() {
        E();
        if (this.f9744g0.f9318a.p()) {
            return 0;
        }
        p0 p0Var = this.f9744g0;
        return p0Var.f9318a.b(p0Var.f9319b.f9519a);
    }

    @Override // androidx.media3.common.z
    public final long getCurrentPosition() {
        E();
        return fa.z.Y(p(this.f9744g0));
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.d0 getCurrentTimeline() {
        E();
        return this.f9744g0.f9318a;
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.v getMediaMetadata() {
        E();
        return this.O;
    }

    @Override // androidx.media3.common.z
    public final boolean getPlayWhenReady() {
        E();
        return this.f9744g0.f9329l;
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.y getPlaybackParameters() {
        E();
        return this.f9744g0.f9332o;
    }

    @Override // androidx.media3.common.z
    public final int getPlaybackState() {
        E();
        return this.f9744g0.f9322e;
    }

    @Override // androidx.media3.common.z
    public final int getPlaybackSuppressionReason() {
        E();
        return this.f9744g0.f9331n;
    }

    @Override // androidx.media3.common.z
    public final int getRepeatMode() {
        E();
        return this.F;
    }

    @Override // androidx.media3.common.z
    public final long getSeekBackIncrement() {
        E();
        return this.f9760u;
    }

    @Override // androidx.media3.common.z
    public final long getSeekForwardIncrement() {
        E();
        return this.f9761v;
    }

    @Override // androidx.media3.common.z
    public final boolean getShuffleModeEnabled() {
        E();
        return this.G;
    }

    @Override // androidx.media3.common.z
    public final long getTotalBufferedDuration() {
        E();
        return fa.z.Y(this.f9744g0.f9335r);
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.g0 getTrackSelectionParameters() {
        E();
        return this.f9745h.a();
    }

    @Override // androidx.media3.common.z
    public final androidx.media3.common.k0 getVideoSize() {
        E();
        return this.f9740e0;
    }

    @Override // androidx.media3.common.g
    public final void i(long j8, int i14, boolean z14) {
        E();
        if (i14 == -1) {
            return;
        }
        fa.a.a(i14 >= 0);
        androidx.media3.common.d0 d0Var = this.f9744g0.f9318a;
        if (d0Var.p() || i14 < d0Var.o()) {
            this.f9757r.notifySeekStarted();
            this.H++;
            if (isPlayingAd()) {
                fa.k.g("seekTo ignored because an ad is playing");
                z.d dVar = new z.d(this.f9744g0);
                dVar.a(1);
                v vVar = this.f9749j.f9692a;
                vVar.f9747i.post(new ab.j(11, vVar, dVar));
                return;
            }
            p0 p0VarG = this.f9744g0;
            int i15 = p0VarG.f9322e;
            if (i15 == 3 || (i15 == 4 && !d0Var.p())) {
                p0VarG = this.f9744g0.g(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            p0 p0VarS = s(p0VarG, d0Var, t(d0Var, i14, j8));
            this.f9750k.f9893i.obtainMessage(3, new z.g(d0Var, i14, fa.z.O(j8))).b();
            C(p0VarS, 0, true, 1, p(p0VarS), currentMediaItemIndex, z14);
        }
    }

    @Override // androidx.media3.common.z
    public final boolean isPlayingAd() {
        E();
        return this.f9744g0.f9319b.b();
    }

    public final androidx.media3.common.v l() {
        androidx.media3.common.d0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.f9742f0;
        }
        androidx.media3.common.t tVar = currentTimeline.m(getCurrentMediaItemIndex(), this.f8225a, 0L).f8198c;
        androidx.media3.common.v vVar = this.f9742f0;
        vVar.getClass();
        androidx.media3.common.v.b bVar = new androidx.media3.common.v.b();
        androidx.media3.common.v vVar2 = tVar.f8441d;
        if (vVar2 != null) {
            ImmutableList<String> immutableList = vVar2.A;
            byte[] bArr = vVar2.f8527f;
            CharSequence charSequence = vVar2.f8522a;
            if (charSequence != null) {
                bVar.f8548a = charSequence;
            }
            CharSequence charSequence2 = vVar2.f8523b;
            if (charSequence2 != null) {
                bVar.f8549b = charSequence2;
            }
            CharSequence charSequence3 = vVar2.f8524c;
            if (charSequence3 != null) {
                bVar.f8550c = charSequence3;
            }
            CharSequence charSequence4 = vVar2.f8525d;
            if (charSequence4 != null) {
                bVar.f8551d = charSequence4;
            }
            CharSequence charSequence5 = vVar2.f8526e;
            if (charSequence5 != null) {
                bVar.f8552e = charSequence5;
            }
            if (bArr != null) {
                Integer num = vVar2.f8528g;
                bVar.f8553f = bArr == null ? null : (byte[]) bArr.clone();
                bVar.f8554g = num;
            }
            Integer num2 = vVar2.f8529h;
            if (num2 != null) {
                bVar.f8555h = num2;
            }
            Integer num3 = vVar2.f8530i;
            if (num3 != null) {
                bVar.f8556i = num3;
            }
            Integer num4 = vVar2.f8531j;
            if (num4 != null) {
                bVar.f8557j = num4;
            }
            Boolean bool = vVar2.f8532k;
            if (bool != null) {
                bVar.f8558k = bool;
            }
            Integer num5 = vVar2.f8533l;
            if (num5 != null) {
                bVar.f8559l = num5;
            }
            Integer num6 = vVar2.f8534m;
            if (num6 != null) {
                bVar.f8559l = num6;
            }
            Integer num7 = vVar2.f8535n;
            if (num7 != null) {
                bVar.f8560m = num7;
            }
            Integer num8 = vVar2.f8536o;
            if (num8 != null) {
                bVar.f8561n = num8;
            }
            Integer num9 = vVar2.f8537p;
            if (num9 != null) {
                bVar.f8562o = num9;
            }
            Integer num10 = vVar2.f8538q;
            if (num10 != null) {
                bVar.f8563p = num10;
            }
            Integer num11 = vVar2.f8539r;
            if (num11 != null) {
                bVar.f8564q = num11;
            }
            CharSequence charSequence6 = vVar2.f8540s;
            if (charSequence6 != null) {
                bVar.f8565r = charSequence6;
            }
            CharSequence charSequence7 = vVar2.f8541t;
            if (charSequence7 != null) {
                bVar.f8566s = charSequence7;
            }
            CharSequence charSequence8 = vVar2.f8542u;
            if (charSequence8 != null) {
                bVar.f8567t = charSequence8;
            }
            Integer num12 = vVar2.f8543v;
            if (num12 != null) {
                bVar.f8568u = num12;
            }
            Integer num13 = vVar2.f8544w;
            if (num13 != null) {
                bVar.f8569v = num13;
            }
            CharSequence charSequence9 = vVar2.f8545x;
            if (charSequence9 != null) {
                bVar.f8570w = charSequence9;
            }
            CharSequence charSequence10 = vVar2.f8546y;
            if (charSequence10 != null) {
                bVar.f8571x = charSequence10;
            }
            Integer num14 = vVar2.f8547z;
            if (num14 != null) {
                bVar.f8572y = num14;
            }
            if (!immutableList.isEmpty()) {
                bVar.f8573z = ImmutableList.copyOf((Collection) immutableList);
            }
        }
        return new androidx.media3.common.v(bVar);
    }

    public final void m() {
        E();
        v();
        z(null);
        u(0, 0);
    }

    public final r0 n(r0.b bVar) {
        int iQ = q(this.f9744g0);
        androidx.media3.common.d0 d0Var = this.f9744g0.f9318a;
        if (iQ == -1) {
            iQ = 0;
        }
        fa.t tVar = this.f9763x;
        z zVar = this.f9750k;
        return new r0(zVar, bVar, d0Var, iQ, tVar, zVar.f9895k);
    }

    public final long o(p0 p0Var) {
        androidx.media3.exoplayer.source.j.b bVar = p0Var.f9319b;
        long j8 = p0Var.f9320c;
        androidx.media3.common.d0 d0Var = p0Var.f9318a;
        if (!bVar.b()) {
            return fa.z.Y(p(p0Var));
        }
        Object obj = p0Var.f9319b.f9519a;
        androidx.media3.common.d0.b bVar2 = this.f9753n;
        d0Var.g(obj, bVar2);
        if (j8 == C.TIME_UNSET) {
            return fa.z.Y(d0Var.m(q(p0Var), this.f8225a, 0L).f8207l);
        }
        return fa.z.Y(j8) + fa.z.Y(bVar2.f8191e);
    }

    public final long p(p0 p0Var) {
        if (p0Var.f9318a.p()) {
            return fa.z.O(this.f9748i0);
        }
        long j8 = p0Var.f9333p ? p0Var.j() : p0Var.f9336s;
        if (p0Var.f9319b.b()) {
            return j8;
        }
        androidx.media3.common.d0 d0Var = p0Var.f9318a;
        Object obj = p0Var.f9319b.f9519a;
        androidx.media3.common.d0.b bVar = this.f9753n;
        d0Var.g(obj, bVar);
        return j8 + bVar.f8191e;
    }

    @Override // androidx.media3.common.z
    public final void prepare() {
        E();
        boolean playWhenReady = getPlayWhenReady();
        int iD = this.B.d(playWhenReady, 2);
        B(playWhenReady, iD, iD == -1 ? 2 : 1);
        p0 p0Var = this.f9744g0;
        if (p0Var.f9322e != 1) {
            return;
        }
        p0 p0VarE = p0Var.e(null);
        p0 p0VarG = p0VarE.g(p0VarE.f9318a.p() ? 4 : 2);
        this.H++;
        this.f9750k.f9893i.obtainMessage(29).b();
        C(p0VarG, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final int q(p0 p0Var) {
        return p0Var.f9318a.p() ? this.f9746h0 : p0Var.f9318a.g(p0Var.f9319b.f9519a, this.f9753n).f8189c;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        String str;
        boolean z14;
        StringBuilder sb3 = new StringBuilder("Release ");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" [AndroidXMedia3/1.5.1] [");
        sb3.append(fa.z.f70075e);
        sb3.append("] [");
        HashSet<String> hashSet = androidx.media3.common.u.f8506a;
        synchronized (androidx.media3.common.u.class) {
            str = androidx.media3.common.u.f8507b;
        }
        sb3.append(str);
        sb3.append("]");
        fa.k.f(sb3.toString());
        E();
        this.A.a();
        this.C.getClass();
        this.D.getClass();
        e eVar = this.B;
        eVar.f8916c = null;
        eVar.a();
        eVar.c(0);
        z zVar = this.f9750k;
        synchronized (zVar) {
            if (zVar.I || !zVar.f9895k.getThread().isAlive()) {
                z14 = true;
            } else {
                zVar.f9893i.sendEmptyMessage(7);
                zVar.n0(new m(zVar, 6), zVar.f9908y);
                z14 = zVar.I;
            }
        }
        if (!z14) {
            this.f9751l.f(10, new androidx.core.view.j(17));
        }
        this.f9751l.e();
        this.f9747i.a();
        this.f9759t.b(this.f9757r);
        p0 p0Var = this.f9744g0;
        if (p0Var.f9333p) {
            this.f9744g0 = p0Var.a();
        }
        p0 p0VarG = this.f9744g0.g(1);
        this.f9744g0 = p0VarG;
        p0 p0VarB = p0VarG.b(p0VarG.f9319b);
        this.f9744g0 = p0VarB;
        p0VarB.f9334q = p0VarB.f9336s;
        this.f9744g0.f9335r = 0L;
        this.f9757r.f5();
        this.f9745h.d();
        v();
        Surface surface = this.Q;
        if (surface != null) {
            surface.release();
            this.Q = null;
        }
        this.f9732a0 = ea.b.f63585b;
    }

    public final p0 s(p0 p0Var, androidx.media3.common.d0 d0Var, Pair<Object, Long> pair) {
        fa.a.a(d0Var.p() || pair != null);
        androidx.media3.common.d0 d0Var2 = p0Var.f9318a;
        long jO = o(p0Var);
        p0 p0VarH = p0Var.h(d0Var);
        if (d0Var.p()) {
            androidx.media3.exoplayer.source.j.b bVar = p0.f9317u;
            long jO2 = fa.z.O(this.f9748i0);
            p0 p0VarB = p0VarH.c(bVar, jO2, jO2, jO2, 0L, sa.r.f158151d, this.f9733b, ImmutableList.of()).b(bVar);
            p0VarB.f9334q = p0VarB.f9336s;
            return p0VarB;
        }
        Object obj = p0VarH.f9319b.f9519a;
        boolean zEquals = obj.equals(pair.first);
        androidx.media3.exoplayer.source.j.b bVar2 = !zEquals ? new androidx.media3.exoplayer.source.j.b(pair.first) : p0VarH.f9319b;
        long jLongValue = ((Long) pair.second).longValue();
        long jO3 = fa.z.O(jO);
        if (!d0Var2.p()) {
            jO3 -= d0Var2.g(obj, this.f9753n).f8191e;
        }
        if (!zEquals || jLongValue < jO3) {
            androidx.media3.exoplayer.source.j.b bVar3 = bVar2;
            fa.a.d(!bVar3.b());
            p0 p0VarB2 = p0VarH.c(bVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? sa.r.f158151d : p0VarH.f9325h, !zEquals ? this.f9733b : p0VarH.f9326i, !zEquals ? ImmutableList.of() : p0VarH.f9327j).b(bVar3);
            p0VarB2.f9334q = jLongValue;
            return p0VarB2;
        }
        if (jLongValue != jO3) {
            androidx.media3.exoplayer.source.j.b bVar4 = bVar2;
            fa.a.d(!bVar4.b());
            long jMax = Math.max(0L, p0VarH.f9335r - (jLongValue - jO3));
            long j8 = p0VarH.f9334q;
            if (p0VarH.f9328k.equals(p0VarH.f9319b)) {
                j8 = jLongValue + jMax;
            }
            p0 p0VarC = p0VarH.c(bVar4, jLongValue, jLongValue, jLongValue, jMax, p0VarH.f9325h, p0VarH.f9326i, p0VarH.f9327j);
            p0VarC.f9334q = j8;
            return p0VarC;
        }
        int iB = d0Var.b(p0VarH.f9328k.f9519a);
        if (iB != -1 && d0Var.f(iB, this.f9753n, false).f8189c == d0Var.g(bVar2.f9519a, this.f9753n).f8189c) {
            return p0VarH;
        }
        d0Var.g(bVar2.f9519a, this.f9753n);
        boolean zB = bVar2.b();
        androidx.media3.common.d0.b bVar5 = this.f9753n;
        long jA = zB ? bVar5.a(bVar2.f9520b, bVar2.f9521c) : bVar5.f8190d;
        androidx.media3.exoplayer.source.j.b bVar6 = bVar2;
        p0 p0VarB3 = p0VarH.c(bVar6, p0VarH.f9336s, p0VarH.f9336s, p0VarH.f9321d, jA - p0VarH.f9336s, p0VarH.f9325h, p0VarH.f9326i, p0VarH.f9327j).b(bVar6);
        p0VarB3.f9334q = jA;
        return p0VarB3;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        E();
        w(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.z
    public final void setPlayWhenReady(boolean z14) {
        E();
        int iD = this.B.d(z14, getPlaybackState());
        B(z14, iD, iD == -1 ? 2 : 1);
    }

    @Override // androidx.media3.common.z
    public final void setRepeatMode(final int i14) {
        E();
        if (this.F != i14) {
            this.F = i14;
            this.f9750k.f9893i.obtainMessage(11, i14, 0).b();
            fa.j.a<androidx.media3.common.z.d> aVar = new fa.j.a() { // from class: androidx.media3.exoplayer.r
                @Override // fa.j.a
                public final void invoke(Object obj) {
                    int i15 = v.f9731j0;
                    ((androidx.media3.common.z.d) obj).onRepeatModeChanged(i14);
                }
            };
            fa.j<androidx.media3.common.z.d> jVar = this.f9751l;
            jVar.d(8, aVar);
            A();
            jVar.c();
        }
    }

    @Override // androidx.media3.common.z
    public final void setShuffleModeEnabled(boolean z14) {
        E();
        if (this.G != z14) {
            this.G = z14;
            this.f9750k.f9893i.obtainMessage(12, z14 ? 1 : 0, 0).b();
            s sVar = new s(z14, 0);
            fa.j<androidx.media3.common.z.d> jVar = this.f9751l;
            jVar.d(9, sVar);
            A();
            jVar.c();
        }
    }

    @Override // androidx.media3.common.z
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        E();
        if (surfaceView instanceof za.e) {
            v();
            z(surfaceView);
            y(surfaceView.getHolder());
            return;
        }
        boolean z14 = surfaceView instanceof ab.k;
        b bVar = this.f9764y;
        if (z14) {
            v();
            this.S = (ab.k) surfaceView;
            r0 r0VarN = n(this.f9765z);
            fa.a.d(!r0VarN.f9353i);
            r0VarN.f9349e = 10000;
            ab.k kVar = this.S;
            fa.a.d(true ^ r0VarN.f9353i);
            r0VarN.f9350f = kVar;
            r0VarN.c();
            this.S.f2479a.add(bVar);
            z(this.S.getVideoSurface());
            y(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        E();
        if (holder == null) {
            m();
            return;
        }
        v();
        this.T = true;
        this.R = holder;
        holder.addCallback(bVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            z(null);
            u(0, 0);
        } else {
            z(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            u(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.z
    public final void setVideoTextureView(TextureView textureView) {
        E();
        if (textureView == null) {
            m();
            return;
        }
        v();
        this.U = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            fa.k.g("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f9764y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            z(null);
            u(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            z(surface);
            this.Q = surface;
            u(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final Pair<Object, Long> t(androidx.media3.common.d0 d0Var, int i14, long j8) {
        if (d0Var.p()) {
            this.f9746h0 = i14;
            if (j8 == C.TIME_UNSET) {
                j8 = 0;
            }
            this.f9748i0 = j8;
            return null;
        }
        if (i14 == -1 || i14 >= d0Var.o()) {
            i14 = d0Var.a(this.G);
            j8 = fa.z.Y(d0Var.m(i14, this.f8225a, 0L).f8207l);
        }
        return d0Var.i(this.f8225a, this.f9753n, i14, fa.z.O(j8));
    }

    public final void u(final int i14, final int i15) {
        fa.s sVar = this.W;
        if (i14 == sVar.f70058a && i15 == sVar.f70059b) {
            return;
        }
        this.W = new fa.s(i14, i15);
        this.f9751l.f(24, new fa.j.a() { // from class: androidx.media3.exoplayer.q
            @Override // fa.j.a
            public final void invoke(Object obj) {
                int i16 = v.f9731j0;
                ((androidx.media3.common.z.d) obj).onSurfaceSizeChanged(i14, i15);
            }
        });
        w(2, 14, new fa.s(i14, i15));
    }

    public final void v() {
        ab.k kVar = this.S;
        b bVar = this.f9764y;
        if (kVar != null) {
            r0 r0VarN = n(this.f9765z);
            fa.a.d(!r0VarN.f9353i);
            r0VarN.f9349e = 10000;
            fa.a.d(!r0VarN.f9353i);
            r0VarN.f9350f = null;
            r0VarN.c();
            this.S.f2479a.remove(bVar);
            this.S = null;
        }
        TextureView textureView = this.U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                fa.k.g("SurfaceTextureListener already unset or replaced.");
            } else {
                this.U.setSurfaceTextureListener(null);
            }
            this.U = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.R = null;
        }
    }

    public final void w(int i14, int i15, Object obj) {
        for (t0 t0Var : this.f9743g) {
            if (i14 == -1 || t0Var.getTrackType() == i14) {
                r0 r0VarN = n(t0Var);
                fa.a.d(!r0VarN.f9353i);
                r0VarN.f9349e = i15;
                fa.a.d(!r0VarN.f9353i);
                r0VarN.f9350f = obj;
                r0VarN.c();
            }
        }
    }

    public final void x(List list) {
        E();
        q(this.f9744g0);
        getCurrentPosition();
        this.H++;
        ArrayList arrayList = this.f9754o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList.remove(i14);
            }
            this.L = this.L.cloneAndRemove(0, size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            o0.c cVar = new o0.c((androidx.media3.exoplayer.source.j) list.get(i15), this.f9755p);
            arrayList2.add(cVar);
            arrayList.add(i15, new d(cVar.f9311b, cVar.f9310a));
        }
        this.L = this.L.cloneAndInsert(0, arrayList2.size());
        s0 s0Var = new s0(arrayList, this.L);
        boolean zP = s0Var.p();
        int i16 = s0Var.f9358f;
        if (!zP && -1 >= i16) {
            throw new IllegalSeekPositionException(s0Var, -1, C.TIME_UNSET);
        }
        int iA = s0Var.a(this.G);
        p0 p0VarS = s(this.f9744g0, s0Var, t(s0Var, iA, C.TIME_UNSET));
        int i17 = p0VarS.f9322e;
        if (iA != -1 && i17 != 1) {
            i17 = (s0Var.p() || iA >= i16) ? 4 : 2;
        }
        p0 p0VarG = p0VarS.g(i17);
        this.f9750k.f9893i.obtainMessage(17, new z.a(arrayList2, this.L, iA, fa.z.O(C.TIME_UNSET), null)).b();
        C(p0VarG, 0, (this.f9744g0.f9319b.f9519a.equals(p0VarG.f9319b.f9519a) || this.f9744g0.f9318a.p()) ? false : true, 4, p(p0VarG), -1, false);
    }

    public final void y(SurfaceHolder surfaceHolder) {
        this.T = false;
        this.R = surfaceHolder;
        surfaceHolder.addCallback(this.f9764y);
        Surface surface = this.R.getSurface();
        if (surface == null || !surface.isValid()) {
            u(0, 0);
        } else {
            Rect surfaceFrame = this.R.getSurfaceFrame();
            u(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void z(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (t0 t0Var : this.f9743g) {
            if (t0Var.getTrackType() == 2) {
                r0 r0VarN = n(t0Var);
                fa.a.d(!r0VarN.f9353i);
                r0VarN.f9349e = 1;
                fa.a.d(true ^ r0VarN.f9353i);
                r0VarN.f9350f = obj;
                r0VarN.c();
                arrayList.add(r0VarN);
            }
        }
        Object obj2 = this.P;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r0) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z14 = true;
            }
            Object obj3 = this.P;
            Surface surface = this.Q;
            if (obj3 == surface) {
                surface.release();
                this.Q = null;
            }
        }
        this.P = obj;
        if (z14) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003);
            p0 p0Var = this.f9744g0;
            p0 p0VarB = p0Var.b(p0Var.f9319b);
            p0VarB.f9334q = p0VarB.f9336s;
            p0VarB.f9335r = 0L;
            p0 p0VarG = p0VarB.g(1);
            if (exoPlaybackExceptionCreateForUnexpected != null) {
                p0VarG = p0VarG.e(exoPlaybackExceptionCreateForUnexpected);
            }
            this.H++;
            this.f9750k.f9893i.obtainMessage(6).b();
            C(p0VarG, 0, false, 5, C.TIME_UNSET, -1, false);
        }
    }
}
