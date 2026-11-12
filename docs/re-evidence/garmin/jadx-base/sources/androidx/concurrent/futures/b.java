package androidx.concurrent.futures;

import am.j;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d<T> f6080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<Void> f6081c = e.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6082d;

        public final void a(Runnable runnable, Executor executor) {
            e<Void> eVar = this.f6081c;
            if (eVar != null) {
                eVar.addListener(runnable, executor);
            }
        }

        public final boolean b(T t7) {
            this.f6082d = true;
            d<T> dVar = this.f6080b;
            boolean z14 = dVar != null && dVar.f6084b.set(t7);
            if (z14) {
                this.f6079a = null;
                this.f6080b = null;
                this.f6081c = null;
            }
            return z14;
        }

        public final void c() {
            this.f6082d = true;
            d<T> dVar = this.f6080b;
            if (dVar == null || !dVar.f6084b.cancel(true)) {
                return;
            }
            this.f6079a = null;
            this.f6080b = null;
            this.f6081c = null;
        }

        public final boolean d(Throwable th3) {
            this.f6082d = true;
            d<T> dVar = this.f6080b;
            boolean z14 = dVar != null && dVar.f6084b.setException(th3);
            if (z14) {
                this.f6079a = null;
                this.f6080b = null;
                this.f6081c = null;
            }
            return z14;
        }

        public final void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f6080b;
            if (dVar != null && !dVar.f6084b.isDone()) {
                dVar.a(new C0082b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6079a));
            }
            if (this.f6082d || (eVar = this.f6081c) == null) {
                return;
            }
            eVar.set(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.b$b, reason: collision with other inner class name */
    public static final class C0082b extends Throwable {
        public C0082b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object d(a<T> aVar);
    }

    private b() {
    }

    public static d a(c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = cVar.getClass();
        try {
            Object objD = cVar.d(aVar);
            if (objD == null) {
                return dVar;
            }
            aVar.f6079a = objD;
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }

    public static final class d<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f6083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f6084b = new a();

        public class a extends androidx.concurrent.futures.a<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.a
            public final String pendingToString() {
                a<T> aVar = d.this.f6083a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return j.k(aVar.f6079a, "]", new StringBuilder("tag=["));
            }
        }

        public d(a<T> aVar) {
            this.f6083a = new WeakReference<>(aVar);
        }

        public final boolean a(Throwable th3) {
            return this.f6084b.setException(th3);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.f6084b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z14) {
            a<T> aVar = this.f6083a.get();
            boolean zCancel = this.f6084b.cancel(z14);
            if (zCancel && aVar != null) {
                aVar.f6079a = null;
                aVar.f6080b = null;
                aVar.f6081c.set(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f6084b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f6084b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f6084b.isDone();
        }

        public final String toString() {
            return this.f6084b.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j8, TimeUnit timeUnit) {
            return this.f6084b.get(j8, timeUnit);
        }
    }
}
