package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class ImmutableSortedMap<K, V> extends k1<K, V> implements NavigableMap<K, V> {
    private static final Comparator<Comparable> i = Ordering.natural();
    private static final ImmutableSortedMap<Comparable, Object> j = new ImmutableSortedMap<>(ImmutableSortedSet.q(Ordering.natural()), ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient g2<K> f;
    private final transient ImmutableList<V> g;
    private transient ImmutableSortedMap<K, V> h;

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        private transient Object[] e;
        private transient Object[] f;
        private final Comparator<? super K> g;

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private void a(int i) {
            Object[] objArr = this.e;
            if (i > objArr.length) {
                int iA = ImmutableCollection.Builder.a(objArr.length, i);
                this.e = Arrays.copyOf(this.e, iA);
                this.f = Arrays.copyOf(this.f, iA);
            }
        }

        private Builder(Comparator<? super K> comparator, int i) {
            this.g = (Comparator) Preconditions.checkNotNull(comparator);
            this.e = new Object[i];
            this.f = new Object[i];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
            int i = this.c;
            if (i == 0) {
                return ImmutableSortedMap.q(this.g);
            }
            if (i == 1) {
                return ImmutableSortedMap.u(this.g, this.e[0], this.f[0]);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i);
            Arrays.sort(objArrCopyOf, this.g);
            Object[] objArr = new Object[this.c];
            for (int i2 = 0; i2 < this.c; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.g.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                    }
                }
                objArr[Arrays.binarySearch(objArrCopyOf, this.e[i2], this.g)] = this.f[i2];
            }
            return new ImmutableSortedMap<>(new g2(ImmutableList.g(objArrCopyOf), this.g), ImmutableList.g(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        @Deprecated
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            a(this.c + 1);
            u.a(k, v);
            Object[] objArr = this.e;
            int i = this.c;
            objArr[i] = k;
            this.f[i] = v;
            this.c = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }
    }

    public static class a implements Comparator<Map.Entry<K, V>> {
        public final /* synthetic */ Comparator a;

        public a(Comparator comparator) {
            this.a = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            return this.a.compare(entry.getKey(), entry2.getKey());
        }
    }

    public class b extends g1<K, V> {

        public class a extends ImmutableList<Map.Entry<K, V>> {
            public a() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean f() {
                return true;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i) {
                return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f.asList().get(i), ImmutableSortedMap.this.g.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return ImmutableSortedMap.this.size();
            }
        }

        public b() {
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> k() {
            return new a();
        }

        @Override // com.google.common.collect.g1
        public ImmutableMap<K, V> o() {
            return ImmutableSortedMap.this;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static class c extends ImmutableMap.d {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> c;

        public c(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.c = immutableSortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.d
        public Object readResolve() {
            return a(new Builder(this.c));
        }
    }

    public ImmutableSortedMap(g2<K> g2Var, ImmutableList<V> immutableList) {
        this(g2Var, immutableList, null);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return p(map, (Ordering) i);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = i;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.j()) {
                return immutableSortedMap;
            }
        }
        return r(comparator, true, sortedMap.entrySet());
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <K, V> ImmutableSortedMap<K, V> of() {
        return (ImmutableSortedMap<K, V>) j;
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
        return new Builder<>(comparator);
    }

    private static <K, V> ImmutableSortedMap<K, V> p(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == i) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.j()) {
                return immutableSortedMap;
            }
        }
        return r(comparator, zEquals, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> q(Comparator<? super K> comparator) {
        return Ordering.natural().equals(comparator) ? of() : new ImmutableSortedMap<>(ImmutableSortedSet.q(comparator), ImmutableList.of());
    }

    private static <K, V> ImmutableSortedMap<K, V> r(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.g(iterable, ImmutableMap.e);
        return s(comparator, z, entryArr, entryArr.length);
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    private static <K, V> ImmutableSortedMap<K, V> s(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i2) {
        if (i2 == 0) {
            return q(comparator);
        }
        if (i2 == 1) {
            return u(comparator, entryArr[0].getKey(), entryArr[0].getValue());
        }
        Object[] objArr = new Object[i2];
        Object[] objArr2 = new Object[i2];
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                K key = entryArr[i3].getKey();
                V value = entryArr[i3].getValue();
                u.a(key, value);
                objArr[i3] = key;
                objArr2[i3] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i2, new a(comparator));
            Object key2 = entryArr[0].getKey();
            objArr[0] = key2;
            objArr2[0] = entryArr[0].getValue();
            u.a(objArr[0], objArr2[0]);
            int i4 = 1;
            while (i4 < i2) {
                Object key3 = entryArr[i4].getKey();
                V value2 = entryArr[i4].getValue();
                u.a(key3, value2);
                objArr[i4] = key3;
                objArr2[i4] = value2;
                ImmutableMap.a(comparator.compare(key2, key3) != 0, "key", entryArr[i4 - 1], entryArr[i4]);
                i4++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new g2(ImmutableList.g(objArr), comparator), ImmutableList.g(objArr2));
    }

    private ImmutableSortedMap<K, V> t(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        return i2 == i3 ? q(comparator()) : new ImmutableSortedMap<>(this.f.w(i2, i3), this.g.subList(i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> ImmutableSortedMap<K, V> u(Comparator<? super K> comparator, K k, V v) {
        return new ImmutableSortedMap<>(new g2(ImmutableList.of(k), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.of(v));
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> v(Map.Entry<K, V>... entryArr) {
        return s(Ordering.natural(), false, entryArr, entryArr.length);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap((Object) k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.x(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> e() {
        return isEmpty() ? ImmutableSet.of() : new b();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap((Object) k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.x(floorEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iIndexOf = this.f.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.g.get(iIndexOf);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap((Object) k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) Maps.x(higherEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean j() {
        return this.f.f() || this.g.f();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap((Object) k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.x(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.g.size();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new c(this);
    }

    public ImmutableSortedMap(g2<K> g2Var, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f = g2Var;
        this.g = immutableList;
        this.h = immutableSortedMap;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj) {
        return u(Ordering.natural(), comparable, obj);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.h;
        if (immutableSortedMap == null) {
            return isEmpty() ? q(Ordering.from(comparator()).reverse()) : new ImmutableSortedMap<>((g2) this.f.descendingSet(), this.g.reverse(), this);
        }
        return immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableCollection<V> values() {
        return this.g;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return p(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return v(ImmutableMap.h(comparable, obj), ImmutableMap.h(comparable2, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap((Object) k, false);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.f;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap((Object) k, true, (Object) k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap((Object) k, true);
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Ordering) i);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return v(ImmutableMap.h(comparable, obj), ImmutableMap.h(comparable2, obj2), ImmutableMap.h(comparable3, obj3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return t(0, this.f.x((K) Preconditions.checkNotNull(k), z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(k2);
        Preconditions.checkArgument(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap((Object) k2, z2).tailMap((Object) k, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return t(this.f.y((K) Preconditions.checkNotNull(k), z), size());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return v(ImmutableMap.h(comparable, obj), ImmutableMap.h(comparable2, obj2), ImmutableMap.h(comparable3, obj3), ImmutableMap.h(comparable4, obj4));
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return r((Comparator) Preconditions.checkNotNull(comparator), false, iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return v(ImmutableMap.h(comparable, obj), ImmutableMap.h(comparable2, obj2), ImmutableMap.h(comparable3, obj3), ImmutableMap.h(comparable4, obj4), ImmutableMap.h(comparable5, obj5));
    }
}
