package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/c1;", "T", "Lp3/c4;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Le23/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1<T> implements c4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f135048a;

    public c1(e23.a<? extends T> aVar) {
        this.f135048a = o13.m.b(aVar);
    }

    @Override // p3.c4
    public final T a(i2 i2Var) {
        return (T) this.f135048a.getValue();
    }
}
