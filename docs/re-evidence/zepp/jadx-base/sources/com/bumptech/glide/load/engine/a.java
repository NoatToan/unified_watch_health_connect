package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private static final int i = 1;
    private final boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new C0119a());

    @VisibleForTesting
    public final Map<Key, d> c = new HashMap();
    private k.a d;

    @Nullable
    private ReferenceQueue<k<?>> e;

    @Nullable
    private Thread f;
    private volatile boolean g;

    @Nullable
    private volatile c h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class C0119a implements Handler.Callback {
        public C0119a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            a.this.c((d) message.obj);
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            a.this.b();
        }
    }

    @VisibleForTesting
    public interface c {
        void a();
    }

    @VisibleForTesting
    public static final class d extends WeakReference<k<?>> {
        public final Key a;
        public final boolean b;

        @Nullable
        public Resource<?> c;

        public d(@NonNull Key key, @NonNull k<?> kVar, @NonNull ReferenceQueue<? super k<?>> referenceQueue, boolean z) {
            super(kVar, referenceQueue);
            this.a = (Key) Preconditions.checkNotNull(key);
            this.c = (kVar.c() && z) ? (Resource) Preconditions.checkNotNull(kVar.b()) : null;
            this.b = kVar.c();
        }

        public void a() {
            this.c = null;
            clear();
        }
    }

    public a(boolean z) {
        this.a = z;
    }

    private ReferenceQueue<k<?>> f() {
        if (this.e == null) {
            this.e = new ReferenceQueue<>();
            Thread thread = new Thread(new b(), "glide-active-resources");
            this.f = thread;
            thread.start();
        }
        return this.e;
    }

    public void a(Key key, k<?> kVar) {
        d dVarPut = this.c.put(key, new d(key, kVar, f(), this.a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    public void b() {
        while (!this.g) {
            try {
                this.b.obtainMessage(1, (d) this.e.remove()).sendToTarget();
                c cVar = this.h;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@NonNull d dVar) {
        Resource<?> resource;
        Util.assertMainThread();
        this.c.remove(dVar.a);
        if (!dVar.b || (resource = dVar.c) == null) {
            return;
        }
        k<?> kVar = new k<>(resource, true, false);
        kVar.e(dVar.a, this.d);
        this.d.onResourceReleased(dVar.a, kVar);
    }

    public void d(Key key) {
        d dVarRemove = this.c.remove(key);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    @Nullable
    public k<?> e(Key key) {
        d dVar = this.c.get(key);
        if (dVar == null) {
            return null;
        }
        k<?> kVar = dVar.get();
        if (kVar == null) {
            c(dVar);
        }
        return kVar;
    }

    @VisibleForTesting
    public void g(c cVar) {
        this.h = cVar;
    }

    public void h(k.a aVar) {
        this.d = aVar;
    }

    @VisibleForTesting
    public void i() {
        this.g = true;
        Thread thread = this.f;
        if (thread == null) {
            return;
        }
        thread.interrupt();
        try {
            this.f.join(TimeUnit.SECONDS.toMillis(5L));
            if (this.f.isAlive()) {
                throw new RuntimeException("Failed to join in time");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
