package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class s4h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33273b;
    public final TimeUnit c;
    public final hfl d;
    public final boolean e;

    public static final class a<T> implements z5h<T>, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f33274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f33275b;
        public final TimeUnit c;
        public final hfl.c d;
        public final boolean e;
        public jz6 f;

        /* JADX INFO: renamed from: s4h$a$a, reason: collision with other inner class name */
        public final class RunnableC1101a implements Runnable {
            public RunnableC1101a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f33274a.onComplete();
                } finally {
                    a.this.d.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f33277a;

            public b(Throwable th) {
                this.f33277a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f33274a.onError(this.f33277a);
                } finally {
                    a.this.d.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f33279a;

            public c(T t) {
                this.f33279a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f33274a.onNext(this.f33279a);
            }
        }

        public a(z5h<? super T> z5hVar, long j, TimeUnit timeUnit, hfl.c cVar, boolean z) {
            this.f33274a = z5hVar;
            this.f33275b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.e = z;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.f.dispose();
            this.d.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.d.c(new RunnableC1101a(), this.f33275b, this.c);
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            this.d.c(new b(th), this.e ? this.f33275b : 0L, this.c);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            this.d.c(new c(t), this.f33275b, this.c);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.f, jz6Var)) {
                this.f = jz6Var;
                this.f33274a.onSubscribe(this);
            }
        }
    }

    public s4h(o5h<T> o5hVar, long j, TimeUnit timeUnit, hfl hflVar, boolean z) {
        super(o5hVar);
        this.f33273b = j;
        this.c = timeUnit;
        this.d = hflVar;
        this.e = z;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(this.e ? z5hVar : new swl(z5hVar), this.f33273b, this.c, this.d.b(), this.e));
    }
}
