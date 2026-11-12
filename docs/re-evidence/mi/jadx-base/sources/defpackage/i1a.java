package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i1a<E> extends t1a implements Collection<E> {
    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // defpackage.t1a
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return epd.a(this, collection.iterator());
    }

    public void standardClear() {
        epd.d(iterator());
    }

    public boolean standardContains(Object obj) {
        return epd.f(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return m44.a(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (j4h.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return epd.r(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return epd.s(iterator(), collection);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return m44.e(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) t3h.g(this, tArr);
    }
}
