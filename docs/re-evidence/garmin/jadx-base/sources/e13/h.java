package e13;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.a f62321b;

    public final class a implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62322a;

        public a(q03.t<? super T> tVar) {
            this.f62322a = tVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f62322a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            try {
                h.this.f62321b.run();
            } catch (Throwable th4) {
                t03.a.a(th4);
                th3 = new CompositeException(th3, th4);
            }
            this.f62322a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            q03.t<? super T> tVar = this.f62322a;
            try {
                h.this.f62321b.run();
                tVar.onSuccess(t7);
            } catch (Throwable th3) {
                t03.a.a(th3);
                tVar.onError(th3);
            }
        }
    }

    public h(q03.v<T> vVar, u03.a aVar) {
        this.f62320a = vVar;
        this.f62321b = aVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62320a.a(new a(tVar));
    }
}
