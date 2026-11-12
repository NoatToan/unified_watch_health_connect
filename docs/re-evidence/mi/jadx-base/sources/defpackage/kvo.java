package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class kvo<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<E> f24346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24347b;

    public kvo(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f24346a = collection;
        this.f24347b = this;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        boolean zAdd;
        synchronized (this.f24347b) {
            zAdd = e().add(e);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.f24347b) {
            zAddAll = e().addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f24347b) {
            e().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f24347b) {
            zContains = e().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean zContainsAll;
        synchronized (this.f24347b) {
            zContainsAll = e().containsAll(collection);
        }
        return zContainsAll;
    }

    public Collection<E> e() {
        return this.f24346a;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f24347b) {
            zIsEmpty = e().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return e().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f24347b) {
            zRemove = e().remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.f24347b) {
            zRemoveAll = e().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.f24347b) {
            zRetainAll = e().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f24347b) {
            size = e().size();
        }
        return size;
    }

    public String toString() {
        String string;
        synchronized (this.f24347b) {
            string = e().toString();
        }
        return string;
    }
}
