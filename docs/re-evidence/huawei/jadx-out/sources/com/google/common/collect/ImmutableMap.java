package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ajz;
import defpackage.ale;
import defpackage.alw;
import defpackage.alz;
import defpackage.amf;
import defpackage.anb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @CheckForNull
    @LazyInit
    private transient ImmutableSet<K> keySet;

    @CheckForNull
    @LazyInit
    private transient amf<K, V> multimapView;

    @CheckForNull
    @LazyInit
    private transient ImmutableCollection<V> values;

    protected abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    protected abstract ImmutableSet<K> createKeySet();

    protected abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    boolean isHashCodeFast() {
        return false;
    }

    protected abstract boolean isPartialView();

    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return ajz.c(function, function2);
    }

    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return ajz.a(function, function2, binaryOperator);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) anb.e;
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v) {
        ale.d(k, v);
        return anb.c(1, new Object[]{k, v});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2) {
        ale.d(k, v);
        ale.d(k2, v2);
        return anb.c(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        return anb.c(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        return anb.c(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        return anb.c(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        return anb.c(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        return anb.c(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        return anb.c(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        ale.d(k9, v9);
        return anb.c(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        ale.d(k9, v9);
        ale.d(k10, v10);
        return anb.c(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        ale.d(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    public static <K, V> b<K, V> builder() {
        return new b<>();
    }

    public static <K, V> b<K, V> builderWithExpectedSize(int i) {
        ale.b(i, "expectedSize");
        return new b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    @DoNotMock
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        Comparator<? super V> f4362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object[] f4364c;
        public C0045b d;
        protected int e;

        public b() {
            this(4);
        }

        public b(int i) {
            this.f4364c = new Object[i * 2];
            this.e = 0;
            this.f4363b = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f4364c;
            if (i2 > objArr.length) {
                this.f4364c = Arrays.copyOf(objArr, ImmutableCollection.Builder.expandedCapacity(objArr.length, i2));
                this.f4363b = false;
            }
        }

        public b<K, V> c(K k, V v) {
            a(this.e + 1);
            ale.d(k, v);
            Object[] objArr = this.f4364c;
            int i = this.e;
            int i2 = i * 2;
            objArr[i2] = k;
            objArr[i2 + 1] = v;
            this.e = i + 1;
            return this;
        }

        public b<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        public b<K, V> b(Map<? extends K, ? extends V> map) {
            return d(map.entrySet());
        }

        public b<K, V> d(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.e + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            return this;
        }

        public b<K, V> d(b<K, V> bVar) {
            Preconditions.checkNotNull(bVar);
            a(this.e + bVar.e);
            System.arraycopy(bVar.f4364c, 0, this.f4364c, this.e * 2, bVar.e * 2);
            this.e += bVar.e;
            return this;
        }

        private ImmutableMap<K, V> e(boolean z) {
            Object[] objArrD;
            C0045b c0045b;
            C0045b c0045b2;
            if (z && (c0045b2 = this.d) != null) {
                throw c0045b2.d();
            }
            int length = this.e;
            if (this.f4362a == null) {
                objArrD = this.f4364c;
            } else {
                if (this.f4363b) {
                    this.f4364c = Arrays.copyOf(this.f4364c, length * 2);
                }
                objArrD = this.f4364c;
                if (!z) {
                    objArrD = d(objArrD, this.e);
                    if (objArrD.length < this.f4364c.length) {
                        length = objArrD.length >>> 1;
                    }
                }
                d(objArrD, length, this.f4362a);
            }
            this.f4363b = true;
            anb anbVarA = anb.a(length, objArrD, this);
            if (!z || (c0045b = this.d) == null) {
                return anbVarA;
            }
            throw c0045b.d();
        }

        public ImmutableMap<K, V> d() {
            return j();
        }

        public ImmutableMap<K, V> j() {
            return e(true);
        }

        public ImmutableMap<K, V> b() {
            return e(false);
        }

        static <V> void d(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(objArr[i3]), Objects.requireNonNull(objArr[i3 + 1]));
            }
            Arrays.sort(entryArr, 0, i, Ordering.from(comparator).onResultOf(Maps.h()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        private Object[] d(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!hashSet.add(Objects.requireNonNull(objArr[i2 * 2]))) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    objArr2[i4] = Objects.requireNonNull(objArr[i3]);
                    objArr2[i4 + 1] = Objects.requireNonNull(objArr[i3 + 1]);
                    i4 += 2;
                    i3 += 2;
                }
            }
            return objArr2;
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$b$b, reason: collision with other inner class name */
        public static final class C0045b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f4365a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f4366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f4367c;

            public C0045b(Object obj, Object obj2, Object obj3) {
                this.f4365a = obj;
                this.f4367c = obj2;
                this.f4366b = obj3;
            }

            public IllegalArgumentException d() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f4365a + "=" + this.f4367c + " and " + this.f4365a + "=" + this.f4366b);
            }
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.d(iterable);
        return bVar.d();
    }

    /* JADX INFO: loaded from: classes21.dex */
    static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected ImmutableSet<K> createKeySet() {
            return new alw(this);
        }

        class c extends ImmutableMapEntrySet<K, V> {
            c() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableMapEntrySet
            protected ImmutableMap<K, V> map() {
                return IteratorBasedImmutableMap.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return IteratorBasedImmutableMap.this.entryIterator();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected ImmutableCollection<V> createValues() {
            return new alz(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map, java.util.SortedMap
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map, java.util.SortedMap
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    public UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map, java.util.SortedMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    public amf<K, V> asMultimap() {
        if (isEmpty()) {
            return amf.e();
        }
        amf<K, V> amfVar = this.multimapView;
        if (amfVar != null) {
            return amfVar;
        }
        amf<K, V> amfVar2 = new amf<>(new a(), size(), null);
        this.multimapView = amfVar2;
        return amfVar2;
    }

    /* JADX INFO: loaded from: classes21.dex */
    final class a extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private a() {
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        protected ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.a.4
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.a.4.4
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.e(this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.d(entrySet());
    }

    public String toString() {
        return Maps.a(this);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class e<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object d;
        private final Object e;

        public e(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.e = objArr;
            this.d = objArr2;
        }

        final Object readResolve() {
            Object obj = this.e;
            if (!(obj instanceof ImmutableSet)) {
                return b();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.d;
            b<K, V> bVarB = b(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                bVarB.c(it.next(), it2.next());
            }
            return bVarB.j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object b() {
            Object[] objArr = (Object[]) this.e;
            Object[] objArr2 = (Object[]) this.d;
            b<K, V> bVarB = b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                bVarB.c(objArr[i], objArr2[i]);
            }
            return bVarB.j();
        }

        protected b<K, V> b(int i) {
            return new b<>(i);
        }
    }

    public Object writeReplace() {
        return new e(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
