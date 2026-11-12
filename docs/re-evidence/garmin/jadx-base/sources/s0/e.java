package s0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b0.a0;
import b0.b0;
import b0.c1;
import b0.e1;
import b0.g1;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import po.g;
import r0.l;
import r0.q;
import v.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements q, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f155260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f155261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0.d f155262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f155263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f155264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f155265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f155266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f155267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f155268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f155269j;

    public e(b0 b0Var, Map<t0.d.e, l> map, a0 a0Var, a0 a0Var2) {
        this.f155264e = 0;
        this.f155265f = false;
        this.f155266g = new AtomicBoolean(false);
        this.f155267h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f155261b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f155263d = handler;
        this.f155262c = new k0.d(handler);
        this.f155260a = new c(a0Var, a0Var2);
        try {
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = h.class;
            try {
                try {
                    e(new at0.c(this, b0Var, map, aVar, 20), new ab2.a(9));
                    aVar.f6079a = "Init GlRenderer";
                } catch (Exception e4) {
                    e = e4;
                    try {
                        dVar.a(e);
                    } catch (RuntimeException e14) {
                        e = e14;
                        RuntimeException runtimeException = e;
                        release();
                        throw runtimeException;
                    }
                }
            } catch (Exception e15) {
                e = e15;
            }
            try {
                dVar.get();
            } catch (InterruptedException | ExecutionException e16) {
                Throwable cause = e16;
                cause = cause instanceof ExecutionException ? cause.getCause() : cause;
                if (!(cause instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", cause);
                }
                throw ((RuntimeException) cause);
            }
        } catch (RuntimeException e17) {
            e = e17;
        }
    }

    @Override // b0.d1
    public final void a(g1 g1Var) {
        if (this.f155266g.get()) {
            g1Var.d();
        } else {
            e(new r0.h(7, this, g1Var), new e1(g1Var, 1));
        }
    }

    @Override // b0.d1
    public final void b(c1 c1Var) throws IOException {
        if (this.f155266g.get()) {
            c1Var.close();
            return;
        }
        r0.h hVar = new r0.h(8, this, c1Var);
        Objects.requireNonNull(c1Var);
        e(hVar, new g(c1Var, 10));
    }

    public final void d() {
        if (this.f155265f && this.f155264e == 0) {
            LinkedHashMap linkedHashMap = this.f155267h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((c1) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.f155260a;
            if (cVar.f148726a.getAndSet(false)) {
                t0.d.c(cVar.f148728c);
                cVar.h();
            }
            cVar.f155256n = -1;
            cVar.f155257o = -1;
            this.f155261b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f155262c.execute(new fh2.a(this, 27, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f155266g.get() || (surfaceTexture2 = this.f155268i) == null || this.f155269j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f155269j.updateTexImage();
        for (Map.Entry entry : this.f155267h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            c1 c1Var = (c1) entry.getKey();
            if (c1Var.getFormat() == 34) {
                try {
                    this.f155260a.l(surfaceTexture.getTimestamp(), surface, c1Var, this.f155268i, this.f155269j);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // r0.q
    public final void release() {
        if (this.f155266g.getAndSet(true)) {
            return;
        }
        e(new g(this, 18), new ab2.a(9));
    }

    public e(b0 b0Var, a0 a0Var, a0 a0Var2) {
        this(b0Var, Collections.EMPTY_MAP, a0Var, a0Var2);
    }
}
