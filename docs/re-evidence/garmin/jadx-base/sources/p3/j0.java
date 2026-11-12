package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/j0;", "T", "Lp3/m2;", "Lp3/p3;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lp3/p3;Le23/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0<T> extends m2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3<T> f135122b;

    public j0(p3<T> p3Var, e23.a<? extends T> aVar) {
        super(aVar);
        this.f135122b = p3Var;
    }

    @Override // p3.m2
    public final n2<T> c(T t7) {
        return new n2<>(this, t7, t7 == null, this.f135122b, null, null, true);
    }
}
