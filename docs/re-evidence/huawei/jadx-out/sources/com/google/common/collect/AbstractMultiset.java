package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    @CheckForNull
    @LazyInit
    private transient Set<E> elementSet;

    @CheckForNull
    @LazyInit
    private transient Set<Multiset.Entry<E>> entrySet;

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    abstract int distinctElements();

    abstract Iterator<E> elementIterator();

    abstract Iterator<Multiset.Entry<E>> entryIterator();

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean add(@ParametricNullness E e) {
        add(e, 1);
        return true;
    }

    public int add(@ParametricNullness E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean remove(@CheckForNull Object obj) {
        return remove(obj, 1) > 0;
    }

    public int remove(@CheckForNull Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(@ParametricNullness E e, int i) {
        return Multisets.b(this, e, i);
    }

    public boolean setCount(@ParametricNullness E e, int i, int i2) {
        return Multisets.a(this, e, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.d(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.c(this, collection);
    }

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.elementSet = setCreateElementSet;
        return setCreateElementSet;
    }

    Set<E> createElementSet() {
        return new c();
    }

    class c extends Multisets.ElementSet<E> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        protected Multiset<E> multiset() {
            return AbstractMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractMultiset.this.elementIterator();
        }
    }

    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> setCreateEntrySet = createEntrySet();
        this.entrySet = setCreateEntrySet;
        return setCreateEntrySet;
    }

    class d extends Multisets.EntrySet<E> {
        d() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        Multiset<E> multiset() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractMultiset.this.distinctElements();
        }
    }

    Set<Multiset.Entry<E>> createEntrySet() {
        return new d();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@CheckForNull Object obj) {
        return Multisets.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
        return entrySet().toString();
    }
}
