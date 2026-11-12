package com.huawei.watchface.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.huawei.watchface.o3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundTaskUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HandlerThread f30587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f30588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Looper f30589c;
    public static final Handler d;
    public static final Handler e;
    public static final LifecycleObserver f;
    public static final SparseArray g;

    /* JADX INFO: loaded from: classes20.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap f30590a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f30591b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f30592c = new HashMap();

        public void a(Runnable runnable, Future future) {
            synchronized (this) {
                this.f30590a.put(runnable, future);
            }
        }

        public void b(Runnable runnable, Runnable runnable2) {
            synchronized (this) {
                this.f30591b.put(runnable, runnable2);
            }
        }

        public Future c(Runnable runnable) {
            Future future;
            synchronized (this) {
                future = (Future) this.f30590a.remove(runnable);
            }
            return future;
        }

        public void a(Runnable runnable, Runnable runnable2) {
            synchronized (this) {
                this.f30592c.put(runnable, runnable2);
            }
        }

        public Runnable b(Runnable runnable) {
            Runnable runnable2;
            synchronized (this) {
                runnable2 = (Runnable) this.f30591b.remove(runnable);
            }
            return runnable2;
        }

        public Runnable a(Runnable runnable) {
            Runnable runnable2;
            synchronized (this) {
                runnable2 = (Runnable) this.f30592c.remove(runnable);
            }
            return runnable2;
        }

        public void a() {
            synchronized (this) {
                this.f30590a.entrySet().forEach(new Consumer() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$a$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        BackgroundTaskUtils.a.a((Map.Entry) obj);
                    }
                });
                this.f30590a.clear();
                this.f30591b.entrySet().forEach(new Consumer() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$a$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        BackgroundTaskUtils.a((Runnable) ((Map.Entry) obj).getValue());
                    }
                });
                this.f30591b.clear();
                this.f30592c.entrySet().forEach(new Consumer() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$a$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        BackgroundTaskUtils.removeTaskFromMainWorker((Runnable) ((Map.Entry) obj).getValue());
                    }
                });
                this.f30592c.clear();
            }
        }

        public static /* synthetic */ void a(Map.Entry entry) {
            Future future = (Future) entry.getValue();
            if (future == null || future.isDone()) {
                return;
            }
            future.cancel(true);
            if (future instanceof Runnable) {
                BackgroundTaskUtils.removeThreadPoolTask((Runnable) future);
            }
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundTaskUtils");
        f30587a = handlerThread;
        f30588b = new o3(5, 20, 10L, TimeUnit.SECONDS);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        f30589c = looper;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        d = new Handler(looper);
        e = new Handler(Looper.getMainLooper());
        f = new LifecycleObserver() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils.1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                BackgroundTaskUtils.a(lifecycleOwner.hashCode());
            }
        };
        g = new SparseArray();
    }

    public static void a(Runnable runnable, int i) {
        a((LifecycleOwner) null, runnable, i);
    }

    public static /* synthetic */ void b(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        a(lifecycleOwner.hashCode(), runnable);
    }

    public static void c(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (lifecycleOwner != null) {
            runnable = b(lifecycleOwner.hashCode(), runnable);
        }
        d.removeCallbacks(runnable);
    }

    public static Future d(int i, Runnable runnable) {
        return a((LifecycleOwner) null, i, runnable);
    }

    public static void postDelayedInMainThread(Runnable runnable, long j) {
        a((LifecycleOwner) null, runnable, j);
    }

    public static void postInMainThread(Runnable runnable) {
        a((LifecycleOwner) null, runnable);
    }

    public static void removeTaskFromMainWorker(Runnable runnable) {
        b((LifecycleOwner) null, runnable);
    }

    public static void removeThreadPoolTask(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f30588b.remove(runnable);
    }

    public static Future<?> submit(Runnable runnable) {
        return d(0, runnable);
    }

    public static void a(final LifecycleOwner lifecycleOwner, final Runnable runnable, int i) {
        if (lifecycleOwner == null) {
            d.postDelayed(runnable, i);
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(f);
        Runnable runnable2 = new Runnable() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundTaskUtils.a(runnable, lifecycleOwner);
            }
        };
        b(lifecycleOwner.hashCode(), runnable, runnable2);
        d.postDelayed(runnable2, i);
    }

    public static /* synthetic */ void d(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        c(lifecycleOwner.hashCode(), runnable);
    }

    public static void b(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (lifecycleOwner != null) {
            runnable = a(lifecycleOwner.hashCode(), runnable);
        }
        e.removeCallbacks(runnable);
    }

    public static /* synthetic */ void c(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        a(lifecycleOwner.hashCode(), runnable);
    }

    public static a b(int i) {
        a aVar;
        synchronized (BackgroundTaskUtils.class) {
            SparseArray sparseArray = g;
            aVar = (a) sparseArray.get(i);
            if (aVar == null) {
                aVar = new a();
            }
            sparseArray.put(i, aVar);
        }
        return aVar;
    }

    public static Future c(int i, Runnable runnable) {
        synchronized (BackgroundTaskUtils.class) {
            a aVar = (a) g.get(i);
            if (aVar == null) {
                return null;
            }
            return aVar.c(runnable);
        }
    }

    public static void b(int i, Runnable runnable, Runnable runnable2) {
        synchronized (BackgroundTaskUtils.class) {
            b(i).b(runnable, runnable2);
        }
    }

    public static /* synthetic */ void a(Runnable runnable, LifecycleOwner lifecycleOwner) {
        runnable.run();
        b(lifecycleOwner.hashCode(), runnable);
    }

    public static Runnable b(int i, Runnable runnable) {
        synchronized (BackgroundTaskUtils.class) {
            a aVar = (a) g.get(i);
            if (aVar == null) {
                return null;
            }
            return aVar.b(runnable);
        }
    }

    public static void a(Runnable runnable) {
        c((LifecycleOwner) null, runnable);
    }

    public static void a(final LifecycleOwner lifecycleOwner, final Runnable runnable) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(f);
            Runnable runnable2 = new Runnable() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundTaskUtils.c(runnable, lifecycleOwner);
                }
            };
            a(lifecycleOwner.hashCode(), runnable, runnable2);
            e.post(runnable2);
            return;
        }
        e.post(runnable);
    }

    public static void a(final LifecycleOwner lifecycleOwner, final Runnable runnable, long j) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(f);
            Runnable runnable2 = new Runnable() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundTaskUtils.b(runnable, lifecycleOwner);
                }
            };
            a(lifecycleOwner.hashCode(), runnable, runnable2);
            e.postDelayed(runnable2, j);
            return;
        }
        e.postDelayed(runnable, j);
    }

    public static Future a(final LifecycleOwner lifecycleOwner, int i, final Runnable runnable) {
        Future futureC;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(f);
            futureC = f30588b.c(i, new Runnable() { // from class: com.huawei.watchface.utils.BackgroundTaskUtils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundTaskUtils.d(runnable, lifecycleOwner);
                }
            });
            a(lifecycleOwner.hashCode(), runnable, futureC);
        } else {
            futureC = f30588b.c(i, runnable);
        }
        if (futureC.isCancelled()) {
            HwLog.w("BackgroundTaskUtils", "submit task,  Future is cancelled");
        }
        return futureC;
    }

    public static boolean a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    public static void a(int i, Runnable runnable, Future future) {
        synchronized (BackgroundTaskUtils.class) {
            b(i).a(runnable, future);
        }
    }

    public static void a(int i, Runnable runnable, Runnable runnable2) {
        synchronized (BackgroundTaskUtils.class) {
            b(i).a(runnable, runnable2);
        }
    }

    public static Runnable a(int i, Runnable runnable) {
        synchronized (BackgroundTaskUtils.class) {
            a aVar = (a) g.get(i);
            if (aVar == null) {
                return null;
            }
            return aVar.a(runnable);
        }
    }

    public static void a(int i) {
        synchronized (BackgroundTaskUtils.class) {
            SparseArray sparseArray = g;
            a aVar = (a) sparseArray.get(i);
            if (aVar != null) {
                aVar.a();
                sparseArray.put(i, null);
            }
        }
    }
}
