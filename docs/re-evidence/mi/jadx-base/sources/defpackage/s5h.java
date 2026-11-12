package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class s5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6i<? super T> f33320b;

    public static final class a<T> implements z5h<T>, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f33321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i6i<? super T> f33322b;
        public jz6 c;
        public boolean d;

        public a(z5h<? super T> z5hVar, i6i<? super T> i6iVar) {
            this.f33321a = z5hVar;
            this.f33322b = i6iVar;
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
            if (this.d) {
                return;
            }
            this.d = true;
            this.f33321a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.d) {
                t5l.p(th);
            } else {
                this.d = true;
                this.f33321a.onError(th);
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            try {
                if (this.f33322b.test(t)) {
                    this.f33321a.onNext(t);
                    return;
                }
                this.d = true;
                this.c.dispose();
                this.f33321a.onComplete();
            } catch (Throwable th) {
                qf8.b(th);
                this.c.dispose();
                onError(th);
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.c, jz6Var)) {
                this.c = jz6Var;
                this.f33321a.onSubscribe(this);
            }
        }
    }

    public s5h(o5h<T> o5hVar, i6i<? super T> i6iVar) {
        super(o5hVar);
        this.f33320b = i6iVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f33320b));
    }
}
