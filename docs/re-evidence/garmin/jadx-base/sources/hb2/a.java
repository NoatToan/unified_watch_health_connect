package hb2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
public class a<T> implements Callable<T>, Future<T>, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<hb2.b<? super T>> f82772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f82773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f82774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FutureTask<T> f82775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Future<?> f82776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable<? extends T> f82777f;

    public class b implements Callable<T> {
        private b() {
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            Handler handler;
            a aVar = a.this;
            try {
                aVar.f82773b = aVar.f82777f.call();
                T t7 = aVar.f82773b;
                handler = aVar.f82774c;
                return t7;
            } finally {
                handler = aVar.f82774c;
                handler.sendMessage(handler.obtainMessage(1, aVar.f82773b));
            }
        }
    }

    public a(Callable<? extends T> callable, T t7, Looper looper) {
        this.f82772a = new ArrayList<>();
        this.f82775d = new FutureTask<>(new b());
        this.f82774c = new Handler(looper, this);
        this.f82777f = callable;
        this.f82773b = t7;
    }

    public final void a(hb2.b<? super T> bVar) {
        synchronized (this) {
            try {
                if (!this.f82772a.contains(bVar)) {
                    this.f82772a.add(bVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f82776e == null) {
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    this.f82776e = executorServiceNewSingleThreadExecutor.submit(this.f82775d);
                    executorServiceNewSingleThreadExecutor.shutdown();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        boolean z14;
        synchronized (this) {
            try {
                if (this.f82776e == null) {
                    this.f82776e = this;
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            this.f82775d.run();
        }
        return this.f82775d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        return this.f82775d.cancel(z14);
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f82775d.get();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        synchronized (this.f82772a) {
            try {
                Iterator<hb2.b<? super T>> it = this.f82772a.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f82775d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f82775d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j8, TimeUnit timeUnit) {
        return this.f82775d.get(j8, timeUnit);
    }

    public a(T t7) {
        this(null, t7);
    }

    public a(Callable<? extends T> callable, T t7) {
        this(callable, t7, Looper.getMainLooper());
    }

    public a() {
        this(null, null);
    }
}
