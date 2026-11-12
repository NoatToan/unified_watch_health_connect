package defpackage;

import com.google.common.collect.s;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d00<K, V> extends r1a<K, V> implements ri2<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;
    private transient Set<Map.Entry<K, V>> entrySet;
    transient d00<V, K> inverse;
    private transient Set<K> keySet;
    private transient Set<V> valueSet;

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, V> f14900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f14901b;

        public a(Iterator it) {
            this.f14901b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f14901b.next();
            this.f14900a = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14901b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f14900a;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            V value = entry.getValue();
            this.f14901b.remove();
            d00.this.removeFromInverseMap(value);
            this.f14900a = null;
        }
    }

    public class b extends s1a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, V> f14902a;

        public b(Map.Entry<K, V> entry) {
            this.f14902a = entry;
        }

        @Override // defpackage.t1a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> delegate() {
            return this.f14902a;
        }

        @Override // defpackage.s1a, java.util.Map.Entry
        public V setValue(V v) {
            d00.this.checkValue(v);
            c6i.u(d00.this.entrySet().contains(this), "entry no longer in map");
            if (j4h.a(v, getValue())) {
                return v;
            }
            c6i.j(!d00.this.containsValue(v), "value already present: %s", v);
            V value = this.f14902a.setValue(v);
            c6i.u(j4h.a(v, d00.this.get(getKey())), "entry no longer in map");
            d00.this.updateInverseMap(getKey(), true, value, v);
            return value;
        }
    }

    public class c extends w1a<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f14904a;

        public c() {
            this.f14904a = d00.this.delegate.entrySet();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public void clear() {
            d00.this.clear();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.e(delegate(), obj);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // defpackage.i1a, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return d00.this.entrySetIterator();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.f14904a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((d00) d00.this.inverse).delegate.remove(entry.getValue());
            this.f14904a.remove(entry);
            return true;
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // defpackage.i1a, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ c(d00 d00Var, a aVar) {
            this();
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<Map.Entry<K, V>> delegate() {
            return this.f14904a;
        }
    }

    public static class d<K, V> extends d00<K, V> {
        private static final long serialVersionUID = 0;

        public d(Map<K, V> map, d00<V, K> d00Var) {
            super(map, d00Var, null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            setInverse((d00) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // defpackage.d00
        public K checkKey(K k2) {
            return this.inverse.checkValue(k2);
        }

        @Override // defpackage.d00
        public V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        @Override // defpackage.d00, defpackage.r1a, defpackage.t1a
        public /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // defpackage.d00, defpackage.r1a, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public class e extends w1a<K> {
        public e() {
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public void clear() {
            d00.this.clear();
        }

        @Override // defpackage.i1a, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return s.l(d00.this.entrySet().iterator());
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            d00.this.removeFromBothMaps(obj);
            return true;
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public /* synthetic */ e(d00 d00Var, a aVar) {
            this();
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<K> delegate() {
            return d00.this.delegate.keySet();
        }
    }

    public class f extends w1a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<V> f14907a;

        public f() {
            this.f14907a = d00.this.inverse.keySet();
        }

        @Override // defpackage.i1a, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return s.D(d00.this.entrySet().iterator());
        }

        @Override // defpackage.i1a, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // defpackage.t1a
        public String toString() {
            return standardToString();
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ f(d00 d00Var, a aVar) {
            this();
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<V> delegate() {
            return this.f14907a;
        }
    }

    public /* synthetic */ d00(Map map, d00 d00Var, a aVar) {
        this(map, d00Var);
    }

    private V putInBothMaps(K k2, V v, boolean z) {
        checkKey(k2);
        checkValue(v);
        boolean zContainsKey = containsKey(k2);
        if (zContainsKey && j4h.a(v, get(k2))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            c6i.j(!containsValue(v), "value already present: %s", v);
        }
        V vPut = this.delegate.put(k2, v);
        updateInverseMap(k2, zContainsKey, vPut, v);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeFromBothMaps(Object obj) {
        V v = (V) d2h.a(this.delegate.remove(obj));
        removeFromInverseMap(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(K k2, boolean z, V v, V v2) {
        if (z) {
            removeFromInverseMap(d2h.a(v));
        }
        this.inverse.delegate.put(v2, k2);
    }

    public K checkKey(K k2) {
        return k2;
    }

    public V checkValue(V v) {
        return v;
    }

    @Override // defpackage.r1a, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // defpackage.r1a, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // defpackage.r1a, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.entrySet = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new a(this.delegate.entrySet().iterator());
    }

    public V forcePut(K k2, V v) {
        return putInBothMaps(k2, v, true);
    }

    public ri2<V, K> inverse() {
        return this.inverse;
    }

    @Override // defpackage.r1a, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.keySet = eVar;
        return eVar;
    }

    public d00<V, K> makeInverse(Map<V, K> map) {
        return new d(map, this);
    }

    @Override // defpackage.r1a, java.util.Map
    public V put(K k2, V v) {
        return putInBothMaps(k2, v, false);
    }

    @Override // defpackage.r1a, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.r1a, java.util.Map
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        c6i.t(this.delegate == null);
        c6i.t(this.inverse == null);
        c6i.d(map.isEmpty());
        c6i.d(map2.isEmpty());
        c6i.d(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(d00<V, K> d00Var) {
        this.inverse = d00Var;
    }

    public d00(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    @Override // defpackage.r1a, defpackage.t1a
    public Map<K, V> delegate() {
        return this.delegate;
    }

    @Override // defpackage.r1a, java.util.Map
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        f fVar = new f(this, null);
        this.valueSet = fVar;
        return fVar;
    }

    private d00(Map<K, V> map, d00<V, K> d00Var) {
        this.delegate = map;
        this.inverse = d00Var;
    }
}
