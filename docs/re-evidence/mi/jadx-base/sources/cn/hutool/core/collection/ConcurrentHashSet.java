package cn.hutool.core.collection;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConcurrentHashSet<E> extends AbstractSet<E> implements Serializable {
    private static final Boolean PRESENT = Boolean.TRUE;
    private static final long serialVersionUID = 7997886765361607470L;
    private final ConcurrentHashMap<E, Boolean> map;

    public ConcurrentHashSet() {
        this.map = new ConcurrentHashMap<>();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.map.put(e, PRESENT) == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.map.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return PRESENT.equals(this.map.remove(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    public ConcurrentHashSet(int i) {
        this.map = new ConcurrentHashMap<>(i);
    }

    public ConcurrentHashSet(int i, float f) {
        this.map = new ConcurrentHashMap<>(i, f);
    }

    public ConcurrentHashSet(int i, float f, int i2) {
        this.map = new ConcurrentHashMap<>(i, f, i2);
    }

    public ConcurrentHashSet(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            Collection<? extends E> collection = (Collection) iterable;
            this.map = new ConcurrentHashMap<>((int) (collection.size() / 0.75f));
            addAll(collection);
        } else {
            this.map = new ConcurrentHashMap<>();
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }
}
