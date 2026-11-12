package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class a<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @MonotonicNonNullDecl
    private transient Map<K, V> a;

    @RetainedWith
    @MonotonicNonNullDecl
    public transient a<V, K> b;

    @MonotonicNonNullDecl
    private transient Set<K> c;

    @MonotonicNonNullDecl
    private transient Set<V> d;

    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> e;

    /* JADX INFO: renamed from: com.google.common.collect.a$a, reason: collision with other inner class name */
    public class C0192a implements Iterator<Map.Entry<K, V>> {

        @NullableDecl
        public Map.Entry<K, V> a;
        public final /* synthetic */ Iterator b;

        public C0192a(Iterator it2) {
            this.b = it2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.b.next();
            this.a = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.a != null);
            V value = this.a.getValue();
            this.b.remove();
            a.this.p(value);
            this.a = null;
        }
    }

    public class b extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> a;

        public b(Map.Entry<K, V> entry) {
            this.a = entry;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            a.this.j(v);
            Preconditions.checkState(a.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.equal(v, getValue())) {
                return v;
            }
            Preconditions.checkArgument(!a.this.containsValue(v), "value already present: %s", v);
            V value = this.a.setValue(v);
            Preconditions.checkState(Objects.equal(v, a.this.get(getKey())), "entry no longer in map");
            a.this.s(getKey(), true, value, v);
            return value;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
            return this.a;
        }
    }

    public class c extends ForwardingSet<Map.Entry<K, V>> {
        public final Set<Map.Entry<K, V>> a;

        private c() {
            this.a = a.this.a.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.l(delegate(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return a.this.k();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.a.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((a) a.this.b).a.remove(entry.getValue());
            this.a.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ c(a aVar, C0192a c0192a) {
            this();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<Map.Entry<K, V>> delegate() {
            return this.a;
        }
    }

    public static class d<K, V> extends a<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;

        public d(Map<K, V> map, a<V, K> aVar) {
            super(map, aVar, null);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            r((a) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.a, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        @Override // com.google.common.collect.a
        public K i(K k) {
            return this.b.j(k);
        }

        @Override // com.google.common.collect.a
        public V j(V v) {
            return this.b.i(v);
        }

        @GwtIncompatible
        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public class e extends ForwardingSet<K> {
        private e() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return Maps.w(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            a.this.o(obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public /* synthetic */ e(a aVar, C0192a c0192a) {
            this();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<K> delegate() {
            return a.this.a.keySet();
        }
    }

    public class f extends ForwardingSet<V> {
        public final Set<V> a;

        private f() {
            this.a = a.this.b.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.Q(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ f(a aVar, C0192a c0192a) {
            this();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
            return this.a;
        }
    }

    public /* synthetic */ a(Map map, a aVar, C0192a c0192a) {
        this(map, aVar);
    }

    private V n(@NullableDecl K k, @NullableDecl V v, boolean z) {
        i(k);
        j(v);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && Objects.equal(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            Preconditions.checkArgument(!containsValue(v), "value already present: %s", v);
        }
        V vPut = this.a.put(k, v);
        s(k, zContainsKey, vPut, v);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public V o(Object obj) {
        V vRemove = this.a.remove(obj);
        p(vRemove);
        return vRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(V v) {
        this.b.a.remove(v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(K k, boolean z, V v, V v2) {
        if (z) {
            p(v);
        }
        this.b.a.put(v2, k);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.e;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.e = cVar;
        return cVar;
    }

    @CanIgnoreReturnValue
    public V forcePut(@NullableDecl K k, @NullableDecl V v) {
        return n(k, v, true);
    }

    @CanIgnoreReturnValue
    public K i(@NullableDecl K k) {
        return k;
    }

    public BiMap<V, K> inverse() {
        return this.b;
    }

    @CanIgnoreReturnValue
    public V j(@NullableDecl V v) {
        return v;
    }

    public Iterator<Map.Entry<K, V>> k() {
        return new C0192a(this.a.entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.c;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.c = eVar;
        return eVar;
    }

    public a<V, K> m(Map<V, K> map) {
        return new d(map, this);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        return n(k, v, false);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void q(Map<K, V> map, Map<V, K> map2) {
        Preconditions.checkState(this.a == null);
        Preconditions.checkState(this.b == null);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map2.isEmpty());
        Preconditions.checkArgument(map != map2);
        this.a = map;
        this.b = m(map2);
    }

    public void r(a<V, K> aVar) {
        this.b = aVar;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (containsKey(obj)) {
            return o(obj);
        }
        return null;
    }

    public a(Map<K, V> map, Map<V, K> map2) {
        q(map, map2);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.d;
        if (set != null) {
            return set;
        }
        f fVar = new f(this, null);
        this.d = fVar;
        return fVar;
    }

    private a(Map<K, V> map, a<V, K> aVar) {
        this.a = map;
        this.b = aVar;
    }
}
