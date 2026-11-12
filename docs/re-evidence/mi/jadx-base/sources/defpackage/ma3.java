package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class ma3<T> extends o4h<prk<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka3<T> f25935a;

    public static final class a<T> implements jz6, xa3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka3<?> f25936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z5h<? super prk<T>> f25937b;
        public volatile boolean c;
        public boolean d = false;

        public a(ka3<?> ka3Var, z5h<? super prk<T>> z5hVar) {
            this.f25936a = ka3Var;
            this.f25937b = z5hVar;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.c = true;
            this.f25936a.cancel();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }

        @Override // defpackage.xa3
        public void onFailure(ka3<T> ka3Var, Throwable th) {
            if (ka3Var.isCanceled()) {
                return;
            }
            try {
                this.f25937b.onError(th);
            } catch (Throwable th2) {
                qf8.b(th2);
                t5l.p(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.xa3
        public void onResponse(ka3<T> ka3Var, prk<T> prkVar) {
            if (this.c) {
                return;
            }
            try {
                this.f25937b.onNext(prkVar);
                if (this.c) {
                    return;
                }
                this.d = true;
                this.f25937b.onComplete();
            } catch (Throwable th) {
                if (this.d) {
                    t5l.p(th);
                    return;
                }
                if (this.c) {
                    return;
                }
                try {
                    this.f25937b.onError(th);
                } catch (Throwable th2) {
                    qf8.b(th2);
                    t5l.p(new CompositeException(th, th2));
                }
            }
        }
    }

    public ma3(ka3<T> ka3Var) {
        this.f25935a = ka3Var;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super prk<T>> z5hVar) {
        ka3<T> ka3VarClone = this.f25935a.clone();
        a aVar = new a(ka3VarClone, z5hVar);
        z5hVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        ka3VarClone.E(aVar);
    }
}
