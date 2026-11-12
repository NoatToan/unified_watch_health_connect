package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class t4h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg4<? super T> f34302b;
    public final bg4<? super Throwable> c;
    public final vc0 d;
    public final vc0 e;

    public static final class a<T> implements z5h<T>, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f34303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bg4<? super T> f34304b;
        public final bg4<? super Throwable> c;
        public final vc0 d;
        public final vc0 e;
        public jz6 f;
        public boolean g;

        public a(z5h<? super T> z5hVar, bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, vc0 vc0Var2) {
            this.f34303a = z5hVar;
            this.f34304b = bg4Var;
            this.c = bg4Var2;
            this.d = vc0Var;
            this.e = vc0Var2;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.f.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.f.isDisposed();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.g) {
                return;
            }
            try {
                this.d.run();
                this.g = true;
                this.f34303a.onComplete();
                try {
                    this.e.run();
                } catch (Throwable th) {
                    qf8.b(th);
                    t5l.p(th);
                }
            } catch (Throwable th2) {
                qf8.b(th2);
                onError(th2);
            }
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.g) {
                t5l.p(th);
                return;
            }
            this.g = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                qf8.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f34303a.onError(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                qf8.b(th3);
                t5l.p(th3);
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            try {
                this.f34304b.accept(t);
                this.f34303a.onNext(t);
            } catch (Throwable th) {
                qf8.b(th);
                this.f.dispose();
                onError(th);
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.f, jz6Var)) {
                this.f = jz6Var;
                this.f34303a.onSubscribe(this);
            }
        }
    }

    public t4h(o5h<T> o5hVar, bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, vc0 vc0Var2) {
        super(o5hVar);
        this.f34302b = bg4Var;
        this.c = bg4Var2;
        this.d = vc0Var;
        this.e = vc0Var2;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f34302b, this.c, this.d, this.e));
    }
}
