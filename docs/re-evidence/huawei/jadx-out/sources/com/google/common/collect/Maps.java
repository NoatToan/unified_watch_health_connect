package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ale;
import defpackage.alf;
import defpackage.alx;
import defpackage.aml;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Maps {

    enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public interface EntryTransformer<K, V1, V2> {
        @ParametricNullness
        V2 transformEntry(@ParametricNullness K k, @ParametricNullness V1 v1);
    }

    static <K> Function<Map.Entry<K, ?>, K> e() {
        return EntryFunction.KEY;
    }

    static <V> Function<Map.Entry<?, V>, V> h() {
        return EntryFunction.VALUE;
    }

    static <K, V> Iterator<K> d(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, K>(it) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public K transform(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, V>(it) { // from class: com.google.common.collect.Maps.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V transform(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <K, V> HashMap<K, V> a() {
        return new HashMap<>();
    }

    static int b(int i) {
        if (i < 3) {
            ale.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> LinkedHashMap<K, V> c() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> c(int i) {
        return new LinkedHashMap<>(b(i));
    }

    public static <K, V> ConcurrentMap<K, V> d() {
        return new ConcurrentHashMap();
    }

    public static <K, V> IdentityHashMap<K, V> b() {
        return new IdentityHashMap<>();
    }

    public static <K, V> Map<K, V> d(Set<K> set, Function<? super K, V> function) {
        return new d(set, function);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class d<K, V> extends ViewCachingAbstractMap<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<K> f4445c;
        final Function<? super K, V> d;

        Set<K> e() {
            return this.f4445c;
        }

        d(Set<K> set, Function<? super K, V> function) {
            this.f4445c = (Set) Preconditions.checkNotNull(set);
            this.d = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: createKeySet */
        public Set<K> d() {
            return Maps.a(e());
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
            return alf.c((Collection) this.f4445c, (Function) this.d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return e().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return e().contains(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            if (alf.a(e(), obj)) {
                return this.d.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            if (e().remove(obj)) {
                return this.d.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            e().clear();
        }

        class a extends EntrySet<K, V> {
            a() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, V> map() {
                return d.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return Maps.e(d.this.e(), d.this.d);
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
            return new a();
        }
    }

    static <K, V> Iterator<Map.Entry<K, V>> e(Set<K> set, final Function<? super K, V> function) {
        return new TransformedIterator<K, Map.Entry<K, V>>(set.iterator()) { // from class: com.google.common.collect.Maps.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> transform(@ParametricNullness K k) {
                return Maps.c(k, function.apply(k));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> a(final Set<E> set) {
        return new ForwardingSet<E>() { // from class: com.google.common.collect.Maps.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<E> delegate() {
                return set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean add(@ParametricNullness E e2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static <K, V> ImmutableMap<K, V> a(Iterable<K> iterable, Function<? super K, V> function) {
        return c((Iterator) iterable.iterator(), (Function) function);
    }

    public static <K, V> ImmutableMap<K, V> c(Iterator<K> it, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.b bVarBuilder = ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            bVarBuilder.c(next, function.apply(next));
        }
        return bVarBuilder.b();
    }

    public static <K, V> ImmutableMap<K, V> d(Iterable<V> iterable, Function<? super V, K> function) {
        if (iterable instanceof Collection) {
            return a(iterable.iterator(), function, ImmutableMap.builderWithExpectedSize(((Collection) iterable).size()));
        }
        return b(iterable.iterator(), function);
    }

    public static <K, V> ImmutableMap<K, V> b(Iterator<V> it, Function<? super V, K> function) {
        return a(it, function, ImmutableMap.builder());
    }

    private static <K, V> ImmutableMap<K, V> a(Iterator<V> it, Function<? super V, K> function, ImmutableMap.b<K, V> bVar) {
        Preconditions.checkNotNull(function);
        while (it.hasNext()) {
            V next = it.next();
            bVar.c(function.apply(next), next);
        }
        try {
            return bVar.j();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> Map.Entry<K, V> c(@ParametricNullness K k, @ParametricNullness V v) {
        return new alx(k, v);
    }

    static <K, V> Map.Entry<K, V> e(final Map.Entry<? extends K, ? extends V> entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V>() { // from class: com.google.common.collect.Maps.3
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public K getKey() {
                return (K) entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public V getValue() {
                return (V) entry.getValue();
            }
        };
    }

    static <K> Predicate<Map.Entry<K, ?>> a(Predicate<? super K> predicate) {
        return Predicates.compose(predicate, e());
    }

    static <V> Predicate<Map.Entry<?, V>> e(Predicate<? super V> predicate) {
        return Predicates.compose(predicate, h());
    }

    /* JADX INFO: loaded from: classes21.dex */
    static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        final Predicate<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            this.unfiltered = map;
            this.predicate = predicate;
        }

        boolean apply(@CheckForNull Object obj, @ParametricNullness V v) {
            return this.predicate.apply(Maps.c(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(@ParametricNullness K k, @ParametricNullness V v) {
            Preconditions.checkArgument(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.checkArgument(apply(entry.getKey(), entry.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            V v = this.unfiltered.get(obj);
            if (v == null || !apply(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            if (containsKey(obj)) {
                return this.unfiltered.remove(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
            return new b(this, this.unfiltered, this.predicate);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class b<K, V> extends g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f4442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Predicate<? super Map.Entry<K, V>> f4443b;

        b(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map);
            this.f4442a = map2;
            this.f4443b = predicate;
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f4442a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f4443b.apply(next) && Objects.equal(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f4442a.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f4443b.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f4442a.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f4443b.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return aml.a(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) aml.a(iterator()).toArray(tArr);
        }
    }

    static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        @CheckForNull
        @LazyInit
        private transient Set<Map.Entry<K, V>> entrySet;

        @CheckForNull
        @LazyInit
        private transient Set<K> keySet;

        @CheckForNull
        @LazyInit
        private transient Collection<V> values;

        abstract Set<Map.Entry<K, V>> createEntrySet();

        ViewCachingAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setD = d();
            this.keySet = setD;
            return setD;
        }

        /* JADX INFO: renamed from: createKeySet */
        Set<K> d() {
            return new c(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionCreateValues = createValues();
            this.values = collectionCreateValues;
            return collectionCreateValues;
        }

        Collection<V> createValues() {
            return new g(this);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();

        IteratorBasedAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.5
                @Override // com.google.common.collect.Maps.EntrySet
                Map<K, V> map() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedAbstractMap.this.entryIterator();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.d(entryIterator());
        }
    }

    @CheckForNull
    static <V> V a(Map<?, V> map, @CheckForNull Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean c(Map<?, ?> map, @CheckForNull Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @CheckForNull
    static <V> V h(Map<?, V> map, @CheckForNull Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, @CheckForNull Object obj) {
        return Iterators.b((Iterator<?>) d(map.entrySet().iterator()), obj);
    }

    static boolean d(Map<?, ?> map, @CheckForNull Object obj) {
        return Iterators.b((Iterator<?>) b(map.entrySet().iterator()), obj);
    }

    static <K, V> boolean a(Collection<Map.Entry<K, V>> collection, @CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(e((Map.Entry) obj));
        }
        return false;
    }

    static boolean e(Map<?, ?> map, @CheckForNull Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String a(Map<?, ?> map) {
        StringBuilder sbC = alf.c(map.size());
        sbC.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbC.append(", ");
            }
            sbC.append(entry.getKey());
            sbC.append('=');
            sbC.append(entry.getValue());
            z = false;
        }
        sbC.append('}');
        return sbC.toString();
    }

    static <K, V> void c(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static class c<K, V> extends Sets.ImprovedAbstractSet<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<K, V> f4444c;

        c(Map<K, V> map) {
            this.f4444c = (Map) Preconditions.checkNotNull(map);
        }

        Map<K, V> c() {
            return this.f4444c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.d(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            c().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }
    }

    @CheckForNull
    public static <K> K d(@CheckForNull Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class a<K, V> extends c<K, V> implements SortedSet<K> {
        a(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> c() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new a(c().subMap(k, k2));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new a(c().headMap(k));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new a(c().tailMap(k));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K first() {
            return c().firstKey();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K last() {
            return c().lastKey();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class e<K, V> extends a<K, V> implements NavigableSet<K> {
        e(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.a, com.google.common.collect.Maps.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V> c() {
            return (NavigableMap) this.f4444c;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(@ParametricNullness K k) {
            return c().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(@ParametricNullness K k) {
            return c().floorKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(@ParametricNullness K k) {
            return c().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(@ParametricNullness K k) {
            return c().higherKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) Maps.d(c().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) Maps.d(c().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return c().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return c().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.a, java.util.SortedSet
        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return c().headMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.a, java.util.SortedSet
        public SortedSet<K> headSet(@ParametricNullness K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return c().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.a, java.util.SortedSet
        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return tailSet(k, true);
        }
    }

    static class g<K, V> extends AbstractCollection<V> {
        final Map<K, V> d;

        g(Map<K, V> map) {
            this.d = (Map) Preconditions.checkNotNull(map);
        }

        final Map<K, V> e() {
            return this.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.b(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = Sets.a();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = Sets.a();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return e().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }
    }

    static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        abstract Map<K, V> map();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objA = Maps.a((Map<?, Object>) map(), key);
            if (Objects.equal(objA, entry.getValue())) {
                return objA != null || map().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return map().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.c(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = Sets.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetA.add(((Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(hashSetA);
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        @CheckForNull
        @LazyInit
        private transient Comparator<? super K> comparator;

        @CheckForNull
        @LazyInit
        private transient Set<Map.Entry<K, V>> entrySet;

        @CheckForNull
        @LazyInit
        private transient NavigableSet<K> navigableKeySet;

        abstract Iterator<Map.Entry<K, V>> entryIterator();

        abstract NavigableMap<K, V> forward();

        DescendingMap() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<K, V> delegate() {
            return forward();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.comparator;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = forward().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingReverse = reverse(comparator2);
            this.comparator = orderingReverse;
            return orderingReverse;
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return forward().lastKey();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return forward().firstKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
            return forward().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@ParametricNullness K k) {
            return forward().higherKey(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
            return forward().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@ParametricNullness K k) {
            return forward().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
            return forward().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@ParametricNullness K k) {
            return forward().floorKey(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
            return forward().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@ParametricNullness K k) {
            return forward().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return forward().lastEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return forward().firstEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            return forward().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            return forward().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return forward();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        class a extends EntrySet<K, V> {
            a() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, V> map() {
                return DescendingMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return DescendingMap.this.entryIterator();
            }
        }

        Set<Map.Entry<K, V>> createEntrySet() {
            return new a();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            e eVar = new e(this);
            this.navigableKeySet = eVar;
            return eVar;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return forward().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return forward().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return forward().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return forward().headMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            return new g(this);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }
    }

    public static <E> ImmutableMap<E, Integer> c(Collection<E> collection) {
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bVar.c(it.next(), Integer.valueOf(i));
            i++;
        }
        return bVar.j();
    }
}
