package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35418b;
    public final TimeUnit c;
    public final hfl d;
    public final o5h<? extends T> e;

    public static final class a<T> implements z5h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f35419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<jz6> f35420b;

        public a(z5h<? super T> z5hVar, AtomicReference<jz6> atomicReference) {
            this.f35419a = z5hVar;
            this.f35420b = atomicReference;
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.f35419a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            this.f35419a.onError(th);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            this.f35419a.onNext(t);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.replace(this.f35420b, jz6Var);
        }
    }

    public static final class b<T> extends AtomicReference<jz6> implements z5h<T>, jz6, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f35421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35422b;
        public final TimeUnit c;
        public final hfl.c d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference<jz6> g = new AtomicReference<>();
        public o5h<? extends T> h;

        public b(z5h<? super T> z5hVar, long j, TimeUnit timeUnit, hfl.c cVar, o5h<? extends T> o5hVar) {
            this.f35421a = z5hVar;
            this.f35422b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.h = o5hVar;
        }

        @Override // u5h.d
        public void a(long j) {
            if (this.f.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.g);
                o5h<? extends T> o5hVar = this.h;
                this.h = null;
                o5hVar.a(new a(this.f35421a, this));
                this.d.dispose();
            }
        }

        public void b(long j) {
            this.e.replace(this.d.c(new e(j, this), this.f35422b, this.c));
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this.g);
            DisposableHelper.dispose(this);
            this.d.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.f35421a.onComplete();
                this.d.dispose();
            }
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                t5l.p(th);
                return;
            }
            this.e.dispose();
            this.f35421a.onError(th);
            this.d.dispose();
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            long j = this.f.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f.compareAndSet(j, j2)) {
                    this.e.get().dispose();
                    this.f35421a.onNext(t);
                    b(j2);
                }
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.setOnce(this.g, jz6Var);
        }
    }

    public static final class c<T> extends AtomicLong implements z5h<T>, jz6, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f35423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35424b;
        public final TimeUnit c;
        public final hfl.c d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicReference<jz6> f = new AtomicReference<>();

        public c(z5h<? super T> z5hVar, long j, TimeUnit timeUnit, hfl.c cVar) {
            this.f35423a = z5hVar;
            this.f35424b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        @Override // u5h.d
        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f);
                this.f35423a.onError(new TimeoutException(jf8.c(this.f35424b, this.c)));
                this.d.dispose();
            }
        }

        public void b(long j) {
            this.e.replace(this.d.c(new e(j, this), this.f35424b, this.c));
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this.f);
            this.d.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f.get());
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.f35423a.onComplete();
                this.d.dispose();
            }
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                t5l.p(th);
                return;
            }
            this.e.dispose();
            this.f35423a.onError(th);
            this.d.dispose();
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.e.get().dispose();
                    this.f35423a.onNext(t);
                    b(j2);
                }
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.setOnce(this.f, jz6Var);
        }
    }

    public interface d {
        void a(long j);
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f35425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35426b;

        public e(long j, d dVar) {
            this.f35426b = j;
            this.f35425a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35425a.a(this.f35426b);
        }
    }

    public u5h(o4h<T> o4hVar, long j, TimeUnit timeUnit, hfl hflVar, o5h<? extends T> o5hVar) {
        super(o4hVar);
        this.f35418b = j;
        this.c = timeUnit;
        this.d = hflVar;
        this.e = o5hVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        if (this.e == null) {
            c cVar = new c(z5hVar, this.f35418b, this.c, this.d.b());
            z5hVar.onSubscribe(cVar);
            cVar.b(0L);
            this.f19561a.a(cVar);
            return;
        }
        b bVar = new b(z5hVar, this.f35418b, this.c, this.d.b(), this.e);
        z5hVar.onSubscribe(bVar);
        bVar.b(0L);
        this.f19561a.a(bVar);
    }
}
