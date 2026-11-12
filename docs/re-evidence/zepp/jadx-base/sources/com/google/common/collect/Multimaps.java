package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Multimaps {

    public static final class a<K, V> extends Maps.q0<K, Collection<V>> {

        @Weak
        private final Multimap<K, V> d;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a, reason: collision with other inner class name */
        public class C0181a extends Maps.s<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a$a, reason: collision with other inner class name */
            public class C0182a implements Function<K, Collection<V>> {
                public C0182a() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(K k) {
                    return a.this.d.get(k);
                }
            }

            public C0181a() {
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, Collection<V>> d() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.i(a.this.d.keySet(), new C0182a());
            }

            @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                a.this.h(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public a(Multimap<K, V> multimap) {
            this.d = (Multimap) Preconditions.checkNotNull(multimap);
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0181a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.d.removeAll(obj);
            }
            return null;
        }

        public void h(Object obj) {
            this.d.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return this.d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.d.keySet().size();
        }
    }

    public static class b<K, V> extends com.google.common.collect.c<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient Supplier<? extends List<V>> h;

        public b(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.h = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.h = (Supplier) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.h);
            objectOutputStream.writeObject(s());
        }

        @Override // com.google.common.collect.c, com.google.common.collect.d
        /* JADX INFO: renamed from: F */
        public List<V> t() {
            return this.h.get();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Map<K, Collection<V>> b() {
            return v();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Set<K> f() {
            return w();
        }
    }

    public static class c<K, V> extends com.google.common.collect.d<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient Supplier<? extends Collection<V>> h;

        public c(Map<K, Collection<V>> map, Supplier<? extends Collection<V>> supplier) {
            super(map);
            this.h = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.h = (Supplier) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.h);
            objectOutputStream.writeObject(s());
        }

        @Override // com.google.common.collect.d
        public <E> Collection<E> C(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.unmodifiableNavigableSet((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.d
        public Collection<V> D(K k, Collection<V> collection) {
            if (collection instanceof List) {
                return E(k, (List) collection, null);
            }
            if (collection instanceof NavigableSet) {
                return new com.google.common.collect.d.m(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new com.google.common.collect.d.o(k, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new com.google.common.collect.d.n(k, (Set) collection) : new com.google.common.collect.d.k(k, collection, null);
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Map<K, Collection<V>> b() {
            return v();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Set<K> f() {
            return w();
        }

        @Override // com.google.common.collect.d
        public Collection<V> t() {
            return this.h.get();
        }
    }

    public static class d<K, V> extends com.google.common.collect.k<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient Supplier<? extends Set<V>> h;

        public d(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
            super(map);
            this.h = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.h = (Supplier) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.h);
            objectOutputStream.writeObject(s());
        }

        @Override // com.google.common.collect.k, com.google.common.collect.d
        public <E> Collection<E> C(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.unmodifiableNavigableSet((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.k, com.google.common.collect.d
        public Collection<V> D(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new com.google.common.collect.d.m(k, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new com.google.common.collect.d.o(k, (SortedSet) collection, null) : new com.google.common.collect.d.n(k, (Set) collection);
        }

        @Override // com.google.common.collect.k, com.google.common.collect.d
        /* JADX INFO: renamed from: F */
        public Set<V> t() {
            return this.h.get();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Map<K, Collection<V>> b() {
            return v();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Set<K> f() {
            return w();
        }
    }

    public static class e<K, V> extends com.google.common.collect.n<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient Supplier<? extends SortedSet<V>> h;
        public transient Comparator<? super V> i;

        public e(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
            super(map);
            this.h = (Supplier) Preconditions.checkNotNull(supplier);
            this.i = supplier.get().comparator();
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Supplier<? extends SortedSet<V>> supplier = (Supplier) objectInputStream.readObject();
            this.h = supplier;
            this.i = supplier.get().comparator();
            B((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.h);
            objectOutputStream.writeObject(s());
        }

        @Override // com.google.common.collect.n, com.google.common.collect.k, com.google.common.collect.d
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> t() {
            return this.h.get();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Map<K, Collection<V>> b() {
            return v();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.g
        public Set<K> f() {
            return w();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return this.i;
        }
    }

    public static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract Multimap<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static class g<K, V> extends com.google.common.collect.h<K> {

        @Weak
        public final Multimap<K, V> c;

        public class a extends x2<Map.Entry<K, Collection<V>>, Multiset.Entry<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$g$a$a, reason: collision with other inner class name */
            public class C0183a extends Multisets.f<K> {
                public final /* synthetic */ Map.Entry a;

                public C0183a(Map.Entry entry) {
                    this.a = entry;
                }

                @Override // com.google.common.collect.Multiset.Entry
                public int getCount() {
                    return ((Collection) this.a.getValue()).size();
                }

                @Override // com.google.common.collect.Multiset.Entry
                public K getElement() {
                    return (K) this.a.getKey();
                }
            }

            public a(Iterator it2) {
                super(it2);
            }

            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0183a(entry);
            }
        }

        public g(Multimap<K, V> multimap) {
            this.c = multimap;
        }

        @Override // com.google.common.collect.h
        public int b() {
            return this.c.asMap().size();
        }

        @Override // com.google.common.collect.h
        public Iterator<K> c() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.c.clear();
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            return this.c.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(@NullableDecl Object obj) {
            Collection collection = (Collection) Maps.G(this.c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<K>> e() {
            return new a(this.c.asMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.h, com.google.common.collect.Multiset
        public Set<K> elementSet() {
            return this.c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<K> iterator() {
            return Maps.w(this.c.entries().iterator());
        }

        @Override // com.google.common.collect.h, com.google.common.collect.Multiset
        public int remove(@NullableDecl Object obj, int i) {
            u.b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.G(this.c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it2 = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it2.next();
                    it2.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.c.size();
        }
    }

    public static class h<K, V> extends com.google.common.collect.g<K, V> implements SetMultimap<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        public final Map<K, V> f;

        public class a extends Sets.k<V> {
            public final /* synthetic */ Object a;

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$h$a$a, reason: collision with other inner class name */
            public class C0184a implements Iterator<V> {
                public int a;

                public C0184a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.a == 0) {
                        a aVar = a.this;
                        if (h.this.f.containsKey(aVar.a)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.a++;
                    a aVar = a.this;
                    return h.this.f.get(aVar.a);
                }

                @Override // java.util.Iterator
                public void remove() {
                    u.e(this.a == 1);
                    this.a = -1;
                    a aVar = a.this;
                    h.this.f.remove(aVar.a);
                }
            }

            public a(Object obj) {
                this.a = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0184a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.f.containsKey(this.a) ? 1 : 0;
            }
        }

        public h(Map<K, V> map) {
            this.f = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.collect.g
        public Map<K, Collection<V>> b() {
            return new a(this);
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.f.clear();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
            return this.f.entrySet().contains(Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.f.containsKey(obj);
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            return this.f.containsValue(obj);
        }

        @Override // com.google.common.collect.g
        public Collection<Map.Entry<K, V>> e() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.g
        public Set<K> f() {
            return this.f.keySet();
        }

        @Override // com.google.common.collect.g
        public Multiset<K> g() {
            return new g(this);
        }

        @Override // com.google.common.collect.g
        public Collection<V> h() {
            return this.f.values();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public int hashCode() {
            return this.f.hashCode();
        }

        @Override // com.google.common.collect.g
        public Iterator<Map.Entry<K, V>> i() {
            return this.f.entrySet().iterator();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return this.f.entrySet().remove(Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.f.size();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return this.f.entrySet();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(K k) {
            return new a(k);
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class i<K, V1, V2> extends j<K, V1, V2> implements ListMultimap<K, V2> {
        public i(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        @Override // com.google.common.collect.Multimaps.j
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<V2> k(K k, Collection<V1> collection) {
            return Lists.transform((List) collection, Maps.j(this.g, k));
        }

        @Override // com.google.common.collect.Multimaps.j, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> get(K k) {
            return k(k, this.f.get(k));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.j, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> removeAll(Object obj) {
            return k(obj, this.f.removeAll(obj));
        }

        @Override // com.google.common.collect.Multimaps.j, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class j<K, V1, V2> extends com.google.common.collect.g<K, V2> {
        public final Multimap<K, V1> f;
        public final Maps.EntryTransformer<? super K, ? super V1, V2> g;

        public class a implements Maps.EntryTransformer<K, Collection<V1>, Collection<V2>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.EntryTransformer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V2> transformEntry(K k, Collection<V1> collection) {
                return j.this.k(k, collection);
            }
        }

        public j(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.f = (Multimap) Preconditions.checkNotNull(multimap);
            this.g = (Maps.EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.g
        public Map<K, Collection<V2>> b() {
            return Maps.transformEntries(this.f.asMap(), new a());
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.f.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.f.containsKey(obj);
        }

        @Override // com.google.common.collect.g
        public Collection<Map.Entry<K, V2>> e() {
            return new com.google.common.collect.g.a();
        }

        @Override // com.google.common.collect.g
        public Set<K> f() {
            return this.f.keySet();
        }

        @Override // com.google.common.collect.g
        public Multiset<K> g() {
            return this.f.keys();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> get(K k) {
            return k(k, this.f.get(k));
        }

        @Override // com.google.common.collect.g
        public Collection<V2> h() {
            return Collections2.transform(this.f.entries(), Maps.g(this.g));
        }

        @Override // com.google.common.collect.g
        public Iterator<Map.Entry<K, V2>> i() {
            return Iterators.transform(this.f.entries().iterator(), Maps.f(this.g));
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.f.isEmpty();
        }

        public Collection<V2> k(K k, Collection<V1> collection) {
            Function functionJ = Maps.j(this.g, k);
            return collection instanceof List ? Lists.transform((List) collection, functionJ) : Collections2.transform(collection, functionJ);
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean put(K k, V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> removeAll(Object obj) {
            return k(obj, this.f.removeAll(obj));
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.f.size();
        }

        @Override // com.google.common.collect.g, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    public static class k<K, V> extends l<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public k(ListMultimap<K, V> listMultimap) {
            super(listMultimap);
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> get(K k) {
            return Collections.unmodifiableList(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public ListMultimap<K, V> delegate() {
            return (ListMultimap) super.delegate();
        }
    }

    public static class l<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Multimap<K, V> a;

        @MonotonicNonNullDecl
        public transient Collection<Map.Entry<K, V>> b;

        @MonotonicNonNullDecl
        public transient Multiset<K> c;

        @MonotonicNonNullDecl
        public transient Set<K> d;

        @MonotonicNonNullDecl
        public transient Collection<V> e;

        @MonotonicNonNullDecl
        public transient Map<K, Collection<V>> f;

        public class a implements Function<Collection<V>, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.base.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return Multimaps.g(collection);
            }
        }

        public l(Multimap<K, V> multimap) {
            this.a = (Multimap) Preconditions.checkNotNull(multimap);
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(Maps.transformValues(this.a.asMap(), new a()));
            this.f = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.b;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionF = Multimaps.f(this.a.entries());
            this.b = collectionF;
            return collectionF;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> get(K k) {
            return Multimaps.g(this.a.get(k));
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set = this.d;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.a.keySet());
            this.d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Multiset<K> keys() {
            Multiset<K> multiset = this.c;
            if (multiset != null) {
                return multiset;
            }
            Multiset<K> multisetUnmodifiableMultiset = Multisets.unmodifiableMultiset(this.a.keys());
            this.c = multisetUnmodifiableMultiset;
            return multisetUnmodifiableMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection = this.e;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.a.values());
            this.e = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public Multimap<K, V> delegate() {
            return this.a;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    public static class m<K, V> extends l<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public m(SetMultimap<K, V> setMultimap) {
            super(setMultimap);
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return Maps.M(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(K k) {
            return Collections.unmodifiableSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public SetMultimap<K, V> delegate() {
            return (SetMultimap) super.delegate();
        }
    }

    private Multimaps() {
    }

    @Beta
    public static <K, V> Map<K, List<V>> asMap(ListMultimap<K, V> listMultimap) {
        return listMultimap.asMap();
    }

    public static boolean c(Multimap<?, ?> multimap, @NullableDecl Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }

    private static <K, V> Multimap<K, V> d(r0<K, V> r0Var, Predicate<? super Map.Entry<K, V>> predicate) {
        return new m0(r0Var.a(), Predicates.and(r0Var.c(), predicate));
    }

    private static <K, V> SetMultimap<K, V> e(t0<K, V> t0Var, Predicate<? super Map.Entry<K, V>> predicate) {
        return new n0(t0Var.a(), Predicates.and(t0Var.c(), predicate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> f(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? Maps.M((Set) collection) : new Maps.l0(Collections.unmodifiableCollection(collection));
    }

    public static <K, V> Multimap<K, V> filterEntries(Multimap<K, V> multimap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (multimap instanceof SetMultimap) {
            return filterEntries((SetMultimap) multimap, (Predicate) predicate);
        }
        return multimap instanceof r0 ? d((r0) multimap, predicate) : new m0((Multimap) Preconditions.checkNotNull(multimap), predicate);
    }

    public static <K, V> Multimap<K, V> filterKeys(Multimap<K, V> multimap, Predicate<? super K> predicate) {
        if (multimap instanceof SetMultimap) {
            return filterKeys((SetMultimap) multimap, (Predicate) predicate);
        }
        if (multimap instanceof ListMultimap) {
            return filterKeys((ListMultimap) multimap, (Predicate) predicate);
        }
        if (!(multimap instanceof p0)) {
            return multimap instanceof r0 ? d((r0) multimap, Maps.y(predicate)) : new p0(multimap, predicate);
        }
        p0 p0Var = (p0) multimap;
        return new p0(p0Var.f, Predicates.and(p0Var.g, predicate));
    }

    public static <K, V> Multimap<K, V> filterValues(Multimap<K, V> multimap, Predicate<? super V> predicate) {
        return filterEntries(multimap, Maps.S(predicate));
    }

    public static <K, V> SetMultimap<K, V> forMap(Map<K, V> map) {
        return new h(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> g(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterable<V> iterable, Function<? super V, K> function) {
        return index(iterable.iterator(), function);
    }

    @CanIgnoreReturnValue
    public static <K, V, M extends Multimap<K, V>> M invertFrom(Multimap<? extends V, ? extends K> multimap, M m2) {
        Preconditions.checkNotNull(m2);
        for (Map.Entry<? extends V, ? extends K> entry : multimap.entries()) {
            m2.put(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public static <K, V> ListMultimap<K, V> newListMultimap(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new b(map, supplier);
    }

    public static <K, V> Multimap<K, V> newMultimap(Map<K, Collection<V>> map, Supplier<? extends Collection<V>> supplier) {
        return new c(map, supplier);
    }

    public static <K, V> SetMultimap<K, V> newSetMultimap(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
        return new d(map, supplier);
    }

    public static <K, V> SortedSetMultimap<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
        return new e(map, supplier);
    }

    public static <K, V> ListMultimap<K, V> synchronizedListMultimap(ListMultimap<K, V> listMultimap) {
        return v2.k(listMultimap, null);
    }

    public static <K, V> Multimap<K, V> synchronizedMultimap(Multimap<K, V> multimap) {
        return v2.m(multimap, null);
    }

    public static <K, V> SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> setMultimap) {
        return v2.v(setMultimap, null);
    }

    public static <K, V> SortedSetMultimap<K, V> synchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return v2.y(sortedSetMultimap, null);
    }

    public static <K, V1, V2> Multimap<K, V2> transformEntries(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new j(multimap, entryTransformer);
    }

    public static <K, V1, V2> Multimap<K, V2> transformValues(Multimap<K, V1> multimap, Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, Maps.h(function));
    }

    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
        return ((listMultimap instanceof k) || (listMultimap instanceof ImmutableListMultimap)) ? listMultimap : new k(listMultimap);
    }

    public static <K, V> Multimap<K, V> unmodifiableMultimap(Multimap<K, V> multimap) {
        return ((multimap instanceof l) || (multimap instanceof ImmutableMultimap)) ? multimap : new l(multimap);
    }

    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
        return ((setMultimap instanceof m) || (setMultimap instanceof ImmutableSetMultimap)) ? setMultimap : new m(setMultimap);
    }

    public static <K, V> SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap instanceof n ? sortedSetMultimap : new n(sortedSetMultimap);
    }

    public static class n<K, V> extends m<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public n(SortedSetMultimap<K, V> sortedSetMultimap) {
            super(sortedSetMultimap);
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        @Override // com.google.common.collect.Multimaps.m, com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.m, com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.m, com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.m, com.google.common.collect.Multimaps.l, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public SortedSetMultimap<K, V> delegate() {
            return (SortedSetMultimap) super.delegate();
        }
    }

    @Beta
    public static <K, V> Map<K, Set<V>> asMap(SetMultimap<K, V> setMultimap) {
        return setMultimap.asMap();
    }

    public static <K, V> SetMultimap<K, V> filterValues(SetMultimap<K, V> setMultimap, Predicate<? super V> predicate) {
        return filterEntries((SetMultimap) setMultimap, Maps.S(predicate));
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterator<V> it2, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        while (it2.hasNext()) {
            V next = it2.next();
            Preconditions.checkNotNull(next, it2);
            builder.put((Object) function.apply(next), (Object) next);
        }
        return builder.build();
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformEntries(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new i(listMultimap, entryTransformer);
    }

    @Beta
    public static <K, V> Map<K, SortedSet<V>> asMap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap.asMap();
    }

    @Deprecated
    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ImmutableListMultimap<K, V> immutableListMultimap) {
        return (ListMultimap) Preconditions.checkNotNull(immutableListMultimap);
    }

    @Deprecated
    public static <K, V> Multimap<K, V> unmodifiableMultimap(ImmutableMultimap<K, V> immutableMultimap) {
        return (Multimap) Preconditions.checkNotNull(immutableMultimap);
    }

    @Deprecated
    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(ImmutableSetMultimap<K, V> immutableSetMultimap) {
        return (SetMultimap) Preconditions.checkNotNull(immutableSetMultimap);
    }

    @Beta
    public static <K, V> Map<K, Collection<V>> asMap(Multimap<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformValues(ListMultimap<K, V1> listMultimap, Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries((ListMultimap) listMultimap, Maps.h(function));
    }

    public static <K, V> SetMultimap<K, V> filterEntries(SetMultimap<K, V> setMultimap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (setMultimap instanceof t0) {
            return e((t0) setMultimap, predicate);
        }
        return new n0((SetMultimap) Preconditions.checkNotNull(setMultimap), predicate);
    }

    public static <K, V> SetMultimap<K, V> filterKeys(SetMultimap<K, V> setMultimap, Predicate<? super K> predicate) {
        if (setMultimap instanceof q0) {
            q0 q0Var = (q0) setMultimap;
            return new q0(q0Var.a(), Predicates.and(q0Var.g, predicate));
        }
        if (setMultimap instanceof t0) {
            return e((t0) setMultimap, Maps.y(predicate));
        }
        return new q0(setMultimap, predicate);
    }

    public static <K, V> ListMultimap<K, V> filterKeys(ListMultimap<K, V> listMultimap, Predicate<? super K> predicate) {
        if (listMultimap instanceof o0) {
            o0 o0Var = (o0) listMultimap;
            return new o0(o0Var.a(), Predicates.and(o0Var.g, predicate));
        }
        return new o0(listMultimap, predicate);
    }
}
