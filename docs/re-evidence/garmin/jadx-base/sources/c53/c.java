package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc53/c;", "T", "K", "Lc53/j;", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Lc53/j;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<T, K> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, K> f24517b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(j<? extends T> jVar, e23.l<? super T, ? extends K> lVar) {
        jVar.getClass();
        lVar.getClass();
        this.f24516a = jVar;
        this.f24517b = lVar;
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new b(this.f24516a.iterator(), this.f24517b);
    }
}
