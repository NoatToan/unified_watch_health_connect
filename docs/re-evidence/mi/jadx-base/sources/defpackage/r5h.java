package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class r5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6i<? super T> f32206b;

    public static final class a<T> implements z5h<T>, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f32207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i6i<? super T> f32208b;
        public jz6 c;
        public boolean d;

        public a(z5h<? super T> z5hVar, i6i<? super T> i6iVar) {
            this.f32207a = z5hVar;
            this.f32208b = i6iVar;
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
            this.f32207a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.d) {
                t5l.p(th);
            } else {
                this.d = true;
                this.f32207a.onError(th);
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            this.f32207a.onNext(t);
            try {
                if (this.f32208b.test(t)) {
                    this.d = true;
                    this.c.dispose();
                    this.f32207a.onComplete();
                }
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
                this.f32207a.onSubscribe(this);
            }
        }
    }

    public r5h(o5h<T> o5hVar, i6i<? super T> i6iVar) {
        super(o5hVar);
        this.f32206b = i6iVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f32206b));
    }
}
