package e13;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super Throwable> f62308b;

    public final class a implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62309a;

        public a(q03.t<? super T> tVar) {
            this.f62309a = tVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f62309a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            try {
                e.this.f62308b.accept(th3);
            } catch (Throwable th4) {
                t03.a.a(th4);
                th3 = new CompositeException(th3, th4);
            }
            this.f62309a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62309a.onSuccess(t7);
        }
    }

    public e(q03.v<T> vVar, u03.d<? super Throwable> dVar) {
        this.f62307a = vVar;
        this.f62308b = dVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62307a.a(new a(tVar));
    }
}
