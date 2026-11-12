package ch.qos.logback.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class COWArrayList<E> implements List<E> {
    final E[] modelArray;
    E[] ourCopy;
    AtomicBoolean fresh = new AtomicBoolean(false);
    CopyOnWriteArrayList<E> underlyingList = new CopyOnWriteArrayList<>();

    public COWArrayList(E[] eArr) {
        this.modelArray = eArr;
    }

    private boolean isFresh() {
        return this.fresh.get();
    }

    private void markAsStale() {
        this.fresh.set(false);
    }

    private void refreshCopy() {
        this.ourCopy = (E[]) this.underlyingList.toArray(this.modelArray);
        this.fresh.set(true);
    }

    private void refreshCopyIfNecessary() {
        if (isFresh()) {
            return;
        }
        refreshCopy();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e4) {
        boolean zAdd = this.underlyingList.add(e4);
        markAsStale();
        return zAdd;
    }

    @Override // java.util.List
    public boolean addAll(int i14, Collection<? extends E> collection) {
        boolean zAddAll = this.underlyingList.addAll(i14, collection);
        markAsStale();
        return zAddAll;
    }

    public void addIfAbsent(E e4) {
        this.underlyingList.addIfAbsent(e4);
        markAsStale();
    }

    public E[] asTypedArray() {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.underlyingList.clear();
        markAsStale();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.underlyingList.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.underlyingList.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i14) {
        refreshCopyIfNecessary();
        return this.ourCopy[i14];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.underlyingList.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.underlyingList.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.underlyingList.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.underlyingList.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.underlyingList.listIterator();
    }

    @Override // java.util.List
    public E remove(int i14) {
        E eRemove = this.underlyingList.remove(i14);
        markAsStale();
        return eRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.underlyingList.removeAll(collection);
        markAsStale();
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.underlyingList.retainAll(collection);
        markAsStale();
        return zRetainAll;
    }

    @Override // java.util.List
    public E set(int i14, E e4) {
        E e14 = this.underlyingList.set(i14, e4);
        markAsStale();
        return e14;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.underlyingList.size();
    }

    @Override // java.util.List
    public List<E> subList(int i14, int i15) {
        return this.underlyingList.subList(i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i14) {
        return this.underlyingList.listIterator(i14);
    }

    @Override // java.util.List
    public void add(int i14, E e4) {
        this.underlyingList.add(i14, e4);
        markAsStale();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll = this.underlyingList.addAll(collection);
        markAsStale();
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.underlyingList.remove(obj);
        markAsStale();
        return zRemove;
    }
}
