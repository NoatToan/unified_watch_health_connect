package com.google.common.collect;

import defpackage.c6i;
import defpackage.d2h;
import defpackage.d44;
import defpackage.dua;
import defpackage.epd;
import defpackage.f10;
import defpackage.h6i;
import defpackage.ich;
import defpackage.j4h;
import defpackage.k6i;
import defpackage.m44;
import defpackage.pyp;
import defpackage.r1a;
import defpackage.t6d;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    public class a<K, V2> extends f10<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f9228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f9229b;

        public a(Map.Entry entry, k kVar) {
            this.f9228a = entry;
            this.f9229b = kVar;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return (K) this.f9228a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.f10, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f9229b.a(this.f9228a.getKey(), this.f9228a.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public class b<K, V1, V2> implements dua<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f9230a;

        public b(k kVar) {
            this.f9230a = kVar;
        }

        @Override // defpackage.dua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return s.z(this.f9230a, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class c<K, V> extends pyp<Map.Entry<K, V>, K> {
        public c(Iterator it) {
            super(it);
        }

        @Override // defpackage.pyp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class d<K, V> extends pyp<Map.Entry<K, V>, V> {
        public d(Iterator it) {
            super(it);
        }

        @Override // defpackage.pyp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class e<K, V> extends pyp<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dua f9231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Iterator it, dua duaVar) {
            super(it);
            this.f9231b = duaVar;
        }

        @Override // defpackage.pyp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k2) {
            return s.i(k2, this.f9231b.apply(k2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class f<K, V> extends f10<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f9232a;

        public f(Map.Entry entry) {
            this.f9232a = entry;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return (K) this.f9232a.getKey();
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getValue() {
            return (V) this.f9232a.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public class g<K, V1, V2> implements k<K, V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dua f9233a;

        public g(dua duaVar) {
            this.f9233a = duaVar;
        }

        @Override // com.google.common.collect.s.k
        public V2 a(K k2, V1 v1) {
            return (V2) this.f9233a.apply(v1);
        }
    }

    public static abstract class h<K, V> extends r1a<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Comparator<? super K> f9234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f9235b;
        public transient NavigableSet<K> c;

        public class a extends j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.s.j
            public Map<K, V> i() {
                return h.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return h.this.g();
            }
        }

        public static <T> ich<T> m(Comparator<T> comparator) {
            return ich.a(comparator).h();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            return j().floorEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return j().floorKey(k2);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f9234a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = j().comparator();
            if (comparator2 == null) {
                comparator2 = ich.e();
            }
            ich ichVarM = m(comparator2);
            this.f9234a = ichVarM;
            return ichVarM;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return j().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return j();
        }

        @Override // defpackage.r1a, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f9235b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setF = f();
            this.f9235b = setF;
            return setF;
        }

        public Set<Map.Entry<K, V>> f() {
            return new a();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return j().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            return j().ceilingEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return j().ceilingKey(k2);
        }

        public abstract Iterator<Map.Entry<K, V>> g();

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            return j().tailMap(k2, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            return j().lowerEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return j().lowerKey(k2);
        }

        public abstract NavigableMap<K, V> j();

        @Override // defpackage.r1a, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return j().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            return j().higherEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return j().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.c;
            if (navigableSet != null) {
                return navigableSet;
            }
            n nVar = new n(this);
            this.c = nVar;
            return nVar;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return j().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return j().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            return j().subMap(k3, z2, k2, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            return j().headMap(k2, z).descendingMap();
        }

        @Override // defpackage.t1a
        public String toString() {
            return standardToString();
        }

        @Override // defpackage.r1a, java.util.Map
        public Collection<V> values() {
            return new q(this);
        }

        @Override // defpackage.r1a, defpackage.t1a
        public final Map<K, V> delegate() {
            return j();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class i implements dua<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f9237a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f9238b = new b("VALUE", 1);
        public static final /* synthetic */ i[] c = a();

        public final enum a extends i {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.dua
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public final enum b extends i {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.dua
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public i(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ i[] a() {
            return new i[]{f9237a, f9238b};
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) c.clone();
        }

        public /* synthetic */ i(String str, int i, c cVar) {
            this(str, i);
        }
    }

    public static abstract class j<K, V> extends i0.b<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objV = s.v(i(), key);
            if (j4h.a(objV, entry.getValue())) {
                return objV != null || i().containsKey(key);
            }
            return false;
        }

        public abstract Map<K, V> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return i().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.i0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) c6i.o(collection));
            } catch (UnsupportedOperationException unused) {
                return i0.h(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.i0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) c6i.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetE = i0.e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetE.add(((Map.Entry) obj).getKey());
                    }
                }
                return i().keySet().retainAll(hashSetE);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    public interface k<K, V1, V2> {
        V2 a(K k2, V1 v1);
    }

    public static abstract class l<K, V> extends AbstractMap<K, V> {

        public class a extends j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.s.j
            public Map<K, V> i() {
                return l.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return l.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            epd.d(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    public static class m<K, V> extends i0.b<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, V> f9240a;

        public m(Map<K, V> map) {
            this.f9240a = (Map) c6i.o(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j().containsKey(obj);
        }

        /* JADX INFO: renamed from: i */
        public Map<K, V> j() {
            return this.f9240a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return j().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return s.l(j().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            j().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j().size();
        }
    }

    public static class n<K, V> extends o<K, V> implements NavigableSet<K> {
        public n(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return i().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return i().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return i().floorKey(k2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return i().headMap(k2, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return i().higherKey(k2);
        }

        @Override // com.google.common.collect.s.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> j() {
            return (NavigableMap) this.f9240a;
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return i().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) s.m(i().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) s.m(i().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return i().subMap(k2, z, k3, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return i().tailMap(k2, z).navigableKeySet();
        }

        @Override // com.google.common.collect.s.o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // com.google.common.collect.s.o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // com.google.common.collect.s.o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }
    }

    public static class o<K, V> extends m<K, V> implements SortedSet<K> {
        public o(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return j().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new o(j().headMap(k2));
        }

        @Override // com.google.common.collect.s.m
        public SortedMap<K, V> j() {
            return (SortedMap) super.j();
        }

        @Override // java.util.SortedSet
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new o(j().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new o(j().tailMap(k2));
        }
    }

    public static class p<K, V1, V2> extends l<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, V1> f9241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k<? super K, ? super V1, V2> f9242b;

        public p(Map<K, V1> map, k<? super K, ? super V1, V2> kVar) {
            this.f9241a = (Map) c6i.o(map);
            this.f9242b = (k) c6i.o(kVar);
        }

        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<K, V2>> a() {
            return epd.w(this.f9241a.entrySet().iterator(), s.a(this.f9242b));
        }

        @Override // com.google.common.collect.s.l, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f9241a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f9241a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f9241a.get(obj);
            if (v1 != null || this.f9241a.containsKey(obj)) {
                return this.f9242b.a(obj, (Object) d2h.a(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f9241a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f9241a.containsKey(obj)) {
                return this.f9242b.a(obj, (Object) d2h.a(this.f9241a.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f9241a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new q(this);
        }
    }

    public static class q<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, V> f9243a;

        public q(Map<K, V> map) {
            this.f9243a = (Map) c6i.o(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        public final Map<K, V> e() {
            return this.f9243a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return s.D(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (j4h.a(obj, entry.getValue())) {
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
                return super.removeAll((Collection) c6i.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetD = i0.d();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetD.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(hashSetD);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) c6i.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetD = i0.d();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetD.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(hashSetD);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    public static abstract class r<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f9244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set<K> f9245b;
        public transient Collection<V> c;

        public abstract Set<Map.Entry<K, V>> a();

        /* JADX INFO: renamed from: b */
        public Set<K> j() {
            return new m(this);
        }

        public Collection<V> c() {
            return new q(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f9244a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f9244a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> l() {
            Set<K> set = this.f9245b;
            if (set != null) {
                return set;
            }
            Set<K> setJ = j();
            this.f9245b = setJ;
            return setJ;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionC = c();
            this.c = collectionC;
            return collectionC;
        }
    }

    public static <K, V1, V2> Map<K, V2> A(Map<K, V1> map, dua<? super V1, V2> duaVar) {
        return y(map, b(duaVar));
    }

    public static <K, V> Map.Entry<K, V> B(Map.Entry<? extends K, ? extends V> entry) {
        c6i.o(entry);
        return new f(entry);
    }

    public static <V> dua<Map.Entry<?, V>, V> C() {
        return i.f9238b;
    }

    public static <K, V> Iterator<V> D(Iterator<Map.Entry<K, V>> it) {
        return new d(it);
    }

    public static <V> V E(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public static <V> h6i<Map.Entry<?, V>> F(h6i<? super V> h6iVar) {
        return k6i.b(h6iVar, C());
    }

    public static <K, V1, V2> dua<Map.Entry<K, V1>, Map.Entry<K, V2>> a(k<? super K, ? super V1, V2> kVar) {
        c6i.o(kVar);
        return new b(kVar);
    }

    public static <K, V1, V2> k<K, V1, V2> b(dua<? super V1, V2> duaVar) {
        c6i.o(duaVar);
        return new g(duaVar);
    }

    public static <K, V> Iterator<Map.Entry<K, V>> c(Set<K> set, dua<? super K, V> duaVar) {
        return new e(set.iterator(), duaVar);
    }

    public static int d(int i2) {
        if (i2 < 3) {
            d44.b(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> boolean e(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(B((Map.Entry) obj));
        }
        return false;
    }

    public static boolean f(Map<?, ?> map, Object obj) {
        return epd.f(l(map.entrySet().iterator()), obj);
    }

    public static boolean g(Map<?, ?> map, Object obj) {
        return epd.f(D(map.entrySet().iterator()), obj);
    }

    public static boolean h(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> i(K k2, V v) {
        return new t6d(k2, v);
    }

    public static <E> ImmutableMap<E, Integer> j(Collection<E> collection) {
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bVar.g(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return bVar.d();
    }

    public static <K> dua<Map.Entry<K, ?>, K> k() {
        return i.f9237a;
    }

    public static <K, V> Iterator<K> l(Iterator<Map.Entry<K, V>> it) {
        return new c(it);
    }

    public static <K> K m(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K> h6i<Map.Entry<K, ?>> n(h6i<? super K> h6iVar) {
        return k6i.b(h6iVar, k());
    }

    public static <K, V> HashMap<K, V> o() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> p(int i2) {
        return new HashMap<>(d(i2));
    }

    public static <K, V> IdentityHashMap<K, V> q() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> r() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> s(int i2) {
        return new LinkedHashMap<>(d(i2));
    }

    public static <K, V> void t(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static boolean u(Map<?, ?> map, Object obj) {
        c6i.o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V v(Map<?, V> map, Object obj) {
        c6i.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V w(Map<?, V> map, Object obj) {
        c6i.o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String x(Map<?, ?> map) {
        StringBuilder sbB = m44.b(map.size());
        sbB.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z = false;
        }
        sbB.append(AbstractJsonLexerKt.END_OBJ);
        return sbB.toString();
    }

    public static <K, V1, V2> Map<K, V2> y(Map<K, V1> map, k<? super K, ? super V1, V2> kVar) {
        return new p(map, kVar);
    }

    public static <V2, K, V1> Map.Entry<K, V2> z(k<? super K, ? super V1, V2> kVar, Map.Entry<K, V1> entry) {
        c6i.o(kVar);
        c6i.o(entry);
        return new a(entry, kVar);
    }
}
