package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import defpackage.orj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class orj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray<c> f44602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LifecycleObserver f44603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final orp f44604c;
    private static final Handler d;
    public static final HandlerThread e;
    private static final Handler i;
    private static Looper j;

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundTaskUtils");
        e = handlerThread;
        f44604c = new orp(3, 12, 10L, TimeUnit.SECONDS);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        j = looper;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        i = new Handler(looper);
        d = new Handler(Looper.getMainLooper());
        f44603b = new LifecycleObserver() { // from class: com.huawei.picture.security.base.utils.BackgroundTaskUtils$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                orj.b(lifecycleOwner.hashCode());
            }
        };
        f44602a = new SparseArray<>();
    }

    private orj() {
    }

    public static void a(Runnable runnable) {
        c((LifecycleOwner) null, runnable);
    }

    public static void c(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (lifecycleOwner != null) {
            runnable = b(lifecycleOwner.hashCode(), runnable);
        }
        i.removeCallbacks(runnable);
    }

    public static void c(Runnable runnable, long j2) {
        a((LifecycleOwner) null, runnable, j2);
    }

    public static void a(final LifecycleOwner lifecycleOwner, final Runnable runnable, long j2) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(f44603b);
            Runnable runnable2 = new Runnable() { // from class: ori
                @Override // java.lang.Runnable
                public final void run() {
                    orj.a(runnable, lifecycleOwner);
                }
            };
            e(lifecycleOwner.hashCode(), runnable, runnable2);
            d.postDelayed(runnable2, j2);
            return;
        }
        d.postDelayed(runnable, j2);
    }

    static /* synthetic */ void a(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        e(lifecycleOwner.hashCode(), runnable);
    }

    public static void d(Runnable runnable) {
        e((LifecycleOwner) null, runnable);
    }

    public static void e(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (lifecycleOwner != null) {
            runnable = e(lifecycleOwner.hashCode(), runnable);
        }
        d.removeCallbacks(runnable);
    }

    public static Future<?> c(Runnable runnable) {
        return d(0, runnable);
    }

    public static Future<?> d(int i2, Runnable runnable) {
        return e((LifecycleOwner) null, i2, runnable);
    }

    public static Future<?> e(final LifecycleOwner lifecycleOwner, int i2, final Runnable runnable) {
        Future<?> futureD;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(f44603b);
            futureD = f44604c.d(i2, new Runnable() { // from class: orl
                @Override // java.lang.Runnable
                public final void run() {
                    orj.c(runnable, lifecycleOwner);
                }
            });
            a(lifecycleOwner.hashCode(), runnable, futureD);
        } else {
            futureD = f44604c.d(i2, runnable);
        }
        if (futureD.isCancelled()) {
            ork.e("BackgroundTaskUtils", "submit task,  Future is cancelled");
        }
        return futureD;
    }

    static /* synthetic */ void c(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        c(lifecycleOwner.hashCode(), runnable);
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f44604c.remove(runnable);
    }

    private static c c(int i2) {
        c cVar;
        synchronized (orj.class) {
            SparseArray<c> sparseArray = f44602a;
            cVar = sparseArray.get(i2);
            if (cVar == null) {
                cVar = new c();
            }
            sparseArray.put(i2, cVar);
        }
        return cVar;
    }

    private static void a(int i2, Runnable runnable, Future<?> future) {
        synchronized (orj.class) {
            c(i2).b(runnable, future);
        }
    }

    private static void e(int i2, Runnable runnable, Runnable runnable2) {
        synchronized (orj.class) {
            c(i2).b(runnable, runnable2);
        }
    }

    private static Future<?> c(int i2, Runnable runnable) {
        synchronized (orj.class) {
            c cVar = f44602a.get(i2);
            if (cVar == null) {
                return null;
            }
            return cVar.c(runnable);
        }
    }

    private static Runnable b(int i2, Runnable runnable) {
        synchronized (orj.class) {
            c cVar = f44602a.get(i2);
            if (cVar == null) {
                return null;
            }
            return cVar.a(runnable);
        }
    }

    private static Runnable e(int i2, Runnable runnable) {
        synchronized (orj.class) {
            c cVar = f44602a.get(i2);
            if (cVar == null) {
                return null;
            }
            return cVar.e(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2) {
        synchronized (orj.class) {
            SparseArray<c> sparseArray = f44602a;
            c cVar = sparseArray.get(i2);
            if (cVar != null) {
                cVar.a();
                sparseArray.put(i2, null);
            }
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<Runnable, Future<?>> f44605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap<Runnable, Runnable> f44606c;
        private final HashMap<Runnable, Runnable> e;

        private c() {
            this.f44605a = new HashMap<>();
            this.e = new HashMap<>();
            this.f44606c = new HashMap<>();
        }

        public void b(Runnable runnable, Future<?> future) {
            synchronized (this) {
                this.f44605a.put(runnable, future);
            }
        }

        public void b(Runnable runnable, Runnable runnable2) {
            synchronized (this) {
                this.f44606c.put(runnable, runnable2);
            }
        }

        public Future<?> c(Runnable runnable) {
            Future<?> futureRemove;
            synchronized (this) {
                futureRemove = this.f44605a.remove(runnable);
            }
            return futureRemove;
        }

        public Runnable a(Runnable runnable) {
            Runnable runnableRemove;
            synchronized (this) {
                runnableRemove = this.e.remove(runnable);
            }
            return runnableRemove;
        }

        public Runnable e(Runnable runnable) {
            Runnable runnableRemove;
            synchronized (this) {
                runnableRemove = this.f44606c.remove(runnable);
            }
            return runnableRemove;
        }

        public void a() {
            synchronized (this) {
                Iterator<Map.Entry<Runnable, Future<?>>> it = this.f44605a.entrySet().iterator();
                while (it.hasNext()) {
                    Future<?> value = it.next().getValue();
                    if (value != null && !value.isDone()) {
                        value.cancel(true);
                        if (value instanceof Runnable) {
                            orj.b((Runnable) value);
                        }
                    }
                }
                this.f44605a.clear();
                Iterator<Map.Entry<Runnable, Runnable>> it2 = this.e.entrySet().iterator();
                while (it2.hasNext()) {
                    orj.a(it2.next().getValue());
                }
                this.e.clear();
                Iterator<Map.Entry<Runnable, Runnable>> it3 = this.f44606c.entrySet().iterator();
                while (it3.hasNext()) {
                    orj.d(it3.next().getValue());
                }
                this.f44606c.clear();
            }
        }
    }
}
