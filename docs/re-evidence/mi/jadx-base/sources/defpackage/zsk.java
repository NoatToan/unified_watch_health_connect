package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class zsk<T> extends o4h<vsk<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4h<prk<T>> f41631a;

    public static class a<R> implements z5h<prk<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super vsk<R>> f41632a;

        public a(z5h<? super vsk<R>> z5hVar) {
            this.f41632a = z5hVar;
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(prk<R> prkVar) {
            this.f41632a.onNext(vsk.b(prkVar));
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.f41632a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            try {
                this.f41632a.onNext(vsk.a(th));
                this.f41632a.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f41632a.onError(th2);
                } catch (Throwable th3) {
                    qf8.b(th3);
                    t5l.p(new CompositeException(th2, th3));
                }
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            this.f41632a.onSubscribe(jz6Var);
        }
    }

    public zsk(o4h<prk<T>> o4hVar) {
        this.f41631a = o4hVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super vsk<T>> z5hVar) {
        this.f41631a.a(new a(z5hVar));
    }
}
