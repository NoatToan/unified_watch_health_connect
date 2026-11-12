package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class cb3 {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d<T> f5148b;
        public cqk<Void> c = cqk.r();
        public boolean d;

        public void a(Runnable runnable, Executor executor) {
            cqk<Void> cqkVar = this.c;
            if (cqkVar != null) {
                cqkVar.addListener(runnable, executor);
            }
        }

        public void b() {
            this.f5147a = null;
            this.f5148b = null;
            this.c.o(null);
        }

        public boolean c(T t) {
            this.d = true;
            d<T> dVar = this.f5148b;
            boolean z = dVar != null && dVar.b(t);
            if (z) {
                e();
            }
            return z;
        }

        public boolean d() {
            this.d = true;
            d<T> dVar = this.f5148b;
            boolean z = dVar != null && dVar.a(true);
            if (z) {
                e();
            }
            return z;
        }

        public final void e() {
            this.f5147a = null;
            this.f5148b = null;
            this.c = null;
        }

        public boolean f(Throwable th) {
            this.d = true;
            d<T> dVar = this.f5148b;
            boolean z = dVar != null && dVar.c(th);
            if (z) {
                e();
            }
            return z;
        }

        public void finalize() {
            cqk<Void> cqkVar;
            d<T> dVar = this.f5148b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5147a));
            }
            if (this.d || (cqkVar = this.c) == null) {
                return;
            }
            cqkVar.o(null);
        }
    }

    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    public static final class d<T> implements lhe<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f5149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p10<T> f5150b = new a();

        public class a extends p10<T> {
            public a() {
            }

            @Override // defpackage.p10
            public String l() {
                a<T> aVar = d.this.f5149a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f5147a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f5149a = new WeakReference<>(aVar);
        }

        public boolean a(boolean z) {
            return this.f5150b.cancel(z);
        }

        @Override // defpackage.lhe
        public void addListener(Runnable runnable, Executor executor) {
            this.f5150b.addListener(runnable, executor);
        }

        public boolean b(T t) {
            return this.f5150b.o(t);
        }

        public boolean c(Throwable th) {
            return this.f5150b.p(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.f5149a.get();
            boolean zCancel = this.f5150b.cancel(z);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f5150b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f5150b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f5150b.isDone();
        }

        public String toString() {
            return this.f5150b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f5150b.get(j, timeUnit);
        }
    }

    public static <T> lhe<T> a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f5148b = dVar;
        aVar.f5147a = cVar.getClass();
        try {
            Object objA = cVar.a(aVar);
            if (objA != null) {
                aVar.f5147a = objA;
            }
        } catch (Exception e) {
            dVar.c(e);
        }
        return dVar;
    }
}
