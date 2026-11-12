package com.google.common.collect;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.cpd;
import defpackage.d0i;
import defpackage.d44;
import defpackage.epd;
import defpackage.i82;
import defpackage.ich;
import defpackage.nag;
import defpackage.uaq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableMultimap<K, V> extends i82<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    public class a extends uaq<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f9038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public K f9039b = null;
        public Iterator<V> c = epd.h();

        public a() {
            this.f9038a = ImmutableMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.c.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f9038a.next();
                this.f9039b = next.getKey();
                this.c = next.getValue().iterator();
            }
            K k2 = this.f9039b;
            Objects.requireNonNull(k2);
            return s.i(k2, this.c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c.hasNext() || this.f9038a.hasNext();
        }
    }

    public class b extends uaq<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<? extends ImmutableCollection<V>> f9040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<V> f9041b = epd.h();

        public b() {
            this.f9040a = ImmutableMultimap.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9041b.hasNext() || this.f9040a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f9041b.hasNext()) {
                this.f9041b = this.f9040a.next().iterator();
            }
            return this.f9041b.next();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, Collection<V>> f9042a = d0i.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Comparator<? super K> f9043b;
        public Comparator<? super V> c;

        public ImmutableMultimap<K, V> a() {
            Collection collectionEntrySet = this.f9042a.entrySet();
            Comparator<? super K> comparator = this.f9043b;
            if (comparator != null) {
                collectionEntrySet = ich.a(comparator).f().b(collectionEntrySet);
            }
            return ImmutableListMultimap.fromMapEntries(collectionEntrySet, this.c);
        }

        public Collection<V> b() {
            return new ArrayList();
        }

        public c<K, V> c(K k2, V v) {
            d44.a(k2, v);
            Collection<V> collection = this.f9042a.get(k2);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f9042a;
                Collection<V> collectionB = b();
                map.put(k2, collectionB);
                collection = collectionB;
            }
            collection.add(v);
            return this;
        }

        public c<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        public c<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            return this;
        }

        public c<K, V> f(K k2, Iterable<? extends V> iterable) {
            if (k2 == null) {
                String strValueOf = String.valueOf(cpd.m(iterable));
                throw new NullPointerException(strValueOf.length() != 0 ? "null key in entry: null=".concat(strValueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f9042a.get(k2);
            if (collection != null) {
                for (V v : iterable) {
                    d44.a(k2, v);
                    collection.add(v);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionB = b();
            while (it.hasNext()) {
                V next = it.next();
                d44.a(k2, next);
                collectionB.add(next);
            }
            this.f9042a.put(k2, collectionB);
            return this;
        }

        public c<K, V> g(K k2, V... vArr) {
            return f(k2, Arrays.asList(vArr));
        }
    }

    public static class d<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMultimap<K, V> f9044a;

        public d(ImmutableMultimap<K, V> immutableMultimap) {
            this.f9044a = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f9044a.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f9044a.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f9044a.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<Map.Entry<K, V>> iterator() {
            return this.f9044a.entryIterator();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0.b<ImmutableMultimap> f9045a = g0.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0.b<ImmutableMultimap> f9046b = g0.a(ImmutableMultimap.class, MediaStoreUtil.MediaInfo.SIZE);
    }

    public class f extends ImmutableMultiset<K> {
        public f() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public u.a<K> getEntry(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return v.g(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new g(ImmutableMultimap.this);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    public static final class g implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMultimap<?, ?> f9048a;

        public g(ImmutableMultimap<?, ?> immutableMultimap) {
            this.f9048a = immutableMultimap;
        }

        public Object readResolve() {
            return this.f9048a.keys();
        }
    }

    public static final class h<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient ImmutableMultimap<K, V> f9049a;

        public h(ImmutableMultimap<K, V> immutableMultimap) {
            this.f9049a = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f9049a.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            uaq<? extends ImmutableCollection<V>> it = this.f9049a.map.values().iterator();
            while (it.hasNext()) {
                i = it.next().copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f9049a.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<V> iterator() {
            return this.f9049a.valueIterator();
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(nag<? extends K, ? extends V> nagVar) {
        if (nagVar instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) nagVar;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((nag) nagVar);
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ImmutableListMultimap.of();
    }

    @Override // defpackage.nag
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // defpackage.nag
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.d
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.d
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.d
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.nag
    public abstract ImmutableCollection<V> get(K k2);

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    @Deprecated
    public final boolean put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d
    @Deprecated
    public final boolean putAll(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nag
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k2, V v) {
        return ImmutableListMultimap.of((Object) k2, (Object) v);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.d
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new d(this);
    }

    @Override // com.google.common.collect.d
    public ImmutableMultiset<K> createKeys() {
        return new f();
    }

    @Override // com.google.common.collect.d
    public ImmutableCollection<V> createValues() {
        return new h(this);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.d
    public uaq<Map.Entry<K, V>> entryIterator() {
        return new a();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.d
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.d
    @Deprecated
    public final boolean putAll(nag<? extends K, ? extends V> nagVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nag
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d
    public uaq<V> valueIterator() {
        return new b();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k2, V v, K k3, V v2) {
        return ImmutableListMultimap.of((Object) k2, (Object) v, (Object) k3, (Object) v2);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        return ImmutableListMultimap.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        return ImmutableListMultimap.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3, (Object) k5, (Object) v4);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        return ImmutableListMultimap.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3, (Object) k5, (Object) v4, (Object) k6, (Object) v5);
    }
}
