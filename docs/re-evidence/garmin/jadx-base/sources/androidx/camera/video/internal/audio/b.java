package androidx.camera.video.internal.audio;

import android.content.Context;
import b71.i;
import com.google.common.util.concurrent.ListenableFuture;
import g1.y;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.h;
import l0.j;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Boolean> f5930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f5932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f5933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f5935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1.c.a f5936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f5938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0.c f5939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b1.c<? extends y> f5940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.camera.video.internal.audio.a f5941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c1.b f5942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f5946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f5947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5948t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f5949u;

    public interface a {
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.b$b, reason: collision with other inner class name */
    public class C0078b implements AudioStream.a {
        public C0078b() {
        }
    }

    public enum c {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public b(c1.a aVar, Executor executor, Context context, androidx.camera.video.internal.audio.c cVar, long j8) throws AudioSourceAccessException {
        this.f5930b = new AtomicReference<>(null);
        this.f5931c = new AtomicBoolean(false);
        this.f5935g = c.CONFIGURED;
        this.f5936h = b1.c.a.INACTIVE;
        this.f5948t = 0L;
        h hVar = new h(executor);
        this.f5929a = hVar;
        this.f5934f = TimeUnit.MILLISECONDS.toNanos(j8);
        try {
            ((i) cVar).getClass();
            f fVar = new f(new d(aVar, context), aVar);
            this.f5932d = fVar;
            fVar.a(new C0078b(), hVar);
            this.f5933e = new g(aVar);
            this.f5949u = aVar.a();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e4) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e4);
        }
    }

    public final void a() {
        Executor executor = this.f5938j;
        a0.c cVar = this.f5939k;
        if (executor == null || cVar == null) {
            return;
        }
        boolean z14 = this.f5943o || this.f5945q;
        if (Objects.equals(this.f5930b.getAndSet(Boolean.valueOf(z14)), Boolean.valueOf(z14))) {
            return;
        }
        executor.execute(new a0.a(cVar, z14, 1));
    }

    public final void b(g1.i.a aVar) throws ExecutionException, InterruptedException {
        b1.c<? extends y> cVar = this.f5940l;
        b1.c.a aVar2 = null;
        if (cVar != null) {
            c1.b bVar = this.f5942n;
            Objects.requireNonNull(bVar);
            cVar.c(bVar);
            this.f5940l = null;
            this.f5942n = null;
            this.f5941m = null;
            this.f5936h = b1.c.a.INACTIVE;
            c();
        }
        if (aVar != null) {
            this.f5940l = aVar;
            this.f5942n = new c1.b(this, aVar);
            this.f5941m = new androidx.camera.video.internal.audio.a(this, aVar);
            try {
                ListenableFuture<b1.c.a> listenableFutureB = aVar.b();
                if (listenableFutureB.isDone()) {
                    aVar2 = listenableFutureB.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (aVar2 != null) {
                this.f5936h = aVar2;
                c();
            }
            this.f5940l.d(this.f5929a, this.f5942n);
        }
    }

    public final void c() {
        c cVar = this.f5935g;
        c cVar2 = c.STARTED;
        f fVar = this.f5932d;
        if (cVar != cVar2) {
            if (this.f5937i) {
                this.f5937i = false;
                fVar.stop();
                return;
            }
            return;
        }
        boolean z14 = this.f5936h == b1.c.a.ACTIVE;
        boolean z15 = !z14;
        Executor executor = this.f5938j;
        a0.c cVar3 = this.f5939k;
        if (executor != null && cVar3 != null && this.f5931c.getAndSet(z15) != z15) {
            executor.execute(new a0.c(cVar3, z15));
        }
        boolean z16 = this.f5937i;
        if (!z14) {
            if (z16) {
                this.f5937i = false;
                fVar.stop();
                return;
            }
            return;
        }
        if (z16) {
            return;
        }
        try {
            fVar.start();
            this.f5943o = false;
        } catch (AudioStream.AudioStreamException unused) {
            this.f5943o = true;
            this.f5933e.start();
            this.f5944p = System.nanoTime();
            a();
        }
        this.f5937i = true;
        b1.c<? extends y> cVar4 = this.f5940l;
        Objects.requireNonNull(cVar4);
        androidx.concurrent.futures.b.d dVarE = cVar4.e();
        androidx.camera.video.internal.audio.a aVar = this.f5941m;
        Objects.requireNonNull(aVar);
        j.a(dVarE, aVar, this.f5929a);
    }

    public b(c1.a aVar, Executor executor, Context context) {
        this(aVar, executor, context, new i(20), 3000L);
    }
}
