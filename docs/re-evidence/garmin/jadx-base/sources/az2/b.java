package az2;

import f23.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0005¨\u0006\u0007"}, d2 = {"Laz2/b;", "T", "", "<init>", "()V", "", "size", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> implements Set<T>, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet<T> f13783a = new CopyOnWriteArraySet<>();

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t7) {
        return this.f13783a.add(t7);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        return this.f13783a.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f13783a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13783a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.f13783a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f13783a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterator<T> it = this.f13783a.iterator();
        it.getClass();
        return it;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13783a.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        return this.f13783a.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        return this.f13783a.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f13783a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) i.d(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return i.c(this);
    }
}
