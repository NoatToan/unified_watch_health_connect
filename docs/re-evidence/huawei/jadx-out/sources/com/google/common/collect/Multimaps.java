package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import defpackage.ale;
import defpackage.ama;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Multimaps {
    public static <K, V> ListMultimap<K, V> c(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new a(map, supplier);
    }

    static class a<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        transient Supplier<? extends List<V>> f4461c;

        a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.f4461c = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return this.f4461c.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f4461c);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f4461c = (Supplier) Objects.requireNonNull(objectInputStream.readObject());
            setMap((Map) Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> SetMultimap<K, V> b(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
        return new d(map, supplier);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class d<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        transient Supplier<? extends Set<V>> f4462b;

        d(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
            super(map);
            this.f4462b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return this.f4462b.get();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.a((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        Collection<V> wrapCollection(@ParametricNullness K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.h(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.l(k, (SortedSet) collection, null);
            }
            return new AbstractMapBasedMultimap.o(k, (Set) collection);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f4462b);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f4462b = (Supplier) Objects.requireNonNull(objectInputStream.readObject());
            setMap((Map) Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> SortedSetMultimap<K, V> a(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
        return new c(map, supplier);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class c<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier<? extends SortedSet<V>> d;

        @CheckForNull
        transient Comparator<? super V> e;

        c(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
            super(map);
            this.d = (Supplier) Preconditions.checkNotNull(supplier);
            this.e = supplier.get().comparator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public SortedSet<V> createCollection() {
            return this.d.get();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @CheckForNull
        public Comparator<? super V> valueComparator() {
            return this.e;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.d);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Supplier<? extends SortedSet<V>> supplier = (Supplier) Objects.requireNonNull(objectInputStream.readObject());
            this.d = supplier;
            this.e = supplier.get().comparator();
            setMap((Map) Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> ama<K, V> d(Iterable<V> iterable, Function<? super V, K> function) {
        return b(iterable.iterator(), function);
    }

    public static <K, V> ama<K, V> b(Iterator<V> it, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ama.e eVarC = ama.c();
        while (it.hasNext()) {
            V next = it.next();
            Preconditions.checkNotNull(next, it);
            eVarC.c(function.apply(next), next);
        }
        return eVarC.b();
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class e<K, V> extends AbstractMultiset<K> {
        final Multimap<K, V> e;

        e(Multimap<K, V> multimap) {
            this.e = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<K>> entryIterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>>(this, this.e.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.e.3
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Multiset.Entry<K> transform(final Map.Entry<K, Collection<V>> entry) {
                    return new Multisets.AbstractEntry<K>(this) { // from class: com.google.common.collect.Multimaps.e.3.5
                        @Override // com.google.common.collect.Multiset.Entry
                        @ParametricNullness
                        public K getElement() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return this.e.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.e.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@CheckForNull Object obj) {
            return this.e.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<K> iterator() {
            return Maps.d(this.e.entries().iterator());
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object obj) {
            Collection collection = (Collection) Maps.a(this.e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@CheckForNull Object obj, int i) {
            ale.b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.a(this.e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.e.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
        public Set<K> elementSet() {
            return this.e.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }
    }

    static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        abstract Multimap<K, V> multimap();

        Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return multimap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            multimap().clear();
        }
    }

    static boolean d(Multimap<?, ?> multimap, @CheckForNull Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }
}
