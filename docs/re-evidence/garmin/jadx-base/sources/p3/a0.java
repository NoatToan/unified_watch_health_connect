package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/a0;", "T", "Lp3/m2;", "Lkotlin/Function1;", "Lp3/u;", "defaultComputation", "<init>", "(Le23/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0<T> extends m2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0<T> f135029b;

    public a0(e23.l<? super u, ? extends T> lVar) {
        super(new oe0.e(28));
        this.f135029b = new b0<>(lVar);
    }

    @Override // p3.t
    public final c4 a() {
        return this.f135029b;
    }

    @Override // p3.m2
    public final n2<T> c(T t7) {
        return new n2<>(this, t7, t7 == null, null, null, null, true);
    }
}
