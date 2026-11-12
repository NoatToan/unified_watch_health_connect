package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class na3<T> extends o4h<prk<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka3<T> f27699a;

    public static final class a implements jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka3<?> f27700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f27701b;

        public a(ka3<?> ka3Var) {
            this.f27700a = ka3Var;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.f27701b = true;
            this.f27700a.cancel();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.f27701b;
        }
    }

    public na3(ka3<T> ka3Var) {
        this.f27699a = ka3Var;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super prk<T>> z5hVar) {
        ka3<T> ka3VarClone = this.f27699a.clone();
        a aVar = new a(ka3VarClone);
        z5hVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        boolean z = false;
        try {
            prk<T> prkVarExecute = ka3VarClone.execute();
            if (!aVar.isDisposed()) {
                z5hVar.onNext(prkVarExecute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                z5hVar.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                qf8.b(th);
                if (z) {
                    t5l.p(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    z5hVar.onError(th);
                } catch (Throwable th2) {
                    qf8.b(th2);
                    t5l.p(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
