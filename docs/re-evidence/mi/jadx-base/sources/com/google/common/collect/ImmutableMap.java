package com.google.common.collect;

import defpackage.d44;
import defpackage.f10;
import defpackage.ich;
import defpackage.uaq;
import defpackage.v6d;
import defpackage.w6d;
import defpackage.x6d;
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

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    private transient ImmutableSetMultimap<K, V> multimapView;
    private transient ImmutableCollection<V> values;

    public class a extends uaq<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uaq f9027a;

        public a(ImmutableMap immutableMap, uaq uaqVar) {
            this.f9027a = uaqVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9027a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f9027a.next()).getKey();
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator<? super V> f9028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f9029b;
        public int c;
        public boolean d;
        public a e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f9030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f9031b;
            public final Object c;

            public a(Object obj, Object obj2, Object obj3) {
                this.f9030a = obj;
                this.f9031b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f9030a);
                String strValueOf2 = String.valueOf(this.f9031b);
                String strValueOf3 = String.valueOf(this.f9030a);
                String strValueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public b() {
            this(4);
        }

        private void e(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f9029b;
            if (i2 > objArr.length) {
                this.f9029b = Arrays.copyOf(objArr, ImmutableCollection.b.e(objArr.length, i2));
                this.d = false;
            }
        }

        public static <V> void k(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, ich.a(comparator).g(s.C()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public ImmutableMap<K, V> a() {
            return d();
        }

        public final ImmutableMap<K, V> b(boolean z) {
            Object[] objArrF;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.e) != null) {
                throw aVar2.a();
            }
            int length = this.c;
            if (this.f9028a == null) {
                objArrF = this.f9029b;
            } else {
                if (this.d) {
                    this.f9029b = Arrays.copyOf(this.f9029b, length * 2);
                }
                objArrF = this.f9029b;
                if (!z) {
                    objArrF = f(objArrF, this.c);
                    if (objArrF.length < this.f9029b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f9028a);
            }
            this.d = true;
            a0 a0VarB = a0.b(length, objArrF, this);
            if (!z || (aVar = this.e) == null) {
                return a0VarB;
            }
            throw aVar.a();
        }

        public ImmutableMap<K, V> c() {
            return b(false);
        }

        public ImmutableMap<K, V> d() {
            return b(true);
        }

        public final Object[] f(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
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
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        public b<K, V> g(K k2, V v) {
            e(this.c + 1);
            d44.a(k2, v);
            Object[] objArr = this.f9029b;
            int i = this.c;
            objArr[i * 2] = k2;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        public b<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public b<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                e(this.c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            return this;
        }

        public b<K, V> j(Map<? extends K, ? extends V> map) {
            return i(map.entrySet());
        }

        public b(int i) {
            this.f9029b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    public static abstract class c<K, V> extends ImmutableMap<K, V> {

        public class a extends v6d<K, V> {
            public a() {
            }

            @Override // defpackage.v6d
            public ImmutableMap<K, V> e() {
                return c.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public uaq<Map.Entry<K, V>> iterator() {
                return c.this.a();
            }
        }

        public abstract uaq<Map.Entry<K, V>> a();

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new a();
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new w6d(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new x6d(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public final class d extends c<K, ImmutableSet<V>> {

        public class a extends uaq<Map.Entry<K, ImmutableSet<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f9034a;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$d$a$a, reason: collision with other inner class name */
            public class C0228a extends f10<K, ImmutableSet<V>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f9035a;

                public C0228a(a aVar, Map.Entry entry) {
                    this.f9035a = entry;
                }

                @Override // defpackage.f10, java.util.Map.Entry
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.of(this.f9035a.getValue());
                }

                @Override // defpackage.f10, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f9035a.getKey();
                }
            }

            public a(d dVar, Iterator it) {
                this.f9034a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C0228a(this, (Map.Entry) this.f9034a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9034a.hasNext();
            }
        }

        public d() {
        }

        @Override // com.google.common.collect.ImmutableMap.c
        public uaq<Map.Entry<K, ImmutableSet<V>>> a() {
            return new a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        public /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this();
        }
    }

    public static class e<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9037b;

        public e(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            uaq<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f9036a = objArr;
            this.f9037b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a() {
            Object[] objArr = (Object[]) this.f9036a;
            Object[] objArr2 = (Object[]) this.f9037b;
            b<K, V> bVarB = b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                bVarB.g(objArr[i], objArr2[i]);
            }
            return bVarB.d();
        }

        public b<K, V> b(int i) {
            return new b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.f9036a;
            if (!(obj instanceof ImmutableSet)) {
                return a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.f9037b;
            b<K, V> bVarB = b(immutableSet.size());
            uaq it = immutableSet.iterator();
            uaq it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                bVarB.g(it.next(), it2.next());
            }
            return bVarB.d();
        }
    }

    public static <K, V> b<K, V> builder() {
        return new b<>();
    }

    public static <K, V> b<K, V> builderWithExpectedSize(int i) {
        d44.b(i, "expectedSize");
        return new b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + strValueOf.length() + strValueOf2.length());
        sb.append("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(strValueOf);
        sb.append(" and ");
        sb.append(strValueOf2);
        return new IllegalArgumentException(sb.toString());
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

    public static <K, V> Map.Entry<K, V> entryOf(K k2, V v) {
        d44.a(k2, v);
        return new AbstractMap.SimpleImmutableEntry(k2, v);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) a0.d;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new d(this, null), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return s.h(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return i0.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public uaq<K> keyIterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return s.x(this);
    }

    public Object writeReplace() {
        return new e(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v) {
        d44.a(k2, v);
        return a0.a(1, new Object[]{k2, v});
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2) {
        d44.a(k2, v);
        d44.a(k3, v2);
        return a0.a(2, new Object[]{k2, v, k3, v2});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.i(iterable);
        return bVar.a();
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        return a0.a(3, new Object[]{k2, v, k3, v2, k4, v3});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        return a0.a(4, new Object[]{k2, v, k3, v2, k4, v3, k5, v4});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        return a0.a(5, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        return a0.a(6, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        return a0.a(7, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        return a0.a(8, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8, K k10, V v9) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        d44.a(k10, v9);
        return a0.a(9, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8, k10, v9});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        d44.a(k10, v9);
        d44.a(k11, v10);
        return a0.a(10, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8, k10, v9, k11, v10});
    }
}
