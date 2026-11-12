package defpackage;

import io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber;
import io.reactivex.internal.operators.flowable.a;

/* JADX INFO: loaded from: classes2.dex */
public final class bz9<K, T> extends w3b<K, T> {
    public final a<T, K> c;

    public bz9(K k2, a<T, K> aVar) {
        super(k2);
        this.c = aVar;
    }

    public static <T, K> bz9<K, T> f(K k2, int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, boolean z) {
        return new bz9<>(k2, new a(i, flowableGroupBy$GroupBySubscriber, k2, z));
    }

    public void g() {
        this.c.onComplete();
    }

    public void h(Throwable th) {
        this.c.onError(th);
    }

    public void i(T t) {
        this.c.onNext(t);
    }
}
