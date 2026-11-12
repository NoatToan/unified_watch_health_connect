package w3;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/l;", "K", "V", "", "Lp13/e;", "Lw3/f;", "builder", "<init>", "(Lw3/f;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l<K, V> extends p13.e<V> implements Collection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<K, V> f181805a;

    public l(f<K, V> fVar) {
        this.f181805a = fVar;
    }

    @Override // p13.e
    public final int a() {
        return this.f181805a.getF181797f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f181805a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f181805a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new m(this.f181805a);
    }
}
