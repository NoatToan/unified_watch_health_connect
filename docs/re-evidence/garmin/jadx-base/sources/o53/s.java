package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo53/s;", "T", "Lo53/p1;", "Lo53/r;", "Lo53/l1;", "parent", "<init>", "(Lo53/l1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s<T> extends p1 implements r<T> {
    public s(l1 l1Var) {
        super(true);
        d0(l1Var);
    }

    @Override // o53.r
    public final boolean O(Throwable th3) {
        return g0(new v(th3, false, 2, null));
    }

    @Override // o53.i0
    public final Object await(t13.d<? super T> dVar) {
        Object objC = C(dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objC;
    }
}
