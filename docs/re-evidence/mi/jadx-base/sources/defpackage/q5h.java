package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class q5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31135b;

    public static final class a<T> implements z5h<T>, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f31136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31137b;
        public jz6 c;
        public long d;

        public a(z5h<? super T> z5hVar, long j) {
            this.f31136a = z5hVar;
            this.d = j;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.c.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.f31137b) {
                return;
            }
            this.f31137b = true;
            this.c.dispose();
            this.f31136a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.f31137b) {
                t5l.p(th);
                return;
            }
            this.f31137b = true;
            this.c.dispose();
            this.f31136a.onError(th);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.f31137b) {
                return;
            }
            long j = this.d;
            long j2 = j - 1;
            this.d = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f31136a.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.c, jz6Var)) {
                this.c = jz6Var;
                if (this.d != 0) {
                    this.f31136a.onSubscribe(this);
                    return;
                }
                this.f31137b = true;
                jz6Var.dispose();
                EmptyDisposable.complete(this.f31136a);
            }
        }
    }

    public q5h(o5h<T> o5hVar, long j) {
        super(o5hVar);
        this.f31135b = j;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f31135b));
    }
}
