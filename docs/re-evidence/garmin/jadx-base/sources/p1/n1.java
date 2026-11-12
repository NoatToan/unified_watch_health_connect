package p1;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lp1/n1;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n1 implements Iterator<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1<Object> f134779b;

    public n1(l1<Object> l1Var) {
        this.f134779b = l1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f134778a < this.f134779b.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i14 = this.f134778a;
        this.f134778a = i14 + 1;
        return this.f134779b.g(i14);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
