package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ams;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;

    @CheckForNull
    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySet;
    transient AbstractBiMap<V, K> inverse;

    @CheckForNull
    @LazyInit
    private transient Set<K> keySet;

    @CheckForNull
    @LazyInit
    private transient Set<V> valueSet;

    @ParametricNullness
    K checkKey(@ParametricNullness K k) {
        return k;
    }

    @ParametricNullness
    V checkValue(@ParametricNullness V v) {
        return v;
    }

    AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.delegate = map;
        this.inverse = abstractBiMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
        return this.delegate;
    }

    void setDelegates(Map<K, V> map, Map<V, K> map2) {
        Preconditions.checkState(this.delegate == null);
        Preconditions.checkState(this.inverse == null);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map2.isEmpty());
        Preconditions.checkArgument(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
        return new b(map, this);
    }

    void setInverse(AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return putInBothMaps(k, v, false);
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        return putInBothMaps(k, v, true);
    }

    @CheckForNull
    private V putInBothMaps(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && Objects.equal(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            Preconditions.checkArgument(!containsValue(v), "value already present: %s", v);
        }
        V vPut = this.delegate.put(k, v);
        updateInverseMap(k, zContainsKey, vPut, v);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(@ParametricNullness K k, boolean z, @CheckForNull V v, @ParametricNullness V v2) {
        if (z) {
            removeFromInverseMap(ams.e(v));
        }
        this.inverse.delegate.put(v2, k);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ParametricNullness
    public V removeFromBothMaps(@CheckForNull Object obj) {
        V v = (V) ams.e(this.delegate.remove(obj));
        removeFromInverseMap(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(@ParametricNullness V v) {
        this.inverse.delegate.remove(v);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.keySet = cVar;
        return cVar;
    }

    class c extends ForwardingSet<K> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<K> delegate() {
            return AbstractBiMap.this.delegate.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.removeFromBothMaps(obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.d(AbstractBiMap.this.entrySet().iterator());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.valueSet = aVar;
        return aVar;
    }

    class a extends ForwardingSet<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Set<V> f4269c;

        private a() {
            this.f4269c = AbstractBiMap.this.inverse.keySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
            return this.f4269c;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.b(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        d dVar = new d();
        this.entrySet = dVar;
        return dVar;
    }

    class e extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> e;

        e(Map.Entry<K, V> entry) {
            this.e = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
            return this.e;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            AbstractBiMap.this.checkValue(v);
            Preconditions.checkState(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.equal(v, getValue())) {
                return v;
            }
            Preconditions.checkArgument(!AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            V value = this.e.setValue(v);
            Preconditions.checkState(Objects.equal(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.updateInverseMap(getKey(), true, value, v);
            return value;
        }
    }

    Iterator<Map.Entry<K, V>> entrySetIterator() {
        final Iterator<Map.Entry<K, V>> it = this.delegate.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.AbstractBiMap.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @CheckForNull
            Map.Entry<K, V> f4268a;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                this.f4268a = (Map.Entry) it.next();
                return new e(this.f4268a);
            }

            @Override // java.util.Iterator
            public void remove() {
                Map.Entry<K, V> entry = this.f4268a;
                if (entry == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                V value = entry.getValue();
                it.remove();
                AbstractBiMap.this.removeFromInverseMap(value);
                this.f4268a = null;
            }
        };
    }

    class d extends ForwardingSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f4271a;

        private d() {
            this.f4271a = AbstractBiMap.this.delegate.entrySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<Map.Entry<K, V>> delegate() {
            return this.f4271a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!this.f4271a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.f4271a.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.entrySetIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return Maps.a(delegate(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }
    }

    static class b<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        b(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @ParametricNullness
        K checkKey(@ParametricNullness K k) {
            return this.inverse.checkValue(k);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @ParametricNullness
        V checkValue(@ParametricNullness V v) {
            return this.inverse.checkKey(v);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            setInverse((AbstractBiMap) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }

        Object readResolve() {
            return inverse().inverse();
        }
    }
}
