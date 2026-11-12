package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] e = new Map.Entry[0];

    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> a;

    @LazyInit
    private transient ImmutableSet<K> b;

    @LazyInit
    private transient ImmutableCollection<V> c;

    @LazyInit
    private transient ImmutableSetMultimap<K, V> d;

    public static class Builder<K, V> {

        @MonotonicNonNullDecl
        public Comparator<? super V> a;
        public Object[] b;
        public int c;
        public boolean d;

        public Builder() {
            this(4);
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, ImmutableCollection.Builder.a(objArr.length, i2));
                this.d = false;
            }
        }

        public void b() {
            int i;
            if (this.a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, Ordering.from(this.a).onResultOf(Maps.P()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        public ImmutableMap<K, V> build() {
            b();
            this.d = true;
            return c2.m(this.c, this.b);
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.a == null, "valueComparator was already set");
            this.a = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            a(this.c + 1);
            u.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public Builder(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it2 = iterable.iterator();
            while (it2.hasNext()) {
                put(it2.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    public class a extends UnmodifiableIterator<K> {
        public final /* synthetic */ UnmodifiableIterator a;

        public a(UnmodifiableIterator unmodifiableIterator) {
            this.a = unmodifiableIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.a.next()).getKey();
        }
    }

    public static abstract class b<K, V> extends ImmutableMap<K, V> {

        public class a extends g1<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.g1
            public ImmutableMap<K, V> o() {
                return b.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return b.this.m();
            }
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> e() {
            return new a();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> f() {
            return new h1(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> g() {
            return new i1(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> m();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public final class c extends b<K, ImmutableSet<V>> {

        public class a extends UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> {
            public final /* synthetic */ Iterator a;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$c$a$a, reason: collision with other inner class name */
            public class C0177a extends f<K, ImmutableSet<V>> {
                public final /* synthetic */ Map.Entry a;

                public C0177a(Map.Entry entry) {
                    this.a = entry;
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.of(this.a.getValue());
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                public K getKey() {
                    return (K) this.a.getKey();
                }
            }

            public a(Iterator it2) {
                this.a = it2;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C0177a((Map.Entry) this.a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }
        }

        private c() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.b, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> f() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean i() {
            return ImmutableMap.this.i();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean j() {
            return ImmutableMap.this.j();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> m() {
            return new a(ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<V> get(@NullableDecl Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        public /* synthetic */ c(ImmutableMap immutableMap, a aVar) {
            this();
        }
    }

    public static class d implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] a;
        private final Object[] b;

        public d(ImmutableMap<?, ?> immutableMap) {
            this.a = new Object[immutableMap.size()];
            this.b = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<?, ?>> it2 = immutableMap.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                Map.Entry<?, ?> next = it2.next();
                this.a[i] = next.getKey();
                this.b[i] = next.getValue();
                i++;
            }
        }

        public Object a(Builder<Object, Object> builder) {
            int i = 0;
            while (true) {
                Object[] objArr = this.a;
                if (i >= objArr.length) {
                    return builder.build();
                }
                builder.put(objArr[i], this.b[i]);
                i++;
            }
        }

        public Object readResolve() {
            return a(new Builder<>(this.a.length));
        }
    }

    public static void a(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw c(str, entry, entry2);
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        u.b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static IllegalArgumentException c(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.j()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> h(K k, V v) {
        u.a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) c2.j;
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.d;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new c(this, null), size(), null);
        this.d = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return Maps.p(this, obj);
    }

    public abstract ImmutableSet<K> f();

    public abstract ImmutableCollection<V> g();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.b(entrySet());
    }

    public boolean i() {
        return false;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean j();

    public UnmodifiableIterator<K> k() {
        return new a(entrySet().iterator());
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.I(this);
    }

    Object writeReplace() {
        return new d(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v) {
        u.a(k, v);
        return c2.m(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetE = e();
        this.a = immutableSetE;
        return immutableSetE;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetF = f();
        this.b = immutableSetF;
        return immutableSetF;
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionG = g();
        this.c = immutableCollectionG;
        return immutableCollectionG;
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2) {
        u.a(k, v);
        u.a(k2, v2);
        return c2.m(2, new Object[]{k, v, k2, v2});
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        u.a(k, v);
        u.a(k2, v2);
        u.a(k3, v3);
        return c2.m(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        u.a(k, v);
        u.a(k2, v2);
        u.a(k3, v3);
        u.a(k4, v4);
        return c2.m(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        u.a(k, v);
        u.a(k2, v2);
        u.a(k3, v3);
        u.a(k4, v4);
        u.a(k5, v5);
        return c2.m(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
