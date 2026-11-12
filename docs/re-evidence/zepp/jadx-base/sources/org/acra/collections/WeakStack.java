package org.acra.collections;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class WeakStack<T> extends AbstractCollection<T> {
    private final List<WeakReference<T>> a = new ArrayList();

    public static class b<T> implements Iterator<T> {
        private final Iterator<WeakReference<T>> a;
        private T b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b != null) {
                return true;
            }
            while (this.a.hasNext()) {
                T t = this.a.next().get();
                if (t != null) {
                    this.b = t;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = this.b;
            this.b = null;
            while (t == null) {
                t = this.a.next().get();
            }
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }

        private b(Iterator<WeakReference<T>> it2) {
            this.a = it2;
        }
    }

    private void a() {
        for (WeakReference<T> weakReference : this.a) {
            if (weakReference.get() == null) {
                this.a.remove(weakReference);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(T t) {
        return this.a.add(new WeakReference<>(t));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<WeakReference<T>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (obj.equals(it2.next().get())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return new b(this.a.iterator());
    }

    public T peek() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            T t = this.a.get(size).get();
            if (t != null) {
                return t;
            }
        }
        throw new EmptyStackException();
    }

    public T pop() {
        T tPeek = peek();
        remove(tPeek);
        return tPeek;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj != null) {
            for (int i = 0; i < this.a.size(); i++) {
                if (obj.equals(this.a.get(i).get())) {
                    this.a.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        a();
        return this.a.size();
    }
}
