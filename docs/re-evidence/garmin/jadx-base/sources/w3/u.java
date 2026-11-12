package w3;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw3/u;", "K", "V", "T", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u<K, V, T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f181817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f181818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f181819c;

    public u() {
        t.f181809e.getClass();
        this.f181817a = t.f181810f.f181814d;
    }

    public final void a(int i14, int i15, Object[] objArr) {
        this.f181817a = objArr;
        this.f181818b = i14;
        this.f181819c = i15;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f181819c < this.f181818b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
