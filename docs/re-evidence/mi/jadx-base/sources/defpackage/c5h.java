package defpackage;

import io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class c5h<K, T> extends y3b<K, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d5h<T, K> f4948b;

    public c5h(K k2, d5h<T, K> d5hVar) {
        super(k2);
        this.f4948b = d5hVar;
    }

    public static <T, K> c5h<K, T> j0(K k2, int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, boolean z) {
        return new c5h<>(k2, new d5h(i, observableGroupBy$GroupByObserver, k2, z));
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f4948b.a(z5hVar);
    }

    public void onComplete() {
        this.f4948b.d();
    }

    public void onError(Throwable th) {
        this.f4948b.e(th);
    }

    public void onNext(T t) {
        this.f4948b.f(t);
    }
}
