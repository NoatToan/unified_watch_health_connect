package z0;

import android.location.Location;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.p2;
import androidx.camera.core.impl.x1;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z1;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import b0.g1;
import b0.y0;
import com.google.auto.value.AutoValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements n0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Set<j> f200502h0 = Collections.unmodifiableSet(EnumSet.of(j.PENDING_RECORDING, j.PENDING_PAUSED));

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Set<j> f200503i0 = Collections.unmodifiableSet(EnumSet.of(j.CONFIGURING, j.IDLING, j.RESETTING, j.STOPPING, j.ERROR));

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final x f200504j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final p0 f200505k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final q f200506l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final l2 f200507m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final l2 f200508n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f200509o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f200510p0;
    public MediaMuxer A;
    public final x1<q> B;
    public androidx.camera.video.internal.audio.b C;
    public g1.r D;
    public en0.n E;
    public g1.r F;
    public en0.n G;
    public f H;
    public Uri I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public final long Q;
    public final long R;
    public int S;
    public Throwable T;
    public g1.g U;
    public final q0.a V;
    public Throwable W;
    public boolean X;
    public n0.a Y;
    public ScheduledFuture<?> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1<e0> f200511a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public m0 f200512a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1<Boolean> f200513b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public m0 f200514b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f200515c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public double f200516c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f200517d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f200518d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0.h f200519e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public b1.g f200520e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.l f200521f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f200522f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f200523g = new Object();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f200524g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f200525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f200526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f200527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x1<Range<Integer>> f200528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f200529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f200530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f200531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f200532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f200533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g1.g f200534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g1.g f200535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b1.i f200536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f200537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f200538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f200539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g1 f200540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x2 f200541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Surface f200542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Surface f200543z;

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.video.internal.audio.b f200544a;

        public a(a0 a0Var, androidx.camera.video.internal.audio.b bVar) {
            this.f200544a = bVar;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f200544a.hashCode()));
        }

        @Override // l0.c
        public final void onSuccess(Void r14) {
            String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f200544a.hashCode()));
        }
    }

    public class b implements g1.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.b.a f200545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f200546c;

        public b(androidx.concurrent.futures.b.a aVar, h hVar) {
            this.f200545b = aVar;
            this.f200546c = hVar;
        }

        @Override // g1.j
        public final void a(en0.n nVar) {
            a0.this.E = nVar;
        }

        @Override // g1.j
        public final void b() {
            this.f200545b.b(null);
        }

        @Override // g1.j
        public final void c(EncodeException encodeException) {
            this.f200545b.d(encodeException);
        }

        @Override // g1.j
        public final void d(g1.g gVar) throws Exception {
            a0 a0Var = a0.this;
            MediaMuxer mediaMuxer = a0Var.A;
            h hVar = this.f200546c;
            if (mediaMuxer != null) {
                try {
                    a0Var.B(gVar, hVar);
                    gVar.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        gVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            if (a0Var.f200533p) {
                gVar.close();
                return;
            }
            g1.g gVar2 = a0Var.U;
            if (gVar2 != null) {
                gVar2.close();
                a0Var.U = null;
            }
            if (!gVar.h2()) {
                g1.r rVar = a0Var.D;
                rVar.f74735i.execute(new g1.m(rVar, 0));
                gVar.close();
            } else {
                a0Var.U = gVar;
                if (a0Var.m() && a0Var.V.c()) {
                    return;
                }
                a0Var.w(hVar);
            }
        }
    }

    public class c implements androidx.camera.video.internal.audio.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k7.b f200548a;

        public c(k7.b bVar) {
            this.f200548a = bVar;
        }
    }

    public class d implements g1.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.b.a f200550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k7.b f200551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f200552d;

        public d(androidx.concurrent.futures.b.a aVar, k7.b bVar, h hVar) {
            this.f200550b = aVar;
            this.f200551c = bVar;
            this.f200552d = hVar;
        }

        @Override // g1.j
        public final void a(en0.n nVar) {
            a0.this.G = nVar;
        }

        @Override // g1.j
        public final void b() {
            this.f200550b.b(null);
        }

        @Override // g1.j
        public final void c(EncodeException encodeException) {
            if (a0.this.W == null) {
                this.f200551c.accept(encodeException);
            }
        }

        @Override // g1.j
        public final void d(g1.g gVar) throws Exception {
            a0 a0Var = a0.this;
            if (a0Var.H == f.DISABLED) {
                gVar.close();
                vb.h.q("Audio is not enabled but audio encoded data is being produced.");
                return;
            }
            MediaMuxer mediaMuxer = a0Var.A;
            h hVar = this.f200552d;
            if (mediaMuxer == null) {
                if (!a0Var.f200533p) {
                    a0Var.V.b(new g1.f(gVar));
                    if (a0Var.U != null) {
                        a0Var.w(hVar);
                    }
                }
                gVar.close();
                return;
            }
            try {
                a0Var.A(gVar, hVar);
                gVar.close();
            } catch (Throwable th3) {
                try {
                    gVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public class e implements l0.c<List<Void>> {
        public e() {
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            a0 a0Var = a0.this;
            k7.h.f(a0Var.f200532o != null, "In-progress recording shouldn't be null");
            if (a0Var.f200532o.k()) {
                return;
            }
            Objects.toString(th3);
            a0Var.i(a0Var.A == null ? 8 : 6, th3);
            throw null;
        }

        @Override // l0.c
        public final void onSuccess(List<Void> list) {
            a0 a0Var = a0.this;
            a0Var.i(a0Var.S, a0Var.T);
            throw null;
        }
    }

    public enum f {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0.f.b f200562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l2 f200563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l2 f200564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l2 f200565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f200566e;

        public g() {
            l2 l2Var = a0.f200507m0;
            this.f200563b = l2Var;
            this.f200564c = l2Var;
            this.f200565d = a0.f200508n0;
            this.f200566e = -1L;
            this.f200562a = q.a();
        }
    }

    @AutoValue
    public static abstract class h implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0.d f200567a = j0.d.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f200568b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<a> f200569c = new AtomicReference<>(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<k7.b<Uri>> f200570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f200571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final x1<Boolean> f200572f;

        public interface a {
            MediaMuxer get();
        }

        public h() {
            new AtomicReference(null);
            this.f200570d = new AtomicReference<>(new y0(6));
            this.f200571e = new AtomicBoolean(false);
            this.f200572f = x1.g(Boolean.FALSE);
        }

        public final void a(Uri uri) {
            if (this.f200568b.get()) {
                c(this.f200570d.getAndSet(null), uri);
            }
        }

        public final void c(k7.b<Uri> bVar, Uri uri) {
            if (bVar != null) {
                this.f200567a.f95910a.close();
                bVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            a(Uri.EMPTY);
        }

        public abstract Executor e();

        public abstract k7.b<o0> f();

        public final void finalize() throws Throwable {
            try {
                this.f200567a.f95910a.a();
                k7.b<Uri> andSet = this.f200570d.getAndSet(null);
                if (andSet != null) {
                    c(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public abstract s j();

        public abstract boolean k();

        public final MediaMuxer l(int i14, j1.v vVar) throws IOException {
            if (!this.f200568b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            a andSet = this.f200569c.getAndSet(null);
            if (andSet == null) {
                com.nimbusds.jose.shaded.gson.internal.a.y(this, "One-time media muxer creation has already occurred for recording ");
                return null;
            }
            try {
                return andSet.get();
            } catch (RuntimeException e4) {
                throw new IOException("Failed to create MediaMuxer by " + e4, e4);
            }
        }

        public final void n(o0 o0Var, boolean z14) {
            int i14;
            s sVar = o0Var.f200701a;
            if (!sVar.equals(j())) {
                StringBuilder sb3 = new StringBuilder("Attempted to update event listener with event from incorrect recording [Recording: ");
                sb3.append(sVar);
                s sVarJ = j();
                sb3.append(", Expected: ");
                sb3.append(sVarJ);
                sb3.append("]");
                throw new AssertionError(sb3.toString());
            }
            if (z14) {
                "Sending VideoRecordEvent ".concat(o0Var.getClass().getSimpleName());
                if ((o0Var instanceof o0.a) && (i14 = ((o0.a) o0Var).f200702b) != 0) {
                    switch (i14) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            StringBuilder sb4 = new StringBuilder("Unknown(");
                            sb4.append(i14);
                            sb4.append(")");
                            break;
                    }
                }
            }
            boolean z15 = o0Var instanceof o0.d;
            x1<Boolean> x1Var = this.f200572f;
            if (z15 || (o0Var instanceof o0.c)) {
                x1Var.f(Boolean.TRUE);
            } else if ((o0Var instanceof o0.b) || (o0Var instanceof o0.a)) {
                x1Var.f(Boolean.FALSE);
            }
            if (e() == null || f() == null) {
                return;
            }
            try {
                e().execute(new vg1.d(24, this, o0Var));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g1 f200573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x2 f200574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f200575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f200576d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f200577e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ScheduledFuture<?> f200578f = null;

        public i(g1 g1Var, x2 x2Var, boolean z14, int i14) {
            this.f200573a = g1Var;
            this.f200574b = x2Var;
            a0.this.f200524g0 = z14;
            this.f200575c = i14;
        }
    }

    public enum j {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        /* JADX INFO: Fake field, exist only in values array */
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        x xVar = p0.f200705b;
        f200504j0 = xVar;
        l.b bVarA = p0.a();
        bVarA.c(xVar);
        bVarA.b(-1);
        l lVarA = bVarA.a();
        f200505k0 = lVarA;
        z0.f.b bVarA2 = q.a();
        bVarA2.f200623c = -1;
        bVarA2.f200621a = lVarA;
        f200506l0 = bVarA2.a();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f200507m0 = new l2(13);
        f200508n0 = new l2(14);
        new k0.h(k0.b.c());
        f200509o0 = 3;
        f200510p0 = 1000L;
    }

    public a0(Executor executor, q qVar, int i14, g1.l lVar, g1.l lVar2, b1.f fVar, long j8) {
        this.f200525h = e1.a.f61851a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f200528k = x1.g(null);
        this.f200529l = j.CONFIGURING;
        this.f200530m = null;
        this.f200531n = 0;
        this.f200532o = null;
        this.f200533p = false;
        this.f200534q = null;
        this.f200535r = null;
        this.f200536s = null;
        this.f200537t = new ArrayList();
        this.f200538u = null;
        this.f200539v = null;
        this.f200542y = null;
        this.f200543z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = f.INITIALIZING;
        this.I = Uri.EMPTY;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0L;
        this.R = 0L;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new q0.a(60);
        this.W = null;
        this.X = false;
        this.Y = n0.a.INACTIVE;
        this.Z = null;
        this.f200514b0 = null;
        this.f200516c0 = 0.0d;
        this.f200518d0 = null;
        this.f200520e0 = null;
        this.f200522f0 = Long.MAX_VALUE;
        this.f200524g0 = false;
        this.f200515c = executor;
        executor = executor == null ? k0.b.c() : executor;
        this.f200517d = executor;
        k0.h hVar = new k0.h(executor);
        this.f200519e = hVar;
        z0.f.b bVarE = qVar.e();
        if (qVar.d().b() == -1) {
            l.b bVarF = bVarE.b().f();
            bVarF.b(f200505k0.b());
            bVarE.f200621a = bVarF.a();
        }
        this.B = x1.g(bVarE.a());
        this.f200526i = i14;
        int i15 = this.f200531n;
        e0.a aVarL = l(this.f200529l);
        k kVar = e0.f200612a;
        this.f200511a = x1.g(new k(i15, aVarL, null));
        this.f200513b = x1.g(Boolean.FALSE);
        this.f200521f = lVar;
        this.f200512a0 = new m0(lVar, hVar, executor);
        j8 = j8 == -1 ? 52428800L : j8;
        this.f200527j = j8;
        h1.d.a(j8);
    }

    public static Object k(p2 p2Var) {
        try {
            return p2Var.b().get();
        } catch (InterruptedException | ExecutionException e4) {
            l2.p(e4);
            return null;
        }
    }

    public static e0.a l(j jVar) {
        return (jVar == j.RECORDING || (jVar == j.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) e1.a.f61851a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? e0.a.ACTIVE : e0.a.INACTIVE;
    }

    public static void o(g1.i iVar) {
        if (iVar instanceof g1.r) {
            g1.r rVar = (g1.r) iVar;
            rVar.f74735i.execute(new g1.m(rVar, 2));
        }
    }

    public final void A(g1.g gVar, h hVar) throws Exception {
        long size = gVar.size() + this.J;
        long j8 = this.Q;
        if (j8 != 0 && size > j8) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            p(hVar, 2, null);
            return;
        }
        long jA0 = gVar.a0();
        long j14 = this.N;
        if (j14 == Long.MAX_VALUE) {
            this.N = jA0;
            String.format("First audio time: %d (%s)", Long.valueOf(jA0), b1.d.b(this.N));
        } else {
            long jMin = jA0 - Math.min(this.M, j14);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jMin);
            k7.h.f(this.P != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jA0 - this.P) + nanos;
            long j15 = this.R;
            if (j15 != 0 && nanos2 > j15) {
                String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                p(hVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.f200538u.intValue(), gVar.i(), gVar.M());
            this.J = size;
            this.K = gVar.size() + this.K;
            this.P = jA0;
        } catch (IllegalStateException e4) {
            b1.g gVar2 = this.f200520e0;
            gVar2.getClass();
            p(hVar, gVar2.a() < this.f200527j ? 3 : 1, e4);
        }
    }

    public final void B(g1.g gVar, h hVar) throws Exception {
        long j8 = this.f200527j;
        if (this.f200539v == null) {
            vb.h.q("Video data comes before the track is added to MediaMuxer.");
            return;
        }
        long size = gVar.size() + this.J;
        long j14 = this.Q;
        long nanos = 0;
        if (j14 != 0 && size > j14) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            p(hVar, 2, null);
            return;
        }
        long jA0 = gVar.a0();
        long j15 = this.M;
        if (j15 == Long.MAX_VALUE) {
            this.M = jA0;
            String.format("First video time: %d (%s)", Long.valueOf(jA0), b1.d.b(this.M));
        } else {
            long jMin = jA0 - Math.min(j15, this.N);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jMin);
            k7.h.f(this.O != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jA0 - this.O) + nanos;
            long j16 = this.R;
            if (j16 != 0 && nanos2 > j16) {
                String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                p(hVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.f200539v.intValue(), gVar.i(), gVar.M());
            this.J = size;
            this.L = nanos;
            this.O = jA0;
            y(gVar.h2());
            if (size > this.f200522f0) {
                b1.g gVar2 = this.f200520e0;
                gVar2.getClass();
                long jA = gVar2.a();
                h1.d.a(jA);
                if (jA < j8) {
                    p(hVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(j8))));
                } else {
                    this.f200522f0 = jA - j8;
                }
            }
        } catch (IllegalStateException e4) {
            b1.g gVar3 = this.f200520e0;
            gVar3.getClass();
            p(hVar, gVar3.a() >= j8 ? 1 : 3, e4);
        }
    }

    @Override // z0.n0
    public final void a(g1 g1Var) {
        b(g1Var, x2.UPTIME, false);
    }

    @Override // z0.n0
    public final void b(g1 g1Var, x2 x2Var, boolean z14) {
        synchronized (this.f200523g) {
            try {
                Objects.toString(this.f200529l);
                if (this.f200529l == j.ERROR) {
                    v(j.CONFIGURING);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f200519e.execute(new bd0.c(this, g1Var, x2Var, z14, 3));
    }

    @Override // z0.n0
    public final f0 c(b0.r rVar, int i14) {
        return new c0(this.f200526i, (androidx.camera.core.impl.k0) rVar, i14 == 1 ? 2 : 1, g1.h0.f74714c);
    }

    @Override // z0.n0
    public final void d(n0.a aVar) {
        this.f200519e.execute(new vg1.d(22, this, aVar));
    }

    @Override // z0.n0
    public final z1<q> e() {
        return this.B;
    }

    @Override // z0.n0
    public final z1<e0> f() {
        return this.f200511a;
    }

    @Override // z0.n0
    public final z1<Boolean> g() {
        return this.f200513b;
    }

    public final void h(g1 g1Var, x2 x2Var, boolean z14) {
        u value;
        u uVar;
        if (g1Var.a()) {
            return;
        }
        g1Var.c(this.f200519e, new y(this));
        Size size = g1Var.f13906b;
        b0.b0 b0Var = g1Var.f13907c;
        c0 c0Var = (c0) c(g1Var.f13909e.b(), g1Var.f13911g);
        m mVarE = c0Var.e(b0Var);
        if (mVarE == null) {
            uVar = u.f200714g;
        } else {
            TreeMap<Size, u> treeMap = mVarE.f200673b;
            Size size2 = q0.c.f141971a;
            Map.Entry<Size, u> entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry<Size, u> entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            uVar = value;
            if (uVar == null) {
                uVar = u.f200714g;
            }
        }
        Objects.toString(uVar);
        Objects.toString(size);
        if (uVar != u.f200714g) {
            m mVarE2 = c0Var.e(b0Var);
            b1.i iVarA = mVarE2 == null ? null : mVarE2.a(uVar);
            this.f200536s = iVarA;
            if (iVarA == null) {
                vb.h.q("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                return;
            }
        }
        Objects.toString(this.f200536s);
        i iVar = this.f200518d0;
        if (iVar != null && !iVar.f200576d) {
            iVar.f200576d = true;
            ScheduledFuture<?> scheduledFuture = iVar.f200578f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                iVar.f200578f = null;
            }
        }
        i iVar2 = new i(g1Var, x2Var, this.f200524g0, z14 ? f200509o0 : 0);
        this.f200518d0 = iVar2;
        a0 a0Var = a0.this;
        Objects.toString(a0Var.D);
        m0 m0Var = a0Var.f200512a0;
        m0Var.a();
        l0.j.f(m0Var.f200685j).addListener(new uj2.b(iVar2, 11, iVar2.f200573a, iVar2.f200574b), a0Var.f200519e);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[LOOP:0: B:33:0x00c4->B:35:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:49:0x0101, B:52:0x0104, B:53:0x010b), top: B:58:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:49:0x0101, B:52:0x0104, B:53:0x010b), top: B:58:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void i(int i14, Throwable th3) {
        int i15;
        s sVarJ;
        z0.j jVarJ;
        z0.g gVar;
        boolean z14;
        o0.a aVar;
        h hVar;
        q0.a aVar2;
        int iOrdinal;
        if (this.f200532o == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.A;
        int i16 = 8;
        if (mediaMuxer == null) {
            if (i14 != 0) {
                i15 = i14;
            }
            this.f200532o.a(this.I);
            sVarJ = this.f200532o.j();
            jVarJ = j();
            Uri uri = this.I;
            k7.h.e(uri, "OutputUri cannot be null.");
            gVar = new z0.g(uri);
            h hVar2 = this.f200532o;
            if (i15 == 0) {
                aVar = new o0.a(sVarJ, jVarJ, gVar, 0, null);
            } else {
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                k7.h.b(z14, "An error type is required.");
                aVar = new o0.a(sVarJ, jVarJ, gVar, i15, th3);
            }
            hVar2.n(aVar, true);
            hVar = this.f200532o;
            this.f200532o = null;
            this.f200533p = false;
            this.f200538u = null;
            this.f200539v = null;
            this.f200537t.clear();
            this.I = Uri.EMPTY;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.M = Long.MAX_VALUE;
            this.N = Long.MAX_VALUE;
            this.O = Long.MAX_VALUE;
            this.P = Long.MAX_VALUE;
            this.S = 1;
            this.T = null;
            this.W = null;
            this.f200516c0 = 0.0d;
            this.f200520e0 = null;
            this.f200522f0 = Long.MAX_VALUE;
            aVar2 = this.V;
            while (!aVar2.c()) {
                aVar2.a();
            }
            t(null);
            iOrdinal = this.H.ordinal();
            if (iOrdinal != 2 || iOrdinal == 3) {
                s(f.IDLING);
                androidx.camera.video.internal.audio.b bVar = this.C;
                bVar.f5929a.execute(new a0.c(bVar, 25));
            } else if (iOrdinal == 4 || iOrdinal == 5) {
                s(f.INITIALIZING);
            }
            synchronized (this.f200523g) {
                if (hVar != null) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                throw null;
            }
        }
        try {
            mediaMuxer.stop();
            this.A.release();
        } catch (IllegalStateException e4) {
            e4.getMessage();
            if (i14 == 0) {
                b1.g gVar2 = this.f200520e0;
                gVar2.getClass();
                if (gVar2.a() < this.f200527j) {
                    i16 = 3;
                } else if (this.K != 0) {
                    i16 = 1;
                }
            }
            this.A = null;
            i15 = i16;
            this.f200532o.a(this.I);
            sVarJ = this.f200532o.j();
            jVarJ = j();
            Uri uri2 = this.I;
            k7.h.e(uri2, "OutputUri cannot be null.");
            gVar = new z0.g(uri2);
            h hVar3 = this.f200532o;
            if (i15 == 0) {
                aVar = new o0.a(sVarJ, jVarJ, gVar, 0, null);
            } else {
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                k7.h.b(z14, "An error type is required.");
                aVar = new o0.a(sVarJ, jVarJ, gVar, i15, th3);
            }
            hVar3.n(aVar, true);
            hVar = this.f200532o;
            this.f200532o = null;
            this.f200533p = false;
            this.f200538u = null;
            this.f200539v = null;
            this.f200537t.clear();
            this.I = Uri.EMPTY;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.M = Long.MAX_VALUE;
            this.N = Long.MAX_VALUE;
            this.O = Long.MAX_VALUE;
            this.P = Long.MAX_VALUE;
            this.S = 1;
            this.T = null;
            this.W = null;
            this.f200516c0 = 0.0d;
            this.f200520e0 = null;
            this.f200522f0 = Long.MAX_VALUE;
            aVar2 = this.V;
            while (!aVar2.c()) {
                aVar2.a();
            }
            t(null);
            iOrdinal = this.H.ordinal();
            if (iOrdinal != 2) {
                s(f.IDLING);
                androidx.camera.video.internal.audio.b bVar2 = this.C;
                bVar2.f5929a.execute(new a0.c(bVar2, 25));
            } else {
                s(f.IDLING);
                androidx.camera.video.internal.audio.b bVar3 = this.C;
                bVar3.f5929a.execute(new a0.c(bVar3, 25));
            }
            synchronized (this.f200523g) {
                try {
                    if (hVar != null) {
                        throw new AssertionError("Active recording did not match finalized recording on finalize.");
                    }
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        i16 = i14;
        this.A = null;
        i15 = i16;
        this.f200532o.a(this.I);
        sVarJ = this.f200532o.j();
        jVarJ = j();
        Uri uri3 = this.I;
        k7.h.e(uri3, "OutputUri cannot be null.");
        gVar = new z0.g(uri3);
        h hVar4 = this.f200532o;
        if (i15 == 0) {
            aVar = new o0.a(sVarJ, jVarJ, gVar, 0, null);
        } else {
            if (i15 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            k7.h.b(z14, "An error type is required.");
            aVar = new o0.a(sVarJ, jVarJ, gVar, i15, th3);
        }
        hVar4.n(aVar, true);
        hVar = this.f200532o;
        this.f200532o = null;
        this.f200533p = false;
        this.f200538u = null;
        this.f200539v = null;
        this.f200537t.clear();
        this.I = Uri.EMPTY;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.S = 1;
        this.T = null;
        this.W = null;
        this.f200516c0 = 0.0d;
        this.f200520e0 = null;
        this.f200522f0 = Long.MAX_VALUE;
        aVar2 = this.V;
        while (!aVar2.c()) {
            aVar2.a();
        }
        t(null);
        iOrdinal = this.H.ordinal();
        if (iOrdinal != 2) {
            s(f.IDLING);
            androidx.camera.video.internal.audio.b bVar4 = this.C;
            bVar4.f5929a.execute(new a0.c(bVar4, 25));
        } else {
            s(f.IDLING);
            androidx.camera.video.internal.audio.b bVar5 = this.C;
            bVar5.f5929a.execute(new a0.c(bVar5, 25));
        }
        synchronized (this.f200523g) {
            if (hVar != null) {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    public final z0.j j() {
        int i14;
        long j8 = this.L;
        long j14 = this.J;
        f fVar = this.H;
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i14 = 1;
        } else {
            int i15 = 2;
            if (iOrdinal != 2) {
                i14 = 3;
                if (iOrdinal != 3) {
                    i15 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            com.nimbusds.jose.shaded.gson.internal.a.y(fVar, "Invalid internal audio state: ");
                            return null;
                        }
                    }
                } else {
                    h hVar = this.f200532o;
                    if (hVar == null || !hVar.f200571e.get()) {
                        i14 = this.X ? i15 : 0;
                    } else {
                        i14 = 5;
                    }
                }
            } else {
                i14 = 1;
            }
        }
        Throwable th3 = this.W;
        double d14 = this.f200516c0;
        long j15 = this.K;
        Set<Integer> set = z0.b.f200589a;
        z0.d dVar = new z0.d(i14, d14, j15, th3);
        k7.h.b(j8 >= 0, "duration must be positive value.");
        k7.h.b(j14 >= 0, "bytes must be positive value.");
        return new z0.j(j8, j14, dVar);
    }

    public final boolean m() {
        return this.H == f.ENABLED;
    }

    public final boolean n() {
        h hVar = this.f200532o;
        return hVar != null && hVar.k();
    }

    public final void p(h hVar, int i14, Exception exc) throws Exception {
        Throwable th3;
        if (hVar != this.f200532o) {
            vb.h.q("Internal error occurred on recording that is not the current in-progress recording.");
            return;
        }
        synchronized (this.f200523g) {
            try {
                try {
                    boolean z14 = false;
                    switch (this.f200529l) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f200529l);
                        case RECORDING:
                        case PAUSED:
                            try {
                                v(j.STOPPING);
                                z14 = true;
                                break;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (hVar != null) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z14) {
                                x(hVar, -1L, i14, exc);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void q(boolean z14) throws Exception {
        boolean z15;
        boolean z16;
        synchronized (this.f200523g) {
            try {
                z15 = true;
                z16 = false;
                switch (this.f200529l) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        z(j.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        k7.h.f(this.f200532o != null, "In-progress recording shouldn't be null when in state " + this.f200529l);
                        if (this.f200532o != null) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!n()) {
                            v(j.RESETTING);
                            z16 = true;
                            z15 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        v(j.RESETTING);
                        z15 = false;
                        break;
                    case RESETTING:
                    default:
                        z15 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z15) {
            if (z16) {
                x(this.f200532o, -1L, 4, null);
                return;
            }
            return;
        }
        if (z14) {
            r();
            return;
        }
        g1.r rVar = this.F;
        if (rVar != null) {
            rVar.g();
            this.F = null;
            this.G = null;
        }
        if (this.C != null) {
            androidx.camera.video.internal.audio.b bVar = this.C;
            if (bVar != null) {
                this.C = null;
                String.format("Releasing audio source: 0x%x", Integer.valueOf(bVar.hashCode()));
                androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
                androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
                aVar.f6080b = dVar;
                aVar.f6079a = v.h.class;
                try {
                    bVar.f5929a.execute(new ab.j(26, bVar, aVar));
                    aVar.f6079a = "AudioSource-release";
                } catch (Exception e4) {
                    dVar.a(e4);
                }
                l0.j.a(dVar, new a(this, bVar), k0.b.a());
            } else {
                vb.h.q("Cannot release null audio source.");
            }
        }
        s(f.INITIALIZING);
        r();
    }

    public final void r() {
        g1 g1Var;
        g1.r rVar = this.D;
        boolean z14 = true;
        if (rVar != null) {
            m0 m0Var = this.f200514b0;
            if (m0Var != null) {
                k7.h.f(m0Var.f200679d == rVar, null);
                Objects.toString(this.D);
                this.f200514b0.b();
                this.f200514b0 = null;
                this.D = null;
                this.E = null;
                u(null);
            } else {
                Objects.toString(rVar);
                m0 m0Var2 = this.f200512a0;
                m0Var2.a();
                l0.j.f(m0Var2.f200685j);
            }
        }
        synchronized (this.f200523g) {
            try {
                switch (this.f200529l.ordinal()) {
                    case 1:
                    case 2:
                        z(j.CONFIGURING);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (n()) {
                            z14 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        v(j.CONFIGURING);
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z14 || (g1Var = this.f200540w) == null || g1Var.a()) {
            return;
        }
        h(this.f200540w, this.f200541x, false);
    }

    public final void s(f fVar) {
        Objects.toString(this.H);
        Objects.toString(fVar);
        this.H = fVar;
    }

    public final void t(g1.g gVar) {
        Objects.toString(gVar);
        this.f200534q = gVar;
        synchronized (this.f200523g) {
            x1<e0> x1Var = this.f200511a;
            int i14 = this.f200531n;
            e0.a aVarL = l(this.f200529l);
            k kVar = e0.f200612a;
            x1Var.f(new k(i14, aVarL, gVar));
        }
    }

    public final void u(Surface surface) {
        int iHashCode;
        if (this.f200542y == surface) {
            return;
        }
        this.f200542y = surface;
        synchronized (this.f200523g) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th3) {
                    throw th3;
                }
            } else {
                iHashCode = 0;
            }
            if (this.f200531n != iHashCode) {
                this.f200531n = iHashCode;
                x1<e0> x1Var = this.f200511a;
                e0.a aVarL = l(this.f200529l);
                g1.g gVar = this.f200534q;
                k kVar = e0.f200612a;
                x1Var.f(new k(iHashCode, aVarL, gVar));
            }
        }
    }

    public final void v(j jVar) {
        j jVar2 = this.f200529l;
        if (jVar2 == jVar) {
            throw new AssertionError("Attempted to transition to state " + jVar + ", but Recorder is already in state " + jVar);
        }
        Objects.toString(jVar2);
        Objects.toString(jVar);
        Set<j> set = f200502h0;
        e0.a aVarL = null;
        if (set.contains(jVar)) {
            if (!set.contains(this.f200529l)) {
                boolean zContains = f200503i0.contains(this.f200529l);
                j jVar3 = this.f200529l;
                if (!zContains) {
                    com.nimbusds.jose.shaded.gson.internal.a.y(jVar3, "Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    return;
                } else {
                    this.f200530m = jVar3;
                    aVarL = l(jVar3);
                }
            }
        } else if (this.f200530m != null) {
            this.f200530m = null;
        }
        this.f200529l = jVar;
        if (aVarL == null) {
            aVarL = l(jVar);
        }
        int i14 = this.f200531n;
        g1.g gVar = this.f200534q;
        k kVar = e0.f200612a;
        this.f200511a.f(new k(i14, aVarL, gVar));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    public final void w(h hVar) throws Exception {
        String message;
        q0.a aVar = this.V;
        if (this.A != null) {
            vb.h.q("Unable to set up media muxer when one already exists.");
            return;
        }
        if (m() && aVar.c()) {
            vb.h.q("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            return;
        }
        g1.g gVar = this.U;
        if (gVar == null) {
            vb.h.q("Media muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            this.U = null;
            long jA0 = gVar.a0();
            ArrayList arrayList = new ArrayList();
            while (!aVar.c()) {
                g1.g gVar2 = (g1.g) aVar.a();
                if (gVar2.a0() >= jA0) {
                    arrayList.add(gVar2);
                }
            }
            long size = gVar.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((g1.g) it.next()).size();
            }
            long j8 = this.Q;
            int i14 = 2;
            if (j8 != 0 && size > j8) {
                String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
                p(hVar, 2, null);
                gVar.close();
                return;
            }
            int i15 = 3;
            int i16 = 5;
            try {
                q qVar = (q) k(this.B);
                if (qVar.c() == -1) {
                    b1.i iVar = this.f200536s;
                    int i17 = f200506l0.c() != 1 ? 0 : 1;
                    if (iVar != null) {
                        int i18 = ((b1.a) iVar).f14183b;
                        if (i18 != 1) {
                            if (i18 == 2) {
                                i14 = 0;
                            } else if (i18 != 9) {
                                i14 = i17;
                            } else {
                                i14 = 1;
                            }
                        }
                        try {
                            gVar.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                    i14 = i17;
                } else if (qVar.c() != 1) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                MediaMuxer mediaMuxerL = hVar.l(i14, new j1.v(this, i16));
                g1.g gVar3 = this.f200535r;
                if (gVar3 != null) {
                    t(gVar3);
                    mediaMuxerL.setOrientationHint(gVar3.b());
                }
                Location locationA = hVar.j().f200707a.a();
                if (locationA != null) {
                    try {
                        double latitude = locationA.getLatitude();
                        double longitude = locationA.getLongitude();
                        if (e1.a.f61851a.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
                            if (latitude < 0.0d) {
                                latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                            if (longitude < 0.0d) {
                                longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                        }
                        Pair pairCreate = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                        mediaMuxerL.setLocation((float) ((Double) pairCreate.first).doubleValue(), (float) ((Double) pairCreate.second).doubleValue());
                    } catch (IllegalArgumentException e4) {
                        mediaMuxerL.release();
                        p(hVar, 5, e4);
                        gVar.close();
                        return;
                    }
                }
                MediaFormat mediaFormat = (MediaFormat) this.E.f64713b;
                int i19 = g1.r.d.f74768m;
                this.f200539v = Integer.valueOf(mediaMuxerL.addTrack(mediaFormat));
                if (m()) {
                    this.f200538u = Integer.valueOf(mediaMuxerL.addTrack((MediaFormat) this.G.f64713b));
                }
                try {
                    mediaMuxerL.start();
                    this.A = mediaMuxerL;
                    B(gVar, hVar);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        A((g1.g) it3.next(), hVar);
                    }
                    gVar.close();
                } catch (IllegalStateException e14) {
                    b1.g gVar4 = this.f200520e0;
                    gVar4.getClass();
                    if (gVar4.a() >= this.f200527j) {
                        i15 = 1;
                    }
                    p(hVar, i15, e14);
                    gVar.close();
                }
            } catch (IOException e15) {
                int i24 = h1.d.f80738a;
                if (!(e15 instanceof FileNotFoundException) || (message = e15.getMessage()) == null || !d53.w.z(message, "No space left on device", false)) {
                    i15 = 5;
                }
                p(hVar, i15, e15);
                gVar.close();
            }
        } catch (Throwable th4) {
            gVar.close();
            throw th4;
        }
    }

    public final void x(h hVar, long j8, int i14, Throwable th3) throws Exception {
        if (this.f200532o != hVar || this.f200533p) {
            return;
        }
        this.f200533p = true;
        this.S = i14;
        this.T = th3;
        if (m()) {
            while (true) {
                q0.a aVar = this.V;
                if (aVar.c()) {
                    break;
                } else {
                    aVar.a();
                }
            }
            this.F.o(j8);
        }
        g1.g gVar = this.U;
        if (gVar != null) {
            gVar.close();
            this.U = null;
        }
        n0.a aVar2 = this.Y;
        n0.a aVar3 = n0.a.ACTIVE_NON_STREAMING;
        g1.r rVar = this.D;
        if (aVar2 != aVar3) {
            this.Z = k0.b.d().schedule(new vg1.d(23, this.f200519e, new v.b0(rVar, 28)), 1000L, TimeUnit.MILLISECONDS);
        } else {
            o(rVar);
        }
        this.D.o(j8);
    }

    public final void y(boolean z14) {
        h hVar = this.f200532o;
        if (hVar != null) {
            hVar.n(new o0.e(hVar.j(), j()), z14);
        }
    }

    public final void z(j jVar) {
        if (!f200502h0.contains(this.f200529l)) {
            o2.c.l(this.f200529l, "Can only updated non-pending state from a pending state, but state is ");
            return;
        }
        if (!f200503i0.contains(jVar)) {
            com.nimbusds.jose.shaded.gson.internal.a.y(jVar, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
            return;
        }
        if (this.f200530m != jVar) {
            this.f200530m = jVar;
            int i14 = this.f200531n;
            e0.a aVarL = l(jVar);
            g1.g gVar = this.f200534q;
            k kVar = e0.f200612a;
            this.f200511a.f(new k(i14, aVarL, gVar));
        }
    }
}
