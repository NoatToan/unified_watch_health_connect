package k53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk53/u;", "K", "V", "T", "", "<init>", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u<K, V, T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f103000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103002c;

    public u() {
        t.f102994e.getClass();
        this.f103000a = t.f102995f.f102999d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f103002c < this.f103001b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
