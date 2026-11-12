package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes21.dex */
public class ec<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Executor f32724b = Executors.newCachedThreadPool(new iw());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f32725a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ee<T> f32726c;
    private final Set<LottieListener<T>> d;
    private final Set<LottieListener<Throwable>> e;

    public ec(Callable<ee<T>> callable) {
        this(callable, false);
    }

    public ec(T t) {
        this.d = new LinkedHashSet(1);
        this.e = new LinkedHashSet(1);
        this.f32725a = new Handler(Looper.getMainLooper());
        this.f32726c = null;
        e(new ee<>(t));
    }

    public ec(Callable<ee<T>> callable, boolean z) {
        this.d = new LinkedHashSet(1);
        this.e = new LinkedHashSet(1);
        this.f32725a = new Handler(Looper.getMainLooper());
        this.f32726c = null;
        if (z) {
            try {
                e(callable.call());
                return;
            } catch (Throwable th) {
                e(new ee<>(th));
                return;
            }
        }
        f32724b.execute(new c(this, callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ee<T> eeVar) {
        if (this.f32726c != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f32726c = eeVar;
        c();
    }

    public ec<T> b(LottieListener<T> lottieListener) {
        synchronized (this) {
            ee<T> eeVar = this.f32726c;
            if (eeVar != null && eeVar.c() != null) {
                lottieListener.onResult(eeVar.c());
            }
            this.d.add(lottieListener);
        }
        return this;
    }

    public ec<T> c(LottieListener<T> lottieListener) {
        synchronized (this) {
            this.d.remove(lottieListener);
        }
        return this;
    }

    public ec<T> e(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            ee<T> eeVar = this.f32726c;
            if (eeVar != null && eeVar.d() != null) {
                lottieListener.onResult(eeVar.d());
            }
            this.e.add(lottieListener);
        }
        return this;
    }

    public ec<T> d(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            this.e.remove(lottieListener);
        }
        return this;
    }

    public ee<T> a() {
        return this.f32726c;
    }

    private void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e();
        } else {
            this.f32725a.post(new Runnable() { // from class: eh
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ee<T> eeVar = this.f32726c;
        if (eeVar == null) {
            return;
        }
        if (eeVar.c() != null) {
            b(eeVar.c());
        } else {
            c(eeVar.d());
        }
    }

    private void b(T t) {
        synchronized (this) {
            Iterator it = new ArrayList(this.d).iterator();
            while (it.hasNext()) {
                ((LottieListener) it.next()).onResult(t);
            }
        }
    }

    private void c(Throwable th) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.e);
            if (arrayList.isEmpty()) {
                iy.b("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((LottieListener) it.next()).onResult(th);
            }
        }
    }

    static class c<T> extends FutureTask<ee<T>> {
        private ec<T> d;

        c(ec<T> ecVar, Callable<ee<T>> callable) {
            super(callable);
            this.d = ecVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.d.e(get());
                } catch (InterruptedException | ExecutionException e) {
                    this.d.e(new ee(e));
                }
            } finally {
                this.d = null;
            }
        }
    }
}
