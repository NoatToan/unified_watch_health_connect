package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import defpackage.ale;
import defpackage.ama;
import defpackage.amz;
import defpackage.ann;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    protected final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract ImmutableCollection<V> get(K k);

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ama.d();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v) {
        return ama.c(k, v);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2) {
        return ama.e(k, v, k2, v2);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return ama.e(k, v, k2, v2, k3, v3);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ama.b(k, v, k2, v2, k3, v3, k4, v4);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ama.c(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    /* JADX INFO: loaded from: classes21.dex */
    @DoNotMock
    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        protected Comparator<? super V> f4374a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Map<K, Collection<V>> f4375c = amz.a();

        @CheckForNull
        protected Comparator<? super K> e;

        protected Collection<V> c() {
            return new ArrayList();
        }

        public c<K, V> c(K k, V v) {
            ale.d(k, v);
            Collection<V> collection = this.f4375c.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f4375c;
                Collection<V> collectionC = c();
                map.put(k, collectionC);
                collection = collectionC;
            }
            collection.add(v);
            return this;
        }

        public c<K, V> c(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        public c<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return this;
        }

        public ImmutableMultimap<K, V> b() {
            Collection collectionEntrySet = this.f4375c.entrySet();
            Comparator<? super K> comparator = this.e;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ama.d(collectionEntrySet, this.f4374a);
        }
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ama.b((Multimap) multimap);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ama.b((Iterable) iterable);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class e {
        public static final ann.a<ImmutableMultimap> e = ann.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ann.a<ImmutableMultimap> f4376b = ann.a(ImmutableMultimap.class, "size");

        e() {
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i2) {
        this.map = immutableMap;
        this.size = i2;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    public ImmutableCollection<V> removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@CheckForNull Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@CheckForNull Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new a(this);
    }

    static class a<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ImmutableMultimap<K, V> f4372a;

        a(ImmutableMultimap<K, V> immutableMultimap) {
            this.f4372a = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f4372a.entryIterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f4372a.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f4372a.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f4372a.containsEntry(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        protected Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    public UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableMultimap.3
            final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> e;

            @CheckForNull
            K d = null;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator<V> f4370a = Iterators.e();

            {
                this.e = ImmutableMultimap.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4370a.hasNext() || this.e.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!this.f4370a.hasNext()) {
                    Map.Entry<K, ? extends ImmutableCollection<V>> next = this.e.next();
                    this.d = next.getKey();
                    this.f4370a = next.getValue().iterator();
                }
                return Maps.c(Objects.requireNonNull(this.d), this.f4370a.next());
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableMultiset<K> createKeys() {
        return new b();
    }

    /* JADX INFO: loaded from: classes21.dex */
    class b extends ImmutableMultiset<K> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        b() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return ImmutableMultimap.this.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultiset
        protected Multiset.Entry<K> getEntry(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return Multisets.c(entry.getKey(), entry.getValue().size());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        protected Object writeReplace() {
            return new d(ImmutableMultimap.this);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class d implements Serializable {
        final ImmutableMultimap<?, ?> d;

        d(ImmutableMultimap<?, ?> immutableMultimap) {
            this.d = immutableMultimap;
        }

        Object readResolve() {
            return this.d.keys();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableCollection<V> createValues() {
        return new i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public UnmodifiableIterator<V> valueIterator() {
        return new UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMultimap.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator<V> f4368a = Iterators.e();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Iterator<? extends ImmutableCollection<V>> f4369b;

            {
                this.f4369b = ImmutableMultimap.this.map.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4368a.hasNext() || this.f4369b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.f4368a.hasNext()) {
                    this.f4368a = this.f4369b.next().iterator();
                }
                return this.f4368a.next();
            }
        };
    }

    static final class i<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient ImmutableMultimap<K, V> f4377c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        i(ImmutableMultimap<K, V> immutableMultimap) {
            this.f4377c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f4377c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<V> iterator() {
            return this.f4377c.valueIterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        protected int copyIntoArray(Object[] objArr, int i) {
            UnmodifiableIterator<? extends ImmutableCollection<V>> it = this.f4377c.map.values().iterator();
            while (it.hasNext()) {
                i = it.next().copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f4377c.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        protected Object writeReplace() {
            return super.writeReplace();
        }
    }
}
