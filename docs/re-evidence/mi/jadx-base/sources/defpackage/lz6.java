package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class lz6<T> implements z5h<T>, jz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5h<? super T> f25577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg4<? super jz6> f25578b;
    public final vc0 c;
    public jz6 d;

    public lz6(z5h<? super T> z5hVar, bg4<? super jz6> bg4Var, vc0 vc0Var) {
        this.f25577a = z5hVar;
        this.f25578b = bg4Var;
        this.c = vc0Var;
    }

    @Override // defpackage.jz6
    public void dispose() {
        jz6 jz6Var = this.d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (jz6Var != disposableHelper) {
            this.d = disposableHelper;
            try {
                this.c.run();
            } catch (Throwable th) {
                qf8.b(th);
                t5l.p(th);
            }
            jz6Var.dispose();
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // defpackage.z5h
    public void onComplete() {
        jz6 jz6Var = this.d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (jz6Var != disposableHelper) {
            this.d = disposableHelper;
            this.f25577a.onComplete();
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        jz6 jz6Var = this.d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (jz6Var == disposableHelper) {
            t5l.p(th);
        } else {
            this.d = disposableHelper;
            this.f25577a.onError(th);
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        this.f25577a.onNext(t);
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        try {
            this.f25578b.accept(jz6Var);
            if (DisposableHelper.validate(this.d, jz6Var)) {
                this.d = jz6Var;
                this.f25577a.onSubscribe(this);
            }
        } catch (Throwable th) {
            qf8.b(th);
            jz6Var.dispose();
            this.d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f25577a);
        }
    }
}
