package p13;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp13/o0;", "T", "", "Lp13/m0;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0<T> implements Iterator<m0<? extends T>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<T> f134956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134957b;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(Iterator<? extends T> it) {
        it.getClass();
        this.f134956a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f134956a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i14 = this.f134957b;
        this.f134957b = i14 + 1;
        if (i14 >= 0) {
            return new m0(i14, this.f134956a.next());
        }
        x.q();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
