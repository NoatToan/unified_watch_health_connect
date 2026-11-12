package g1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z1;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class r implements i {
    public static final Range<Long> H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public ScheduledFuture G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74727a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f74730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaFormat f74731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaCodec f74732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.b f74733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f74734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0.h f74735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListenableFuture<Void> f74736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f74737k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x2 f74743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f74744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rational f74745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f74746t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f74749w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f74728b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f74738l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f74739m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f74740n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashSet f74741o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f74742p = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f74747u = j.f74716a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Executor f74748v = k0.b.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Range<Long> f74750x = H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f74751y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74752z = false;
    public Long A = null;
    public ScheduledFuture B = null;
    public d C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public class a extends z {
        public a(MediaCodec mediaCodec, int i14) {
            super(mediaCodec, i14);
        }

        @Override // g1.z, g1.y
        public final void b(long j8) {
            r rVar = r.this;
            if (!rVar.f74729c) {
                j8 = rVar.q(j8);
            }
            super.b(j8);
        }
    }

    public class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f74754a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b1.c.a f74755b = b1.c.a.INACTIVE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f74756c = new ArrayList();

        public b() {
        }

        @Override // androidx.camera.core.impl.z1
        public final ListenableFuture<b1.c.a> b() {
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                r.this.f74735i.execute(new t(this, aVar, 0));
                aVar.f6079a = "fetchData";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            return dVar;
        }

        @Override // androidx.camera.core.impl.z1
        public final void c(z1.a<? super b1.c.a> aVar) {
            r.this.f74735i.execute(new df.d(14, this, aVar));
        }

        @Override // androidx.camera.core.impl.z1
        public final void d(Executor executor, z1.a<? super b1.c.a> aVar) {
            r.this.f74735i.execute(new fh2.a(this, 2, aVar, executor));
        }

        @Override // b1.c
        public final androidx.concurrent.futures.b.d e() {
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                r.this.f74735i.execute(new t(this, aVar, 1));
                aVar.f6079a = "acquireBuffer";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            return dVar;
        }

        public final void f(boolean z14) {
            b1.c.a aVar = z14 ? b1.c.a.ACTIVE : b1.c.a.INACTIVE;
            if (this.f74755b == aVar) {
                return;
            }
            this.f74755b = aVar;
            if (aVar == b1.c.a.INACTIVE) {
                ArrayList arrayList = this.f74756c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f74754a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new df.d(16, entry, aVar));
                } catch (RejectedExecutionException unused) {
                    String str = r.this.f74727a;
                }
            }
        }
    }

    public enum c {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public class d extends MediaCodec.Callback {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int f74768m = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i1.f f74769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74771c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74772d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74773e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f74774f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f74775g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74776h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f74777i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f74778j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f74779k;

        public d() {
            this.f74770b = true;
            boolean z14 = r.this.f74729c;
            this.f74779k = z14;
            if (z14) {
                this.f74769a = new i1.f(r.this.f74744r, r.this.f74743q, (CameraUseInconsistentTimebaseQuirk) e1.a.f61851a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f74769a = null;
            }
            if (((CodecStuckOnFlushQuirk) e1.a.f61851a.b(CodecStuckOnFlushQuirk.class)) == null || !MimeTypes.VIDEO_MP4V.equals(r.this.f74731e.getString("mime"))) {
                return;
            }
            this.f74770b = false;
        }

        public final void a() {
            r rVar;
            j jVar;
            Executor executor;
            r rVar2 = r.this;
            String str = rVar2.f74727a;
            if (this.f74773e) {
                return;
            }
            this.f74773e = true;
            ScheduledFuture scheduledFuture = rVar2.G;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                r.this.G = null;
            }
            synchronized (r.this.f74728b) {
                rVar = r.this;
                jVar = rVar.f74747u;
                executor = rVar.f74748v;
            }
            rVar.p(new fh2.a(this, 3, executor, jVar));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            r.this.f74735i.execute(new df.d(17, this, codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i14) {
            r.this.f74735i.execute(new androidx.media3.exoplayer.d(this, i14, 5));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i14, MediaCodec.BufferInfo bufferInfo) {
            r.this.f74735i.execute(new com.garmin.android.apps.connectmobile.gfdi.protobuf.g(this, bufferInfo, mediaCodec, i14, 4));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            r rVar = r.this;
            String str = rVar.f74727a;
            Objects.toString(mediaFormat);
            b1.d.a(mediaFormat.getByteBuffer("csd-0"));
            if (mediaFormat.containsKey("csd-1")) {
                b1.d.a(mediaFormat.getByteBuffer("csd-1"));
            }
            if (mediaFormat.containsKey("csd-2")) {
                b1.d.a(mediaFormat.getByteBuffer("csd-2"));
            }
            rVar.f74735i.execute(new df.d(18, this, mediaFormat));
        }
    }

    public class e implements i.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Surface f74782b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p62.e f74784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f74785e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f74781a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f74783c = new HashSet();

        public e() {
        }

        @Override // g1.i.c
        public final void a(Executor executor, p62.e eVar) {
            Surface surface;
            synchronized (this.f74781a) {
                this.f74784d = eVar;
                executor.getClass();
                this.f74785e = executor;
                surface = this.f74782b;
            }
            if (surface != null) {
                try {
                    executor.execute(new df.d(21, eVar, surface));
                } catch (RejectedExecutionException unused) {
                    String str = r.this.f74727a;
                }
            }
        }
    }

    public r(Executor executor, k kVar, int i14) throws InvalidConfigException {
        boolean z14 = false;
        executor.getClass();
        kVar.getClass();
        this.f74730d = kVar;
        LruCache<String, MediaCodecInfo> lruCache = h1.a.f80732a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(kVar.a());
            this.f74732f = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.f74735i = new k0.h(executor);
            MediaFormat mediaFormatC = kVar.c();
            this.f74731e = mediaFormatC;
            x2 x2VarB = kVar.b();
            this.f74743q = x2VarB;
            this.f74744r = new s(new en0.n(this, 19), new b0());
            if (kVar instanceof g1.a) {
                g1.a aVar = (g1.a) kVar;
                this.f74727a = "AudioEncoder";
                this.f74729c = false;
                this.f74733g = new b();
                this.f74734h = new g1.b(codecInfo, kVar.a());
                this.f74745s = new Rational(aVar.e(), aVar.g());
            } else {
                if (!(kVar instanceof d0)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                d0 d0Var = (d0) kVar;
                this.f74727a = "VideoEncoder";
                this.f74729c = true;
                this.f74733g = new e();
                h0 h0Var = new h0(codecInfo, kVar.a());
                if (mediaFormatC.containsKey("bitrate")) {
                    int integer = mediaFormatC.getInteger("bitrate");
                    int iIntValue = ((Integer) h0Var.f74715b.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatC.setInteger("bitrate", iIntValue);
                    }
                }
                this.f74734h = h0Var;
                this.f74745s = new Rational(d0Var.f(), d0Var.i());
            }
            Objects.toString(x2VarB);
            Objects.toString(mediaFormatC);
            Objects.toString(this.f74745s);
            try {
                j();
                AtomicReference atomicReference = new AtomicReference();
                androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
                androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
                aVar2.f6080b = dVar;
                aVar2.f6079a = v.h.class;
                try {
                    atomicReference.set(aVar2);
                    aVar2.f6079a = "mReleasedFuture";
                } catch (Exception e4) {
                    dVar.a(e4);
                }
                this.f74736j = l0.j.f(dVar);
                androidx.concurrent.futures.b.a<Void> aVar3 = (androidx.concurrent.futures.b.a) atomicReference.get();
                aVar3.getClass();
                this.f74737k = aVar3;
                if (this.f74729c && i14 == 1 && e1.a.f61851a.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                    z14 = true;
                }
                this.f74746t = z14;
                l(c.CONFIGURED);
            } catch (MediaCodec.CodecException e14) {
                throw new InvalidConfigException(e14);
            }
        } catch (IOException | IllegalArgumentException e15) {
            throw new InvalidConfigException(e15);
        }
    }

    public final ListenableFuture<y> a() {
        switch (this.f74749w) {
            case CONFIGURED:
                IllegalStateException illegalStateException = new IllegalStateException("Encoder is not started yet.");
                l0.j.a aVar = l0.j.f107810a;
                return new l0.m.a(illegalStateException);
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                AtomicReference atomicReference = new AtomicReference();
                androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
                androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
                aVar2.f6080b = dVar;
                aVar2.f6079a = v.h.class;
                try {
                    atomicReference.set(aVar2);
                    aVar2.f6079a = "acquireInputBuffer";
                    break;
                } catch (Exception e4) {
                    dVar.a(e4);
                }
                androidx.concurrent.futures.b.a aVar3 = (androidx.concurrent.futures.b.a) atomicReference.get();
                aVar3.getClass();
                this.f74739m.offer(aVar3);
                aVar3.a(new df.d(13, this, aVar3), this.f74735i);
                d();
                return dVar;
            case ERROR:
                IllegalStateException illegalStateException2 = new IllegalStateException("Encoder is in error state.");
                l0.j.a aVar4 = l0.j.f107810a;
                return new l0.m.a(illegalStateException2);
            case RELEASED:
                IllegalStateException illegalStateException3 = new IllegalStateException("Encoder is released.");
                l0.j.a aVar5 = l0.j.f107810a;
                return new l0.m.a(illegalStateException3);
            default:
                androidx.room.a0.s(this.f74749w, "Unknown state: ");
                return null;
        }
    }

    public final void b(int i14, String str, Throwable th3) {
        switch (this.f74749w) {
            case CONFIGURED:
                e(i14, str, th3);
                j();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                l(c.ERROR);
                p(new com.garmin.android.apps.connectmobile.gfdi.protobuf.g(this, i14, str, th3, 3));
                break;
        }
    }

    public final boolean c() {
        Rational rational = this.f74745s;
        return true ^ (rational != null && rational.getDenominator() == rational.getNumerator());
    }

    public final void d() {
        while (true) {
            ArrayDeque arrayDeque = this.f74739m;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f74738l;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            androidx.concurrent.futures.b.a aVar = (androidx.concurrent.futures.b.a) arrayDeque.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                a aVar2 = new a(this.f74732f, num.intValue());
                if (aVar.b(aVar2)) {
                    this.f74740n.add(aVar2);
                    l0.j.f(aVar2.f74803d).addListener(new df.d(11, this, aVar2), this.f74735i);
                } else {
                    aVar2.cancel();
                }
            } catch (MediaCodec.CodecException e4) {
                b(1, e4.getMessage(), e4);
                return;
            }
        }
    }

    public final void e(int i14, String str, Throwable th3) {
        j jVar;
        Executor executor;
        synchronized (this.f74728b) {
            jVar = this.f74747u;
            executor = this.f74748v;
        }
        try {
            executor.execute(new com.garmin.android.apps.connectmobile.gfdi.protobuf.g(jVar, i14, str, th3, 2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void f() {
        this.f74735i.execute(new o(this, this.f74744r.b(), 0));
    }

    public final void g() {
        this.f74735i.execute(new m(this, 1));
    }

    public final void h() {
        Surface surface;
        HashSet hashSet;
        if (this.D) {
            if (!this.f74746t) {
                this.f74732f.stop();
            }
            this.D = false;
        }
        this.f74732f.release();
        i.b bVar = this.f74733g;
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            synchronized (eVar.f74781a) {
                surface = eVar.f74782b;
                eVar.f74782b = null;
                hashSet = new HashSet(eVar.f74783c);
                eVar.f74783c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        l(c.RELEASED);
        this.f74737k.b(null);
    }

    public final void i() {
        this.f74732f.setParameters(am.j.e(0, "request-sync"));
    }

    public final void j() {
        p62.e eVar;
        Executor executor;
        this.f74750x = H;
        this.f74751y = 0L;
        this.f74742p.clear();
        this.f74738l.clear();
        Iterator it = this.f74739m.iterator();
        while (it.hasNext()) {
            ((androidx.concurrent.futures.b.a) it.next()).c();
        }
        this.f74739m.clear();
        this.f74732f.reset();
        this.D = false;
        this.E = false;
        this.F = false;
        this.f74752z = false;
        ScheduledFuture scheduledFuture = this.B;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.B = null;
        }
        ScheduledFuture scheduledFuture2 = this.G;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.G = null;
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.f74778j = true;
        }
        d dVar2 = new d();
        this.C = dVar2;
        this.f74732f.setCallback(dVar2);
        this.f74732f.configure(this.f74731e, (Surface) null, (MediaCrypto) null, 1);
        i.b bVar = this.f74733g;
        if (bVar instanceof e) {
            e eVar2 = (e) bVar;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) e1.a.f61851a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (eVar2.f74781a) {
                Surface surface = eVar2.f74782b;
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (surface == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            eVar2.f74782b = surfaceCreateInputSurface;
                        }
                        r.this.f74732f.setInputSurface(eVar2.f74782b);
                    } else {
                        if (surface != null) {
                            eVar2.f74783c.add(surface);
                        }
                        surfaceCreateInputSurface = r.this.f74732f.createInputSurface();
                        eVar2.f74782b = surfaceCreateInputSurface;
                    }
                    eVar = eVar2.f74784d;
                    executor = eVar2.f74785e;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (surfaceCreateInputSurface == null || eVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new df.d(21, eVar, surfaceCreateInputSurface));
            } catch (RejectedExecutionException unused) {
                String str = r.this.f74727a;
            }
        }
    }

    public final void k(j jVar, k0.h hVar) {
        synchronized (this.f74728b) {
            this.f74747u = jVar;
            this.f74748v = hVar;
        }
    }

    public final void l(c cVar) {
        c cVar2 = this.f74749w;
        if (cVar2 == cVar) {
            return;
        }
        Objects.toString(cVar2);
        Objects.toString(cVar);
        this.f74749w = cVar;
    }

    public final void m() {
        i.b bVar = this.f74733g;
        if (bVar instanceof b) {
            ((b) bVar).f(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f74740n.iterator();
            while (it.hasNext()) {
                arrayList.add(((y) it.next()).d());
            }
            l0.j.i(arrayList).addListener(new m(this, 5), this.f74735i);
            return;
        }
        if (bVar instanceof e) {
            try {
                if (e1.a.f61851a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    d dVar = this.C;
                    k0.h hVar = this.f74735i;
                    ScheduledFuture scheduledFuture = this.G;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.G = k0.b.d().schedule(new df.d(12, hVar, dVar), 1000L, TimeUnit.MILLISECONDS);
                }
                this.f74732f.signalEndOfInputStream();
                this.F = true;
            } catch (MediaCodec.CodecException e4) {
                b(1, e4.getMessage(), e4);
            }
        }
    }

    public final void n() {
        this.f74735i.execute(new o(this, this.f74744r.b(), 1));
    }

    public final void o(final long j8) {
        final long jB = this.f74744r.b();
        this.f74735i.execute(new Runnable() { // from class: g1.n
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = this.f74719a;
                switch (rVar.f74749w) {
                    case CONFIGURED:
                    case STOPPING:
                    case ERROR:
                        break;
                    case STARTED:
                    case PAUSED:
                        r.c cVar = rVar.f74749w;
                        rVar.l(r.c.STOPPING);
                        Long l14 = (Long) rVar.f74750x.getLower();
                        long jLongValue = l14.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            vb.h.q("There should be a \"start\" before \"stop\"");
                        } else {
                            long j14 = j8;
                            if (j14 == -1 || j14 < jLongValue) {
                                j14 = jB;
                            }
                            if (j14 < jLongValue) {
                                vb.h.q("The start time should be before the stop time.");
                            } else {
                                rVar.f74750x = Range.create(l14, Long.valueOf(j14));
                                b1.d.b(j14);
                                if (cVar == r.c.PAUSED && rVar.A != null) {
                                    rVar.m();
                                } else {
                                    rVar.f74752z = true;
                                    rVar.B = k0.b.d().schedule(new m(rVar, 3), 1000L, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                        break;
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        rVar.l(r.c.CONFIGURED);
                        break;
                    case PENDING_RELEASE:
                    case RELEASED:
                        vb.h.z("Encoder is released");
                        break;
                    default:
                        androidx.room.a0.s(rVar.f74749w, "Unknown state: ");
                        break;
                }
            }
        });
    }

    public final void p(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f74741o;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(l0.j.f(((h) it.next()).f74711e));
        }
        HashSet hashSet2 = this.f74740n;
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            arrayList.add(((y) it3.next()).d());
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        l0.j.i(arrayList).addListener(new fh2.a(this, 1, arrayList, runnable), this.f74735i);
    }

    public final long q(long j8) {
        if (!c()) {
            return j8;
        }
        return Math.round(this.f74745s.doubleValue() * j8);
    }
}
