package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class p0<K, V> extends g<K, V> implements r0<K, V> {
    public final Multimap<K, V> f;
    public final Predicate<? super K> g;

    public static class a<K, V> extends ForwardingList<V> {
        public final K a;

        public a(K k) {
            this.a = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            add(0, v);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i, V v) {
            Preconditions.checkPositionIndex(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        @CanIgnoreReturnValue
        public boolean addAll(int i, Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public List<V> delegate() {
            return Collections.emptyList();
        }
    }

    public class c extends ForwardingCollection<Map.Entry<K, V>> {
        public c() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (p0.this.f.containsKey(entry.getKey()) && p0.this.g.apply((Object) entry.getKey())) {
                return p0.this.f.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Map.Entry<K, V>> delegate() {
            return Collections2.filter(p0.this.f.entries(), p0.this.c());
        }
    }

    public p0(Multimap<K, V> multimap, Predicate<? super K> predicate) {
        this.f = (Multimap) Preconditions.checkNotNull(multimap);
        this.g = (Predicate) Preconditions.checkNotNull(predicate);
    }

    public Multimap<K, V> a() {
        return this.f;
    }

    @Override // com.google.common.collect.g
    public Map<K, Collection<V>> b() {
        return Maps.filterKeys(this.f.asMap(), this.g);
    }

    @Override // com.google.common.collect.r0
    public Predicate<? super Map.Entry<K, V>> c() {
        return Maps.y(this.g);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        if (this.f.containsKey(obj)) {
            return this.g.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.g
    public Collection<Map.Entry<K, V>> e() {
        return new c();
    }

    @Override // com.google.common.collect.g
    public Set<K> f() {
        return Sets.filter(this.f.keySet(), this.g);
    }

    @Override // com.google.common.collect.g
    public Multiset<K> g() {
        return Multisets.filter(this.f.keys(), this.g);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(K k) {
        if (this.g.apply(k)) {
            return this.f.get(k);
        }
        return this.f instanceof SetMultimap ? new b(k) : new a(k);
    }

    @Override // com.google.common.collect.g
    public Collection<V> h() {
        return new s0(this);
    }

    @Override // com.google.common.collect.g
    public Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    public Collection<V> k() {
        return this.f instanceof SetMultimap ? ImmutableSet.of() : ImmutableList.of();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        return containsKey(obj) ? this.f.removeAll(obj) : k();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        Iterator<Collection<V>> it2 = asMap().values().iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += it2.next().size();
        }
        return size;
    }

    public static class b<K, V> extends ForwardingSet<V> {
        public final K a;

        public b(K k) {
            this.a = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
            return Collections.emptySet();
        }
    }
}
