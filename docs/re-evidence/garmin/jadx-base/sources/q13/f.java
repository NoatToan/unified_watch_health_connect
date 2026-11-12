package q13;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq13/f;", "V", "", "Lp13/e;", "Lq13/c;", "backing", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<V> extends p13.e<V> implements Collection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<?, V> f142143a;

    public f(c<?, V> cVar) {
        cVar.getClass();
        this.f142143a = cVar;
    }

    @Override // p13.e
    public final int a() {
        return this.f142143a.f142129i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f142143a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f142143a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f142143a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        c<?, V> cVar = this.f142143a;
        cVar.getClass();
        return new c.f(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c<?, V> cVar = this.f142143a;
        cVar.c();
        int i14 = cVar.i(obj);
        if (i14 < 0) {
            return false;
        }
        cVar.m(i14);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.f142143a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.f142143a.c();
        return super.retainAll(collection);
    }
}
