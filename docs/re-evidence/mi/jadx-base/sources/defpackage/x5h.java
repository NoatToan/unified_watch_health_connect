package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class x5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hfl f38722b;

    public static final class a<T> extends AtomicBoolean implements z5h<T>, jz6 {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f38723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hfl f38724b;
        public jz6 c;

        /* JADX INFO: renamed from: x5h$a$a, reason: collision with other inner class name */
        public final class RunnableC1144a implements Runnable {
            public RunnableC1144a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c.dispose();
            }
        }

        public a(z5h<? super T> z5hVar, hfl hflVar) {
            this.f38723a = z5hVar;
            this.f38724b = hflVar;
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f38724b.c(new RunnableC1144a());
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f38723a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (get()) {
                t5l.p(th);
            } else {
                this.f38723a.onError(th);
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f38723a.onNext(t);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.c, jz6Var)) {
                this.c = jz6Var;
                this.f38723a.onSubscribe(this);
            }
        }
    }

    public x5h(o5h<T> o5hVar, hfl hflVar) {
        super(o5hVar);
        this.f38722b = hflVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f38722b));
    }
}
