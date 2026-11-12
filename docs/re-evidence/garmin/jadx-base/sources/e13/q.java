package e13;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class q<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super Throwable, ? extends T> f62354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f62355c;

    public final class a implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62356a;

        public a(q03.t<? super T> tVar) {
            this.f62356a = tVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f62356a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            T tMo330apply;
            q qVar = q.this;
            u03.f<? super Throwable, ? extends T> fVar = qVar.f62354b;
            q03.t<? super T> tVar = this.f62356a;
            if (fVar != null) {
                try {
                    tMo330apply = fVar.mo330apply(th3);
                } catch (Throwable th4) {
                    t03.a.a(th4);
                    tVar.onError(new CompositeException(th3, th4));
                    return;
                }
            } else {
                tMo330apply = qVar.f62355c;
            }
            if (tMo330apply != null) {
                tVar.onSuccess(tMo330apply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th3);
            tVar.onError(nullPointerException);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62356a.onSuccess(t7);
        }
    }

    public q(q03.v<? extends T> vVar, u03.f<? super Throwable, ? extends T> fVar, T t7) {
        this.f62353a = vVar;
        this.f62354b = fVar;
        this.f62355c = t7;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62353a.a(new a(tVar));
    }
}
