package com.google.common.collect;

import com.google.common.base.Objects;
import defpackage.alf;
import defpackage.amu;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Collection<E> delegate();

    protected ForwardingCollection() {
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public boolean contains(@CheckForNull Object obj) {
        return delegate().contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(@ParametricNullness E e) {
        return delegate().add(e);
    }

    public boolean remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    protected boolean standardContains(@CheckForNull Object obj) {
        return Iterators.b((Iterator<?>) iterator(), obj);
    }

    protected boolean standardContainsAll(Collection<?> collection) {
        return alf.a((Collection<?>) this, collection);
    }

    protected boolean standardAddAll(Collection<? extends E> collection) {
        return Iterators.a(this, collection.iterator());
    }

    protected boolean standardRemove(@CheckForNull Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (Objects.equal(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
        return Iterators.d((Iterator<?>) iterator(), collection);
    }

    protected boolean standardRetainAll(Collection<?> collection) {
        return Iterators.a((Iterator<?>) iterator(), collection);
    }

    protected void standardClear() {
        Iterators.d(iterator());
    }

    protected boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    protected String standardToString() {
        return alf.a(this);
    }

    protected Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    protected <T> T[] standardToArray(T[] tArr) {
        return (T[]) amu.a(this, tArr);
    }
}
