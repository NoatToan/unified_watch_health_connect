package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e<E> extends AbstractCollection<E> implements u<E> {
    private transient Set<E> elementSet;
    private transient Set<u.a<E>> entrySet;

    public class a extends v.c<E> {
        public a() {
        }

        @Override // com.google.common.collect.v.c
        public u<E> i() {
            return e.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return e.this.elementIterator();
        }
    }

    public class b extends v.d<E> {
        public b() {
        }

        @Override // com.google.common.collect.v.d
        public u<E> i() {
            return e.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u.a<E>> iterator() {
            return e.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e.this.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return v.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new a();
    }

    public Set<u.a<E>> createEntrySet() {
        return new b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.elementSet = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator<u.a<E>> entryIterator();

    public Set<u.a<E>> entrySet() {
        Set<u.a<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<u.a<E>> setCreateEntrySet = createEntrySet();
        this.entrySet = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.u
    public final boolean equals(Object obj) {
        return v.f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.u
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return v.j(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return v.k(this, collection);
    }

    public int setCount(E e, int i) {
        return v.l(this, e, i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        return v.m(this, e, i, i2);
    }
}
