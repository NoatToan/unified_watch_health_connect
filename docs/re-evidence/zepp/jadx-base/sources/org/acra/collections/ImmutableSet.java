package org.acra.collections;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class ImmutableSet<E> implements Set<E>, Serializable {
    private static final ImmutableSet<Object> b = new ImmutableSet<>();
    private final Set<E> a;

    public static final class Builder<E> {
        private final Set<E> a = new LinkedHashSet();

        public void add(E e) {
            this.a.add(e);
        }

        public ImmutableSet<E> build() {
            return new ImmutableSet<>(this.a);
        }
    }

    private ImmutableSet() {
        this.a = Collections.emptySet();
    }

    @NonNull
    public static <T> ImmutableSet<T> empty() {
        return (ImmutableSet<T>) b;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<E> iterator() {
        return new a(this.a.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    @NonNull
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }

    @SafeVarargs
    public ImmutableSet(E... eArr) {
        this(Arrays.asList(eArr));
    }

    public ImmutableSet(@NonNull Collection<E> collection) {
        this.a = new LinkedHashSet(collection);
    }
}
