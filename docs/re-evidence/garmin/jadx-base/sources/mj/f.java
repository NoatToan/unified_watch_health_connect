package mj;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import i3.e5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public class f<R> implements Future, nj.h, g<R> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f119029k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f119031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f119032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f119033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public R f119034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f119035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f119036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f119037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f119038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GlideException f119039j;

    public static class a {
    }

    public f(int i14, int i15, boolean z14, a aVar) {
        this.f119030a = i14;
        this.f119031b = i15;
        this.f119032c = z14;
        this.f119033d = aVar;
    }

    @Override // nj.h
    public final void a(Drawable drawable) {
    }

    @Override // nj.h
    public final void b(j jVar) throws Throwable {
        jVar.c(this.f119030a, this.f119031b);
    }

    @Override // nj.h
    public final synchronized void c(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f119036g = true;
                this.f119033d.getClass();
                notifyAll();
                d dVar = null;
                if (z14) {
                    d dVar2 = this.f119035f;
                    this.f119035f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.g
    public final synchronized boolean d(GlideException glideException, nj.h hVar) {
        this.f119038i = true;
        this.f119039j = glideException;
        this.f119033d.getClass();
        notifyAll();
        return false;
    }

    @Override // nj.h
    public final void e(j jVar) {
    }

    @Override // nj.h
    public final synchronized void f(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mj.g
    public final synchronized void g(Object obj, Object obj2, ui.a aVar) {
        this.f119037h = true;
        this.f119034e = obj;
        this.f119033d.getClass();
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j8, TimeUnit timeUnit) {
        return j(Long.valueOf(timeUnit.toMillis(j8)));
    }

    @Override // nj.h
    public final synchronized d getRequest() {
        return this.f119035f;
    }

    @Override // nj.h
    public final void h(Drawable drawable) {
    }

    @Override // nj.h
    public final synchronized void i(d dVar) {
        this.f119035f = dVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f119036g;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f119036g || this.f119037h || this.f119038i;
    }

    public final synchronized R j(Long l14) {
        try {
            if (this.f119032c && !isDone()) {
                char[] cArr = m.f144982a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
            }
            if (this.f119036g) {
                throw new CancellationException();
            }
            if (this.f119038i) {
                throw new ExecutionException(this.f119039j);
            }
            if (this.f119037h) {
                return this.f119034e;
            }
            if (l14 == null) {
                this.f119033d.getClass();
                wait(0L);
            } else if (l14.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l14.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f119033d.getClass();
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f119038i) {
                throw new ExecutionException(this.f119039j);
            }
            if (this.f119036g) {
                throw new CancellationException();
            }
            if (!this.f119037h) {
                throw new TimeoutException();
            }
            return this.f119034e;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // jj.m
    public final void onDestroy() {
    }

    @Override // jj.m
    public final void onStart() {
    }

    @Override // jj.m
    public final void onStop() {
    }

    public final String toString() {
        d dVar;
        String str;
        String strO = am.j.o(super.toString(), "[status=", new StringBuilder());
        synchronized (this) {
            try {
                dVar = null;
                if (this.f119036g) {
                    str = "CANCELLED";
                } else if (this.f119038i) {
                    str = "FAILURE";
                } else if (this.f119037h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.f119035f;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dVar == null) {
            return e5.g(strO, str, "]");
        }
        return strO + str + ", request=[" + dVar + "]]";
    }

    public f(int i14, int i15) {
        this(i14, i15, true, f119029k);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return j(null);
        } catch (TimeoutException e4) {
            vb.h.q(e4);
            return null;
        }
    }
}
