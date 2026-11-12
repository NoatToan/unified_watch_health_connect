package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hfl f30018b;

    public static final class a<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f30019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<jz6> f30020b = new AtomicReference<>();

        public a(z5h<? super T> z5hVar) {
            this.f30019a = z5hVar;
        }

        public void a(jz6 jz6Var) {
            DisposableHelper.setOnce(this, jz6Var);
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this.f30020b);
            DisposableHelper.dispose(this);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.f30019a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            this.f30019a.onError(th);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            this.f30019a.onNext(t);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.setOnce(this.f30020b, jz6Var);
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<T> f30021a;

        public b(a<T> aVar) {
            this.f30021a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p5h.this.f19561a.a(this.f30021a);
        }
    }

    public p5h(o5h<T> o5hVar, hfl hflVar) {
        super(o5hVar);
        this.f30018b = hflVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        a aVar = new a(z5hVar);
        z5hVar.onSubscribe(aVar);
        aVar.a(this.f30018b.c(new b(aVar)));
    }
}
