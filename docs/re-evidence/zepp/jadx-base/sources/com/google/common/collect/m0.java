package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class m0<K, V> extends g<K, V> implements r0<K, V> {
    public final Multimap<K, V> f;
    public final Predicate<? super Map.Entry<K, V>> g;

    public class a extends Maps.q0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.m0$a$a, reason: collision with other inner class name */
        public class C0196a extends Maps.s<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.m0$a$a$a, reason: collision with other inner class name */
            public class C0197a extends AbstractIterator<Map.Entry<K, Collection<V>>> {
                public final Iterator<Map.Entry<K, Collection<V>>> c;

                public C0197a() {
                    this.c = m0.this.f.asMap().entrySet().iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> computeNext() {
                    while (this.c.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.c.next();
                        K key = next.getKey();
                        Collection collectionM = m0.m(next.getValue(), new c(key));
                        if (!collectionM.isEmpty()) {
                            return Maps.immutableEntry(key, collectionM);
                        }
                    }
                    return endOfData();
                }
            }

            public C0196a() {
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, Collection<V>> d() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0197a();
            }

            @Override // com.google.common.collect.Maps.s, com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return m0.this.n(Predicates.in(collection));
            }

            @Override // com.google.common.collect.Maps.s, com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return m0.this.n(Predicates.not(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Iterators.size(iterator());
            }
        }

        public class b extends Maps.a0<K, Collection<V>> {
            public b() {
                super(a.this);
            }

            @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@NullableDecl Object obj) {
                return a.this.remove(obj) != null;
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return m0.this.n(Maps.y(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return m0.this.n(Maps.y(Predicates.not(Predicates.in(collection))));
            }
        }

        public class c extends Maps.p0<K, Collection<V>> {
            public c() {
                super(a.this);
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@NullableDecl Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<K, Collection<V>>> it2 = m0.this.f.asMap().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it2.next();
                    Collection collectionM = m0.m(next.getValue(), new c(next.getKey()));
                    if (!collectionM.isEmpty() && collection.equals(collectionM)) {
                        if (collectionM.size() == next.getValue().size()) {
                            it2.remove();
                            return true;
                        }
                        collectionM.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return m0.this.n(Maps.S(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return m0.this.n(Maps.S(Predicates.not(Predicates.in(collection))));
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0196a();
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: c */
        public Set<K> h() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            m0.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.q0
        public Collection<Collection<V>> d() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@NullableDecl Object obj) {
            Collection<V> collection = m0.this.f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionM = m0.m(collection, new c(obj));
            if (collectionM.isEmpty()) {
                return null;
            }
            return collectionM;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@NullableDecl Object obj) {
            Collection<V> collection = m0.this.f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            Iterator<V> it2 = collection.iterator();
            while (it2.hasNext()) {
                V next = it2.next();
                if (m0.this.o(obj, next)) {
                    it2.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            return m0.this.f instanceof SetMultimap ? Collections.unmodifiableSet(Sets.newLinkedHashSet(arrayListNewArrayList)) : Collections.unmodifiableList(arrayListNewArrayList);
        }
    }

    public class b extends Multimaps.g<K, V> {

        public class a extends Multisets.i<K> {

            /* JADX INFO: renamed from: com.google.common.collect.m0$b$a$a, reason: collision with other inner class name */
            public class C0198a implements Predicate<Map.Entry<K, Collection<V>>> {
                public final /* synthetic */ Predicate a;

                public C0198a(Predicate predicate) {
                    this.a = predicate;
                }

                @Override // com.google.common.base.Predicate
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public boolean apply(Map.Entry<K, Collection<V>> entry) {
                    return this.a.apply(Multisets.immutableEntry(entry.getKey(), entry.getValue().size()));
                }
            }

            public a() {
            }

            private boolean f(Predicate<? super Multiset.Entry<K>> predicate) {
                return m0.this.n(new C0198a(predicate));
            }

            @Override // com.google.common.collect.Multisets.i
            public Multiset<K> d() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<K>> iterator() {
                return b.this.e();
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return f(Predicates.in(collection));
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return f(Predicates.not(Predicates.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return m0.this.keySet().size();
            }
        }

        public b() {
            super(m0.this);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
            return new a();
        }

        @Override // com.google.common.collect.Multimaps.g, com.google.common.collect.h, com.google.common.collect.Multiset
        public int remove(@NullableDecl Object obj, int i) {
            u.b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection<V> collection = m0.this.f.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (m0.this.o(obj, it2.next()) && (i2 = i2 + 1) <= i) {
                    it2.remove();
                }
            }
            return i2;
        }
    }

    public final class c implements Predicate<V> {
        private final K a;

        public c(K k) {
            this.a = k;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl V v) {
            return m0.this.o(this.a, v);
        }
    }

    public m0(Multimap<K, V> multimap, Predicate<? super Map.Entry<K, V>> predicate) {
        this.f = (Multimap) Preconditions.checkNotNull(multimap);
        this.g = (Predicate) Preconditions.checkNotNull(predicate);
    }

    public static <E> Collection<E> m(Collection<E> collection, Predicate<? super E> predicate) {
        return collection instanceof Set ? Sets.filter((Set) collection, predicate) : Collections2.filter(collection, predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(K k, V v) {
        return this.g.apply(Maps.immutableEntry(k, v));
    }

    @Override // com.google.common.collect.r0
    public Multimap<K, V> a() {
        return this.f;
    }

    @Override // com.google.common.collect.g
    public Map<K, Collection<V>> b() {
        return new a();
    }

    @Override // com.google.common.collect.r0
    public Predicate<? super Map.Entry<K, V>> c() {
        return this.g;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // com.google.common.collect.g
    public Collection<Map.Entry<K, V>> e() {
        return m(this.f.entries(), this.g);
    }

    @Override // com.google.common.collect.g
    public Set<K> f() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.g
    public Multiset<K> g() {
        return new b();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(K k) {
        return m(this.f.get(k), new c(k));
    }

    @Override // com.google.common.collect.g
    public Collection<V> h() {
        return new s0(this);
    }

    @Override // com.google.common.collect.g
    public Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    public boolean n(Predicate<? super Map.Entry<K, Collection<V>>> predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it2 = this.f.asMap().entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Map.Entry<K, Collection<V>> next = it2.next();
            K key = next.getKey();
            Collection collectionM = m(next.getValue(), new c(key));
            if (!collectionM.isEmpty() && predicate.apply(Maps.immutableEntry(key, collectionM))) {
                if (collectionM.size() == next.getValue().size()) {
                    it2.remove();
                } else {
                    collectionM.clear();
                }
                z = true;
            }
        }
        return z;
    }

    public Collection<V> p() {
        return this.f instanceof SetMultimap ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(@NullableDecl Object obj) {
        return (Collection) MoreObjects.firstNonNull(asMap().remove(obj), p());
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }
}
