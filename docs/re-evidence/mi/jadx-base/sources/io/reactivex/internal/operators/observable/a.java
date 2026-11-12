package io.reactivex.internal.operators.observable;

import defpackage.o4h;
import defpackage.w9l;
import defpackage.z5h;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends o4h<T> implements w9l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f21344a;

    public a(T t) {
        this.f21344a = t;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(z5hVar, this.f21344a);
        z5hVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    @Override // defpackage.w9l, java.util.concurrent.Callable
    public T call() {
        return this.f21344a;
    }
}
