package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34339b;
    public final TimeUnit c;
    public final hfl d;

    public static final class a<T> extends AtomicReference<jz6> implements z5h<T>, jz6, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f34340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f34341b;
        public final TimeUnit c;
        public final hfl.c d;
        public jz6 e;
        public volatile boolean f;
        public boolean g;

        public a(z5h<? super T> z5hVar, long j, TimeUnit timeUnit, hfl.c cVar) {
            this.f34340a = z5hVar;
            this.f34341b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.f34340a.onComplete();
            this.d.dispose();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.g) {
                t5l.p(th);
                return;
            }
            this.g = true;
            this.f34340a.onError(th);
            this.d.dispose();
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.f || this.g) {
                return;
            }
            this.f = true;
            this.f34340a.onNext(t);
            jz6 jz6Var = get();
            if (jz6Var != null) {
                jz6Var.dispose();
            }
            DisposableHelper.replace(this, this.d.c(this, this.f34341b, this.c));
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.e, jz6Var)) {
                this.e = jz6Var;
                this.f34340a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f = false;
        }
    }

    public t5h(o5h<T> o5hVar, long j, TimeUnit timeUnit, hfl hflVar) {
        super(o5hVar);
        this.f34339b = j;
        this.c = timeUnit;
        this.d = hflVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(new swl(z5hVar), this.f34339b, this.c, this.d.b()));
    }
}
